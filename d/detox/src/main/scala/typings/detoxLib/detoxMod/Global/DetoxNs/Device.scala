package typings
package detoxLib.detoxMod.Global.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
               * Disable EarlGrey's synchronization mechanism (enabled by default) This is being reset on every new instance of the app.
               * @example await device.disableSynchronization();
               */
  def disableSynchronization(): stdLib.Promise[scala.Unit] = js.native
  /**
               * Enable EarlGrey's synchronization mechanism (enabled by default). This is being reset on every new instance of the app.
               * @example await device.enableSynchronization();
               */
  def enableSynchronization(): stdLib.Promise[scala.Unit] = js.native
  /**
               * Returns the current device, ios or android.
               * @example if (device.getPlatform() === 'ios') {
               *     await expect(loopSwitch).toHaveValue('1');
               * }
               */
  def getPlatform(): detoxLib.detoxLibStrings.ios | detoxLib.detoxLibStrings.android = js.native
  /**
               * By default, installApp() with no params will install the app file defined in the current configuration.
               * To install another app, specify its path
               * @param path
               * @example await device.installApp('path/to/other/app');
               */
  def installApp(): stdLib.Promise[scala.Unit] = js.native
  /**
               * By default, installApp() with no params will install the app file defined in the current configuration.
               * To install another app, specify its path
               * @param path
               * @example await device.installApp('path/to/other/app');
               */
  def installApp(path: js.Any): stdLib.Promise[scala.Unit] = js.native
  /**
               * Launch the app
               * @param config
               * @example // Terminate the app and launch it again. If set to false, the simulator will try to bring app from background,
               * // if the app isn't running, it will launch a new instance. default is false
               * await device.launchApp({newInstance: true});
               * // Grant or deny runtime permissions for your application.
               * await device.launchApp({permissions: {calendar: 'YES'}});
               * // Mock opening the app from URL to test your app's deep link handling mechanism.
               * await device.launchApp({url: url});
               */
  def launchApp(config: DeviceLanchAppConfig): stdLib.Promise[scala.Unit] = js.native
  /**
               * Mock opening the app from URL. sourceApp is an optional parameter to specify source application bundle id.
               * @param url
               */
  def openURL(url: detoxLib.Anon_Url): stdLib.Promise[scala.Unit] = js.native
  /**
               * Simulate press back button (Android Only)
               */
  def pressBack(): stdLib.Promise[scala.Unit] = js.native
  /**
               * If this is a React Native app, reload the React Native JS bundle. This action is much faster than device.launchApp(), and can be used if you just need to reset your React Native logic.
               * @example await device.reloadReactNative()
               */
  def reloadReactNative(): stdLib.Promise[scala.Unit] = js.native
  /**
               * Resets the Simulator to clean state (like the Simulator > Reset Content and Settings... menu item), especially removing previously set permissions.
               * @example await device.resetContentAndSettings();
               */
  def resetContentAndSettings(): stdLib.Promise[scala.Unit] = js.native
  /**
               * Send application to background by bringing com.apple.springboard to the foreground.
               * Combining sendToHome() with launchApp({newInstance: false}) will simulate app coming back from background.
               * @example await device.sendToHome();
               * await device.launchApp({newInstance: false});
               */
  def sendToHome(): stdLib.Promise[scala.Unit] = js.native
  /**
               * Mock handling of received user activity when app is in foreground.
               * @param params
               */
  def sendUserActivity(params: js.Any*): stdLib.Promise[scala.Unit] = js.native
  /**
               * Mock handling of received user notification when app is in foreground.
               * @param params
               */
  def sendUserNotification(params: js.Any*): stdLib.Promise[scala.Unit] = js.native
  /**
               * Note: setLocation is dependent on fbsimctl. if fbsimctl is not installed, the command will fail, it must be installed. Sets the simulator location to the given latitude and longitude.
               * @param lat
               * @param lon
               * @example await device.setLocation(32.0853, 34.7818);
               */
  def setLocation(lat: scala.Double, lon: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
               * Takes "portrait" or "landscape" and rotates the device to the given orientation. Currently only available in the iOS Simulator.
               * @param orientation
               */
  def setOrientation(orientation: Orientation): stdLib.Promise[scala.Unit] = js.native
  /**
               * Disable EarlGrey's network synchronization mechanism on preffered endpoints. Usful if you want to on skip over synchronizing on certain URLs.
               * @param urls
               * @example await device.setURLBlacklist(['.*127.0.0.1.*']);
               */
  def setURLBlacklist(urls: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /**
               * Simulate shake (iOS Only)
               */
  def shake(): stdLib.Promise[scala.Unit] = js.native
  /**
               * By default, terminateApp() with no params will terminate the app
               * To terminate another app, specify its bundle id
               * @param bundle
               * @example await device.terminateApp('other.bundle.id');
               */
  def terminateApp(): stdLib.Promise[scala.Unit] = js.native
  /**
               * By default, terminateApp() with no params will terminate the app
               * To terminate another app, specify its bundle id
               * @param bundle
               * @example await device.terminateApp('other.bundle.id');
               */
  def terminateApp(bundle: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
               * By default, uninstallApp() with no params will uninstall the app defined in the current configuration.
               * To uninstall another app, specify its bundle id
               * @param bundle
               * @example await device.installApp('other.bundle.id');
               */
  def uninstallApp(): stdLib.Promise[scala.Unit] = js.native
  /**
               * By default, uninstallApp() with no params will uninstall the app defined in the current configuration.
               * To uninstall another app, specify its bundle id
               * @param bundle
               * @example await device.installApp('other.bundle.id');
               */
  def uninstallApp(bundle: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}


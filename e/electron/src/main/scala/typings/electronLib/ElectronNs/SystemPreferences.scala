package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemPreferences extends EventEmitter {
  def addListener(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("askForMediaAccess")
  def askForMediaAccess_camera(mediaType: electronLib.electronLibStrings.camera): js.Promise[scala.Boolean] = js.native
  /**
    * Important: In order to properly leverage this API, you must set the
    * NSMicrophoneUsageDescription and NSCameraUsageDescription strings in your app's
    * Info.plist file. The values for these keys will be used to populate the
    * permission dialogs so that the user will be properly informed as to the purpose
    * of the permission request. See Electron Application Distribution for more
    * information about how to set these in the context of Electron. This user consent
    * was not required until macOS 10.14 Mojave, so this method will always return
    * true if your system is running 10.13 High Sierra or lower.
    */
  @JSName("askForMediaAccess")
  def askForMediaAccess_microphone(mediaType: electronLib.electronLibStrings.microphone): js.Promise[scala.Boolean] = js.native
  def getAccentColor(): java.lang.String = js.native
  /**
    * Gets the macOS appearance setting that you have declared you want for your
    * application, maps to NSApplication.appearance. You can use the
    * setAppLevelAppearance API to set this value.
    */
  def getAppLevelAppearance(): electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light | electronLib.electronLibStrings.unknown = js.native
  def getColor(
    color: electronLib.electronLibStrings.`3d-dark-shadow` | electronLib.electronLibStrings.`3d-face` | electronLib.electronLibStrings.`3d-highlight` | electronLib.electronLibStrings.`3d-light` | electronLib.electronLibStrings.`3d-shadow` | electronLib.electronLibStrings.`active-border` | electronLib.electronLibStrings.`active-caption` | electronLib.electronLibStrings.`active-caption-gradient` | electronLib.electronLibStrings.`app-workspace` | electronLib.electronLibStrings.`button-text` | electronLib.electronLibStrings.`caption-text` | electronLib.electronLibStrings.desktop | electronLib.electronLibStrings.`disabled-text` | electronLib.electronLibStrings.highlight | electronLib.electronLibStrings.`highlight-text` | electronLib.electronLibStrings.hotlight | electronLib.electronLibStrings.`inactive-border` | electronLib.electronLibStrings.`inactive-caption` | electronLib.electronLibStrings.`inactive-caption-gradient` | electronLib.electronLibStrings.`inactive-caption-text` | electronLib.electronLibStrings.`info-background` | electronLib.electronLibStrings.`info-text` | electronLib.electronLibStrings.menu | electronLib.electronLibStrings.`menu-highlight` | electronLib.electronLibStrings.menubar | electronLib.electronLibStrings.`menu-text` | electronLib.electronLibStrings.scrollbar | electronLib.electronLibStrings.window | electronLib.electronLibStrings.`window-frame` | electronLib.electronLibStrings.`window-text`
  ): java.lang.String = js.native
  /**
    * Gets the macOS appearance setting that is currently applied to your application,
    * maps to NSApplication.effectiveAppearance Please note that until Electron is
    * built targeting the 10.14 SDK, your application's effectiveAppearance will
    * default to 'light' and won't inherit the OS preference. In the interim in order
    * for your application to inherit the OS preference you must set the
    * NSRequiresAquaSystemAppearance key in your apps Info.plist to false.  If you are
    * using electron-packager or electron-forge just set the enableDarwinDarkMode
    * packager option to true.  See the Electron Packager API for more details.
    */
  def getEffectiveAppearance(): electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light | electronLib.electronLibStrings.unknown = js.native
  /**
    * This user consent was not required until macOS 10.14 Mojave, so this method will
    * always return granted if your system is running 10.13 High Sierra or lower.
    */
  def getMediaAccessStatus(mediaType: java.lang.String): electronLib.electronLibStrings.`not-determined` | electronLib.electronLibStrings.granted | electronLib.electronLibStrings.denied | electronLib.electronLibStrings.restricted | electronLib.electronLibStrings.unknown = js.native
  @JSName("getUserDefault")
  def getUserDefault_array(key: java.lang.String, `type`: electronLib.electronLibStrings.array): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_boolean(key: java.lang.String, `type`: electronLib.electronLibStrings.boolean): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_dictionary(key: java.lang.String, `type`: electronLib.electronLibStrings.dictionary): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_double(key: java.lang.String, `type`: electronLib.electronLibStrings.double): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_float(key: java.lang.String, `type`: electronLib.electronLibStrings.float): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_integer(key: java.lang.String, `type`: electronLib.electronLibStrings.integer): js.Any = js.native
  /**
    * Some popular key and types are:
    */
  @JSName("getUserDefault")
  def getUserDefault_string(key: java.lang.String, `type`: electronLib.electronLibStrings.string): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_url(key: java.lang.String, `type`: electronLib.electronLibStrings.url): js.Any = js.native
  /**
    * An example of using it to determine if you should create a transparent window or
    * not (transparent windows won't work correctly when DWM composition is disabled):
    */
  def isAeroGlassEnabled(): scala.Boolean = js.native
  def isDarkMode(): scala.Boolean = js.native
  def isInvertedColorScheme(): scala.Boolean = js.native
  def isSwipeTrackingFromScrollEventsEnabled(): scala.Boolean = js.native
  def isTrustedAccessibilityClient(prompt: scala.Boolean): scala.Boolean = js.native
  /**
    * NOTE: This event is only emitted after you have called
    * startAppLevelAppearanceTrackingOS
    */
  def on(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  // Docs: http://electronjs.org/docs/api/system-preferences
  @JSName("on")
  def `on_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  def once(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postLocalNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postWorkspaceNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
    * Add the specified defaults to your application's NSUserDefaults.
    */
  def registerDefaults(defaults: js.Any): scala.Unit = js.native
  def removeListener(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Removes the key in NSUserDefaults. This can be used to restore the default or
    * global value of a key previously set with setUserDefault.
    */
  def removeUserDefault(key: java.lang.String): scala.Unit = js.native
  /**
    * Sets the appearance setting for your application, this should override the
    * system default and override the value of getEffectiveAppearance.
    */
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_dark(appearance: electronLib.electronLibStrings.dark): scala.Unit = js.native
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_light(appearance: electronLib.electronLibStrings.light): scala.Unit = js.native
  /**
    * Set the value of key in NSUserDefaults. Note that type should match actual type
    * of value. An exception is thrown if they don't. Some popular key and types are:
    */
  def setUserDefault(key: java.lang.String, `type`: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Same as subscribeNotification, but uses NSNotificationCenter for local defaults.
    * This is necessary for events such as NSUserDefaultsDidChangeNotification.
    */
  def subscribeLocalNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Double = js.native
  /**
    * Subscribes to native notifications of macOS, callback will be called with
    * callback(event, userInfo) when the corresponding event happens. The userInfo is
    * an Object that contains the user information dictionary sent along with the
    * notification. The id of the subscriber is returned, which can be used to
    * unsubscribe the event. Under the hood this API subscribes to
    * NSDistributedNotificationCenter, example values of event are:
    */
  def subscribeNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Double = js.native
  /**
    * Same as subscribeNotification, but uses
    * NSWorkspace.sharedWorkspace.notificationCenter. This is necessary for events
    * such as NSWorkspaceDidActivateApplicationNotification.
    */
  def subscribeWorkspaceNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Same as unsubscribeNotification, but removes the subscriber from
    * NSNotificationCenter.
    */
  def unsubscribeLocalNotification(id: scala.Double): scala.Unit = js.native
  /**
    * Removes the subscriber with id.
    */
  def unsubscribeNotification(id: scala.Double): scala.Unit = js.native
  /**
    * Same as unsubscribeNotification, but removes the subscriber from
    * NSWorkspace.sharedWorkspace.notificationCenter.
    */
  def unsubscribeWorkspaceNotification(id: scala.Double): scala.Unit = js.native
}


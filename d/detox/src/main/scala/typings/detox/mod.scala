package typings.detox

import org.scalablytyped.runtime.Shortcut
import typings.detox.anon.AddEventsListener
import typings.detox.anon.SourceApp
import typings.detox.anon.X
import typings.detox.detoxStrings.android
import typings.detox.detoxStrings.ios
import typings.detox.mod.global.Detox_.Detox
import typings.detox.mod.global.Detox_.DetoxCircus
import typings.detox.mod.global.Detox_.DetoxExport
import typings.detox.mod.global.Detox_.Device
import typings.detox.mod.global.Detox_.Element
import typings.detox.mod.global.Detox_.Expect
import typings.detox.mod.global.Detox_.Matchers
import typings.detox.mod.global.Detox_.WaitFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detox", JSImport.Namespace)
  @js.native
  val ^ : DetoxExport = js.native
  
  object global {
    
    @JSGlobal("by")
    @js.native
    val by: Matchers = js.native
    
    @JSGlobal("detox")
    @js.native
    val detox: Detox = js.native
    
    @JSGlobal("detoxCircus")
    @js.native
    val detoxCircus: DetoxCircus = js.native
    
    @JSGlobal("device")
    @js.native
    val device: Device = js.native
    
    @JSGlobal("element")
    @js.native
    val element: Element = js.native
    
    @JSGlobal("expect")
    @js.native
    val expect: Expect[Expect[js.Promise[Unit]]] = js.native
    
    @JSGlobal("waitFor")
    @js.native
    val waitFor: WaitFor = js.native
    
    object Detox_ {
      
      @js.native
      trait Actions[R] extends StObject {
        
        /**
          * Clear text from a text field.
          * @example
          * await element(by.id('textField')).clearText();
          */
        def clearText(): js.Promise[Actions[R]] = js.native
        
        /**
          * Simulate long press on an element
          * @example
          * await element(by.id('tappable')).longPress();
          */
        def longPress(): js.Promise[Actions[R]] = js.native
        
        /**
          * Simulate multiple taps on an element.
          * @param times number of times to tap
          * @example
          * await element(by.id('tappable')).multiTap(3);
          */
        def multiTap(times: Double): js.Promise[Actions[R]] = js.native
        
        /**
          * Pinches in the given direction with speed and angle. (iOS only)
          * @param direction
          * @param speed
          * @param angle value in radiant, default is `0`
          * @example
          * await expect(element(by.id('PinchableScrollView'))).toBeVisible();
          * await element(by.id('PinchableScrollView')).pinchWithAngle('outward', 'slow', 0);
          */
        def pinchWithAngle(direction: Direction, speed: Speed, angle: Double): js.Promise[Actions[R]] = js.native
        
        /**
          * Paste text into a text field.
          * @param text
          * @example
          * await element(by.id('textField')).replaceText('passcode again');
          */
        def replaceText(text: String): js.Promise[Actions[R]] = js.native
        
        /**
          * Scrolls a given amount of pixels in the provided direction, starting from the provided start positions.
          * @param pixels - independent device pixels
          * @param direction - left/right/up/down
          * @param @optional startPositionX - the X starting scroll position, in percentage; valid input: `[0.0, 1.0]`, `NaN`; default: `NaN`—choose the best value automatically
          * @param @optional startPositionY - the Y starting scroll position, in percentage; valid input: `[0.0, 1.0]`, `NaN`; default: `NaN`—choose the best value automatically
          * @example
          * await element(by.id('scrollView')).scroll(100, 'down', NaN, 0.85);
          * await element(by.id('scrollView')).scroll(100, 'up');
          */
        def scroll(pixels: Double, direction: Direction): js.Promise[Actions[R]] = js.native
        def scroll(
          pixels: Double,
          direction: Direction,
          startPositionX: js.UndefOr[scala.Nothing],
          startPositionY: Double
        ): js.Promise[Actions[R]] = js.native
        def scroll(pixels: Double, direction: Direction, startPositionX: Double): js.Promise[Actions[R]] = js.native
        def scroll(pixels: Double, direction: Direction, startPositionX: Double, startPositionY: Double): js.Promise[Actions[R]] = js.native
        
        /**
          * Scroll to edge.
          * @param edge
          * @example
          * await element(by.id('scrollView')).scrollTo('bottom');
          * await element(by.id('scrollView')).scrollTo('top');
          */
        def scrollTo(edge: Direction): js.Promise[Actions[R]] = js.native
        
        /**
          * Sets a picker view’s column to the given value. This function supports both date pickers and general picker views. (iOS Only)
          * @param column number of datepicker column (starts from 0)
          * @param value string value in setted column (must be correct)
          * @example a
          * wait expect(element(by.type('UIPickerView'))).toBeVisible();
          * await element(by.type('UIPickerView')).setColumnToValue(1,"6");
          * await element(by.type('UIPickerView')).setColumnToValue(2,"34");
          *
          * > Note: When working with date pickers, you should always set an explicit locale when launching your app in order to prevent flakiness from different date and time styles.
          * See [here](https://github.com/wix/Detox/blob/master/docs/APIRef.DeviceObjectAPI.md#9-launch-with-a-specific-language-ios-only) for more information.
          */
        def setColumnToValue(column: Double, value: String): js.Promise[Actions[R]] = js.native
        
        /**
          * Sets the date of a date picker to a date generated from the provided string and date format. (iOS only)
          * @param dateString string representing a date in the supplied `dateFormat`
          * @param dateFormat format for the `dateString` supplied
          * @example
          * await expect(element(by.id('datePicker'))).toBeVisible();
          * await element(by.id('datePicker')).setDatePickerDate('2019-02-06T05:10:00-08:00', "yyyy-MM-dd'T'HH:mm:ssZZZZZ");
          */
        def setDatePickerDate(dateString: String, dateFormat: String): js.Promise[Actions[R]] = js.native
        
        /**
          * Swipes in the provided direction at the provided speed, started from percentage.
          * @param direction
          * @param speed default: `fast`
          * @param @optional percentage screen percentage to swipe; valid input: `[0.0, 1.0]`
          * @example
          * await element(by.id('scrollView')).swipe('down');
          * await element(by.id('scrollView')).swipe('down', 'fast');
          * await element(by.id('scrollView')).swipe('down', 'fast', 0.5);
          */
        def swipe(direction: Direction): js.Promise[Actions[R]] = js.native
        def swipe(direction: Direction, speed: js.UndefOr[scala.Nothing], percentage: Double): js.Promise[Actions[R]] = js.native
        def swipe(direction: Direction, speed: Speed): js.Promise[Actions[R]] = js.native
        def swipe(direction: Direction, speed: Speed, percentage: Double): js.Promise[Actions[R]] = js.native
        
        /**
          * Simulate tap on an element
          * @example
          * await element(by.id('tappable')).tap();
          */
        def tap(): js.Promise[Actions[R]] = js.native
        
        /**
          * Simulate tap at a specific point on an element.
          * Note: The point coordinates are relative to the matched element and the element size could changes on different devices or even when changing the device font size.
          * @param point
          * @example
          * await element(by.id('tappable')).tapAtPoint({ x:5, y:10 });
          */
        def tapAtPoint(point: X): js.Promise[Actions[R]] = js.native
        
        /**
          * Taps the backspace key on the built-in keyboard.
          * @example
          * await element(by.id('textField')).tapBackspaceKey();
          */
        def tapBackspaceKey(): js.Promise[Actions[R]] = js.native
        
        /**
          * Taps the return key on the built-in keyboard.
          * @example
          * await element(by.id('textField')).tapReturnKey();
          */
        def tapReturnKey(): js.Promise[Actions[R]] = js.native
        
        /**
          * Use the builtin keyboard to type text into a text field.
          * @param text
          * @example
          * await element(by.id('textField')).typeText('passcode');
          */
        def typeText(text: String): js.Promise[Actions[R]] = js.native
      }
      
      type CalendarPermission = PermissionState
      
      type CameraPermission = PermissionState
      
      @js.native
      trait CircusTestEventListenerBase extends StObject {
        
        def handleTestEvent(event: js.Any, state: js.Any): js.Promise[Unit] = js.native
      }
      object CircusTestEventListenerBase {
        
        @scala.inline
        def apply(handleTestEvent: (js.Any, js.Any) => js.Promise[Unit]): CircusTestEventListenerBase = {
          val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent))
          __obj.asInstanceOf[CircusTestEventListenerBase]
        }
        
        @scala.inline
        implicit class CircusTestEventListenerBaseMutableBuilder[Self <: CircusTestEventListenerBase] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHandleTestEvent(value: (js.Any, js.Any) => js.Promise[Unit]): Self = StObject.set(x, "handleTestEvent", js.Any.fromFunction2(value))
        }
      }
      
      type ContactsPermission = PermissionState
      
      @js.native
      trait Detox extends StObject {
        
        /**
          * Artifacts currently include only logs from the app process after each task
          * @param args
          */
        def afterEach(args: js.Any*): js.Promise[Unit] = js.native
        
        /**
          * Artifacts currently include only logs from the app process before each task
          * @param args
          */
        def beforeEach(args: js.Any*): js.Promise[Unit] = js.native
        
        /**
          * The cleanup phase should happen after all the tests have finished. This is the phase where detox-server shuts down.
          * @example after(async () => {
          *  await detox.cleanup();
          * });
          */
        def cleanup(): js.Promise[Unit] = js.native
        
        /**
          * The setup phase happens inside detox.init(). This is the phase where detox reads its configuration, starts a server, loads its expection library and starts a simulator
          * @param config
          * @param options
          * @example const config = require('../package.json').detox;
          *
          * before(async () => {
          *      await detox.init(config);
          * });
          */
        def init(config: js.Any): js.Promise[Unit] = js.native
        def init(config: js.Any, options: DetoxInitOptions): js.Promise[Unit] = js.native
      }
      
      type DetoxAny = Element with Actions[_] with WaitFor
      
      @js.native
      trait DetoxCircus extends StObject {
        
        /**
          * A get function that Enables access to this instance (single in each worker's scope)
          */
        def getEnv(): AddEventsListener = js.native
      }
      object DetoxCircus {
        
        @scala.inline
        def apply(getEnv: () => AddEventsListener): DetoxCircus = {
          val __obj = js.Dynamic.literal(getEnv = js.Any.fromFunction0(getEnv))
          __obj.asInstanceOf[DetoxCircus]
        }
        
        @scala.inline
        implicit class DetoxCircusMutableBuilder[Self <: DetoxCircus] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGetEnv(value: () => AddEventsListener): Self = StObject.set(x, "getEnv", js.Any.fromFunction0(value))
        }
      }
      
      // Detox exports all methods from detox global and all of the global constants.
      @js.native
      trait DetoxExport extends Detox {
        
        def by(by: Matchers): Matchers = js.native
        @JSName("by")
        var by_Original: Matchers = js.native
        
        var device: Device = js.native
        
        def element(by: Matchers): DetoxAny = js.native
        @JSName("element")
        var element_Original: Element = js.native
        
        def expect(element: Element): Expect[js.Promise[Unit]] = js.native
        @JSName("expect")
        var expect_Original: Expect[Expect[js.Promise[Unit]]] = js.native
        
        /**
          * This API polls using the given expectation continuously until the expectation is met. Use manual synchronization with waitFor only as a last resort.
          * NOTE: Every waitFor call must set a timeout using withTimeout(). Calling waitFor without setting a timeout will do nothing.
          * @example await waitFor(element(by.id('UniqueId336'))).toExist().withTimeout(2000);
          */
        def waitFor(element: Element): Expect[WaitFor] = js.native
        @JSName("waitFor")
        var waitFor_Original: WaitFor = js.native
      }
      
      @js.native
      trait DetoxInitOptions extends StObject {
        
        /**
          * Detox exports device, expect, element, by and waitFor as globals by default, if you want to control their initialization manually, set init detox with initGlobals set to false.
          * This is useful when during E2E tests you also need to run regular expectations in node. jest Expect for instance, will not be overriden by Detox when this option is used.
          */
        var initGlobals: js.UndefOr[Boolean] = js.native
        
        /**
          * By default await detox.init(config); will launch the installed app. If you wish to control when your app is launched, add {launchApp: false} param to your init.
          */
        var launchApp: js.UndefOr[Boolean] = js.native
        
        /**
          * By default await detox.init(config); will uninstall and install the app. If you wish to reuse the existing app for a faster run, add {reuse: true} param to your init.
          */
        var reuse: js.UndefOr[Boolean] = js.native
      }
      object DetoxInitOptions {
        
        @scala.inline
        def apply(): DetoxInitOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DetoxInitOptions]
        }
        
        @scala.inline
        implicit class DetoxInitOptionsMutableBuilder[Self <: DetoxInitOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInitGlobals(value: Boolean): Self = StObject.set(x, "initGlobals", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInitGlobalsUndefined: Self = StObject.set(x, "initGlobals", js.undefined)
          
          @scala.inline
          def setLaunchApp(value: Boolean): Self = StObject.set(x, "launchApp", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLaunchAppUndefined: Self = StObject.set(x, "launchApp", js.undefined)
          
          @scala.inline
          def setReuse(value: Boolean): Self = StObject.set(x, "reuse", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReuseUndefined: Self = StObject.set(x, "reuse", js.undefined)
        }
      }
      
      @js.native
      trait Device extends StObject {
        
        /**
          * Clears the simulator keychain (iOS Only)
          */
        def clearKeychain(): js.Promise[Unit] = js.native
        
        /**
          * Disable EarlGrey's synchronization mechanism (enabled by default) This is being reset on every new instance of the app.
          * @example
          * await device.disableSynchronization();
          */
        def disableSynchronization(): js.Promise[Unit] = js.native
        
        /**
          * Enable EarlGrey's synchronization mechanism (enabled by default). This is being reset on every new instance of the app.
          * @example
          * await device.enableSynchronization();
          */
        def enableSynchronization(): js.Promise[Unit] = js.native
        
        /**
          * Returns the current device, ios or android.
          * @example
          * if (device.getPlatform() === 'ios') {
          *     await expect(loopSwitch).toHaveValue('1');
          * }
          */
        def getPlatform(): ios | android = js.native
        
        /**
          * (Android Only)
          * Exposes UiAutomator's UiDevice API (https://developer.android.com/reference/android/support/test/uiautomator/UiDevice).
          * This is not a part of the official Detox API,
          * it may break and change whenever an update to UiDevice or UiAutomator gradle dependencies ('androidx.test.uiautomator:uiautomator') is introduced.
          * UIDevice's autogenerated code reference: https://github.com/wix/Detox/blob/master/detox/src/android/espressoapi/UIDevice.js
          */
        def getUiDevice(): js.Promise[Unit] = js.native
        
        /**
          * Holds the environment-unique ID of the device - namely, the adb ID on Android (e.g. emulator-5554) and the Mac-global simulator UDID on iOS,
          * as used by simctl (e.g. AAAAAAAA-BBBB-CCCC-DDDD-EEEEEEEEEEEE).
          *
          * The value will be undefined until the device is properly prepared (i.e. in detox.init())
          */
        var id: String = js.native
        
        /**
          * By default, installApp() with no params will install the app file defined in the current configuration.
          * To install another app, specify its path
          * @param path
          * @example await device.installApp('path/to/other/app');
          */
        def installApp(): js.Promise[Unit] = js.native
        def installApp(path: js.Any): js.Promise[Unit] = js.native
        
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
        def launchApp(config: DeviceLanchAppConfig): js.Promise[Unit] = js.native
        
        /**
          * Simulates the success of a face match via FaceID (iOS Only)
          */
        def matchFace(): js.Promise[Unit] = js.native
        
        /**
          * Simulates the success of a finger match via TouchID (iOS Only)
          */
        def matchFinger(): js.Promise[Unit] = js.native
        
        /**
          * Holds a descriptive name of the device. Example: emulator-5554 (Pixel_API_26)
          * The value will be undefined until the device is properly prepared (i.e. in detox.init()).
          */
        var name: String = js.native
        
        /**
          * Mock opening the app from URL. sourceApp is an optional parameter to specify source application bundle id.
          * @param url
          */
        def openURL(url: SourceApp): js.Promise[Unit] = js.native
        
        /**
          * Simulate press back button (Android Only)
          * @example
          * await device.pressBack();
          */
        def pressBack(): js.Promise[Unit] = js.native
        
        /**
          * If this is a React Native app, reload the React Native JS bundle. This action is much faster than device.launchApp(), and can be used if you just need to reset your React Native logic.
          * @example await device.reloadReactNative()
          */
        def reloadReactNative(): js.Promise[Unit] = js.native
        
        /**
          * Resets the Simulator to clean state (like the Simulator > Reset Content and Settings... menu item), especially removing previously set permissions.
          * @example
          * await device.resetContentAndSettings();
          */
        def resetContentAndSettings(): js.Promise[Unit] = js.native
        
        /**
          * Send application to background by bringing com.apple.springboard to the foreground.
          * Combining sendToHome() with launchApp({newInstance: false}) will simulate app coming back from background.
          * @example await device.sendToHome();
          * await device.launchApp({newInstance: false});
          */
        def sendToHome(): js.Promise[Unit] = js.native
        
        /**
          * Mock handling of received user activity when app is in foreground.
          * @param params
          */
        def sendUserActivity(params: js.Any*): js.Promise[Unit] = js.native
        
        /**
          * Mock handling of received user notification when app is in foreground.
          * @param params
          */
        def sendUserNotification(params: js.Any*): js.Promise[Unit] = js.native
        
        /**
          * Toggles device enrollment in biometric auth (TouchID or FaceID) (iOS Only)
          * @example
          * await device.setBiometricEnrollment(true);
          * // or
          * await device.setBiometricEnrollment(false);
          */
        def setBiometricEnrollment(enabled: Boolean): js.Promise[Unit] = js.native
        
        /**
          * Note: setLocation is dependent on fbsimctl. if fbsimctl is not installed, the command will fail, it must be installed. Sets the simulator location to the given latitude and longitude.
          * @param lat
          * @param lon
          * @example await device.setLocation(32.0853, 34.7818);
          */
        def setLocation(lat: Double, lon: Double): js.Promise[Unit] = js.native
        
        /**
          * Takes "portrait" or "landscape" and rotates the device to the given orientation. Currently only available in the iOS Simulator.
          * @param orientation
          */
        def setOrientation(orientation: Orientation): js.Promise[Unit] = js.native
        
        /**
          * Disable EarlGrey's network synchronization mechanism on preffered endpoints. Usful if you want to on skip over synchronizing on certain URLs.
          * @param urls
          * @example await device.setURLBlacklist(['.*127.0.0.1.*']);
          */
        def setURLBlacklist(urls: js.Array[String]): js.Promise[Unit] = js.native
        
        /**
          * Simulate shake (iOS Only)
          */
        def shake(): js.Promise[Unit] = js.native
        
        /**
          * Takes a screenshot on the device and schedules putting it to the artifacts folder upon completion of the current test.
          * @param text
          * @example
          * await device.takeScreenshot('tap on menu');
          *
          * • If the test passes, the screenshot will be put to <artifacts-location>/✓ Menu items should have Logout/tap on menu.png.
          * • If the test fails, the screenshot will be put to <artifacts-location>/✗ Menu items should have Logout/tap on menu.png.
          *
          * > NOTE: At the moment, taking screenshots on-demand in --take-screenshots failing mode is not yet implemented.
          */
        def takeScreenshot(name: String): js.Promise[Unit] = js.native
        
        /**
          * By default, terminateApp() with no params will terminate the app
          * To terminate another app, specify its bundle id
          * @param bundle
          * @example await device.terminateApp('other.bundle.id');
          */
        def terminateApp(): js.Promise[Unit] = js.native
        def terminateApp(bundle: String): js.Promise[Unit] = js.native
        
        /**
          * By default, uninstallApp() with no params will uninstall the app defined in the current configuration.
          * To uninstall another app, specify its bundle id
          * @param bundle
          * @example await device.installApp('other.bundle.id');
          */
        def uninstallApp(): js.Promise[Unit] = js.native
        def uninstallApp(bundle: String): js.Promise[Unit] = js.native
        
        /**
          * Simulates the failure of a face match via FaceID (iOS Only)
          */
        def unmatchFace(): js.Promise[Unit] = js.native
        
        /**
          * Simulates the failure of a finger match via TouchID (iOS Only)
          */
        def unmatchFinger(): js.Promise[Unit] = js.native
      }
      
      @js.native
      trait DeviceLanchAppConfig extends StObject {
        
        /**
          * Launch into a fresh installation
          * A flag that enables relaunching into a fresh installation of the app (it will uninstall and install the binary again), default is false.
          */
        var delete: js.UndefOr[Boolean] = js.native
        
        /**
          * Launch config for specifying the native language and locale
          */
        var languageAndLocale: js.UndefOr[LanguageAndLocale] = js.native
        
        /**
          * Detox can start the app with additional launch arguments
          * The added launchArgs will be passed through the launch command to the device and be accessible via [[NSProcessInfo processInfo] arguments]
          */
        var launchArgs: js.UndefOr[js.Any] = js.native
        
        /**
          * Restart the app
          * Terminate the app and launch it again. If set to false, the simulator will try to bring app from background, if the app isn't running, it will launch a new instance. default is false
          */
        var newInstance: js.UndefOr[Boolean] = js.native
        
        /**
          * Set runtime permissions
          * Grant or deny runtime permissions for your application.
          */
        var permissions: js.UndefOr[DevicePermissions] = js.native
        
        /**
          * Launch from URL
          * Mock opening the app from URL to test your app's deep link handling mechanism.
          */
        var url: js.UndefOr[js.Any] = js.native
        
        /**
          * Launch with user activity
          */
        var userActivity: js.UndefOr[js.Any] = js.native
        
        /**
          * Launch with user notifications
          */
        var userNotification: js.UndefOr[js.Any] = js.native
      }
      object DeviceLanchAppConfig {
        
        @scala.inline
        def apply(): DeviceLanchAppConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DeviceLanchAppConfig]
        }
        
        @scala.inline
        implicit class DeviceLanchAppConfigMutableBuilder[Self <: DeviceLanchAppConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
          
          @scala.inline
          def setLanguageAndLocale(value: LanguageAndLocale): Self = StObject.set(x, "languageAndLocale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLanguageAndLocaleUndefined: Self = StObject.set(x, "languageAndLocale", js.undefined)
          
          @scala.inline
          def setLaunchArgs(value: js.Any): Self = StObject.set(x, "launchArgs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLaunchArgsUndefined: Self = StObject.set(x, "launchArgs", js.undefined)
          
          @scala.inline
          def setNewInstance(value: Boolean): Self = StObject.set(x, "newInstance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNewInstanceUndefined: Self = StObject.set(x, "newInstance", js.undefined)
          
          @scala.inline
          def setPermissions(value: DevicePermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
          
          @scala.inline
          def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
          
          @scala.inline
          def setUserActivity(value: js.Any): Self = StObject.set(x, "userActivity", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserActivityUndefined: Self = StObject.set(x, "userActivity", js.undefined)
          
          @scala.inline
          def setUserNotification(value: js.Any): Self = StObject.set(x, "userNotification", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserNotificationUndefined: Self = StObject.set(x, "userNotification", js.undefined)
        }
      }
      
      /**
        *  Source for string definitions is https://github.com/wix/AppleSimulatorUtils
        */
      @js.native
      trait DevicePermissions extends StObject {
        
        var calendar: js.UndefOr[CalendarPermission] = js.native
        
        var camera: js.UndefOr[CameraPermission] = js.native
        
        var contacts: js.UndefOr[ContactsPermission] = js.native
        
        var faceid: js.UndefOr[FaceIDPermission] = js.native
        
        var health: js.UndefOr[HealthPermission] = js.native
        
        var homekit: js.UndefOr[HomekitPermission] = js.native
        
        var location: js.UndefOr[LocationPermission] = js.native
        
        var medialibrary: js.UndefOr[MediaLibraryPermission] = js.native
        
        var microphone: js.UndefOr[MicrophonePermission] = js.native
        
        var motion: js.UndefOr[MotionPermission] = js.native
        
        var notifications: js.UndefOr[NotificationsPermission] = js.native
        
        var photos: js.UndefOr[PhotosPermission] = js.native
        
        var reminders: js.UndefOr[RemindersPermission] = js.native
        
        var siri: js.UndefOr[SiriPermission] = js.native
        
        var speech: js.UndefOr[SpeechPermission] = js.native
      }
      object DevicePermissions {
        
        @scala.inline
        def apply(): DevicePermissions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DevicePermissions]
        }
        
        @scala.inline
        implicit class DevicePermissionsMutableBuilder[Self <: DevicePermissions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCalendar(value: CalendarPermission): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
          
          @scala.inline
          def setCamera(value: CameraPermission): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
          
          @scala.inline
          def setContacts(value: ContactsPermission): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
          
          @scala.inline
          def setFaceid(value: FaceIDPermission): Self = StObject.set(x, "faceid", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFaceidUndefined: Self = StObject.set(x, "faceid", js.undefined)
          
          @scala.inline
          def setHealth(value: HealthPermission): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
          
          @scala.inline
          def setHomekit(value: HomekitPermission): Self = StObject.set(x, "homekit", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHomekitUndefined: Self = StObject.set(x, "homekit", js.undefined)
          
          @scala.inline
          def setLocation(value: LocationPermission): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          @scala.inline
          def setMedialibrary(value: MediaLibraryPermission): Self = StObject.set(x, "medialibrary", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMedialibraryUndefined: Self = StObject.set(x, "medialibrary", js.undefined)
          
          @scala.inline
          def setMicrophone(value: MicrophonePermission): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMicrophoneUndefined: Self = StObject.set(x, "microphone", js.undefined)
          
          @scala.inline
          def setMotion(value: MotionPermission): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
          
          @scala.inline
          def setNotifications(value: NotificationsPermission): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
          
          @scala.inline
          def setPhotos(value: PhotosPermission): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
          
          @scala.inline
          def setReminders(value: RemindersPermission): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
          
          @scala.inline
          def setSiri(value: SiriPermission): Self = StObject.set(x, "siri", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSiriUndefined: Self = StObject.set(x, "siri", js.undefined)
          
          @scala.inline
          def setSpeech(value: SpeechPermission): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.detox.detoxStrings.left
        - typings.detox.detoxStrings.right
        - typings.detox.detoxStrings.top
        - typings.detox.detoxStrings.bottom
        - typings.detox.detoxStrings.up
        - typings.detox.detoxStrings.down
      */
      trait Direction extends StObject
      object Direction {
        
        @scala.inline
        def bottom: typings.detox.detoxStrings.bottom = "bottom".asInstanceOf[typings.detox.detoxStrings.bottom]
        
        @scala.inline
        def down: typings.detox.detoxStrings.down = "down".asInstanceOf[typings.detox.detoxStrings.down]
        
        @scala.inline
        def left: typings.detox.detoxStrings.left = "left".asInstanceOf[typings.detox.detoxStrings.left]
        
        @scala.inline
        def right: typings.detox.detoxStrings.right = "right".asInstanceOf[typings.detox.detoxStrings.right]
        
        @scala.inline
        def top: typings.detox.detoxStrings.top = "top".asInstanceOf[typings.detox.detoxStrings.top]
        
        @scala.inline
        def up: typings.detox.detoxStrings.up = "up".asInstanceOf[typings.detox.detoxStrings.up]
      }
      
      @js.native
      trait Element extends StObject {
        
        def apply(by: Matchers): DetoxAny = js.native
        
        /**
          * Choose from multiple elements matching the same matcher using index
          * @param index
          * @example await element(by.text('Product')).atIndex(2);
          */
        def atIndex(index: Double): DetoxAny = js.native
      }
      
      @js.native
      trait Expect[R] extends StObject {
        
        def apply(element: Element): Expect[js.Promise[Unit]] = js.native
        
        /**
          * Negate the expectation.
          * @example await expect(element(by.id('UniqueId205'))).not.toBeVisible();
          */
        def not(element: Element): Expect[js.Promise[Unit]] = js.native
        /**
          * Negate the expectation.
          * @example await expect(element(by.id('UniqueId205'))).not.toBeVisible();
          */
        @JSName("not")
        var not_Original: Expect[js.Promise[Unit]] = js.native
        
        /**
          * Expect the view to not be visible.
          * @example await expect(element(by.id('UniqueId205'))).toBeNotVisible();
          */
        def toBeNotVisible(): R = js.native
        
        /**
          * Expect the view to be at least 75% visible.
          * @example await expect(element(by.id('UniqueId204'))).toBeVisible();
          */
        def toBeVisible(): R = js.native
        
        /**
          * Expect the view to exist in the UI hierarchy.
          * @example await expect(element(by.id('UniqueId205'))).toExist();
          */
        def toExist(): R = js.native
        
        /**
          * In React Native apps, expect UI component to have testID with that id.
          * In native iOS apps, expect UI element to have accesibilityIdentifier with that id.
          * @param id
          * @example await expect(element(by.text('I contain some text'))).toHaveId('UniqueId204');
          */
        def toHaveId(id: String): R = js.native
        
        /**
          * It searches by accessibilityLabel on iOS, or by contentDescription on Android.
          * In React Native it can be set for both platforms by defining an accessibilityLabel on the view.
          * @param label
          * @example await expect(element(by.id('UniqueId204'))).toHaveLabel('Done');
          */
        def toHaveLabel(label: String): R = js.native
        
        /**
          * In React Native apps, expect UI component of type <Text> to have text.
          * In native iOS apps, expect UI elements of type UIButton, UILabel, UITextField or UITextViewIn to have inputText with text.
          * @param text
          * @example await expect(element(by.id('UniqueId204'))).toHaveText('I contain some text');
          */
        def toHaveText(text: String): R = js.native
        
        /**
          * Expect components like a Switch to have a value ('0' for off, '1' for on).
          * @param value
          * @example await expect(element(by.id('UniqueId533'))).toHaveValue('0');
          */
        def toHaveValue(value: js.Any): R = js.native
        
        /**
          * Expect the view to not exist in the UI hierarchy.
          * @example await expect(element(by.id('RandomJunk959'))).toNotExist();
          */
        def toNotExist(): R = js.native
      }
      
      type FaceIDPermission = PermissionState
      
      type HealthPermission = PermissionState
      
      type HomekitPermission = PermissionState
      
      @js.native
      trait LanguageAndLocale extends StObject {
        
        var language: js.UndefOr[String] = js.native
        
        var locale: js.UndefOr[String] = js.native
      }
      object LanguageAndLocale {
        
        @scala.inline
        def apply(): LanguageAndLocale = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LanguageAndLocale]
        }
        
        @scala.inline
        implicit class LanguageAndLocaleMutableBuilder[Self <: LanguageAndLocale] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
          
          @scala.inline
          def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.detox.detoxStrings.always
        - typings.detox.detoxStrings.inuse
        - typings.detox.detoxStrings.never
        - typings.detox.detoxStrings.unset
      */
      trait LocationPermission extends StObject
      object LocationPermission {
        
        @scala.inline
        def always: typings.detox.detoxStrings.always = "always".asInstanceOf[typings.detox.detoxStrings.always]
        
        @scala.inline
        def inuse: typings.detox.detoxStrings.inuse = "inuse".asInstanceOf[typings.detox.detoxStrings.inuse]
        
        @scala.inline
        def never: typings.detox.detoxStrings.never = "never".asInstanceOf[typings.detox.detoxStrings.never]
        
        @scala.inline
        def unset: typings.detox.detoxStrings.unset = "unset".asInstanceOf[typings.detox.detoxStrings.unset]
      }
      
      @js.native
      trait Matchers extends StObject {
        
        def apply(by: Matchers): Matchers = js.native
        
        /**
          * Find an element by multiple matchers
          * @param by
          * @example await element(by.text('Product').and(by.id('product_name'));
          */
        def and(by: Matchers): Matchers = js.native
        
        /**
          * by.id will match an id that is given to the view via testID prop.
          * @param id
          * @example // In a React Native component add testID like so:
          * <TouchableOpacity testID={'tap_me'}>
          * // Then match with by.id:
          * await element(by.id('tap_me'));
          */
        def id(id: String): Matchers = js.native
        
        /**
          * Find an element by accessibilityLabel on iOS, or by contentDescription on Android.
          * @param label
          * @example await element(by.label('Welcome'));
          */
        def label(label: String): Matchers = js.native
        
        /**
          * Find an element by text, useful for text fields, buttons.
          * @param text
          * @example await element(by.text('Tap Me'));
          */
        def text(text: String): Matchers = js.native
        
        /**
          * Find an element with an accessibility trait. (iOS only)
          * @example await element(by.traits(['button']));
          */
        def traits(traits: js.Array[String]): Matchers = js.native
        
        /**
          * Find an element by native view type.
          * @param nativeViewType
          * @example await element(by.type('RCTImageView'));
          */
        def `type`(nativeViewType: String): Matchers = js.native
        
        /**
          * Find an element by a matcher with a parent matcher
          * @param parentBy
          * @example await element(by.id('Grandson883').withAncestor(by.id('Son883')));
          */
        def withAncestor(parentBy: Matchers): Matchers = js.native
        
        /**
          * Find an element by a matcher with a child matcher
          * @param childBy
          * @example await element(by.id('Son883').withDescendant(by.id('Grandson883')));
          */
        def withDescendant(childBy: Matchers): Matchers = js.native
      }
      
      type MediaLibraryPermission = PermissionState
      
      type MicrophonePermission = PermissionState
      
      type MotionPermission = PermissionState
      
      type NotificationsPermission = PermissionState
      
      /* Rewritten from type alias, can be one of: 
        - typings.detox.detoxStrings.portrait
        - typings.detox.detoxStrings.landscape
      */
      trait Orientation extends StObject
      object Orientation {
        
        @scala.inline
        def landscape: typings.detox.detoxStrings.landscape = "landscape".asInstanceOf[typings.detox.detoxStrings.landscape]
        
        @scala.inline
        def portrait: typings.detox.detoxStrings.portrait = "portrait".asInstanceOf[typings.detox.detoxStrings.portrait]
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.detox.detoxStrings.YES
        - typings.detox.detoxStrings.NO
        - typings.detox.detoxStrings.unset
      */
      trait PermissionState extends StObject
      object PermissionState {
        
        @scala.inline
        def NO: typings.detox.detoxStrings.NO = "NO".asInstanceOf[typings.detox.detoxStrings.NO]
        
        @scala.inline
        def YES: typings.detox.detoxStrings.YES = "YES".asInstanceOf[typings.detox.detoxStrings.YES]
        
        @scala.inline
        def unset: typings.detox.detoxStrings.unset = "unset".asInstanceOf[typings.detox.detoxStrings.unset]
      }
      
      type PhotosPermission = PermissionState
      
      type RemindersPermission = PermissionState
      
      type SiriPermission = PermissionState
      
      type SpeechPermission = PermissionState
      
      /* Rewritten from type alias, can be one of: 
        - typings.detox.detoxStrings.fast
        - typings.detox.detoxStrings.slow
      */
      trait Speed extends StObject
      object Speed {
        
        @scala.inline
        def fast: typings.detox.detoxStrings.fast = "fast".asInstanceOf[typings.detox.detoxStrings.fast]
        
        @scala.inline
        def slow: typings.detox.detoxStrings.slow = "slow".asInstanceOf[typings.detox.detoxStrings.slow]
      }
      
      @js.native
      trait WaitFor extends StObject {
        
        /**
          * This API polls using the given expectation continuously until the expectation is met. Use manual synchronization with waitFor only as a last resort.
          * NOTE: Every waitFor call must set a timeout using withTimeout(). Calling waitFor without setting a timeout will do nothing.
          * @example await waitFor(element(by.id('UniqueId336'))).toExist().withTimeout(2000);
          */
        def apply(element: Element): Expect[WaitFor] = js.native
        
        /**
          * Performs the action repeatedly on the element until an expectation is met
          * @param by
          * @example await waitFor(element(by.text('Text5'))).toBeVisible().whileElement(by.id('ScrollView630')).scroll(50, 'down');
          */
        def whileElement(by: Matchers): DetoxAny = js.native
        
        /**
          * Waits for the condition to be met until the specified time (millis) have elapsed.
          * @param millis number
          * @example await waitFor(element(by.id('UniqueId336'))).toExist().withTimeout(2000);
          */
        def withTimeout(millis: Double): js.Promise[Unit] = js.native
      }
    }
  }
  
  type _To = DetoxExport
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DetoxExport = ^
}

package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
import typings.electron.electronStrings.`accent-color-changed`
import typings.electron.electronStrings.`color-changed`
import typings.electron.electronStrings.`high-contrast-color-scheme-changed`
import typings.electron.electronStrings.`inverted-color-scheme-changed`
import typings.electron.electronStrings.`not-determined`
import typings.electron.electronStrings.array
import typings.electron.electronStrings.blue
import typings.electron.electronStrings.boolean
import typings.electron.electronStrings.brown
import typings.electron.electronStrings.camera
import typings.electron.electronStrings.dark
import typings.electron.electronStrings.denied
import typings.electron.electronStrings.dictionary
import typings.electron.electronStrings.double
import typings.electron.electronStrings.float
import typings.electron.electronStrings.granted
import typings.electron.electronStrings.gray
import typings.electron.electronStrings.green
import typings.electron.electronStrings.integer
import typings.electron.electronStrings.light
import typings.electron.electronStrings.microphone
import typings.electron.electronStrings.orange
import typings.electron.electronStrings.pink
import typings.electron.electronStrings.purple
import typings.electron.electronStrings.red
import typings.electron.electronStrings.restricted
import typings.electron.electronStrings.string
import typings.electron.electronStrings.unknown
import typings.electron.electronStrings.url
import typings.electron.electronStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemPreferences extends EventEmitter {
  @JSName("addListener")
  def addListener_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("askForMediaAccess")
  def askForMediaAccess_camera(mediaType: camera): js.Promise[Boolean] = js.native
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
  def askForMediaAccess_microphone(mediaType: microphone): js.Promise[Boolean] = js.native
  /**
    * NOTE: This API will return false on macOS systems older than Sierra 10.12.2.
    */
  def canPromptTouchID(): Boolean = js.native
  /**
    * This API is only available on macOS 10.14 Mojave or newer.
    */
  def getAccentColor(): String = js.native
  /**
    * Returns an object with system animation settings.
    */
  def getAnimationSettings(): AnimationSettings = js.native
  /**
    * Gets the macOS appearance setting that you have declared you want for your
    * application, maps to NSApplication.appearance. You can use the
    * setAppLevelAppearance API to set this value.
    */
  def getAppLevelAppearance(): dark | light | unknown = js.native
  def getColor(color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any): String = js.native
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
  def getEffectiveAppearance(): dark | light | unknown = js.native
  /**
    * This user consent was not required until macOS 10.14 Mojave, so this method will
    * always return granted if your system is running 10.13 High Sierra or lower.
    */
  def getMediaAccessStatus(mediaType: String): `not-determined` | granted | denied | restricted | unknown = js.native
  /**
    * Returns one of several standard system colors that automatically adapt to
    * vibrancy and changes in accessibility settings like 'Increase contrast' and
    * 'Reduce transparency'. See Apple Documentation for  more details.
    */
  @JSName("getSystemColor")
  def getSystemColor_blue(color: blue): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_brown(color: brown): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_gray(color: gray): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_green(color: green): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_orange(color: orange): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_pink(color: pink): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_purple(color: purple): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_red(color: red): Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_yellow(color: yellow): Unit = js.native
  @JSName("getUserDefault")
  def getUserDefault_array(key: String, `type`: array): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_boolean(key: String, `type`: boolean): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_dictionary(key: String, `type`: dictionary): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_double(key: String, `type`: double): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_float(key: String, `type`: float): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_integer(key: String, `type`: integer): js.Any = js.native
  /**
    * Some popular key and types are:
    */
  @JSName("getUserDefault")
  def getUserDefault_string(key: String, `type`: string): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_url(key: String, `type`: url): js.Any = js.native
  /**
    * An example of using it to determine if you should create a transparent window or
    * not (transparent windows won't work correctly when DWM composition is disabled):
    */
  def isAeroGlassEnabled(): Boolean = js.native
  def isDarkMode(): Boolean = js.native
  def isHighContrastColorScheme(): Boolean = js.native
  def isInvertedColorScheme(): Boolean = js.native
  def isSwipeTrackingFromScrollEventsEnabled(): Boolean = js.native
  def isTrustedAccessibilityClient(prompt: Boolean): Boolean = js.native
  // Docs: http://electronjs.org/docs/api/system-preferences
  @JSName("on")
  def on_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("on")
  def on_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postLocalNotification(event: String, userInfo: js.Any): Unit = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postNotification(event: String, userInfo: js.Any): Unit = js.native
  def postNotification(event: String, userInfo: js.Any, deliverImmediately: Boolean): Unit = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postWorkspaceNotification(event: String, userInfo: js.Any): Unit = js.native
  /**
    * This API itself will not protect your user data; rather, it is a mechanism to
    * allow you to do so. Native apps will need to set Access Control Constants like
    * kSecAccessControlUserPresence on the their keychain entry so that reading it
    * would auto-prompt for Touch ID biometric consent. This could be done with
    * node-keytar, such that one would store an encryption key with node-keytar and
    * only fetch it if promptTouchID() resolves. NOTE: This API will return a rejected
    * Promise on macOS systems older than Sierra 10.12.2.
    */
  def promptTouchID(reason: String): js.Promise[Unit] = js.native
  /**
    * Add the specified defaults to your application's NSUserDefaults.
    */
  def registerDefaults(defaults: js.Any): Unit = js.native
  @JSName("removeListener")
  def removeListener_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Removes the key in NSUserDefaults. This can be used to restore the default or
    * global value of a key previously set with setUserDefault.
    */
  def removeUserDefault(key: String): Unit = js.native
  /**
    * Sets the appearance setting for your application, this should override the
    * system default and override the value of getEffectiveAppearance.
    */
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_dark(appearance: dark): Unit = js.native
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_light(appearance: light): Unit = js.native
  /**
    * Set the value of key in NSUserDefaults. Note that type should match actual type
    * of value. An exception is thrown if they don't. Some popular key and types are:
    */
  def setUserDefault(key: String, `type`: String, value: String): Unit = js.native
  /**
    * Same as subscribeNotification, but uses NSNotificationCenter for local defaults.
    * This is necessary for events such as NSUserDefaultsDidChangeNotification.
    */
  def subscribeLocalNotification(event: String, callback: js.Function2[/* event */ String, /* userInfo */ js.Any, Unit]): Double = js.native
  /**
    * Subscribes to native notifications of macOS, callback will be called with
    * callback(event, userInfo) when the corresponding event happens. The userInfo is
    * an Object that contains the user information dictionary sent along with the
    * notification. The id of the subscriber is returned, which can be used to
    * unsubscribe the event. Under the hood this API subscribes to
    * NSDistributedNotificationCenter, example values of event are:
    */
  def subscribeNotification(event: String, callback: js.Function2[/* event */ String, /* userInfo */ js.Any, Unit]): Double = js.native
  /**
    * Same as subscribeNotification, but uses
    * NSWorkspace.sharedWorkspace.notificationCenter. This is necessary for events
    * such as NSWorkspaceDidActivateApplicationNotification.
    */
  def subscribeWorkspaceNotification(event: String, callback: js.Function2[/* event */ String, /* userInfo */ js.Any, Unit]): Unit = js.native
  /**
    * Same as unsubscribeNotification, but removes the subscriber from
    * NSNotificationCenter.
    */
  def unsubscribeLocalNotification(id: Double): Unit = js.native
  /**
    * Removes the subscriber with id.
    */
  def unsubscribeNotification(id: Double): Unit = js.native
  /**
    * Same as unsubscribeNotification, but removes the subscriber from
    * NSWorkspace.sharedWorkspace.notificationCenter.
    */
  def unsubscribeWorkspaceNotification(id: Double): Unit = js.native
}

@JSGlobal("Electron.systemPreferences")
@js.native
object systemPreferences extends TopLevel[SystemPreferences]


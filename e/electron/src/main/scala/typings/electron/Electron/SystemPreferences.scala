package typings.electron.Electron

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
import typings.electron.electronStrings.screen
import typings.electron.electronStrings.string
import typings.electron.electronStrings.unknown_
import typings.electron.electronStrings.url
import typings.electron.electronStrings.yellow
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemPreferences extends EventEmitter {
  /**
    * A `String` property that can be `dark`, `light` or `unknown`. It determines the
    * macOS appearance setting for your application. This maps to values in:
    * NSApplication.appearance. Setting this will override the system default as well
    * as the value of `getEffectiveAppearance`.
    *
    * Possible values that can be set are `dark` and `light`, and possible return
    * values are `dark`, `light`, and `unknown`.
    * 
  This property is only available on macOS 10.14 Mojave or newer.
    *
    * @platform darwin
    */
  var appLevelAppearance: dark | light | unknown_ = js.native
  /**
    * A `String` property that can be `dark`, `light` or `unknown`.
    *
    * Returns the macOS appearance setting that is currently applied to your
    * application, maps to NSApplication.effectiveAppearance
    *
    * @platform darwin
    */
  val effectiveAppearance: dark | light | unknown_ = js.native
  @JSName("addListener")
  def addListener_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ typings.std.Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("askForMediaAccess")
  def askForMediaAccess_camera(mediaType: camera): js.Promise[Boolean] = js.native
  /**
    * A promise that resolves with `true` if consent was granted and `false` if it was
    * denied. If an invalid `mediaType` is passed, the promise will be rejected. If an
    * access request was denied and later is changed through the System Preferences
    * pane, a restart of the app will be required for the new permissions to take
    * effect. If access has already been requested and denied, it _must_ be changed
    * through the preference pane; an alert will not pop up and the promise will
    * resolve with the existing access status.
    *
    * **Important:** In order to properly leverage this API, you must set the
    * `NSMicrophoneUsageDescription` and `NSCameraUsageDescription` strings in your
    * app's `Info.plist` file. The values for these keys will be used to populate the
    * permission dialogs so that the user will be properly informed as to the purpose
    * of the permission request. See Electron Application Distribution for more
    * information about how to set these in the context of Electron.
    *
    * This user consent was not required until macOS 10.14 Mojave, so this method will
    * always return `true` if your system is running 10.13 High Sierra or lower.
    *
    * @platform darwin
    */
  @JSName("askForMediaAccess")
  def askForMediaAccess_microphone(mediaType: microphone): js.Promise[Boolean] = js.native
  /**
    * whether or not this device has the ability to use Touch ID.
    *
    * **NOTE:** This API will return `false` on macOS systems older than Sierra
    * 10.12.2.
    *
    * @platform darwin
    */
  def canPromptTouchID(): Boolean = js.native
  /**
    * The users current system wide accent color preference in RGBA hexadecimal form.
    * 
  This API is only available on macOS 10.14 Mojave or newer.
    *
    * @platform win32,darwin
    */
  def getAccentColor(): String = js.native
  /**
    * * `shouldRenderRichAnimation` Boolean - Returns true if rich animations should
    * be rendered. Looks at session type (e.g. remote desktop) and accessibility
    * settings to give guidance for heavy animations.
    * * `scrollAnimationsEnabledBySystem` Boolean - Determines on a per-platform basis
    * whether scroll animations (e.g. produced by home/end key) should be enabled.
    * * `prefersReducedMotion` Boolean - Determines whether the user desires reduced
    * motion based on platform APIs.
    * 
  Returns an object with system animation settings.
    */
  def getAnimationSettings(): AnimationSettings = js.native
  /**
    * | `null` - Can be `dark`, `light` or `unknown`.
    *
    * Gets the macOS appearance setting that you have declared you want for your
    * application, maps to NSApplication.appearance. You can use the
    * `setAppLevelAppearance` API to set this value.
    *
    * @deprecated
    * @platform darwin
    */
  def getAppLevelAppearance(): dark | light | unknown_ = js.native
  /**
    * The system color setting in RGB hexadecimal form (`#ABCDEF`). See the Windows
    * docs and the macOS docs for more details.
    *
    * The following colors are only available on macOS 10.14: `find-highlight`,
    * `selected-content-background`, `separator`,
    * `unemphasized-selected-content-background`,
    * `unemphasized-selected-text-background`, and `unemphasized-selected-text`.
    *
    * @platform win32,darwin
    */
  def getColor(color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any): String = js.native
  /**
    * Can be `dark`, `light` or `unknown`.
    *
    * Gets the macOS appearance setting that is currently applied to your application,
    * maps to NSApplication.effectiveAppearance
    *
    * @platform darwin
    */
  def getEffectiveAppearance(): dark | light | unknown_ = js.native
  @JSName("getMediaAccessStatus")
  def getMediaAccessStatus_camera(mediaType: camera): `not-determined` | granted | denied | restricted | unknown_ = js.native
  /**
    * Can be `not-determined`, `granted`, `denied`, `restricted` or `unknown`.
    *
    * This user consent was not required on macOS 10.13 High Sierra or lower so this
    * method will always return `granted`. macOS 10.14 Mojave or higher requires
    * consent for `microphone` and `camera` access. macOS 10.15 Catalina or higher
    * requires consent for `screen` access.
    *
    * Windows 10 has a global setting controlling `microphone` and `camera` access for
    * all win32 applications. It will always return `granted` for `screen` and for all
    * media types on older versions of Windows.
    *
    * @platform win32,darwin
    */
  @JSName("getMediaAccessStatus")
  def getMediaAccessStatus_microphone(mediaType: microphone): `not-determined` | granted | denied | restricted | unknown_ = js.native
  @JSName("getMediaAccessStatus")
  def getMediaAccessStatus_screen(mediaType: screen): `not-determined` | granted | denied | restricted | unknown_ = js.native
  /**
    * The standard system color formatted as `#RRGGBBAA`.
    *
    * Returns one of several standard system colors that automatically adapt to
    * vibrancy and changes in accessibility settings like 'Increase contrast' and
    * 'Reduce transparency'. See Apple Documentation for  more details.
    *
    * @platform darwin
    */
  @JSName("getSystemColor")
  def getSystemColor_blue(color: blue): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_brown(color: brown): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_gray(color: gray): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_green(color: green): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_orange(color: orange): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_pink(color: pink): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_purple(color: purple): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_red(color: red): String = js.native
  @JSName("getSystemColor")
  def getSystemColor_yellow(color: yellow): String = js.native
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
    * The value of `key` in `NSUserDefaults`.
    *
    * Some popular `key` and `type`s are:
    *
    * * `AppleInterfaceStyle`: `string`
    * * `AppleAquaColorVariant`: `integer`
    * * `AppleHighlightColor`: `string`
    * * `AppleShowScrollBars`: `string`
    * * `NSNavRecentPlaces`: `array`
    * * `NSPreferredWebServices`: `dictionary`
    * * `NSUserDictionaryReplacementItems`: `array`
    *
    * @platform darwin
    */
  @JSName("getUserDefault")
  def getUserDefault_string(key: String, `type`: string): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_url(key: String, `type`: url): js.Any = js.native
  /**
    * `true` if DWM composition (Aero Glass) is enabled, and `false` otherwise.
    *
    * An example of using it to determine if you should create a transparent window or
    * not (transparent windows won't work correctly when DWM composition is disabled):
    *
    * @platform win32
    */
  def isAeroGlassEnabled(): Boolean = js.native
  /**
    * Whether the system is in Dark Mode.
    *
    * **Note:** On macOS 10.15 Catalina in order for this API to return the correct
    * value when in the "automatic" dark mode setting you must either have
    * `NSRequiresAquaSystemAppearance=false` in your `Info.plist` or be on Electron
    * `>=7.0.0`.  See the dark mode guide for more information.
    * 
  **Deprecated:** Should use the new `nativeTheme.shouldUseDarkColors` API.
    *
    * @deprecated
    * @platform darwin,win32
    */
  def isDarkMode(): Boolean = js.native
  /**
    * `true` if a high contrast theme is active, `false` otherwise.
    *
    * **Deprecated:** Should use the new `nativeTheme.shouldUseHighContrastColors`
    * API.
    *
    * @deprecated
    * @platform darwin,win32
    */
  def isHighContrastColorScheme(): Boolean = js.native
  /**
    * `true` if an inverted color scheme (a high contrast color scheme with light text
    * and dark backgrounds) is active, `false` otherwise.
    *
    * **Deprecated:** Should use the new `nativeTheme.shouldUseInvertedColorScheme`
    * API.
    *
    * @deprecated
    * @platform win32
    */
  def isInvertedColorScheme(): Boolean = js.native
  /**
    * Whether the Swipe between pages setting is on.
    *
    * @platform darwin
    */
  def isSwipeTrackingFromScrollEventsEnabled(): Boolean = js.native
  /**
    * `true` if the current process is a trusted accessibility client and `false` if
    * it is not.
    *
    * @platform darwin
    */
  def isTrustedAccessibilityClient(prompt: Boolean): Boolean = js.native
  // Docs: http://electronjs.org/docs/api/system-preferences
  @JSName("on")
  def on_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ typings.std.Event, Unit]): this.type = js.native
  /**
    * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
    *
    * @deprecated
    * @platform win32
    */
  @JSName("on")
  def on_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  /**
    * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
    *
    * @deprecated
    * @platform win32
    */
  @JSName("on")
  def on_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ typings.std.Event, Unit]): this.type = js.native
  @JSName("once")
  def once_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postLocalNotification(event: String, userInfo: Record[String, _]): Unit = js.native
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postNotification(event: String, userInfo: Record[String, _]): Unit = js.native
  def postNotification(event: String, userInfo: Record[String, _], deliverImmediately: Boolean): Unit = js.native
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postWorkspaceNotification(event: String, userInfo: Record[String, _]): Unit = js.native
  /**
    * resolves if the user has successfully authenticated with Touch ID.
    *
    * This API itself will not protect your user data; rather, it is a mechanism to
    * allow you to do so. Native apps will need to set Access Control Constants like
    * `kSecAccessControlUserPresence` on the their keychain entry so that reading it
    * would auto-prompt for Touch ID biometric consent. This could be done with
    * `node-keytar`, such that one would store an encryption key with `node-keytar`
    * and only fetch it if `promptTouchID()` resolves.
    *
    * **NOTE:** This API will return a rejected Promise on macOS systems older than
    * Sierra 10.12.2.
    *
    * @platform darwin
    */
  def promptTouchID(reason: String): js.Promise[Unit] = js.native
  /**
    * Add the specified defaults to your application's `NSUserDefaults`.
    *
    * @platform darwin
    */
  def registerDefaults(defaults: Record[String, String | Boolean | Double]): Unit = js.native
  @JSName("removeListener")
  def removeListener_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ typings.std.Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ typings.std.Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Removes the `key` in `NSUserDefaults`. This can be used to restore the default
    * or global value of a `key` previously set with `setUserDefault`.
    *
    * @platform darwin
    */
  def removeUserDefault(key: String): Unit = js.native
  /**
    * Sets the appearance setting for your application, this should override the
    * system default and override the value of `getEffectiveAppearance`.
    *
    * @deprecated
    * @platform darwin
    */
  def setAppLevelAppearance(): Unit = js.native
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_dark(appearance: dark): Unit = js.native
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_light(appearance: light): Unit = js.native
  /**
    * Set the value of `key` in `NSUserDefaults`.
    *
    * Note that `type` should match actual type of `value`. An exception is thrown if
    * they don't.
    * 
  Some popular `key` and `type`s are:
  * `ApplePressAndHoldEnabled`: `boolean`
    *
    * @platform darwin
    */
  def setUserDefault(key: String, `type`: String, value: String): Unit = js.native
  /**
    * The ID of this subscription
    *
    * Same as `subscribeNotification`, but uses `NSNotificationCenter` for local
    * defaults. This is necessary for events such as
    * `NSUserDefaultsDidChangeNotification`.
    *
    * @platform darwin
    */
  def subscribeLocalNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, _], /* object */ String, Unit]
  ): Double = js.native
  /**
    * The ID of this subscription
    *
    * Subscribes to native notifications of macOS, `callback` will be called with
    * `callback(event, userInfo)` when the corresponding `event` happens. The
    * `userInfo` is an Object that contains the user information dictionary sent along
    * with the notification. The `object` is the sender of the notification, and only
    * supports `NSString` values for now.
    *
    * The `id` of the subscriber is returned, which can be used to unsubscribe the
    * `event`.
    *
    * Under the hood this API subscribes to `NSDistributedNotificationCenter`, example
    * values of `event` are:
    *
    * * `AppleInterfaceThemeChangedNotification`
    * * `AppleAquaColorVariantChanged`
    * * `AppleColorPreferencesChangedNotification`
    * * `AppleShowScrollBarsSettingChanged`
    *
    * @platform darwin
    */
  def subscribeNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, _], /* object */ String, Unit]
  ): Double = js.native
  /**
    * Same as `subscribeNotification`, but uses
    * `NSWorkspace.sharedWorkspace.notificationCenter`. This is necessary for events
    * such as `NSWorkspaceDidActivateApplicationNotification`.
    *
    * @platform darwin
    */
  def subscribeWorkspaceNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, _], /* object */ String, Unit]
  ): Unit = js.native
  /**
    * Same as `unsubscribeNotification`, but removes the subscriber from
    * `NSNotificationCenter`.
    *
    * @platform darwin
    */
  def unsubscribeLocalNotification(id: Double): Unit = js.native
  /**
    * Removes the subscriber with `id`.
    *
    * @platform darwin
    */
  def unsubscribeNotification(id: Double): Unit = js.native
  /**
    * Same as `unsubscribeNotification`, but removes the subscriber from
    * `NSWorkspace.sharedWorkspace.notificationCenter`.
    *
    * @platform darwin
    */
  def unsubscribeWorkspaceNotification(id: Double): Unit = js.native
}


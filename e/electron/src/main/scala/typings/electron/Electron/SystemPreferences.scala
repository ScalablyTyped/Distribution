package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemPreferences
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_colorchanged")
  def addListener(event: "color-changed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_invertedcolorschemechanged")
  def addListener(
    event: "inverted-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_highcontrastcolorschemechanged")
  def addListener(
    event: "high-contrast-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_accentcolorchanged")
  def addListener(
    event: "accent-color-changed",
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  
  /**
    * A `string` property that can be `dark`, `light` or `unknown`. It determines the
    * macOS appearance setting for your application. This maps to values in:
    * NSApplication.appearance. Setting this will override the system default as well
    * as the value of `getEffectiveAppearance`.
    *
    * Possible values that can be set are `dark` and `light`, and possible return
    * values are `dark`, `light`, and `unknown`.
    *
    * This property is only available on macOS 10.14 Mojave or newer.
    *
    * @platform darwin
    */
  var appLevelAppearance: "dark" | "light" | "unknown" = js.native
  
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
  @scala.annotation.targetName("askForMediaAccess_microphone_camera")
  def askForMediaAccess(mediaType: "microphone" | "camera"): js.Promise[Boolean] = js.native
  
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
    * A `string` property that can be `dark`, `light` or `unknown`.
    *
    * Returns the macOS appearance setting that is currently applied to your
    * application, maps to NSApplication.effectiveAppearance
    *
    * @platform darwin
    */
  val effectiveAppearance: "dark" | "light" | "unknown" = js.native
  
  /**
    * The users current system wide accent color preference in RGBA hexadecimal form.
    *
    * This API is only available on macOS 10.14 Mojave or newer.
    *
    * @platform win32,darwin
    */
  def getAccentColor(): String = js.native
  
  /**
    * * `shouldRenderRichAnimation` boolean - Returns true if rich animations should
    * be rendered. Looks at session type (e.g. remote desktop) and accessibility
    * settings to give guidance for heavy animations.
    * * `scrollAnimationsEnabledBySystem` boolean - Determines on a per-platform basis
    * whether scroll animations (e.g. produced by home/end key) should be enabled.
    * * `prefersReducedMotion` boolean - Determines whether the user desires reduced
    * motion based on platform APIs.
    *
    * Returns an object with system animation settings.
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
  def getAppLevelAppearance(): "dark" | "light" | "unknown" = js.native
  
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
  @JSName("getColor")
  @scala.annotation.targetName("getColor_3ddarkshadow_3dface_3dhighlight_3dlight_3dshadow_activeborder_activecaption_activecaptiongradient_appworkspace_buttontext_captiontext_desktop_disabledtext_highlight_highlighttext_hotlight_inactiveborder_inactivecaption_inactivecaptiongradient_inactivecaptiontext_infobackground_infotext_menu_menuhighlight_menubar_menutext_scrollbar_window_windowframe_windowtext_alternateselectedcontroltext_controlbackground_control_controltext_disabledcontroltext_findhighlight_grid_headertext_keyboardfocusindicator_label_link_placeholdertext_quaternarylabel_scrubbertexturedbackground_secondarylabel_selectedcontentbackground_selectedcontrol_selectedcontroltext_selectedmenuitemtext_selectedtextbackground_selectedtext_separator_shadow_tertiarylabel_textbackground_text_underpagebackground_unemphasizedselectedcontentbackground_unemphasizedselectedtextbackground_unemphasizedselectedtext_windowbackground_windowframetext")
  def getColor(
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62, starting with "3d-dark-shadow", "3d-face", "3d-highlight" */ String
  ): String = js.native
  
  /**
    * Can be `dark`, `light` or `unknown`.
    *
    * Gets the macOS appearance setting that is currently applied to your application,
    * maps to NSApplication.effectiveAppearance
    *
    * @platform darwin
    */
  def getEffectiveAppearance(): "dark" | "light" | "unknown" = js.native
  
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
  @scala.annotation.targetName("getMediaAccessStatus_microphone_camera_screen")
  def getMediaAccessStatus(mediaType: "microphone" | "camera" | "screen"): "not-determined" | "granted" | "denied" | "restricted" | "unknown" = js.native
  
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
  @scala.annotation.targetName("getSystemColor_blue_brown_gray_green_orange_pink_purple_red_yellow")
  def getSystemColor(color: "blue" | "brown" | "gray" | "green" | "orange" | "pink" | "purple" | "red" | "yellow"): String = js.native
  
  @JSName("getUserDefault")
  @scala.annotation.targetName("getUserDefault_boolean")
  def getUserDefault(key: String, `type`: "boolean"): Boolean = js.native
  @JSName("getUserDefault")
  @scala.annotation.targetName("getUserDefault_integer")
  def getUserDefault(key: String, `type`: "integer"): Double = js.native
  @JSName("getUserDefault")
  @scala.annotation.targetName("getUserDefault_double")
  def getUserDefault(key: String, `type`: "double"): Double = js.native
  @JSName("getUserDefault")
  @scala.annotation.targetName("getUserDefault_string")
  def getUserDefault(key: String, `type`: "string"): String = js.native
  @JSName("getUserDefault")
  @scala.annotation.targetName("getUserDefault_dictionary")
  def getUserDefault(key: String, `type`: "dictionary"): Record[String, Any] = js.native
  @JSName("getUserDefault")
  @scala.annotation.targetName("getUserDefault_url")
  def getUserDefault(key: String, `type`: "url"): String = js.native
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
  @scala.annotation.targetName("getUserDefault_array")
  def getUserDefault(key: String, `type`: "array"): js.Array[Any] = js.native
  @JSName("getUserDefault")
  @scala.annotation.targetName("getUserDefault_float")
  def getUserDefault(key: String, `type`: "float"): Double = js.native
  
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
    * **Deprecated:** Should use the new `nativeTheme.shouldUseDarkColors` API.
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
  
  @JSName("on")
  @scala.annotation.targetName("on_colorchanged")
  def on(event: "color-changed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
    *
    * @deprecated
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_invertedcolorschemechanged")
  def on(
    event: "inverted-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  /**
    * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
    *
    * @deprecated
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_highcontrastcolorschemechanged")
  def on(
    event: "high-contrast-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  // Docs: https://electronjs.org/docs/api/system-preferences
  @JSName("on")
  @scala.annotation.targetName("on_accentcolorchanged")
  def on(
    event: "accent-color-changed",
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_colorchanged")
  def once(event: "color-changed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_highcontrastcolorschemechanged")
  def once(
    event: "high-contrast-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_invertedcolorschemechanged")
  def once(
    event: "inverted-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_accentcolorchanged")
  def once(
    event: "accent-color-changed",
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postLocalNotification(event: String, userInfo: Record[String, Any]): Unit = js.native
  
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postNotification(event: String, userInfo: Record[String, Any]): Unit = js.native
  def postNotification(event: String, userInfo: Record[String, Any], deliverImmediately: Boolean): Unit = js.native
  
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postWorkspaceNotification(event: String, userInfo: Record[String, Any]): Unit = js.native
  
  /**
    * resolves if the user has successfully authenticated with Touch ID.
    *
    * This API itself will not protect your user data; rather, it is a mechanism to
    * allow you to do so. Native apps will need to set Access Control Constants like
    * `kSecAccessControlUserPresence` on their keychain entry so that reading it would
    * auto-prompt for Touch ID biometric consent. This could be done with
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
  @scala.annotation.targetName("removeListener_colorchanged")
  def removeListener(event: "color-changed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_accentcolorchanged")
  def removeListener(
    event: "accent-color-changed",
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_invertedcolorschemechanged")
  def removeListener(
    event: "inverted-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_highcontrastcolorschemechanged")
  def removeListener(
    event: "high-contrast-color-scheme-changed",
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
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
  @scala.annotation.targetName("setAppLevelAppearance_dark_light")
  def setAppLevelAppearance(appearance: "dark" | "light"): Unit = js.native
  
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_string")
  def setUserDefault(key: String, `type`: "string", value: String): Unit = js.native
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_url")
  def setUserDefault(key: String, `type`: "url", value: String): Unit = js.native
  /**
    * Set the value of `key` in `NSUserDefaults`.
    *
    * Note that `type` should match actual type of `value`. An exception is thrown if
    * they don't.
    *
    * Some popular `key` and `type`s are:
    *
    * * `ApplePressAndHoldEnabled`: `boolean`
    *
    * @platform darwin
    */
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_array")
  def setUserDefault(key: String, `type`: "array", value: js.Array[Any]): Unit = js.native
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_boolean")
  def setUserDefault(key: String, `type`: "boolean", value: Boolean): Unit = js.native
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_float")
  def setUserDefault(key: String, `type`: "float", value: Double): Unit = js.native
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_integer")
  def setUserDefault(key: String, `type`: "integer", value: Double): Unit = js.native
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_double")
  def setUserDefault(key: String, `type`: "double", value: Double): Unit = js.native
  @JSName("setUserDefault")
  @scala.annotation.targetName("setUserDefault_dictionary")
  def setUserDefault(key: String, `type`: "dictionary", value: Record[String, Any]): Unit = js.native
  
  /**
    * The ID of this subscription
    *
    * Same as `subscribeNotification`, but uses `NSNotificationCenter` for local
    * defaults. This is necessary for events such as
    * `NSUserDefaultsDidChangeNotification`.
    *
    * If `event` is null, the `NSNotificationCenter` doesn’t use it as criteria for
    * delivery to the observer. See docs for more information.
    *
    * @platform darwin
    */
  def subscribeLocalNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  def subscribeLocalNotification(
    event: Null,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
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
    * If `event` is null, the `NSDistributedNotificationCenter` doesn’t use it as
    * criteria for delivery to the observer. See docs  for more information.
    *
    * @platform darwin
    */
  def subscribeNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  def subscribeNotification(
    event: Null,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  
  /**
    * The ID of this subscription
    *
    * Same as `subscribeNotification`, but uses
    * `NSWorkspace.sharedWorkspace.notificationCenter`. This is necessary for events
    * such as `NSWorkspaceDidActivateApplicationNotification`.
    *
    * If `event` is null, the `NSWorkspaceNotificationCenter` doesn’t use it as
    * criteria for delivery to the observer. See docs for more information.
    *
    * @platform darwin
    */
  def subscribeWorkspaceNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  def subscribeWorkspaceNotification(
    event: Null,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  
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

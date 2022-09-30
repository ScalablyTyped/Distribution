package typings.electron.Electron

import typings.electron.electronStrings.`document-user-activation-required`
import typings.electron.electronStrings.`no-user-gesture-required`
import typings.electron.electronStrings.`user-gesture-required`
import typings.electron.electronStrings.animate
import typings.electron.electronStrings.animateOnce
import typings.electron.electronStrings.bypassHeatCheck
import typings.electron.electronStrings.bypassHeatCheckAndEagerCompile
import typings.electron.electronStrings.code
import typings.electron.electronStrings.noAnimation
import typings.electron.electronStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebPreferences extends StObject {
  
  /**
    * An alternative title string provided only to accessibility tools such as screen
    * readers. This string is not directly visible to users.
    */
  var accessibleTitle: js.UndefOr[String] = js.undefined
  
  /**
    * A list of strings that will be appended to `process.argv` in the renderer
    * process of this app.  Useful for passing small bits of data down to renderer
    * process preload scripts.
    */
  var additionalArguments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allow an https page to run JavaScript, CSS or plugins from http URLs. Default is
    * `false`.
    */
  var allowRunningInsecureContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Autoplay policy to apply to content in the window, can be
    * `no-user-gesture-required`, `user-gesture-required`,
    * `document-user-activation-required`. Defaults to `no-user-gesture-required`.
    */
  var autoplayPolicy: js.UndefOr[
    `no-user-gesture-required` | `user-gesture-required` | `document-user-activation-required`
  ] = js.undefined
  
  /**
    * Whether to throttle animations and timers when the page becomes background. This
    * also affects the Page Visibility API. Defaults to `true`.
    */
  var backgroundThrottling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to run Electron APIs and the specified `preload` script in a separate
    * JavaScript context. Defaults to `true`. The context that the `preload` script
    * runs in will only have access to its own dedicated `document` and `window`
    * globals, as well as its own set of JavaScript builtins (`Array`, `Object`,
    * `JSON`, etc.), which are all invisible to the loaded content. The Electron API
    * will only be available in the `preload` script and not the loaded page. This
    * option should be used when loading potentially untrusted remote content to
    * ensure the loaded content cannot tamper with the `preload` script and any
    * Electron APIs being used.  This option uses the same technique used by Chrome
    * Content Scripts.  You can access this context in the dev tools by selecting the
    * 'Electron Isolated Context' entry in the combo box at the top of the Console
    * tab.
    */
  var contextIsolation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `ISO-8859-1`.
    */
  var defaultEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the default font for the font-family.
    */
  var defaultFontFamily: js.UndefOr[DefaultFontFamily] = js.undefined
  
  /**
    * Defaults to `16`.
    */
  var defaultFontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Defaults to `13`.
    */
  var defaultMonospaceFontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to enable DevTools. If it is set to `false`, can not use
    * `BrowserWindow.webContents.openDevTools()` to open DevTools. Default is `true`.
    */
  var devTools: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of feature strings separated by `,`, like `CSSVariables,KeyboardEventKey`
    * to disable. The full list of supported feature strings can be found in the
    * RuntimeEnabledFeatures.json5 file.
    */
  var disableBlinkFeatures: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to disable dialogs completely. Overrides `safeDialogs`. Default is
    * `false`.
    */
  var disableDialogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to prevent the window from resizing when entering HTML Fullscreen.
    * Default is `false`.
    */
  var disableHtmlFullscreenWindowResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of feature strings separated by `,`, like `CSSVariables,KeyboardEventKey`
    * to enable. The full list of supported feature strings can be found in the
    * RuntimeEnabledFeatures.json5 file.
    */
  var enableBlinkFeatures: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to enable preferred size mode. The preferred size is the minimum size
    * needed to contain the layout of the document—without requiring scrolling.
    * Enabling this will cause the `preferred-size-changed` event to be emitted on the
    * `WebContents` when the preferred size changes. Default is `false`.
    */
  var enablePreferredSizeMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable the WebSQL api. Default is `true`.
    */
  var enableWebSQL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables Chromium's experimental features. Default is `false`.
    */
  var experimentalFeatures: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how to run image animations (E.g. GIFs).  Can be `animate`,
    * `animateOnce` or `noAnimation`.  Default is `animate`.
    */
  var imageAnimationPolicy: js.UndefOr[animate | animateOnce | noAnimation] = js.undefined
  
  /**
    * Enables image support. Default is `true`.
    */
  var images: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables JavaScript support. Default is `true`.
    */
  var javascript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `0`.
    */
  var minimumFontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether dragging and dropping a file or link onto the page causes a navigation.
    * Default is `false`.
    */
  var navigateOnDragDrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether node integration is enabled. Default is `false`.
    */
  var nodeIntegration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Experimental option for enabling Node.js support in sub-frames such as iframes
    * and child windows. All your preloads will load for every iframe, you can use
    * `process.isMainFrame` to determine if you are in the main frame or not.
    */
  var nodeIntegrationInSubFrames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether node integration is enabled in web workers. Default is `false`. More
    * about this can be found in Multithreading.
    */
  var nodeIntegrationInWorker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable offscreen rendering for the browser window. Defaults to
    * `false`. See the offscreen rendering tutorial for more details.
    */
  var offscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the session used by the page according to the session's partition string.
    * If `partition` starts with `persist:`, the page will use a persistent session
    * available to all pages in the app with the same `partition`. If there is no
    * `persist:` prefix, the page will use an in-memory session. By assigning the same
    * `partition`, multiple pages can share the same session. Default is the default
    * session.
    */
  var partition: js.UndefOr[String] = js.undefined
  
  /**
    * Whether plugins should be enabled. Default is `false`.
    */
  var plugins: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a script that will be loaded before other scripts run in the page.
    * This script will always have access to node APIs no matter whether node
    * integration is turned on or off. The value should be the absolute file path to
    * the script. When node integration is turned off, the preload script can
    * reintroduce Node global symbols back to the global scope. See example here.
    */
  var preload: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to enable browser style consecutive dialog protection. Default is
    * `false`.
    */
  var safeDialogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The message to display when consecutive dialog protection is triggered. If not
    * defined the default message would be used, note that currently the default
    * message is in English and not localized.
    */
  var safeDialogsMessage: js.UndefOr[String] = js.undefined
  
  /**
    * If set, this will sandbox the renderer associated with the window, making it
    * compatible with the Chromium OS-level sandbox and disabling the Node.js engine.
    * This is not the same as the `nodeIntegration` option and the APIs available to
    * the preload script are more limited. Read more about the option here.
    */
  var sandbox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables scroll bounce (rubber banding) effect on macOS. Default is `false`.
    *
    * @platform darwin
    */
  var scrollBounce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the session used by the page. Instead of passing the Session object
    * directly, you can also choose to use the `partition` option instead, which
    * accepts a partition string. When both `session` and `partition` are provided,
    * `session` will be preferred. Default is the default session.
    */
  var session: js.UndefOr[Session_] = js.undefined
  
  /**
    * Whether to enable the builtin spellchecker. Default is `true`.
    */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Make TextArea elements resizable. Default is `true`.
    */
  var textAreasAreResizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enforces the v8 code caching policy used by blink. Accepted values are
    */
  var v8CacheOptions: js.UndefOr[none | code | bypassHeatCheck | bypassHeatCheckAndEagerCompile] = js.undefined
  
  /**
    * When `false`, it will disable the same-origin policy (usually using testing
    * websites by people), and set `allowRunningInsecureContent` to `true` if this
    * options has not been set by user. Default is `true`.
    */
  var webSecurity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables WebGL support. Default is `true`.
    */
  var webgl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable the `<webview>` tag. Defaults to `false`. **Note:** The
    * `preload` script configured for the `<webview>` will have node integration
    * enabled when it is executed so you should ensure remote/untrusted content is not
    * able to create a `<webview>` tag with a possibly malicious `preload` script. You
    * can use the `will-attach-webview` event on webContents to strip away the
    * `preload` script and to validate or alter the `<webview>`'s initial settings.
    */
  var webviewTag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default zoom factor of the page, `3.0` represents `300%`. Default is `1.0`.
    */
  var zoomFactor: js.UndefOr[Double] = js.undefined
}
object WebPreferences {
  
  inline def apply(): WebPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPreferences]
  }
  
  extension [Self <: WebPreferences](x: Self) {
    
    inline def setAccessibleTitle(value: String): Self = StObject.set(x, "accessibleTitle", value.asInstanceOf[js.Any])
    
    inline def setAccessibleTitleUndefined: Self = StObject.set(x, "accessibleTitle", js.undefined)
    
    inline def setAdditionalArguments(value: js.Array[String]): Self = StObject.set(x, "additionalArguments", value.asInstanceOf[js.Any])
    
    inline def setAdditionalArgumentsUndefined: Self = StObject.set(x, "additionalArguments", js.undefined)
    
    inline def setAdditionalArgumentsVarargs(value: String*): Self = StObject.set(x, "additionalArguments", js.Array(value*))
    
    inline def setAllowRunningInsecureContent(value: Boolean): Self = StObject.set(x, "allowRunningInsecureContent", value.asInstanceOf[js.Any])
    
    inline def setAllowRunningInsecureContentUndefined: Self = StObject.set(x, "allowRunningInsecureContent", js.undefined)
    
    inline def setAutoplayPolicy(value: `no-user-gesture-required` | `user-gesture-required` | `document-user-activation-required`): Self = StObject.set(x, "autoplayPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoplayPolicyUndefined: Self = StObject.set(x, "autoplayPolicy", js.undefined)
    
    inline def setBackgroundThrottling(value: Boolean): Self = StObject.set(x, "backgroundThrottling", value.asInstanceOf[js.Any])
    
    inline def setBackgroundThrottlingUndefined: Self = StObject.set(x, "backgroundThrottling", js.undefined)
    
    inline def setContextIsolation(value: Boolean): Self = StObject.set(x, "contextIsolation", value.asInstanceOf[js.Any])
    
    inline def setContextIsolationUndefined: Self = StObject.set(x, "contextIsolation", js.undefined)
    
    inline def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    inline def setDefaultFontFamily(value: DefaultFontFamily): Self = StObject.set(x, "defaultFontFamily", value.asInstanceOf[js.Any])
    
    inline def setDefaultFontFamilyUndefined: Self = StObject.set(x, "defaultFontFamily", js.undefined)
    
    inline def setDefaultFontSize(value: Double): Self = StObject.set(x, "defaultFontSize", value.asInstanceOf[js.Any])
    
    inline def setDefaultFontSizeUndefined: Self = StObject.set(x, "defaultFontSize", js.undefined)
    
    inline def setDefaultMonospaceFontSize(value: Double): Self = StObject.set(x, "defaultMonospaceFontSize", value.asInstanceOf[js.Any])
    
    inline def setDefaultMonospaceFontSizeUndefined: Self = StObject.set(x, "defaultMonospaceFontSize", js.undefined)
    
    inline def setDevTools(value: Boolean): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
    
    inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
    
    inline def setDisableBlinkFeatures(value: String): Self = StObject.set(x, "disableBlinkFeatures", value.asInstanceOf[js.Any])
    
    inline def setDisableBlinkFeaturesUndefined: Self = StObject.set(x, "disableBlinkFeatures", js.undefined)
    
    inline def setDisableDialogs(value: Boolean): Self = StObject.set(x, "disableDialogs", value.asInstanceOf[js.Any])
    
    inline def setDisableDialogsUndefined: Self = StObject.set(x, "disableDialogs", js.undefined)
    
    inline def setDisableHtmlFullscreenWindowResize(value: Boolean): Self = StObject.set(x, "disableHtmlFullscreenWindowResize", value.asInstanceOf[js.Any])
    
    inline def setDisableHtmlFullscreenWindowResizeUndefined: Self = StObject.set(x, "disableHtmlFullscreenWindowResize", js.undefined)
    
    inline def setEnableBlinkFeatures(value: String): Self = StObject.set(x, "enableBlinkFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnableBlinkFeaturesUndefined: Self = StObject.set(x, "enableBlinkFeatures", js.undefined)
    
    inline def setEnablePreferredSizeMode(value: Boolean): Self = StObject.set(x, "enablePreferredSizeMode", value.asInstanceOf[js.Any])
    
    inline def setEnablePreferredSizeModeUndefined: Self = StObject.set(x, "enablePreferredSizeMode", js.undefined)
    
    inline def setEnableWebSQL(value: Boolean): Self = StObject.set(x, "enableWebSQL", value.asInstanceOf[js.Any])
    
    inline def setEnableWebSQLUndefined: Self = StObject.set(x, "enableWebSQL", js.undefined)
    
    inline def setExperimentalFeatures(value: Boolean): Self = StObject.set(x, "experimentalFeatures", value.asInstanceOf[js.Any])
    
    inline def setExperimentalFeaturesUndefined: Self = StObject.set(x, "experimentalFeatures", js.undefined)
    
    inline def setImageAnimationPolicy(value: animate | animateOnce | noAnimation): Self = StObject.set(x, "imageAnimationPolicy", value.asInstanceOf[js.Any])
    
    inline def setImageAnimationPolicyUndefined: Self = StObject.set(x, "imageAnimationPolicy", js.undefined)
    
    inline def setImages(value: Boolean): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setJavascript(value: Boolean): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    inline def setJavascriptUndefined: Self = StObject.set(x, "javascript", js.undefined)
    
    inline def setMinimumFontSize(value: Double): Self = StObject.set(x, "minimumFontSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumFontSizeUndefined: Self = StObject.set(x, "minimumFontSize", js.undefined)
    
    inline def setNavigateOnDragDrop(value: Boolean): Self = StObject.set(x, "navigateOnDragDrop", value.asInstanceOf[js.Any])
    
    inline def setNavigateOnDragDropUndefined: Self = StObject.set(x, "navigateOnDragDrop", js.undefined)
    
    inline def setNodeIntegration(value: Boolean): Self = StObject.set(x, "nodeIntegration", value.asInstanceOf[js.Any])
    
    inline def setNodeIntegrationInSubFrames(value: Boolean): Self = StObject.set(x, "nodeIntegrationInSubFrames", value.asInstanceOf[js.Any])
    
    inline def setNodeIntegrationInSubFramesUndefined: Self = StObject.set(x, "nodeIntegrationInSubFrames", js.undefined)
    
    inline def setNodeIntegrationInWorker(value: Boolean): Self = StObject.set(x, "nodeIntegrationInWorker", value.asInstanceOf[js.Any])
    
    inline def setNodeIntegrationInWorkerUndefined: Self = StObject.set(x, "nodeIntegrationInWorker", js.undefined)
    
    inline def setNodeIntegrationUndefined: Self = StObject.set(x, "nodeIntegration", js.undefined)
    
    inline def setOffscreen(value: Boolean): Self = StObject.set(x, "offscreen", value.asInstanceOf[js.Any])
    
    inline def setOffscreenUndefined: Self = StObject.set(x, "offscreen", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSafeDialogs(value: Boolean): Self = StObject.set(x, "safeDialogs", value.asInstanceOf[js.Any])
    
    inline def setSafeDialogsMessage(value: String): Self = StObject.set(x, "safeDialogsMessage", value.asInstanceOf[js.Any])
    
    inline def setSafeDialogsMessageUndefined: Self = StObject.set(x, "safeDialogsMessage", js.undefined)
    
    inline def setSafeDialogsUndefined: Self = StObject.set(x, "safeDialogs", js.undefined)
    
    inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setScrollBounce(value: Boolean): Self = StObject.set(x, "scrollBounce", value.asInstanceOf[js.Any])
    
    inline def setScrollBounceUndefined: Self = StObject.set(x, "scrollBounce", js.undefined)
    
    inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setTextAreasAreResizable(value: Boolean): Self = StObject.set(x, "textAreasAreResizable", value.asInstanceOf[js.Any])
    
    inline def setTextAreasAreResizableUndefined: Self = StObject.set(x, "textAreasAreResizable", js.undefined)
    
    inline def setV8CacheOptions(value: none | code | bypassHeatCheck | bypassHeatCheckAndEagerCompile): Self = StObject.set(x, "v8CacheOptions", value.asInstanceOf[js.Any])
    
    inline def setV8CacheOptionsUndefined: Self = StObject.set(x, "v8CacheOptions", js.undefined)
    
    inline def setWebSecurity(value: Boolean): Self = StObject.set(x, "webSecurity", value.asInstanceOf[js.Any])
    
    inline def setWebSecurityUndefined: Self = StObject.set(x, "webSecurity", js.undefined)
    
    inline def setWebgl(value: Boolean): Self = StObject.set(x, "webgl", value.asInstanceOf[js.Any])
    
    inline def setWebglUndefined: Self = StObject.set(x, "webgl", js.undefined)
    
    inline def setWebviewTag(value: Boolean): Self = StObject.set(x, "webviewTag", value.asInstanceOf[js.Any])
    
    inline def setWebviewTagUndefined: Self = StObject.set(x, "webviewTag", js.undefined)
    
    inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}

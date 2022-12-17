package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `devtools_page`
  *
  * Allowed in: Devtools pages only
  */
object devtools {
  
  /**
    * Use the `browser.devtools.inspectedWindow` API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    *
    * Allowed in: Devtools pages only
    */
  object inspectedWindow {
    
    /** The options parameter can contain one or more options. */
    trait EvalOptions extends StObject {
      
      /**
        * Evaluate the expression in the context of a content script of an extension that matches the specified origin. If given, contextSecurityOrigin overrides the 'true' setting on userContentScriptContext.
        * @deprecated Unsupported on Firefox at this time.
        */
      var contextSecurityOrigin: js.UndefOr[String] = js.undefined
      
      /**
        * If specified, the expression is evaluated on the iframe whose URL matches the one specified. By default, the expression is evaluated in the top frame of the inspected page.
        * @deprecated Unsupported on Firefox at this time.
        */
      var frameURL: js.UndefOr[String] = js.undefined
      
      /**
        * Evaluate the expression in the context of the content script of the calling extension, provided that the content script is already injected into the inspected page. If not, the expression is not evaluated and the callback is invoked with the exception parameter set to an object that has the `isError` field set to true and the `code` field set to `E_NOTFOUND`.
        * @deprecated Unsupported on Firefox at this time.
        */
      var useContentScriptContext: js.UndefOr[Boolean] = js.undefined
    }
    object EvalOptions {
      
      inline def apply(): EvalOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EvalOptions]
      }
      
      extension [Self <: EvalOptions](x: Self) {
        
        inline def setContextSecurityOrigin(value: String): Self = StObject.set(x, "contextSecurityOrigin", value.asInstanceOf[js.Any])
        
        inline def setContextSecurityOriginUndefined: Self = StObject.set(x, "contextSecurityOrigin", js.undefined)
        
        inline def setFrameURL(value: String): Self = StObject.set(x, "frameURL", value.asInstanceOf[js.Any])
        
        inline def setFrameURLUndefined: Self = StObject.set(x, "frameURL", js.undefined)
        
        inline def setUseContentScriptContext(value: Boolean): Self = StObject.set(x, "useContentScriptContext", value.asInstanceOf[js.Any])
        
        inline def setUseContentScriptContextUndefined: Self = StObject.set(x, "useContentScriptContext", js.undefined)
      }
    }
    
    /** An object providing details if an exception occurred while evaluating the expression. */
    trait EvalReturnExceptionInfo extends StObject {
      
      /** Set if the error occurred on the DevTools side before the expression is evaluated. */
      var code: String
      
      /** Set if the error occurred on the DevTools side before the expression is evaluated. */
      var description: String
      
      /**
        * Set if the error occurred on the DevTools side before the expression is evaluated, contains the array of the values that may be substituted into the description string to provide more information about the cause of the error.
        */
      var details: js.Array[Any]
      
      /** Set if the error occurred on the DevTools side before the expression is evaluated. */
      var isError: Boolean
      
      /** Set if the evaluated code produces an unhandled exception. */
      var isException: Boolean
      
      /** Set if the evaluated code produces an unhandled exception. */
      var value: String
    }
    object EvalReturnExceptionInfo {
      
      inline def apply(
        code: String,
        description: String,
        details: js.Array[Any],
        isError: Boolean,
        isException: Boolean,
        value: String
      ): EvalReturnExceptionInfo = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isException = isException.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[EvalReturnExceptionInfo]
      }
      
      extension [Self <: EvalReturnExceptionInfo](x: Self) {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: js.Array[Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsVarargs(value: Any*): Self = StObject.set(x, "details", js.Array(value*))
        
        inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
        
        inline def setIsException(value: Boolean): Self = StObject.set(x, "isException", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait ReloadReloadOptions extends StObject {
      
      /**
        * When true, the loader will bypass the cache for all inspected page resources loaded before the `load` event is fired. The effect is similar to pressing Ctrl+Shift+R in the inspected window or within the Developer Tools window.
        */
      var ignoreCache: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If specified, the script will be injected into every frame of the inspected page immediately upon load, before any of the frame's scripts. The script will not be injected after subsequent reloads—for example, if the user presses Ctrl+R.
        */
      var injectedScript: js.UndefOr[String] = js.undefined
      
      /**
        * If specified, this script evaluates into a function that accepts three string arguments: the source to preprocess, the URL of the source, and a function name if the source is an DOM event handler. The preprocessorerScript function should return a string to be compiled by Chrome in place of the input source. In the case that the source is a DOM event handler, the returned source must compile to a single JS function.
        * @deprecated Please avoid using this parameter, it will be removed soon.
        */
      var preprocessorScript: js.UndefOr[String] = js.undefined
      
      /**
        * If specified, the string will override the value of the `User-Agent` HTTP header that's sent while loading the resources of the inspected page. The string will also override the value of the `navigator.userAgent` property that's returned to any scripts that are running within the inspected page.
        */
      var userAgent: js.UndefOr[String] = js.undefined
    }
    object ReloadReloadOptions {
      
      inline def apply(): ReloadReloadOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReloadReloadOptions]
      }
      
      extension [Self <: ReloadReloadOptions](x: Self) {
        
        inline def setIgnoreCache(value: Boolean): Self = StObject.set(x, "ignoreCache", value.asInstanceOf[js.Any])
        
        inline def setIgnoreCacheUndefined: Self = StObject.set(x, "ignoreCache", js.undefined)
        
        inline def setInjectedScript(value: String): Self = StObject.set(x, "injectedScript", value.asInstanceOf[js.Any])
        
        inline def setInjectedScriptUndefined: Self = StObject.set(x, "injectedScript", js.undefined)
        
        inline def setPreprocessorScript(value: String): Self = StObject.set(x, "preprocessorScript", value.asInstanceOf[js.Any])
        
        inline def setPreprocessorScriptUndefined: Self = StObject.set(x, "preprocessorScript", js.undefined)
        
        inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
        
        inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      }
    }
    
    /* devtools.inspectedWindow types */
    /** A resource within the inspected page, such as a document, a script, or an image. */
    trait Resource extends StObject {
      
      /**
        * Gets the content of the resource.
        * @deprecated Unsupported on Firefox at this time.
        */
      var getContent: js.UndefOr[js.Function0[js.Promise[js.Object]]] = js.undefined
      
      /**
        * Sets the content of the resource.
        * @param content New content of the resource. Only resources with the text type are currently supported.
        * @param commit True if the user has finished editing the resource, and the new content of the resource should be persisted; false if this is a minor change sent in progress of the user editing the resource.
        * @deprecated Unsupported on Firefox at this time.
        */
      var setContent: js.UndefOr[
            js.Function2[/* content */ String, /* commit */ Boolean, js.Promise[StringDictionary[Any]]]
          ] = js.undefined
      
      /** The URL of the resource. */
      var url: String
    }
    object Resource {
      
      inline def apply(url: String): Resource = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Resource]
      }
      
      extension [Self <: Resource](x: Self) {
        
        inline def setGetContent(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
        
        inline def setGetContentUndefined: Self = StObject.set(x, "getContent", js.undefined)
        
        inline def setSetContent(value: (/* content */ String, /* commit */ Boolean) => js.Promise[StringDictionary[Any]]): Self = StObject.set(x, "setContent", js.Any.fromFunction2(value))
        
        inline def setSetContentUndefined: Self = StObject.set(x, "setContent", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * Use the `browser.devtools.network` API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    *
    * Allowed in: Devtools pages only
    */
  object network {
    
    /* devtools.network types */
    /**
      * Represents a network request for a document resource (script, image and so on). See HAR Specification for reference.
      */
    trait Request extends StObject {
      
      /** Returns content of the response body. */
      def getContent(): js.Promise[js.Object]
    }
    object Request {
      
      inline def apply(getContent: () => js.Promise[js.Object]): Request = {
        val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent))
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setGetContent(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      }
    }
  }
  
  /**
    * Use the `browser.devtools.panels` API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    *
    * Allowed in: Devtools pages only
    */
  object panels {
    
    /** A button created by the extension. */
    trait Button extends StObject {
      
      /**
        * Fired when the button is clicked.
        * @deprecated Unsupported on Firefox at this time.
        */
      var onClicked: WebExtEvent[js.Function0[Unit]]
      
      /**
        * Updates the attributes of the button. If some of the arguments are omitted or `null`, the corresponding attributes are not updated.
        * @deprecated Unsupported on Firefox at this time.
        */
      /**
        * Updates the attributes of the button. If some of the arguments are omitted or `null`, the corresponding attributes are not updated.
        * @param iconPath Path to the new icon of the button.
        * @param [tooltipText] Text shown as a tooltip when user hovers the mouse over the button.
        * @param [disabled] Whether the button is disabled.
        * @deprecated Unsupported on Firefox at this time.
        */
      /**
        * Updates the attributes of the button. If some of the arguments are omitted or `null`, the corresponding attributes are not updated.
        * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
        * @param disabled Whether the button is disabled.
        * @deprecated Unsupported on Firefox at this time.
        */
      /**
        * Updates the attributes of the button. If some of the arguments are omitted or `null`, the corresponding attributes are not updated.
        * @param disabled Whether the button is disabled.
        * @deprecated Unsupported on Firefox at this time.
        */
      var update: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object Button {
      
      inline def apply(onClicked: WebExtEvent[js.Function0[Unit]]): Button = {
        val __obj = js.Dynamic.literal(onClicked = onClicked.asInstanceOf[js.Any])
        __obj.asInstanceOf[Button]
      }
      
      extension [Self <: Button](x: Self) {
        
        inline def setOnClicked(value: WebExtEvent[js.Function0[Unit]]): Self = StObject.set(x, "onClicked", value.asInstanceOf[js.Any])
        
        inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
        
        inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      }
    }
    
    /* devtools.panels types */
    /** Represents the Elements panel. */
    trait ElementsPanel extends StObject {
      
      /**
        * Creates a pane within panel's sidebar.
        * @param title Text that is displayed in sidebar caption.
        */
      def createSidebarPane(title: String): js.Promise[ExtensionSidebarPane]
      
      /** Fired when an object is selected in the panel. */
      var onSelectionChanged: WebExtEvent[js.Function0[Unit]]
    }
    object ElementsPanel {
      
      inline def apply(
        createSidebarPane: String => js.Promise[ExtensionSidebarPane],
        onSelectionChanged: WebExtEvent[js.Function0[Unit]]
      ): ElementsPanel = {
        val __obj = js.Dynamic.literal(createSidebarPane = js.Any.fromFunction1(createSidebarPane), onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementsPanel]
      }
      
      extension [Self <: ElementsPanel](x: Self) {
        
        inline def setCreateSidebarPane(value: String => js.Promise[ExtensionSidebarPane]): Self = StObject.set(x, "createSidebarPane", js.Any.fromFunction1(value))
        
        inline def setOnSelectionChanged(value: WebExtEvent[js.Function0[Unit]]): Self = StObject.set(x, "onSelectionChanged", value.asInstanceOf[js.Any])
      }
    }
    
    /** Represents a panel created by extension. */
    trait ExtensionPanel extends StObject {
      
      /**
        * Appends a button to the status bar of the panel.
        * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
        * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
        * @param disabled Whether the button is disabled.
        * @deprecated Unsupported on Firefox at this time.
        */
      var createStatusBarButton: js.UndefOr[
            js.Function3[/* iconPath */ String, /* tooltipText */ String, /* disabled */ Boolean, Button]
          ] = js.undefined
      
      /** Fired when the user switches away from the panel. */
      var onHidden: WebExtEvent[js.Function0[Unit]]
      
      /**
        * Fired upon a search action (start of a new search, search result navigation, or search being canceled).
        * @param action Type of search action being performed.
        * @param [queryString] Query string (only for 'performSearch').
        * @deprecated Unsupported on Firefox at this time.
        */
      var onSearch: WebExtEvent[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]]
      
      /**
        * Fired when the user switches to the panel.
        * @param window The JavaScript `window` object of panel's page.
        */
      var onShown: WebExtEvent[js.Function1[/* window */ Window, Unit]]
    }
    object ExtensionPanel {
      
      inline def apply(
        onHidden: WebExtEvent[js.Function0[Unit]],
        onSearch: WebExtEvent[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]],
        onShown: WebExtEvent[js.Function1[/* window */ Window, Unit]]
      ): ExtensionPanel = {
        val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any], onSearch = onSearch.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtensionPanel]
      }
      
      extension [Self <: ExtensionPanel](x: Self) {
        
        inline def setCreateStatusBarButton(value: (/* iconPath */ String, /* tooltipText */ String, /* disabled */ Boolean) => Button): Self = StObject.set(x, "createStatusBarButton", js.Any.fromFunction3(value))
        
        inline def setCreateStatusBarButtonUndefined: Self = StObject.set(x, "createStatusBarButton", js.undefined)
        
        inline def setOnHidden(value: WebExtEvent[js.Function0[Unit]]): Self = StObject.set(x, "onHidden", value.asInstanceOf[js.Any])
        
        inline def setOnSearch(value: WebExtEvent[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]]): Self = StObject.set(x, "onSearch", value.asInstanceOf[js.Any])
        
        inline def setOnShown(value: WebExtEvent[js.Function1[/* window */ Window, Unit]]): Self = StObject.set(x, "onShown", value.asInstanceOf[js.Any])
      }
    }
    
    /** A sidebar created by the extension. */
    @js.native
    trait ExtensionSidebarPane extends StObject {
      
      /**
        * Fired when the sidebar pane becomes hidden as a result of the user switching away from the panel that hosts the sidebar pane.
        */
      var onHidden: WebExtEvent[js.Function0[Unit]] = js.native
      
      /**
        * Fired when the sidebar pane becomes visible as a result of user switching to the panel that hosts it.
        * @param window The JavaScript `window` object of the sidebar page, if one was set with the `setPage()` method.
        */
      var onShown: WebExtEvent[js.Function1[/* window */ Window, Unit]] = js.native
      
      /**
        * Sets an expression that is evaluated within the inspected page. The result is displayed in the sidebar pane.
        * @param expression An expression to be evaluated in context of the inspected page. JavaScript objects and DOM nodes are displayed in an expandable tree similar to the console/watch.
        * @param [rootTitle] An optional title for the root of the expression tree.
        */
      def setExpression(expression: String): js.Promise[Unit] = js.native
      def setExpression(expression: String, rootTitle: String): js.Promise[Unit] = js.native
      
      /**
        * Sets the height of the sidebar.
        * @param height A CSS-like size specification, such as `'100px'` or `'12ex'`.
        * @deprecated Unsupported on Firefox at this time.
        */
      var setHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.native
      
      /**
        * Sets a JSON-compliant object to be displayed in the sidebar pane.
        * @param jsonObject An object to be displayed in context of the inspected page. Evaluated in the context of the caller (API client).
        * @param [rootTitle] An optional title for the root of the expression tree.
        */
      def setObject(jsonObject: String): js.Promise[Unit] = js.native
      def setObject(jsonObject: String, rootTitle: String): js.Promise[Unit] = js.native
      
      /**
        * Sets an HTML page to be displayed in the sidebar pane.
        * @param path Relative path of an extension page to display within the sidebar.
        */
      def setPage(path: ExtensionURL): js.Promise[Any] = js.native
    }
    
    /** Represents the Sources panel. */
    trait SourcesPanel extends StObject {
      
      /**
        * Creates a pane within panel's sidebar.
        * @param title Text that is displayed in sidebar caption.
        * @deprecated Unsupported on Firefox at this time.
        */
      var createSidebarPane: js.UndefOr[js.Function1[/* title */ String, js.Promise[ExtensionSidebarPane]]] = js.undefined
      
      /**
        * Fired when an object is selected in the panel.
        * @deprecated Unsupported on Firefox at this time.
        */
      var onSelectionChanged: WebExtEvent[js.Function0[Unit]]
    }
    object SourcesPanel {
      
      inline def apply(onSelectionChanged: WebExtEvent[js.Function0[Unit]]): SourcesPanel = {
        val __obj = js.Dynamic.literal(onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[SourcesPanel]
      }
      
      extension [Self <: SourcesPanel](x: Self) {
        
        inline def setCreateSidebarPane(value: /* title */ String => js.Promise[ExtensionSidebarPane]): Self = StObject.set(x, "createSidebarPane", js.Any.fromFunction1(value))
        
        inline def setCreateSidebarPaneUndefined: Self = StObject.set(x, "createSidebarPane", js.undefined)
        
        inline def setOnSelectionChanged(value: WebExtEvent[js.Function0[Unit]]): Self = StObject.set(x, "onSelectionChanged", value.asInstanceOf[js.Any])
      }
    }
  }
}

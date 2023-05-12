package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ISOLATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the scripting API to execute script in different contexts.
  *
  * Permissions: `scripting`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object scripting {
  
  trait CSSInjection extends StObject {
    
    /** A string containing the CSS to inject. Exactly one of `files` and `css` must be specified. */
    var css: js.UndefOr[String] = js.undefined
    
    /**
      * The path of the CSS files to inject, relative to the extension's root directory. Exactly one of `files` and `css` must be specified.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The style origin for the injection. Defaults to `'AUTHOR'`. */
    var origin: js.UndefOr[CSSInjectionOrigin] = js.undefined
    
    /** Details specifying the target into which to inject the CSS. */
    var target: InjectionTarget
  }
  object CSSInjection {
    
    inline def apply(target: InjectionTarget): CSSInjection = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSInjection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSSInjection] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setOrigin(value: CSSInjectionOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /** The style origin for the injection. Defaults to `'AUTHOR'`. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.USER
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.AUTHOR
  */
  trait CSSInjectionOrigin extends StObject
  object CSSInjectionOrigin {
    
    inline def AUTHOR: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.AUTHOR = "AUTHOR".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.AUTHOR]
    
    inline def USER: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.USER = "USER".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.USER]
  }
  
  trait ContentScriptFilter extends StObject {
    
    /**
      * The IDs of specific scripts to retrieve with `getRegisteredContentScripts()` or to unregister with `unregisterContentScripts()`.
      */
    var ids: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ContentScriptFilter {
    
    inline def apply(): ContentScriptFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentScriptFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentScriptFilter] (val x: Self) extends AnyVal {
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    }
  }
  
  /**
    * The JavaScript world for a script to execute within. We currently only support the `'ISOLATED'` world.
    */
  type ExecutionWorld = ISOLATED
  
  /** Result of a script injection. */
  trait InjectionResult extends StObject {
    
    /**
      * The error property is set when the script execution failed. The value is typically an (Error) object with a message property, but could be any value (including primitives and undefined) if the script threw or rejected with such a value.
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /** The frame ID associated with the injection. */
    var frameId: Double
    
    /** The result of the script execution. */
    var result: js.UndefOr[Any] = js.undefined
  }
  object InjectionResult {
    
    inline def apply(frameId: Double): InjectionResult = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectionResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait InjectionTarget extends StObject {
    
    /**
      * Whether the script should inject into all frames within the tab. Defaults to false. This must not be true if `frameIds` is specified.
      */
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    /** The IDs of specific frames to inject into. */
    var frameIds: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** The ID of the tab into which to inject. */
    var tabId: Double
  }
  object InjectionTarget {
    
    inline def apply(tabId: Double): InjectionTarget = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectionTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectionTarget] (val x: Self) extends AnyVal {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setFrameIds(value: js.Array[Double]): Self = StObject.set(x, "frameIds", value.asInstanceOf[js.Any])
      
      inline def setFrameIdsUndefined: Self = StObject.set(x, "frameIds", js.undefined)
      
      inline def setFrameIdsVarargs(value: Double*): Self = StObject.set(x, "frameIds", js.Array(value*))
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisteredContentScript extends StObject {
    
    /**
      * If specified true, it will inject into all frames, even if the frame is not the top-most frame in the tab. Each frame is checked independently for URL requirements; it will not inject into child frames if the URL requirements are not met. Defaults to false, meaning that only the top frame is matched.
      */
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The list of CSS files to be injected into matching pages. These are injected in the order they appear in this array.
      */
    var css: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
    
    /** Excludes pages that this content script would otherwise be injected into. */
    var excludeMatches: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The id of the content script, specified in the API call. */
    var id: String
    
    /**
      * The list of JavaScript files to be injected into matching pages. These are injected in the order they appear in this array.
      */
    @JSName("js")
    var js_ : js.UndefOr[js.Array[ExtensionURL]] = js.undefined
    
    /**
      * Specifies which pages this content script will be injected into. Must be specified for `registerContentScripts()`.
      */
    var matches: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Specifies if this content script will persist into future sessions. Defaults to true. */
    var persistAcrossSessions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies when JavaScript files are injected into the web page. The preferred and default value is `document_idle`.
      */
    var runAt: js.UndefOr[RunAt] = js.undefined
  }
  object RegisteredContentScript {
    
    inline def apply(id: String): RegisteredContentScript = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredContentScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredContentScript] (val x: Self) extends AnyVal {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setCss(value: js.Array[ExtensionURL]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: ExtensionURL*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setExcludeMatches(value: js.Array[String]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
      
      inline def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
      
      inline def setExcludeMatchesVarargs(value: String*): Self = StObject.set(x, "excludeMatches", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJs_(value: js.Array[ExtensionURL]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setJs_Varargs(value: ExtensionURL*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setPersistAcrossSessions(value: Boolean): Self = StObject.set(x, "persistAcrossSessions", value.asInstanceOf[js.Any])
      
      inline def setPersistAcrossSessionsUndefined: Self = StObject.set(x, "persistAcrossSessions", js.undefined)
      
      inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
    }
  }
  
  /* scripting types */
  /** Details of a script injection */
  trait ScriptInjection extends StObject {
    
    /**
      * The arguments to curry into a provided function. This is only valid if the `func` parameter is specified. These arguments must be JSON-serializable.
      */
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The path of the JS files to inject, relative to the extension's root directory. Exactly one of `files` and `func` must be specified.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A JavaScript function to inject. This function will be serialized, and then deserialized for injection. This means that any bound parameters and execution context will be lost. Exactly one of `files` and `func` must be specified.
      */
    var func: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
    
    /**
      * Whether the injection should be triggered in the target as soon as possible (but not necessarily prior to page load).
      */
    var injectImmediately: js.UndefOr[Boolean] = js.undefined
    
    /** Details specifying the target into which to inject the script. */
    var target: InjectionTarget
    
    var world: js.UndefOr[ExecutionWorld] = js.undefined
  }
  object ScriptInjection {
    
    inline def apply(target: InjectionTarget): ScriptInjection = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptInjection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptInjection] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFunc(value: () => js.UndefOr[Unit]): Self = StObject.set(x, "func", js.Any.fromFunction0(value))
      
      inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      inline def setInjectImmediately(value: Boolean): Self = StObject.set(x, "injectImmediately", value.asInstanceOf[js.Any])
      
      inline def setInjectImmediatelyUndefined: Self = StObject.set(x, "injectImmediately", js.undefined)
      
      inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWorld(value: ExecutionWorld): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
      
      inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
    }
  }
  
  trait UpdateContentScriptsScripts extends StObject {
    
    /**
      * If specified true, it will inject into all frames, even if the frame is not the top-most frame in the tab. Each frame is checked independently for URL requirements; it will not inject into child frames if the URL requirements are not met. Defaults to false, meaning that only the top frame is matched.
      */
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The list of CSS files to be injected into matching pages. These are injected in the order they appear in this array.
      */
    var css: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
    
    /** Excludes pages that this content script would otherwise be injected into. */
    var excludeMatches: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The id of the content script, specified in the API call. */
    var id: String
    
    /**
      * The list of JavaScript files to be injected into matching pages. These are injected in the order they appear in this array.
      */
    @JSName("js")
    var js_ : js.UndefOr[js.Array[ExtensionURL]] = js.undefined
    
    /**
      * Specifies which pages this content script will be injected into. Must be specified for `registerContentScripts()`.
      */
    var matches: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Specifies if this content script will persist into future sessions. */
    var persistAcrossSessions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies when JavaScript files are injected into the web page. The preferred and default value is `document_idle`.
      */
    var runAt: js.UndefOr[RunAt] = js.undefined
  }
  object UpdateContentScriptsScripts {
    
    inline def apply(id: String): UpdateContentScriptsScripts = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateContentScriptsScripts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateContentScriptsScripts] (val x: Self) extends AnyVal {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setCss(value: js.Array[ExtensionURL]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: ExtensionURL*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setExcludeMatches(value: js.Array[String]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
      
      inline def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
      
      inline def setExcludeMatchesVarargs(value: String*): Self = StObject.set(x, "excludeMatches", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJs_(value: js.Array[ExtensionURL]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setJs_Varargs(value: ExtensionURL*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setPersistAcrossSessions(value: Boolean): Self = StObject.set(x, "persistAcrossSessions", value.asInstanceOf[js.Any])
      
      inline def setPersistAcrossSessionsUndefined: Self = StObject.set(x, "persistAcrossSessions", js.undefined)
      
      inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
    }
  }
}

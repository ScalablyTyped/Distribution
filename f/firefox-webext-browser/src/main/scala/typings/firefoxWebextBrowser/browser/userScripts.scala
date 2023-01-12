package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typings.firefoxWebextBrowser.browser.extensionTypes.PlainJSONValue
import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `user_scripts`, `user_scripts`
  *
  * Not allowed in: Devtools pages
  */
object userScripts {
  
  trait OnBeforeScriptUserScript extends StObject {
    
    /**
      * Exports all the properties of a given plain object as userScript globals
      * @param sourceObject A plain object whose properties are exported as userScript globals
      */
    def defineGlobals(sourceObject: js.Object): Unit
    
    /**
      * Convert a given value to make it accessible to the userScript code
      * @param value A value to convert into an object accessible to the userScript
      */
    def `export`(value: Any): Any
    
    /** The userScript global */
    var global: Any
    
    /** The userScript metadata (as set in userScripts.register) */
    var metadata: Any
  }
  object OnBeforeScriptUserScript {
    
    inline def apply(defineGlobals: js.Object => Unit, `export`: Any => Any, global: Any, metadata: Any): OnBeforeScriptUserScript = {
      val __obj = js.Dynamic.literal(defineGlobals = js.Any.fromFunction1(defineGlobals), global = global.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.updateDynamic("export")(js.Any.fromFunction1(`export`))
      __obj.asInstanceOf[OnBeforeScriptUserScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnBeforeScriptUserScript] (val x: Self) extends AnyVal {
      
      inline def setDefineGlobals(value: js.Object => Unit): Self = StObject.set(x, "defineGlobals", js.Any.fromFunction1(value))
      
      inline def setExport(value: Any => Any): Self = StObject.set(x, "export", js.Any.fromFunction1(value))
      
      inline def setGlobal(value: Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  /** An object that represents a user script registered programmatically */
  trait RegisteredUserScript extends StObject {
    
    /** Unregister a user script registered programmatically */
    def unregister(): js.Promise[Any]
  }
  object RegisteredUserScript {
    
    inline def apply(unregister: () => js.Promise[Any]): RegisteredUserScript = {
      val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[RegisteredUserScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredUserScript] (val x: Self) extends AnyVal {
      
      inline def setUnregister(value: () => js.Promise[Any]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
  
  /* userScripts types */
  /** Details of a user script */
  trait UserScriptOptions extends StObject {
    
    /**
      * If allFrames is `true`, implies that the JavaScript should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
      */
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    var excludeGlobs: js.UndefOr[js.Array[String]] = js.undefined
    
    var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
    
    var includeGlobs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The list of JS files to inject */
    @JSName("js")
    var js_ : js.Array[ExtensionFileOrCode]
    
    /**
      * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
      */
    var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
    
    var matches: js.Array[MatchPattern]
    
    /** The soonest that the JavaScript will be injected into the tab. Defaults to "document_idle". */
    var runAt: js.UndefOr[RunAt] = js.undefined
    
    /** An opaque user script metadata value */
    var scriptMetadata: js.UndefOr[PlainJSONValue] = js.undefined
  }
  object UserScriptOptions {
    
    inline def apply(js_ : js.Array[ExtensionFileOrCode], matches: js.Array[MatchPattern]): UserScriptOptions = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserScriptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserScriptOptions] (val x: Self) extends AnyVal {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setExcludeGlobs(value: js.Array[String]): Self = StObject.set(x, "excludeGlobs", value.asInstanceOf[js.Any])
      
      inline def setExcludeGlobsUndefined: Self = StObject.set(x, "excludeGlobs", js.undefined)
      
      inline def setExcludeGlobsVarargs(value: String*): Self = StObject.set(x, "excludeGlobs", js.Array(value*))
      
      inline def setExcludeMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
      
      inline def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
      
      inline def setExcludeMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "excludeMatches", js.Array(value*))
      
      inline def setIncludeGlobs(value: js.Array[String]): Self = StObject.set(x, "includeGlobs", value.asInstanceOf[js.Any])
      
      inline def setIncludeGlobsUndefined: Self = StObject.set(x, "includeGlobs", js.undefined)
      
      inline def setIncludeGlobsVarargs(value: String*): Self = StObject.set(x, "includeGlobs", js.Array(value*))
      
      inline def setJs_(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Varargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
      
      inline def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
      
      inline def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
      
      inline def setScriptMetadata(value: PlainJSONValue): Self = StObject.set(x, "scriptMetadata", value.asInstanceOf[js.Any])
      
      inline def setScriptMetadataNull: Self = StObject.set(x, "scriptMetadata", null)
      
      inline def setScriptMetadataUndefined: Self = StObject.set(x, "scriptMetadata", js.undefined)
    }
  }
}

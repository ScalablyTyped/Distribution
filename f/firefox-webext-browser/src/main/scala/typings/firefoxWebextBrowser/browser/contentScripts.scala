package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Not allowed in: Content scripts, Devtools pages */
object contentScripts {
  
  /** An object that represents a content script registered programmatically */
  trait RegisteredContentScript extends StObject {
    
    /** Unregister a content script registered programmatically */
    def unregister(): js.Promise[js.Any]
  }
  object RegisteredContentScript {
    
    @scala.inline
    def apply(unregister: () => js.Promise[js.Any]): RegisteredContentScript = {
      val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[RegisteredContentScript]
    }
    
    @scala.inline
    implicit class RegisteredContentScriptMutableBuilder[Self <: RegisteredContentScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnregister(value: () => js.Promise[js.Any]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
  
  /* contentScripts types */
  /** Details of a content script registered programmatically */
  trait RegisteredContentScriptOptions extends StObject {
    
    /**
      * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
      */
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    /** The list of CSS files to inject */
    var css: js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
    
    var excludeGlobs: js.UndefOr[js.Array[String]] = js.undefined
    
    var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
    
    var includeGlobs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The list of JS files to inject */
    @JSName("js")
    var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
    
    /**
      * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
      */
    var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
    
    var matches: js.Array[MatchPattern]
    
    /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
    var runAt: js.UndefOr[RunAt] = js.undefined
  }
  object RegisteredContentScriptOptions {
    
    @scala.inline
    def apply(matches: js.Array[MatchPattern]): RegisteredContentScriptOptions = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredContentScriptOptions]
    }
    
    @scala.inline
    implicit class RegisteredContentScriptOptionsMutableBuilder[Self <: RegisteredContentScriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      @scala.inline
      def setCss(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setCssVarargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "css", js.Array(value :_*))
      
      @scala.inline
      def setExcludeGlobs(value: js.Array[String]): Self = StObject.set(x, "excludeGlobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeGlobsUndefined: Self = StObject.set(x, "excludeGlobs", js.undefined)
      
      @scala.inline
      def setExcludeGlobsVarargs(value: String*): Self = StObject.set(x, "excludeGlobs", js.Array(value :_*))
      
      @scala.inline
      def setExcludeMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
      
      @scala.inline
      def setExcludeMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "excludeMatches", js.Array(value :_*))
      
      @scala.inline
      def setIncludeGlobs(value: js.Array[String]): Self = StObject.set(x, "includeGlobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGlobsUndefined: Self = StObject.set(x, "includeGlobs", js.undefined)
      
      @scala.inline
      def setIncludeGlobsVarargs(value: String*): Self = StObject.set(x, "includeGlobs", js.Array(value :_*))
      
      @scala.inline
      def setJs_(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      @scala.inline
      def setJs_Varargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "js", js.Array(value :_*))
      
      @scala.inline
      def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
      
      @scala.inline
      def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value :_*))
      
      @scala.inline
      def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
    }
  }
}

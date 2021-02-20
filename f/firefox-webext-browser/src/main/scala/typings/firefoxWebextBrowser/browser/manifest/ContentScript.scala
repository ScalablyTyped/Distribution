package typings.firefoxWebextBrowser.browser.manifest

import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be set at the same time. Based on InjectDetails, but using underscore rather than camel case naming conventions.
  */
@js.native
trait ContentScript extends StObject {
  
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
    */
  var all_frames: js.UndefOr[Boolean] = js.native
  
  /** The list of CSS files to inject */
  var css: js.UndefOr[js.Array[ExtensionURL]] = js.native
  
  var exclude_globs: js.UndefOr[js.Array[String]] = js.native
  
  var exclude_matches: js.UndefOr[js.Array[MatchPattern]] = js.native
  
  var include_globs: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of JS files to inject */
  @JSName("js")
  var js_ : js.UndefOr[js.Array[ExtensionURL]] = js.native
  
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
    */
  var match_about_blank: js.UndefOr[Boolean] = js.native
  
  var matches: js.Array[MatchPattern] = js.native
  
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var run_at: js.UndefOr[RunAt] = js.native
}
object ContentScript {
  
  @scala.inline
  def apply(matches: js.Array[MatchPattern]): ContentScript = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentScript]
  }
  
  @scala.inline
  implicit class ContentScriptMutableBuilder[Self <: ContentScript] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll_frames(value: Boolean): Self = StObject.set(x, "all_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_framesUndefined: Self = StObject.set(x, "all_frames", js.undefined)
    
    @scala.inline
    def setCss(value: js.Array[ExtensionURL]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setCssVarargs(value: ExtensionURL*): Self = StObject.set(x, "css", js.Array(value :_*))
    
    @scala.inline
    def setExclude_globs(value: js.Array[String]): Self = StObject.set(x, "exclude_globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_globsUndefined: Self = StObject.set(x, "exclude_globs", js.undefined)
    
    @scala.inline
    def setExclude_globsVarargs(value: String*): Self = StObject.set(x, "exclude_globs", js.Array(value :_*))
    
    @scala.inline
    def setExclude_matches(value: js.Array[MatchPattern]): Self = StObject.set(x, "exclude_matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_matchesUndefined: Self = StObject.set(x, "exclude_matches", js.undefined)
    
    @scala.inline
    def setExclude_matchesVarargs(value: MatchPattern*): Self = StObject.set(x, "exclude_matches", js.Array(value :_*))
    
    @scala.inline
    def setInclude_globs(value: js.Array[String]): Self = StObject.set(x, "include_globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_globsUndefined: Self = StObject.set(x, "include_globs", js.undefined)
    
    @scala.inline
    def setInclude_globsVarargs(value: String*): Self = StObject.set(x, "include_globs", js.Array(value :_*))
    
    @scala.inline
    def setJs_(value: js.Array[ExtensionURL]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
    
    @scala.inline
    def setJs_Varargs(value: ExtensionURL*): Self = StObject.set(x, "js", js.Array(value :_*))
    
    @scala.inline
    def setMatch_about_blank(value: Boolean): Self = StObject.set(x, "match_about_blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch_about_blankUndefined: Self = StObject.set(x, "match_about_blank", js.undefined)
    
    @scala.inline
    def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setRun_at(value: RunAt): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_atUndefined: Self = StObject.set(x, "run_at", js.undefined)
  }
}

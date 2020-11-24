package typings.firefoxWebextBrowser.browser.contentScripts

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* contentScripts types */
/** Details of a content script registered programmatically */
@js.native
trait RegisteredContentScriptOptions extends js.Object {
  
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[Boolean] = js.native
  
  /** The list of CSS files to inject */
  var css: js.UndefOr[js.Array[ExtensionFileOrCode]] = js.native
  
  var excludeGlobs: js.UndefOr[js.Array[String]] = js.native
  
  var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.native
  
  var includeGlobs: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of JS files to inject */
  @JSName("js")
  var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.native
  
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.native
  
  var matches: js.Array[MatchPattern] = js.native
  
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[RunAt] = js.native
}
object RegisteredContentScriptOptions {
  
  @scala.inline
  def apply(matches: js.Array[MatchPattern]): RegisteredContentScriptOptions = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredContentScriptOptions]
  }
  
  @scala.inline
  implicit class RegisteredContentScriptOptionsOps[Self <: RegisteredContentScriptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchesVarargs(value: MatchPattern*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[MatchPattern]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllFrames(value: Boolean): Self = this.set("allFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllFrames: Self = this.set("allFrames", js.undefined)
    
    @scala.inline
    def setCssVarargs(value: ExtensionFileOrCode*): Self = this.set("css", js.Array(value :_*))
    
    @scala.inline
    def setCss(value: js.Array[ExtensionFileOrCode]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setExcludeGlobsVarargs(value: String*): Self = this.set("excludeGlobs", js.Array(value :_*))
    
    @scala.inline
    def setExcludeGlobs(value: js.Array[String]): Self = this.set("excludeGlobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeGlobs: Self = this.set("excludeGlobs", js.undefined)
    
    @scala.inline
    def setExcludeMatchesVarargs(value: MatchPattern*): Self = this.set("excludeMatches", js.Array(value :_*))
    
    @scala.inline
    def setExcludeMatches(value: js.Array[MatchPattern]): Self = this.set("excludeMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeMatches: Self = this.set("excludeMatches", js.undefined)
    
    @scala.inline
    def setIncludeGlobsVarargs(value: String*): Self = this.set("includeGlobs", js.Array(value :_*))
    
    @scala.inline
    def setIncludeGlobs(value: js.Array[String]): Self = this.set("includeGlobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGlobs: Self = this.set("includeGlobs", js.undefined)
    
    @scala.inline
    def setJs_Varargs(value: ExtensionFileOrCode*): Self = this.set("js", js.Array(value :_*))
    
    @scala.inline
    def setJs_(value: js.Array[ExtensionFileOrCode]): Self = this.set("js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
    
    @scala.inline
    def setMatchAboutBlank(value: Boolean): Self = this.set("matchAboutBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchAboutBlank: Self = this.set("matchAboutBlank", js.undefined)
    
    @scala.inline
    def setRunAt(value: RunAt): Self = this.set("runAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAt: Self = this.set("runAt", js.undefined)
  }
}

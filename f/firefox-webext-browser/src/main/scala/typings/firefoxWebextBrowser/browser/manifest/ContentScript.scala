package typings.firefoxWebextBrowser.browser.manifest

import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be
  * set at the same time. Based on InjectDetails, but using underscore rather than camel case naming conventions.
  */
@js.native
trait ContentScript extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
    * page. By default, it's `false` and is only injected into the top frame.
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
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
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
  implicit class ContentScriptOps[Self <: ContentScript] (val x: Self) extends AnyVal {
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
    def setAll_frames(value: Boolean): Self = this.set("all_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll_frames: Self = this.set("all_frames", js.undefined)
    @scala.inline
    def setCssVarargs(value: ExtensionURL*): Self = this.set("css", js.Array(value :_*))
    @scala.inline
    def setCss(value: js.Array[ExtensionURL]): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setExclude_globsVarargs(value: String*): Self = this.set("exclude_globs", js.Array(value :_*))
    @scala.inline
    def setExclude_globs(value: js.Array[String]): Self = this.set("exclude_globs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_globs: Self = this.set("exclude_globs", js.undefined)
    @scala.inline
    def setExclude_matchesVarargs(value: MatchPattern*): Self = this.set("exclude_matches", js.Array(value :_*))
    @scala.inline
    def setExclude_matches(value: js.Array[MatchPattern]): Self = this.set("exclude_matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_matches: Self = this.set("exclude_matches", js.undefined)
    @scala.inline
    def setInclude_globsVarargs(value: String*): Self = this.set("include_globs", js.Array(value :_*))
    @scala.inline
    def setInclude_globs(value: js.Array[String]): Self = this.set("include_globs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_globs: Self = this.set("include_globs", js.undefined)
    @scala.inline
    def setJs_Varargs(value: ExtensionURL*): Self = this.set("js", js.Array(value :_*))
    @scala.inline
    def setJs_(value: js.Array[ExtensionURL]): Self = this.set("js", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
    @scala.inline
    def setMatch_about_blank(value: Boolean): Self = this.set("match_about_blank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch_about_blank: Self = this.set("match_about_blank", js.undefined)
    @scala.inline
    def setRun_at(value: RunAt): Self = this.set("run_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRun_at: Self = this.set("run_at", js.undefined)
  }
  
}


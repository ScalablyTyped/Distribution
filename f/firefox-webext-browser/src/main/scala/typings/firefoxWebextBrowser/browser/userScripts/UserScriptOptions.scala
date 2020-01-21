package typings.firefoxWebextBrowser.browser.userScripts

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typings.firefoxWebextBrowser.browser.extensionTypes.PlainJSONValue
import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* userScripts types */
/** Details of a user script */
trait UserScriptOptions extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript should be injected into all frames of current page. By
    * default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[Boolean] = js.undefined
  var excludeGlobs: js.UndefOr[js.Array[String]] = js.undefined
  var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  var includeGlobs: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of JS files to inject */
  @JSName("js")
  var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  var matches: js.Array[MatchPattern]
  /** The soonest that the JavaScript will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[RunAt] = js.undefined
  /** An opaque user script metadata value */
  var scriptMetadata: js.UndefOr[PlainJSONValue] = js.undefined
}

object UserScriptOptions {
  @scala.inline
  def apply(
    matches: js.Array[MatchPattern],
    allFrames: js.UndefOr[Boolean] = js.undefined,
    excludeGlobs: js.Array[String] = null,
    excludeMatches: js.Array[MatchPattern] = null,
    includeGlobs: js.Array[String] = null,
    js_ : js.Array[ExtensionFileOrCode] = null,
    matchAboutBlank: js.UndefOr[Boolean] = js.undefined,
    runAt: RunAt = null,
    scriptMetadata: PlainJSONValue = null
  ): UserScriptOptions = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames.asInstanceOf[js.Any])
    if (excludeGlobs != null) __obj.updateDynamic("excludeGlobs")(excludeGlobs.asInstanceOf[js.Any])
    if (excludeMatches != null) __obj.updateDynamic("excludeMatches")(excludeMatches.asInstanceOf[js.Any])
    if (includeGlobs != null) __obj.updateDynamic("includeGlobs")(includeGlobs.asInstanceOf[js.Any])
    if (js_ != null) __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank.asInstanceOf[js.Any])
    if (runAt != null) __obj.updateDynamic("runAt")(runAt.asInstanceOf[js.Any])
    if (scriptMetadata != null) __obj.updateDynamic("scriptMetadata")(scriptMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScriptOptions]
  }
}


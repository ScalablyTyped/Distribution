package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSuggestions extends js.Object {
  var editorSuggestions: js.UndefOr[js.Array[String]] = js.undefined
  var processingErrors: js.UndefOr[js.Array[String]] = js.undefined
  var processingHints: js.UndefOr[js.Array[String]] = js.undefined
  var processingWarnings: js.UndefOr[js.Array[String]] = js.undefined
  var tagSuggestions: js.UndefOr[js.Array[VideoSuggestionsTagSuggestion]] = js.undefined
}

object VideoSuggestions {
  @scala.inline
  def apply(
    editorSuggestions: js.Array[String] = null,
    processingErrors: js.Array[String] = null,
    processingHints: js.Array[String] = null,
    processingWarnings: js.Array[String] = null,
    tagSuggestions: js.Array[VideoSuggestionsTagSuggestion] = null
  ): VideoSuggestions = {
    val __obj = js.Dynamic.literal()
    if (editorSuggestions != null) __obj.updateDynamic("editorSuggestions")(editorSuggestions)
    if (processingErrors != null) __obj.updateDynamic("processingErrors")(processingErrors)
    if (processingHints != null) __obj.updateDynamic("processingHints")(processingHints)
    if (processingWarnings != null) __obj.updateDynamic("processingWarnings")(processingWarnings)
    if (tagSuggestions != null) __obj.updateDynamic("tagSuggestions")(tagSuggestions)
    __obj.asInstanceOf[VideoSuggestions]
  }
}


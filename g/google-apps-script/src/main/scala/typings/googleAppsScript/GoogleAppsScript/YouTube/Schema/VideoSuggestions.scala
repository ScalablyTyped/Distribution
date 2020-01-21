package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

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
    if (editorSuggestions != null) __obj.updateDynamic("editorSuggestions")(editorSuggestions.asInstanceOf[js.Any])
    if (processingErrors != null) __obj.updateDynamic("processingErrors")(processingErrors.asInstanceOf[js.Any])
    if (processingHints != null) __obj.updateDynamic("processingHints")(processingHints.asInstanceOf[js.Any])
    if (processingWarnings != null) __obj.updateDynamic("processingWarnings")(processingWarnings.asInstanceOf[js.Any])
    if (tagSuggestions != null) __obj.updateDynamic("tagSuggestions")(tagSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSuggestions]
  }
}


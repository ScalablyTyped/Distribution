package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One suggestion result.
  */
@js.native
trait Schema$SuggestResult extends js.Object {
  var peopleSuggestion: js.UndefOr[Schema$PeopleSuggestion] = js.native
  var querySuggestion: js.UndefOr[Schema$QuerySuggestion] = js.native
  /**
    * The source of the suggestion.
    */
  var source: js.UndefOr[Schema$Source] = js.native
  /**
    * The suggested query that will be used for search, when the user clicks on
    * the suggestion
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}

object Schema$SuggestResult {
  @scala.inline
  def apply(
    peopleSuggestion: Schema$PeopleSuggestion = null,
    querySuggestion: Schema$QuerySuggestion = null,
    source: Schema$Source = null,
    suggestedQuery: String = null
  ): Schema$SuggestResult = {
    val __obj = js.Dynamic.literal()
    if (peopleSuggestion != null) __obj.updateDynamic("peopleSuggestion")(peopleSuggestion.asInstanceOf[js.Any])
    if (querySuggestion != null) __obj.updateDynamic("querySuggestion")(querySuggestion.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (suggestedQuery != null) __obj.updateDynamic("suggestedQuery")(suggestedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestResult]
  }
}


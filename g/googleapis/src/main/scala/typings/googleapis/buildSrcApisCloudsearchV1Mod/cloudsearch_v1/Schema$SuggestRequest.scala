package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of suggest API.
  */
@js.native
trait Schema$SuggestRequest extends js.Object {
  /**
    * The sources to use for suggestions. If not specified, all data sources
    * from the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[Schema$DataSourceRestriction]] = js.native
  /**
    * Partial query for the completion suggestion.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[Schema$RequestOptions] = js.native
}

object Schema$SuggestRequest {
  @scala.inline
  def apply(
    dataSourceRestrictions: js.Array[Schema$DataSourceRestriction] = null,
    query: String = null,
    requestOptions: Schema$RequestOptions = null
  ): Schema$SuggestRequest = {
    val __obj = js.Dynamic.literal()
    if (dataSourceRestrictions != null) __obj.updateDynamic("dataSourceRestrictions")(dataSourceRestrictions.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestRequest]
  }
}


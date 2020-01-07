package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The search API request.
  */
@js.native
trait Schema$SearchRequest extends js.Object {
  /**
    * The sources to use for querying. If not specified, all data sources from
    * the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[Schema$DataSourceRestriction]] = js.native
  var facetOptions: js.UndefOr[js.Array[Schema$FacetOptions]] = js.native
  /**
    * Maximum number of search results to return in one page. Valid values are
    * between 1 and 100, inclusive. Default value is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The raw query string. See supported search operators in the [Cloud search
    * Cheat
    * Sheet](https://gsuite.google.com/learning-center/products/cloudsearch/cheat-sheet/)
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Options to interpret the user query.
    */
  var queryInterpretationOptions: js.UndefOr[Schema$QueryInterpretationOptions] = js.native
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[Schema$RequestOptions] = js.native
  /**
    * The options for sorting the search results
    */
  var sortOptions: js.UndefOr[Schema$SortOptions] = js.native
  /**
    * Starting index of the results.
    */
  var start: js.UndefOr[Double] = js.native
}

object Schema$SearchRequest {
  @scala.inline
  def apply(
    dataSourceRestrictions: js.Array[Schema$DataSourceRestriction] = null,
    facetOptions: js.Array[Schema$FacetOptions] = null,
    pageSize: Int | Double = null,
    query: String = null,
    queryInterpretationOptions: Schema$QueryInterpretationOptions = null,
    requestOptions: Schema$RequestOptions = null,
    sortOptions: Schema$SortOptions = null,
    start: Int | Double = null
  ): Schema$SearchRequest = {
    val __obj = js.Dynamic.literal()
    if (dataSourceRestrictions != null) __obj.updateDynamic("dataSourceRestrictions")(dataSourceRestrictions.asInstanceOf[js.Any])
    if (facetOptions != null) __obj.updateDynamic("facetOptions")(facetOptions.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryInterpretationOptions != null) __obj.updateDynamic("queryInterpretationOptions")(queryInterpretationOptions.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (sortOptions != null) __obj.updateDynamic("sortOptions")(sortOptions.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchRequest]
  }
}


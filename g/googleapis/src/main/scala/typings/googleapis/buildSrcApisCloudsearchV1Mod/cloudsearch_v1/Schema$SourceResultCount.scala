package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Per source result count information.
  */
@js.native
trait Schema$SourceResultCount extends js.Object {
  /**
    * Whether there are more search results for this source.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The estimated result count for this source.
    */
  var resultCountEstimate: js.UndefOr[String] = js.native
  /**
    * The exact result count for this source.
    */
  var resultCountExact: js.UndefOr[String] = js.native
  /**
    * The source the result count information is associated with.
    */
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$SourceResultCount {
  @scala.inline
  def apply(
    hasMoreResults: js.UndefOr[Boolean] = js.undefined,
    resultCountEstimate: String = null,
    resultCountExact: String = null,
    source: Schema$Source = null
  ): Schema$SourceResultCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults.asInstanceOf[js.Any])
    if (resultCountEstimate != null) __obj.updateDynamic("resultCountEstimate")(resultCountEstimate.asInstanceOf[js.Any])
    if (resultCountExact != null) __obj.updateDynamic("resultCountExact")(resultCountExact.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceResultCount]
  }
}


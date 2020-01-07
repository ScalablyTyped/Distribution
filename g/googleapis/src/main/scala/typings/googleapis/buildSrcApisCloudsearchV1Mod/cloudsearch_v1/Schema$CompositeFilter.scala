package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CompositeFilter extends js.Object {
  /**
    * The logic operator of the sub filter.
    */
  var logicOperator: js.UndefOr[String] = js.native
  /**
    * Sub filters.
    */
  var subFilters: js.UndefOr[js.Array[Schema$Filter]] = js.native
}

object Schema$CompositeFilter {
  @scala.inline
  def apply(logicOperator: String = null, subFilters: js.Array[Schema$Filter] = null): Schema$CompositeFilter = {
    val __obj = js.Dynamic.literal()
    if (logicOperator != null) __obj.updateDynamic("logicOperator")(logicOperator.asInstanceOf[js.Any])
    if (subFilters != null) __obj.updateDynamic("subFilters")(subFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompositeFilter]
  }
}


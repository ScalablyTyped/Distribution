package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCompositeFilter extends js.Object {
  /**
    * The logic operator of the sub filter.
    */
  var logicOperator: js.UndefOr[String] = js.native
  /**
    * Sub filters.
    */
  var subFilters: js.UndefOr[js.Array[SchemaFilter]] = js.native
}

object SchemaCompositeFilter {
  @scala.inline
  def apply(logicOperator: String = null, subFilters: js.Array[SchemaFilter] = null): SchemaCompositeFilter = {
    val __obj = js.Dynamic.literal()
    if (logicOperator != null) __obj.updateDynamic("logicOperator")(logicOperator.asInstanceOf[js.Any])
    if (subFilters != null) __obj.updateDynamic("subFilters")(subFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompositeFilter]
  }
}


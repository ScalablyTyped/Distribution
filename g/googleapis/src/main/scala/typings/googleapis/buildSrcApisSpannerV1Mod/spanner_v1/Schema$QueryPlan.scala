package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains an ordered list of nodes appearing in the query plan.
  */
@js.native
trait Schema$QueryPlan extends js.Object {
  /**
    * The nodes in the query plan. Plan nodes are returned in pre-order
    * starting with the plan root. Each PlanNode&#39;s `id` corresponds to its
    * index in `plan_nodes`.
    */
  var planNodes: js.UndefOr[js.Array[Schema$PlanNode]] = js.native
}

object Schema$QueryPlan {
  @scala.inline
  def apply(planNodes: js.Array[Schema$PlanNode] = null): Schema$QueryPlan = {
    val __obj = js.Dynamic.literal()
    if (planNodes != null) __obj.updateDynamic("planNodes")(planNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryPlan]
  }
}


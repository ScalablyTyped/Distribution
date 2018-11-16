package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryPlan extends js.Object {
  /**
               * The nodes in the query plan. Plan nodes are returned in pre-order starting
               * with the plan root. Each PlanNode's `id` corresponds to its index in
               * `plan_nodes`.
               */
  var planNodes: js.UndefOr[js.Array[PlanNode]] = js.undefined
}


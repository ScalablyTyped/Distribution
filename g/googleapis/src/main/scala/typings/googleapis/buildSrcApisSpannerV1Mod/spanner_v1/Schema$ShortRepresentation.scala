package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condensed representation of a node and its subtree. Only present for
  * `SCALAR` PlanNode(s).
  */
@js.native
trait Schema$ShortRepresentation extends js.Object {
  /**
    * A string representation of the expression subtree rooted at this node.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A mapping of (subquery variable name) -&gt; (subquery node id) for cases
    * where the `description` string of this node references a `SCALAR`
    * subquery contained in the expression subtree rooted at this node. The
    * referenced `SCALAR` subquery may not necessarily be a direct child of
    * this node.
    */
  var subqueries: js.UndefOr[StringDictionary[Double]] = js.native
}

object Schema$ShortRepresentation {
  @scala.inline
  def apply(description: String = null, subqueries: StringDictionary[Double] = null): Schema$ShortRepresentation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (subqueries != null) __obj.updateDynamic("subqueries")(subqueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShortRepresentation]
  }
}


package typings.gapiClientSpanner.gapi.client.spanner

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortRepresentation extends js.Object {
  /** A string representation of the expression subtree rooted at this node. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A mapping of (subquery variable name) -> (subquery node id) for cases
    * where the `description` string of this node references a `SCALAR`
    * subquery contained in the expression subtree rooted at this node. The
    * referenced `SCALAR` subquery may not necessarily be a direct child of
    * this node.
    */
  var subqueries: js.UndefOr[Record[String, Double]] = js.undefined
}

object ShortRepresentation {
  @scala.inline
  def apply(description: String = null, subqueries: Record[String, Double] = null): ShortRepresentation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (subqueries != null) __obj.updateDynamic("subqueries")(subqueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortRepresentation]
  }
}


package typings.gapiClientSpanner.gapi.client.spanner

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortRepresentation extends js.Object {
  /** A string representation of the expression subtree rooted at this node. */
  var description: js.UndefOr[String] = js.native
  /**
    * A mapping of (subquery variable name) -> (subquery node id) for cases
    * where the `description` string of this node references a `SCALAR`
    * subquery contained in the expression subtree rooted at this node. The
    * referenced `SCALAR` subquery may not necessarily be a direct child of
    * this node.
    */
  var subqueries: js.UndefOr[Record[String, Double]] = js.native
}

object ShortRepresentation {
  @scala.inline
  def apply(): ShortRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortRepresentation]
  }
  @scala.inline
  implicit class ShortRepresentationOps[Self <: ShortRepresentation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setSubqueries(value: Record[String, Double]): Self = this.set("subqueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubqueries: Self = this.set("subqueries", js.undefined)
  }
  
}


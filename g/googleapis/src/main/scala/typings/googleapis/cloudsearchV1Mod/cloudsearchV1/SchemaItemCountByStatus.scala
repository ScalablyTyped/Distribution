package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaItemCountByStatus extends js.Object {
  /**
    * Number of items matching the status code.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Status of the items.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object SchemaItemCountByStatus {
  @scala.inline
  def apply(): SchemaItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemCountByStatus]
  }
  @scala.inline
  implicit class SchemaItemCountByStatusOps[Self <: SchemaItemCountByStatus] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}


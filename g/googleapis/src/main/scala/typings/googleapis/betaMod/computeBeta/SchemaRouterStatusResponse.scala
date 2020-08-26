package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterStatusResponse extends js.Object {
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var result: js.UndefOr[SchemaRouterStatus] = js.native
}

object SchemaRouterStatusResponse {
  @scala.inline
  def apply(): SchemaRouterStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusResponse]
  }
  @scala.inline
  implicit class SchemaRouterStatusResponseOps[Self <: SchemaRouterStatusResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setResult(value: SchemaRouterStatus): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}


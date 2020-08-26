package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworksRemovePeeringRequest extends js.Object {
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaNetworksRemovePeeringRequest {
  @scala.inline
  def apply(): SchemaNetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksRemovePeeringRequest]
  }
  @scala.inline
  implicit class SchemaNetworksRemovePeeringRequestOps[Self <: SchemaNetworksRemovePeeringRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


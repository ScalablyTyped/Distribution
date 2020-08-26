package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsEnableXpnResourceRequest extends js.Object {
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.native
}

object SchemaProjectsEnableXpnResourceRequest {
  @scala.inline
  def apply(): SchemaProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsEnableXpnResourceRequest]
  }
  @scala.inline
  implicit class SchemaProjectsEnableXpnResourceRequestOps[Self <: SchemaProjectsEnableXpnResourceRequest] (val x: Self) extends AnyVal {
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
    def setXpnResource(value: SchemaXpnResourceId): Self = this.set("xpnResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpnResource: Self = this.set("xpnResource", js.undefined)
  }
  
}


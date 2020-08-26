package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsSetNodeTemplateRequest extends js.Object {
  /**
    * Full or partial URL of the node template resource to be updated for this
    * node group.
    */
  var nodeTemplate: js.UndefOr[String] = js.native
}

object SchemaNodeGroupsSetNodeTemplateRequest {
  @scala.inline
  def apply(): SchemaNodeGroupsSetNodeTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSetNodeTemplateRequest]
  }
  @scala.inline
  implicit class SchemaNodeGroupsSetNodeTemplateRequestOps[Self <: SchemaNodeGroupsSetNodeTemplateRequest] (val x: Self) extends AnyVal {
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
    def setNodeTemplate(value: String): Self = this.set("nodeTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeTemplate: Self = this.set("nodeTemplate", js.undefined)
  }
  
}


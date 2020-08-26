package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodePoolRequest extends js.Object {
  /** The desired image type for the node pool. */
  var imageType: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an
    * upgrade). Use `-` to upgrade to the latest version supported by
    * the server.
    */
  var nodeVersion: js.UndefOr[String] = js.native
}

object UpdateNodePoolRequest {
  @scala.inline
  def apply(): UpdateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNodePoolRequest]
  }
  @scala.inline
  implicit class UpdateNodePoolRequestOps[Self <: UpdateNodePoolRequest] (val x: Self) extends AnyVal {
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
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    @scala.inline
    def setNodeVersion(value: String): Self = this.set("nodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeVersion: Self = this.set("nodeVersion", js.undefined)
  }
  
}


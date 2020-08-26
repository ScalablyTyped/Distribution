package typings.devtoolsProtocol.mod.Protocol.IO

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveBlobRequest extends js.Object {
  /**
    * Object id of a Blob object wrapper.
    */
  var objectId: RemoteObjectId = js.native
}

object ResolveBlobRequest {
  @scala.inline
  def apply(objectId: RemoteObjectId): ResolveBlobRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveBlobRequest]
  }
  @scala.inline
  implicit class ResolveBlobRequestOps[Self <: ResolveBlobRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
  }
  
}


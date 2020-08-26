package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObjectsRequest extends js.Object {
  /**
    * Symbolic group name that can be used to release the results.
    */
  var objectGroup: js.UndefOr[String] = js.native
  /**
    * Identifier of the prototype to return objects for.
    */
  var prototypeObjectId: RemoteObjectId = js.native
}

object QueryObjectsRequest {
  @scala.inline
  def apply(prototypeObjectId: RemoteObjectId): QueryObjectsRequest = {
    val __obj = js.Dynamic.literal(prototypeObjectId = prototypeObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsRequest]
  }
  @scala.inline
  implicit class QueryObjectsRequestOps[Self <: QueryObjectsRequest] (val x: Self) extends AnyVal {
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
    def setPrototypeObjectId(value: RemoteObjectId): Self = this.set("prototypeObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectGroup(value: String): Self = this.set("objectGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectGroup: Self = this.set("objectGroup", js.undefined)
  }
  
}


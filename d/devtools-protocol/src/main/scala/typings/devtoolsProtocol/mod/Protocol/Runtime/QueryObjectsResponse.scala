package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObjectsResponse extends js.Object {
  /**
    * Array with objects.
    */
  var objects: RemoteObject = js.native
}

object QueryObjectsResponse {
  @scala.inline
  def apply(objects: RemoteObject): QueryObjectsResponse = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsResponse]
  }
  @scala.inline
  implicit class QueryObjectsResponseOps[Self <: QueryObjectsResponse] (val x: Self) extends AnyVal {
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
    def setObjects(value: RemoteObject): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
  
}


package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamespacesResponse extends js.Object {
  /** The attachments that corresponded to the request params. */
  var namespaces: js.UndefOr[js.Array[Namespace]] = js.native
}

object ListNamespacesResponse {
  @scala.inline
  def apply(): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamespacesResponse]
  }
  @scala.inline
  implicit class ListNamespacesResponseOps[Self <: ListNamespacesResponse] (val x: Self) extends AnyVal {
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
    def setNamespacesVarargs(value: Namespace*): Self = this.set("namespaces", js.Array(value :_*))
    @scala.inline
    def setNamespaces(value: js.Array[Namespace]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
  }
  
}


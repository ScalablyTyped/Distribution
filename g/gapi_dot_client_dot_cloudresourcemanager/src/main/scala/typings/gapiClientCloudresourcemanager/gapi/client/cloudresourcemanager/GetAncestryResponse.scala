package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAncestryResponse extends js.Object {
  /**
    * Ancestors are ordered from bottom to top of the resource hierarchy. The
    * first ancestor is the project itself, followed by the project's parent,
    * etc.
    */
  var ancestor: js.UndefOr[js.Array[Ancestor]] = js.native
}

object GetAncestryResponse {
  @scala.inline
  def apply(): GetAncestryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAncestryResponse]
  }
  @scala.inline
  implicit class GetAncestryResponseOps[Self <: GetAncestryResponse] (val x: Self) extends AnyVal {
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
    def setAncestorVarargs(value: Ancestor*): Self = this.set("ancestor", js.Array(value :_*))
    @scala.inline
    def setAncestor(value: js.Array[Ancestor]): Self = this.set("ancestor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAncestor: Self = this.set("ancestor", js.undefined)
  }
  
}


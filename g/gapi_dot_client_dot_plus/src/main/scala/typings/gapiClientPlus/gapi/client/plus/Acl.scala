package typings.gapiClientPlus.gapi.client.plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  /** Description of the access granted, suitable for display. */
  var description: js.UndefOr[String] = js.native
  /** The list of access entries. */
  var items: js.UndefOr[js.Array[PlusAclentryResource]] = js.native
  /** Identifies this resource as a collection of access controls. Value: "plus#acl". */
  var kind: js.UndefOr[String] = js.native
}

object Acl {
  @scala.inline
  def apply(): Acl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acl]
  }
  @scala.inline
  implicit class AclOps[Self <: Acl] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setItemsVarargs(value: PlusAclentryResource*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[PlusAclentryResource]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}


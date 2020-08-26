package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enterprise extends js.Object {
  /** Admins of the enterprise. This is only supported for enterprises created via the EMM-initiated flow. */
  var administrator: js.UndefOr[js.Array[Administrator]] = js.native
  /** The unique ID for the enterprise. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#enterprise". */
  var kind: js.UndefOr[String] = js.native
  /** The name of the enterprise, for example, "Example, Inc". */
  var name: js.UndefOr[String] = js.native
  /** The enterprise's primary domain, such as "example.com". */
  var primaryDomain: js.UndefOr[String] = js.native
}

object Enterprise {
  @scala.inline
  def apply(): Enterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enterprise]
  }
  @scala.inline
  implicit class EnterpriseOps[Self <: Enterprise] (val x: Self) extends AnyVal {
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
    def setAdministratorVarargs(value: Administrator*): Self = this.set("administrator", js.Array(value :_*))
    @scala.inline
    def setAdministrator(value: js.Array[Administrator]): Self = this.set("administrator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrator: Self = this.set("administrator", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrimaryDomain(value: String): Self = this.set("primaryDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryDomain: Self = this.set("primaryDomain", js.undefined)
  }
  
}


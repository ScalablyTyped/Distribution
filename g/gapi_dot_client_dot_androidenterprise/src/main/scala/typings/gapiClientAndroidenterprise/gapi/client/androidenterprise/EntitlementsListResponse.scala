package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitlementsListResponse extends js.Object {
  /**
    * An entitlement of a user to a product (e.g. an app). For example, a free app that they have installed, or a paid app that they have been allocated a
    * license to.
    */
  var entitlement: js.UndefOr[js.Array[Entitlement]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#entitlementsListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object EntitlementsListResponse {
  @scala.inline
  def apply(): EntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementsListResponse]
  }
  @scala.inline
  implicit class EntitlementsListResponseOps[Self <: EntitlementsListResponse] (val x: Self) extends AnyVal {
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
    def setEntitlementVarargs(value: Entitlement*): Self = this.set("entitlement", js.Array(value :_*))
    @scala.inline
    def setEntitlement(value: js.Array[Entitlement]): Self = this.set("entitlement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlement: Self = this.set("entitlement", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}


package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entitlement resources for the user.
  */
@js.native
trait SchemaEntitlementsListResponse extends js.Object {
  /**
    * An entitlement of a user to a product (e.g. an app). For example, a free
    * app that they have installed, or a paid app that they have been allocated
    * a license to.
    */
  var entitlement: js.UndefOr[js.Array[SchemaEntitlement]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#entitlementsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEntitlementsListResponse {
  @scala.inline
  def apply(): SchemaEntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntitlementsListResponse]
  }
  @scala.inline
  implicit class SchemaEntitlementsListResponseOps[Self <: SchemaEntitlementsListResponse] (val x: Self) extends AnyVal {
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
    def setEntitlementVarargs(value: SchemaEntitlement*): Self = this.set("entitlement", js.Array(value :_*))
    @scala.inline
    def setEntitlement(value: js.Array[SchemaEntitlement]): Self = this.set("entitlement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlement: Self = this.set("entitlement", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}


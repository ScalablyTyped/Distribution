package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entitlement resources for the user.
  */
@js.native
trait Schema$EntitlementsListResponse extends js.Object {
  /**
    * An entitlement of a user to a product (e.g. an app). For example, a free
    * app that they have installed, or a paid app that they have been allocated
    * a license to.
    */
  var entitlement: js.UndefOr[js.Array[Schema$Entitlement]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#entitlementsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$EntitlementsListResponse {
  @scala.inline
  def apply(entitlement: js.Array[Schema$Entitlement] = null, kind: String = null): Schema$EntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    if (entitlement != null) __obj.updateDynamic("entitlement")(entitlement.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EntitlementsListResponse]
  }
}


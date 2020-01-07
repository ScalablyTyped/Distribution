package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matching enterprise resources.
  */
@js.native
trait Schema$EnterprisesListResponse extends js.Object {
  /**
    * An enterprise.
    */
  var enterprise: js.UndefOr[js.Array[Schema$Enterprise]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterprisesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$EnterprisesListResponse {
  @scala.inline
  def apply(enterprise: js.Array[Schema$Enterprise] = null, kind: String = null): Schema$EnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    if (enterprise != null) __obj.updateDynamic("enterprise")(enterprise.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnterprisesListResponse]
  }
}


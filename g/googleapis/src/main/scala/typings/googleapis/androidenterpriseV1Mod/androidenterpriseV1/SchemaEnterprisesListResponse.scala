package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matching enterprise resources.
  */
@js.native
trait SchemaEnterprisesListResponse extends js.Object {
  /**
    * An enterprise.
    */
  var enterprise: js.UndefOr[js.Array[SchemaEnterprise]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterprisesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEnterprisesListResponse {
  @scala.inline
  def apply(enterprise: js.Array[SchemaEnterprise] = null, kind: String = null): SchemaEnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    if (enterprise != null) __obj.updateDynamic("enterprise")(enterprise.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnterprisesListResponse]
  }
}


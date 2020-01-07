package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The grouplicense resources for the enterprise.
  */
@js.native
trait Schema$GroupLicensesListResponse extends js.Object {
  /**
    * A group license for a product approved for use in the enterprise.
    */
  var groupLicense: js.UndefOr[js.Array[Schema$GroupLicense]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicensesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$GroupLicensesListResponse {
  @scala.inline
  def apply(groupLicense: js.Array[Schema$GroupLicense] = null, kind: String = null): Schema$GroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    if (groupLicense != null) __obj.updateDynamic("groupLicense")(groupLicense.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupLicensesListResponse]
  }
}


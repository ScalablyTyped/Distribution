package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupLicensesListResponse extends js.Object {
  /** A group license for a product approved for use in the enterprise. */
  var groupLicense: js.UndefOr[js.Array[GroupLicense]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicensesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object GroupLicensesListResponse {
  @scala.inline
  def apply(groupLicense: js.Array[GroupLicense] = null, kind: String = null): GroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    if (groupLicense != null) __obj.updateDynamic("groupLicense")(groupLicense)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[GroupLicensesListResponse]
  }
}


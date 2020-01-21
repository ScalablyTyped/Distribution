package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesListResponse extends js.Object {
  /** An enterprise. */
  var enterprise: js.UndefOr[js.Array[Enterprise]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#enterprisesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object EnterprisesListResponse {
  @scala.inline
  def apply(enterprise: js.Array[Enterprise] = null, kind: String = null): EnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    if (enterprise != null) __obj.updateDynamic("enterprise")(enterprise.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterprisesListResponse]
  }
}


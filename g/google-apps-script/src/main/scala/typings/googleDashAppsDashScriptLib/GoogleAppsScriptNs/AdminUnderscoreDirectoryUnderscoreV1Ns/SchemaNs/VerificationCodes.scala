package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationCodes extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[VerificationCode]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object VerificationCodes {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[VerificationCode] = null,
    kind: java.lang.String = null
  ): VerificationCodes = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[VerificationCodes]
  }
}


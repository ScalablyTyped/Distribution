package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionInfo extends js.Object {
  var encryptionEntityId: js.UndefOr[java.lang.String] = js.undefined
  var encryptionEntityType: js.UndefOr[java.lang.String] = js.undefined
  var encryptionSource: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object EncryptionInfo {
  @scala.inline
  def apply(
    encryptionEntityId: java.lang.String = null,
    encryptionEntityType: java.lang.String = null,
    encryptionSource: java.lang.String = null,
    kind: java.lang.String = null
  ): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (encryptionEntityId != null) __obj.updateDynamic("encryptionEntityId")(encryptionEntityId)
    if (encryptionEntityType != null) __obj.updateDynamic("encryptionEntityType")(encryptionEntityType)
    if (encryptionSource != null) __obj.updateDynamic("encryptionSource")(encryptionSource)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EncryptionInfo]
  }
}


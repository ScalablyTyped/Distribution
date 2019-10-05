package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionInfo extends js.Object {
  var encryptionEntityId: js.UndefOr[String] = js.undefined
  var encryptionEntityType: js.UndefOr[String] = js.undefined
  var encryptionSource: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object EncryptionInfo {
  @scala.inline
  def apply(
    encryptionEntityId: String = null,
    encryptionEntityType: String = null,
    encryptionSource: String = null,
    kind: String = null
  ): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (encryptionEntityId != null) __obj.updateDynamic("encryptionEntityId")(encryptionEntityId)
    if (encryptionEntityType != null) __obj.updateDynamic("encryptionEntityType")(encryptionEntityType)
    if (encryptionSource != null) __obj.updateDynamic("encryptionSource")(encryptionSource)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EncryptionInfo]
  }
}


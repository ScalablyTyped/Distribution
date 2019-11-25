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
    if (encryptionEntityId != null) __obj.updateDynamic("encryptionEntityId")(encryptionEntityId.asInstanceOf[js.Any])
    if (encryptionEntityType != null) __obj.updateDynamic("encryptionEntityType")(encryptionEntityType.asInstanceOf[js.Any])
    if (encryptionSource != null) __obj.updateDynamic("encryptionSource")(encryptionSource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionInfo]
  }
}


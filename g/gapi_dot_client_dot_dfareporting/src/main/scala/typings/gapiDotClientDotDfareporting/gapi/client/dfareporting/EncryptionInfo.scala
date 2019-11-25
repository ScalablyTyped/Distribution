package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionInfo extends js.Object {
  /** The encryption entity ID. This should match the encryption configuration for ad serving or Data Transfer. */
  var encryptionEntityId: js.UndefOr[String] = js.undefined
  /** The encryption entity type. This should match the encryption configuration for ad serving or Data Transfer. */
  var encryptionEntityType: js.UndefOr[String] = js.undefined
  /** Describes whether the encrypted cookie was received from ad serving (the %m macro) or from Data Transfer. */
  var encryptionSource: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#encryptionInfo". */
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


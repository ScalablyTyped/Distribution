package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionInfo extends js.Object {
  /** The encryption entity ID. This should match the encryption configuration for ad serving or Data Transfer. */
  var encryptionEntityId: js.UndefOr[java.lang.String] = js.undefined
  /** The encryption entity type. This should match the encryption configuration for ad serving or Data Transfer. */
  var encryptionEntityType: js.UndefOr[java.lang.String] = js.undefined
  /** Describes whether the encrypted cookie was received from ad serving (the %m macro) or from Data Transfer. */
  var encryptionSource: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#encryptionInfo". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}


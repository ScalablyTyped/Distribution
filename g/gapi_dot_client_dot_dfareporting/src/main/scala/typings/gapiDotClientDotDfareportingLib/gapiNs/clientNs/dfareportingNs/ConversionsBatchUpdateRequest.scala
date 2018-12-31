package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchUpdateRequest extends js.Object {
  /** The set of conversions to update. */
  var conversions: js.UndefOr[js.Array[Conversion]] = js.undefined
  /** Describes how encryptedUserId is encrypted. This is a required field if encryptedUserId is used. */
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchUpdateRequest". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}


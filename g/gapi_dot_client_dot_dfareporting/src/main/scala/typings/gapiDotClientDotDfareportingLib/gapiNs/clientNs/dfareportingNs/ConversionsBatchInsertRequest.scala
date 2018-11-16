package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConversionsBatchInsertRequest extends js.Object {
  /** The set of conversions to insert. */
  var conversions: js.UndefOr[js.Array[Conversion]] = js.undefined
  /**
               * Describes how encryptedUserId or encryptedUserIdCandidates[] is encrypted. This is a required field if encryptedUserId or encryptedUserIdCandidates[]
               * is used.
               */
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchInsertRequest". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}


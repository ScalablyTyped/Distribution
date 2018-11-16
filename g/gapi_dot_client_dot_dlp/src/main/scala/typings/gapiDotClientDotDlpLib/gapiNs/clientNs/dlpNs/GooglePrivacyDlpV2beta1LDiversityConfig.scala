package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1LDiversityConfig extends js.Object {
  /**
               * Set of quasi-identifiers indicating how equivalence classes are
               * defined for the l-diversity computation. When multiple fields are
               * specified, they are considered a single composite key.
               */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.undefined
  /** Sensitive field for computing the l-value. */
  var sensitiveAttribute: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
}


package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1InfoTypeTransformation extends js.Object {
  /**
               * Info types to apply the transformation to. Empty list will match all
               * available info types for this transformation.
               */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoType]] = js.undefined
  /** Primitive transformation to apply to the info type. [required] */
  var primitiveTransformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.undefined
}


package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConversionStatus extends js.Object {
  /** The original conversion that was inserted or updated. */
  var conversion: js.UndefOr[Conversion] = js.undefined
  /** A list of errors related to this conversion. */
  var errors: js.UndefOr[js.Array[ConversionError]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionStatus". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}


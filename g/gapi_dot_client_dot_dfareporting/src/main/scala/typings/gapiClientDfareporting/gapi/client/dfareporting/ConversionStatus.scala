package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionStatus extends js.Object {
  /** The original conversion that was inserted or updated. */
  var conversion: js.UndefOr[Conversion] = js.undefined
  /** A list of errors related to this conversion. */
  var errors: js.UndefOr[js.Array[ConversionError]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionStatus". */
  var kind: js.UndefOr[String] = js.undefined
}

object ConversionStatus {
  @scala.inline
  def apply(conversion: Conversion = null, errors: js.Array[ConversionError] = null, kind: String = null): ConversionStatus = {
    val __obj = js.Dynamic.literal()
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionStatus]
  }
}


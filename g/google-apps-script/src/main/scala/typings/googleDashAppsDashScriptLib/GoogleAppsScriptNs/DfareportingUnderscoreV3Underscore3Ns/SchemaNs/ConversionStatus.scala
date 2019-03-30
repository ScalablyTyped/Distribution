package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionStatus extends js.Object {
  var conversion: js.UndefOr[Conversion] = js.undefined
  var errors: js.UndefOr[js.Array[ConversionError]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ConversionStatus {
  @scala.inline
  def apply(
    conversion: Conversion = null,
    errors: js.Array[ConversionError] = null,
    kind: java.lang.String = null
  ): ConversionStatus = {
    val __obj = js.Dynamic.literal()
    if (conversion != null) __obj.updateDynamic("conversion")(conversion)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ConversionStatus]
  }
}


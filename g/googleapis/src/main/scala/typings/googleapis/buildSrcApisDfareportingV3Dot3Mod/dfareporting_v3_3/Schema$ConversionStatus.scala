package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The original conversion that was inserted or updated and whether there were
  * any errors.
  */
@js.native
trait Schema$ConversionStatus extends js.Object {
  /**
    * The original conversion that was inserted or updated.
    */
  var conversion: js.UndefOr[Schema$Conversion] = js.native
  /**
    * A list of errors related to this conversion.
    */
  var errors: js.UndefOr[js.Array[Schema$ConversionError]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ConversionStatus {
  @scala.inline
  def apply(
    conversion: Schema$Conversion = null,
    errors: js.Array[Schema$ConversionError] = null,
    kind: String = null
  ): Schema$ConversionStatus = {
    val __obj = js.Dynamic.literal()
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConversionStatus]
  }
}


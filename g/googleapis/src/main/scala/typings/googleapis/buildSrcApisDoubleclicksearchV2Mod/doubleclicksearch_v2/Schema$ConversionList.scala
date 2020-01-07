package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of conversions.
  */
@js.native
trait Schema$ConversionList extends js.Object {
  /**
    * The conversions being requested.
    */
  var conversion: js.UndefOr[js.Array[Schema$Conversion]] = js.native
  /**
    * Identifies this as a ConversionList resource. Value: the fixed string
    * doubleclicksearch#conversionList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ConversionList {
  @scala.inline
  def apply(conversion: js.Array[Schema$Conversion] = null, kind: String = null): Schema$ConversionList = {
    val __obj = js.Dynamic.literal()
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConversionList]
  }
}


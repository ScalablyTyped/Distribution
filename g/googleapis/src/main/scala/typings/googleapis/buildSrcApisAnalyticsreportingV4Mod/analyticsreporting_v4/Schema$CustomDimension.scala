package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom dimension.
  */
@js.native
trait Schema$CustomDimension extends js.Object {
  /**
    * Slot number of custom dimension.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Value of the custom dimension. Default value (i.e. empty string)
    * indicates clearing sesion/visitor scope custom dimension value.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$CustomDimension {
  @scala.inline
  def apply(index: Int | Double = null, value: String = null): Schema$CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomDimension]
  }
}


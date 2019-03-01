package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartStemAndStyle extends js.Object {
  var stem: js.UndefOr[ChartStem] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object ChartStemAndStyle {
  @scala.inline
  def apply(stem: ChartStem = null, style: java.lang.String = null): ChartStemAndStyle = {
    val __obj = js.Dynamic.literal()
    if (stem != null) __obj.updateDynamic("stem")(stem)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ChartStemAndStyle]
  }
}


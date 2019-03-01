package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAnnotations extends js.Object {
  var boxStyle: js.UndefOr[ChartBoxStyle] = js.undefined
  var datum: js.UndefOr[ChartStemAndStyle] = js.undefined
  var domain: js.UndefOr[ChartStemAndStyle] = js.undefined
  var highContrast: js.UndefOr[scala.Boolean] = js.undefined
  var stem: js.UndefOr[ChartStem] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}

object ChartAnnotations {
  @scala.inline
  def apply(
    boxStyle: ChartBoxStyle = null,
    datum: ChartStemAndStyle = null,
    domain: ChartStemAndStyle = null,
    highContrast: js.UndefOr[scala.Boolean] = js.undefined,
    stem: ChartStem = null,
    style: java.lang.String = null,
    textStyle: ChartTextStyle = null
  ): ChartAnnotations = {
    val __obj = js.Dynamic.literal()
    if (boxStyle != null) __obj.updateDynamic("boxStyle")(boxStyle)
    if (datum != null) __obj.updateDynamic("datum")(datum)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(highContrast)) __obj.updateDynamic("highContrast")(highContrast)
    if (stem != null) __obj.updateDynamic("stem")(stem)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ChartAnnotations]
  }
}


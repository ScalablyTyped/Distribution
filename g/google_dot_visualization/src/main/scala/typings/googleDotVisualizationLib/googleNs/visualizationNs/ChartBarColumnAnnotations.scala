package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBarColumnAnnotations extends ChartAnnotations {
  var alwaysOutside: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartBarColumnAnnotations {
  @scala.inline
  def apply(
    alwaysOutside: js.UndefOr[scala.Boolean] = js.undefined,
    boxStyle: ChartBoxStyle = null,
    datum: ChartStemAndStyle = null,
    domain: ChartStemAndStyle = null,
    highContrast: js.UndefOr[scala.Boolean] = js.undefined,
    stem: ChartStem = null,
    style: java.lang.String = null,
    textStyle: ChartTextStyle = null
  ): ChartBarColumnAnnotations = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysOutside)) __obj.updateDynamic("alwaysOutside")(alwaysOutside)
    if (boxStyle != null) __obj.updateDynamic("boxStyle")(boxStyle)
    if (datum != null) __obj.updateDynamic("datum")(datum)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(highContrast)) __obj.updateDynamic("highContrast")(highContrast)
    if (stem != null) __obj.updateDynamic("stem")(stem)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ChartBarColumnAnnotations]
  }
}


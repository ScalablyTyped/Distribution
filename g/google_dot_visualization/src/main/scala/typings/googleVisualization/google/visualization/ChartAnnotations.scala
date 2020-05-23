package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAnnotations extends js.Object {
  var boxStyle: js.UndefOr[ChartBoxStyle] = js.undefined
  var datum: js.UndefOr[ChartStemAndStyle] = js.undefined
  var domain: js.UndefOr[ChartStemAndStyle] = js.undefined
  var highContrast: js.UndefOr[Boolean] = js.undefined
  var stem: js.UndefOr[ChartStem] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}

object ChartAnnotations {
  @scala.inline
  def apply(
    boxStyle: ChartBoxStyle = null,
    datum: ChartStemAndStyle = null,
    domain: ChartStemAndStyle = null,
    highContrast: js.UndefOr[Boolean] = js.undefined,
    stem: ChartStem = null,
    style: String = null,
    textStyle: ChartTextStyle = null
  ): ChartAnnotations = {
    val __obj = js.Dynamic.literal()
    if (boxStyle != null) __obj.updateDynamic("boxStyle")(boxStyle.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(highContrast)) __obj.updateDynamic("highContrast")(highContrast.get.asInstanceOf[js.Any])
    if (stem != null) __obj.updateDynamic("stem")(stem.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAnnotations]
  }
}


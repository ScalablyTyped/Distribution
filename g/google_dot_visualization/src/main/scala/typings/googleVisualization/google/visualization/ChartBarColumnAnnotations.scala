package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBarColumnAnnotations extends ChartAnnotations {
  var alwaysOutside: js.UndefOr[Boolean] = js.undefined
}

object ChartBarColumnAnnotations {
  @scala.inline
  def apply(
    alwaysOutside: js.UndefOr[Boolean] = js.undefined,
    boxStyle: ChartBoxStyle = null,
    datum: ChartStemAndStyle = null,
    domain: ChartStemAndStyle = null,
    highContrast: js.UndefOr[Boolean] = js.undefined,
    stem: ChartStem = null,
    style: String = null,
    textStyle: ChartTextStyle = null
  ): ChartBarColumnAnnotations = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysOutside)) __obj.updateDynamic("alwaysOutside")(alwaysOutside.asInstanceOf[js.Any])
    if (boxStyle != null) __obj.updateDynamic("boxStyle")(boxStyle.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(highContrast)) __obj.updateDynamic("highContrast")(highContrast.asInstanceOf[js.Any])
    if (stem != null) __obj.updateDynamic("stem")(stem.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBarColumnAnnotations]
  }
}


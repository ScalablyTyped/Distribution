package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipOptions extends js.Object {
  var clickOpen: js.UndefOr[scala.Boolean] = js.undefined
  var disableHover: js.UndefOr[scala.Boolean] = js.undefined
  var fadeInDuration: js.UndefOr[scala.Double] = js.undefined
  var fadeOutDuration: js.UndefOr[scala.Double] = js.undefined
  var hOffset: js.UndefOr[scala.Double] = js.undefined
  var hoverDelay: js.UndefOr[scala.Double] = js.undefined
  var positionClass: js.UndefOr[java.lang.String] = js.undefined
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateClasses: js.UndefOr[java.lang.String] = js.undefined
  var tipText: js.UndefOr[java.lang.String] = js.undefined
  var tooltipClass: js.UndefOr[java.lang.String] = js.undefined
  var triggerClass: js.UndefOr[java.lang.String] = js.undefined
  var vOffset: js.UndefOr[scala.Double] = js.undefined
}

object ITooltipOptions {
  @scala.inline
  def apply(
    clickOpen: js.UndefOr[scala.Boolean] = js.undefined,
    disableHover: js.UndefOr[scala.Boolean] = js.undefined,
    fadeInDuration: scala.Int | scala.Double = null,
    fadeOutDuration: scala.Int | scala.Double = null,
    hOffset: scala.Int | scala.Double = null,
    hoverDelay: scala.Int | scala.Double = null,
    positionClass: java.lang.String = null,
    showOn: java.lang.String = null,
    template: java.lang.String = null,
    templateClasses: java.lang.String = null,
    tipText: java.lang.String = null,
    tooltipClass: java.lang.String = null,
    triggerClass: java.lang.String = null,
    vOffset: scala.Int | scala.Double = null
  ): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickOpen)) __obj.updateDynamic("clickOpen")(clickOpen)
    if (!js.isUndefined(disableHover)) __obj.updateDynamic("disableHover")(disableHover)
    if (fadeInDuration != null) __obj.updateDynamic("fadeInDuration")(fadeInDuration.asInstanceOf[js.Any])
    if (fadeOutDuration != null) __obj.updateDynamic("fadeOutDuration")(fadeOutDuration.asInstanceOf[js.Any])
    if (hOffset != null) __obj.updateDynamic("hOffset")(hOffset.asInstanceOf[js.Any])
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass)
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateClasses != null) __obj.updateDynamic("templateClasses")(templateClasses)
    if (tipText != null) __obj.updateDynamic("tipText")(tipText)
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass)
    if (triggerClass != null) __obj.updateDynamic("triggerClass")(triggerClass)
    if (vOffset != null) __obj.updateDynamic("vOffset")(vOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipOptions]
  }
}


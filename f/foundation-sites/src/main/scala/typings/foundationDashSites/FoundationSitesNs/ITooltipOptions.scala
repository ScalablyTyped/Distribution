package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipOptions extends js.Object {
  var clickOpen: js.UndefOr[Boolean] = js.undefined
  var disableHover: js.UndefOr[Boolean] = js.undefined
  var fadeInDuration: js.UndefOr[Double] = js.undefined
  var fadeOutDuration: js.UndefOr[Double] = js.undefined
  var hOffset: js.UndefOr[Double] = js.undefined
  var hoverDelay: js.UndefOr[Double] = js.undefined
  var positionClass: js.UndefOr[String] = js.undefined
  var showOn: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateClasses: js.UndefOr[String] = js.undefined
  var tipText: js.UndefOr[String] = js.undefined
  var tooltipClass: js.UndefOr[String] = js.undefined
  var triggerClass: js.UndefOr[String] = js.undefined
  var vOffset: js.UndefOr[Double] = js.undefined
}

object ITooltipOptions {
  @scala.inline
  def apply(
    clickOpen: js.UndefOr[Boolean] = js.undefined,
    disableHover: js.UndefOr[Boolean] = js.undefined,
    fadeInDuration: Int | Double = null,
    fadeOutDuration: Int | Double = null,
    hOffset: Int | Double = null,
    hoverDelay: Int | Double = null,
    positionClass: String = null,
    showOn: String = null,
    template: String = null,
    templateClasses: String = null,
    tipText: String = null,
    tooltipClass: String = null,
    triggerClass: String = null,
    vOffset: Int | Double = null
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


package typings.foundationSites.FoundationSites

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
    fadeInDuration: js.UndefOr[Double] = js.undefined,
    fadeOutDuration: js.UndefOr[Double] = js.undefined,
    hOffset: js.UndefOr[Double] = js.undefined,
    hoverDelay: js.UndefOr[Double] = js.undefined,
    positionClass: String = null,
    showOn: String = null,
    template: String = null,
    templateClasses: String = null,
    tipText: String = null,
    tooltipClass: String = null,
    triggerClass: String = null,
    vOffset: js.UndefOr[Double] = js.undefined
  ): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickOpen)) __obj.updateDynamic("clickOpen")(clickOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHover)) __obj.updateDynamic("disableHover")(disableHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeInDuration)) __obj.updateDynamic("fadeInDuration")(fadeInDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOutDuration)) __obj.updateDynamic("fadeOutDuration")(fadeOutDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hOffset)) __obj.updateDynamic("hOffset")(hOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverDelay)) __obj.updateDynamic("hoverDelay")(hoverDelay.get.asInstanceOf[js.Any])
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateClasses != null) __obj.updateDynamic("templateClasses")(templateClasses.asInstanceOf[js.Any])
    if (tipText != null) __obj.updateDynamic("tipText")(tipText.asInstanceOf[js.Any])
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass.asInstanceOf[js.Any])
    if (triggerClass != null) __obj.updateDynamic("triggerClass")(triggerClass.asInstanceOf[js.Any])
    if (!js.isUndefined(vOffset)) __obj.updateDynamic("vOffset")(vOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipOptions]
  }
}


package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettings extends js.Object {
  /** Options for customizing the higher level labels in range navigator.
    */
  var higherLevel: js.UndefOr[LabelSettingsHigherLevel] = js.undefined
  /** Options for customizing the labels in lower level.
    */
  var lowerLevel: js.UndefOr[LabelSettingsLowerLevel] = js.undefined
  /** Options for customizing the style of labels in range navigator.
    */
  var style: js.UndefOr[LabelSettingsStyle] = js.undefined
}

object LabelSettings {
  @scala.inline
  def apply(
    higherLevel: LabelSettingsHigherLevel = null,
    lowerLevel: LabelSettingsLowerLevel = null,
    style: LabelSettingsStyle = null
  ): LabelSettings = {
    val __obj = js.Dynamic.literal()
    if (higherLevel != null) __obj.updateDynamic("higherLevel")(higherLevel.asInstanceOf[js.Any])
    if (lowerLevel != null) __obj.updateDynamic("lowerLevel")(lowerLevel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettings]
  }
}


package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendSettings extends js.Object {
  /** Specifies the alignment text for legend
    * @Default {near}
    */
  var alignment: js.UndefOr[String] = js.undefined
  /** Specifies the alignment text for legend
    * @Default {0}
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  /** Specifies the dockPosition text for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[String] = js.undefined
  /** Specifies the height for legend
    * @Default {30}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies the iconHeight for legend
    * @Default {15}
    */
  var iconHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the iconWidth for legend
    * @Default {15}
    */
  var iconWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the leftLabel text for legend
    */
  var leftLabel: js.UndefOr[String] = js.undefined
  /** Specifies the mode for legendSettings whether default or interactive mode
    * @Default {default}
    */
  var mode: js.UndefOr[String] = js.undefined
  /** Specifies the rightLabel text for legend
    */
  var rightLabel: js.UndefOr[String] = js.undefined
  /** Specifies the template for legendSettings
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Specifies the title text for legend
    */
  var title: js.UndefOr[String] = js.undefined
  /** Specifies the width for legend
    * @Default {100}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LegendSettings {
  @scala.inline
  def apply(
    alignment: String = null,
    columnCount: Int | Double = null,
    dockPosition: String = null,
    height: Int | Double = null,
    iconHeight: Int | Double = null,
    iconWidth: Int | Double = null,
    leftLabel: String = null,
    mode: String = null,
    rightLabel: String = null,
    template: String = null,
    title: String = null,
    width: Int | Double = null
  ): LegendSettings = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendSettings]
  }
}


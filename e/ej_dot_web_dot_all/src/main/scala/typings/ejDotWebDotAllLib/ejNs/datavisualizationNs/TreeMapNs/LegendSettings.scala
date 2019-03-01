package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendSettings extends js.Object {
  /** Specifies the alignment text for legend
    * @Default {near}
    */
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment text for legend
    * @Default {0}
    */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the dockPosition text for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the height for legend
    * @Default {30}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the iconHeight for legend
    * @Default {15}
    */
  var iconHeight: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the iconWidth for legend
    * @Default {15}
    */
  var iconWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the leftLabel text for legend
    */
  var leftLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode for legendSettings whether default or interactive mode
    * @Default {default}
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the rightLabel text for legend
    */
  var rightLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template for legendSettings
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the title text for legend
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width for legend
    * @Default {100}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object LegendSettings {
  @scala.inline
  def apply(
    alignment: java.lang.String = null,
    columnCount: scala.Int | scala.Double = null,
    dockPosition: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    iconHeight: scala.Int | scala.Double = null,
    iconWidth: scala.Int | scala.Double = null,
    leftLabel: java.lang.String = null,
    mode: java.lang.String = null,
    rightLabel: java.lang.String = null,
    template: java.lang.String = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): LegendSettings = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendSettings]
  }
}


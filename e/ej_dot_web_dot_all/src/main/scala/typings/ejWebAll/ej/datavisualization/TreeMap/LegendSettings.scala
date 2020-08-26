package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendSettings extends js.Object {
  /** Specifies the alignment text for legend
    * @Default {near}
    */
  var alignment: js.UndefOr[String] = js.native
  /** Specifies the alignment text for legend
    * @Default {0}
    */
  var columnCount: js.UndefOr[Double] = js.native
  /** Specifies the dockPosition text for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[String] = js.native
  /** Specifies the height for legend
    * @Default {30}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies the iconHeight for legend
    * @Default {15}
    */
  var iconHeight: js.UndefOr[Double] = js.native
  /** Specifies the iconWidth for legend
    * @Default {15}
    */
  var iconWidth: js.UndefOr[Double] = js.native
  /** Specifies the leftLabel text for legend
    */
  var leftLabel: js.UndefOr[String] = js.native
  /** Specifies the mode for legendSettings whether default or interactive mode
    * @Default {default}
    */
  var mode: js.UndefOr[String] = js.native
  /** Specifies the rightLabel text for legend
    */
  var rightLabel: js.UndefOr[String] = js.native
  /** Specifies the template for legendSettings
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Specifies the title text for legend
    */
  var title: js.UndefOr[String] = js.native
  /** Specifies the width for legend
    * @Default {100}
    */
  var width: js.UndefOr[Double] = js.native
}

object LegendSettings {
  @scala.inline
  def apply(): LegendSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendSettings]
  }
  @scala.inline
  implicit class LegendSettingsOps[Self <: LegendSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setDockPosition(value: String): Self = this.set("dockPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockPosition: Self = this.set("dockPosition", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIconHeight(value: Double): Self = this.set("iconHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconHeight: Self = this.set("iconHeight", js.undefined)
    @scala.inline
    def setIconWidth(value: Double): Self = this.set("iconWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconWidth: Self = this.set("iconWidth", js.undefined)
    @scala.inline
    def setLeftLabel(value: String): Self = this.set("leftLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftLabel: Self = this.set("leftLabel", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRightLabel(value: String): Self = this.set("rightLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightLabel: Self = this.set("rightLabel", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


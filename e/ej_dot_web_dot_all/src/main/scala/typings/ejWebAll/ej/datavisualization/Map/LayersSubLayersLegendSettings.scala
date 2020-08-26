package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersLegendSettings extends js.Object {
  /** Determines whether the legend should be placed outside or inside the map bounds
    * @Default {false}
    */
  var dockOnMap: js.UndefOr[Boolean] = js.native
  /** Determines the legend placement and it is valid only when dockOnMap is true
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | String] = js.native
  /** height value for legend setting
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** to get icon value for legend setting
    * @Default {rectangle}
    */
  var icon: js.UndefOr[LegendIcons | String] = js.native
  /** icon height value for legend setting
    * @Default {20}
    */
  var iconHeight: js.UndefOr[Double] = js.native
  /** icon Width value for legend setting
    * @Default {20}
    */
  var iconWidth: js.UndefOr[Double] = js.native
  /** set the orientation of legend labels
    * @Default {vertical}
    */
  var labelOrientation: js.UndefOr[LabelOrientation | String] = js.native
  /** to get leftLabel value for legend setting
    * @Default {null}
    */
  var leftLabel: js.UndefOr[String] = js.native
  /** to get mode of legend setting
    * @Default {default}
    */
  var mode: js.UndefOr[Mode | String] = js.native
  /** set the position of legend settings
    * @Default {topleft}
    */
  var position: js.UndefOr[Position | String] = js.native
  /** x position value for legend setting
    * @Default {0}
    */
  var positionX: js.UndefOr[Double] = js.native
  /** y position value for legend setting
    * @Default {0}
    */
  var positionY: js.UndefOr[Double] = js.native
  /** to get rightLabel value for legend setting
    * @Default {null}
    */
  var rightLabel: js.UndefOr[String] = js.native
  /** Enables or Disables the showLabels
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the showLegend
    * @Default {false}
    */
  var showLegend: js.UndefOr[Boolean] = js.native
  /** To get the field name in the datasource for generating legend items.
    * @Default {null}
    */
  var textPath: js.UndefOr[String] = js.native
  /** to get title of legend setting
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
  /** to get type of legend setting
    * @Default {layers}
    */
  var `type`: js.UndefOr[LegendType | String] = js.native
  /** width value for legend setting
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object LayersSubLayersLegendSettings {
  @scala.inline
  def apply(): LayersSubLayersLegendSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersLegendSettings]
  }
  @scala.inline
  implicit class LayersSubLayersLegendSettingsOps[Self <: LayersSubLayersLegendSettings] (val x: Self) extends AnyVal {
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
    def setDockOnMap(value: Boolean): Self = this.set("dockOnMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockOnMap: Self = this.set("dockOnMap", js.undefined)
    @scala.inline
    def setDockPosition(value: DockPosition | String): Self = this.set("dockPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockPosition: Self = this.set("dockPosition", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIcon(value: LegendIcons | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconHeight(value: Double): Self = this.set("iconHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconHeight: Self = this.set("iconHeight", js.undefined)
    @scala.inline
    def setIconWidth(value: Double): Self = this.set("iconWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconWidth: Self = this.set("iconWidth", js.undefined)
    @scala.inline
    def setLabelOrientation(value: LabelOrientation | String): Self = this.set("labelOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOrientation: Self = this.set("labelOrientation", js.undefined)
    @scala.inline
    def setLeftLabel(value: String): Self = this.set("leftLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftLabel: Self = this.set("leftLabel", js.undefined)
    @scala.inline
    def setMode(value: Mode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPosition(value: Position | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionX(value: Double): Self = this.set("positionX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionX: Self = this.set("positionX", js.undefined)
    @scala.inline
    def setPositionY(value: Double): Self = this.set("positionY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionY: Self = this.set("positionY", js.undefined)
    @scala.inline
    def setRightLabel(value: String): Self = this.set("rightLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightLabel: Self = this.set("rightLabel", js.undefined)
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    @scala.inline
    def setShowLegend(value: Boolean): Self = this.set("showLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLegend: Self = this.set("showLegend", js.undefined)
    @scala.inline
    def setTextPath(value: String): Self = this.set("textPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPath: Self = this.set("textPath", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: LegendType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


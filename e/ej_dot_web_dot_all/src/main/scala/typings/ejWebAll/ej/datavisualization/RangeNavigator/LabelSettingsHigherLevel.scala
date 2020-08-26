package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsHigherLevel extends js.Object {
  /** Options for customizing the border of grid lines in higher level.
    */
  var border: js.UndefOr[LabelSettingsHigherLevelBorder] = js.native
  /** Specifies the fill color of higher level labels.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the grid line colors, width, dashArray, border.
    */
  var gridLineStyle: js.UndefOr[LabelSettingsHigherLevelGridLineStyle] = js.native
  /** Specifies the intervalType for higher level labels. See
    * @Default {auto}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.native
  /** Specifies to hide the labels when it intersects with each other.
    * @Default {none}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.native
  /** Specifies the position of the labels to render either inside or outside of plot area
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
  /** Specifies the position of the labels in higher level
    * @Default {top}
    */
  var position: js.UndefOr[Position | String] = js.native
  /** Options for customizing the style of higher level labels.
    */
  var style: js.UndefOr[LabelSettingsHigherLevelStyle] = js.native
  /** Toggles the visibility of higher level labels.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object LabelSettingsHigherLevel {
  @scala.inline
  def apply(): LabelSettingsHigherLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsHigherLevel]
  }
  @scala.inline
  implicit class LabelSettingsHigherLevelOps[Self <: LabelSettingsHigherLevel] (val x: Self) extends AnyVal {
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
    def setBorder(value: LabelSettingsHigherLevelBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setGridLineStyle(value: LabelSettingsHigherLevelGridLineStyle): Self = this.set("gridLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLineStyle: Self = this.set("gridLineStyle", js.undefined)
    @scala.inline
    def setIntervalType(value: IntervalType | String): Self = this.set("intervalType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalType: Self = this.set("intervalType", js.undefined)
    @scala.inline
    def setLabelIntersectAction(value: LabelIntersectAction | String): Self = this.set("labelIntersectAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelIntersectAction: Self = this.set("labelIntersectAction", js.undefined)
    @scala.inline
    def setLabelPlacement(value: LabelPlacement | String): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    @scala.inline
    def setPosition(value: Position | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStyle(value: LabelSettingsHigherLevelStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


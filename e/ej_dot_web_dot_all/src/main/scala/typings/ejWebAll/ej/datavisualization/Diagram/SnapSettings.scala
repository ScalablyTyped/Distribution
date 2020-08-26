package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapSettings extends js.Object {
  /** Enables or disables snapping nodes/connectors to objects
    * @Default {true}
    */
  var enableSnapToObject: js.UndefOr[Boolean] = js.native
  /** Defines the appearance of horizontal gridlines
    */
  var horizontalGridLines: js.UndefOr[SnapSettingsHorizontalGridLines] = js.native
  /** Defines the angle by which the object needs to be snapped
    * @Default {5}
    */
  var snapAngle: js.UndefOr[Double] = js.native
  /** Defines and sets the snapConstraints
    */
  var snapConstraints: js.UndefOr[SnapConstraints | String] = js.native
  /** Defines the minimum distance between the selected object and the nearest object
    * @Default {5}
    */
  var snapObjectDistance: js.UndefOr[Double] = js.native
  /** Defines the appearance of horizontal gridlines
    */
  var verticalGridLines: js.UndefOr[SnapSettingsVerticalGridLines] = js.native
}

object SnapSettings {
  @scala.inline
  def apply(): SnapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapSettings]
  }
  @scala.inline
  implicit class SnapSettingsOps[Self <: SnapSettings] (val x: Self) extends AnyVal {
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
    def setEnableSnapToObject(value: Boolean): Self = this.set("enableSnapToObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSnapToObject: Self = this.set("enableSnapToObject", js.undefined)
    @scala.inline
    def setHorizontalGridLines(value: SnapSettingsHorizontalGridLines): Self = this.set("horizontalGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalGridLines: Self = this.set("horizontalGridLines", js.undefined)
    @scala.inline
    def setSnapAngle(value: Double): Self = this.set("snapAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapAngle: Self = this.set("snapAngle", js.undefined)
    @scala.inline
    def setSnapConstraints(value: SnapConstraints | String): Self = this.set("snapConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapConstraints: Self = this.set("snapConstraints", js.undefined)
    @scala.inline
    def setSnapObjectDistance(value: Double): Self = this.set("snapObjectDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapObjectDistance: Self = this.set("snapObjectDistance", js.undefined)
    @scala.inline
    def setVerticalGridLines(value: SnapSettingsVerticalGridLines): Self = this.set("verticalGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalGridLines: Self = this.set("verticalGridLines", js.undefined)
  }
  
}


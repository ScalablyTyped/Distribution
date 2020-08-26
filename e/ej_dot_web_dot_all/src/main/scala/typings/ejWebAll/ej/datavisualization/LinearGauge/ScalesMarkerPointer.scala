package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesMarkerPointer extends js.Object {
  /** Specifies the backgroundColor of marker pointer
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the border of marker pointer
    * @Default {null}
    */
  var border: js.UndefOr[ScalesMarkerPointersBorder] = js.native
  /** Specifies the distanceFromScale of marker pointer
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  /** Specifies the pointer Gradient of marker pointer
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.native
  /** Specifies the pointer Length of marker pointer
    * @Default {30}
    */
  var length: js.UndefOr[Double] = js.native
  /** Specifies the opacity of marker pointer
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the pointer Placement of marker pointer See PointerPlacement
    * @Default {Far}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.native
  /** Specifies the marker Style of marker pointerSee
    * @Default {Triangle}
    */
  var `type`: js.UndefOr[MarkerType | String] = js.native
  /** Specifies the value of marker pointer
    * @Default {null}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the pointer Width of marker pointer
    * @Default {30}
    */
  var width: js.UndefOr[Double] = js.native
}

object ScalesMarkerPointer {
  @scala.inline
  def apply(): ScalesMarkerPointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesMarkerPointer]
  }
  @scala.inline
  implicit class ScalesMarkerPointerOps[Self <: ScalesMarkerPointer] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorder(value: ScalesMarkerPointersBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setDistanceFromScale(value: Double): Self = this.set("distanceFromScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceFromScale: Self = this.set("distanceFromScale", js.undefined)
    @scala.inline
    def setGradients(value: js.Any): Self = this.set("gradients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradients: Self = this.set("gradients", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPlacement(value: PointerPlacement | String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setType(value: MarkerType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


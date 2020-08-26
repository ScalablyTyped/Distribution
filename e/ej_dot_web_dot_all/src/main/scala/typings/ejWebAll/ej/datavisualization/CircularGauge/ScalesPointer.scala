package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesPointer extends js.Object {
  /** Specify backNeedleLength of circular gauge
    * @Default {10}
    */
  var backNeedleLength: js.UndefOr[Double] = js.native
  /** Specify backgroundColor for the pointer of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specify the border for pointers of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesPointersBorder] = js.native
  /** Specify distanceFromScale value for pointers of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  /** Specify pointer gradients of circular gauge
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.native
  /** Specify pointer image of circular gauge.It is applicable for both marker as well as needle type pointers.
    * @Default {NULL}
    */
  var imageUrl: js.UndefOr[String] = js.native
  /** Specify pointer length of circular gauge
    * @Default {150}
    */
  var length: js.UndefOr[Double] = js.native
  /** Specify marker Style value of circular gauge. See
    * @Default {Rectangle}
    */
  var markerType: js.UndefOr[MarkerType | String] = js.native
  /** Specify needle Style value of circular gauge. See
    * @Default {Triangle}
    */
  var needleType: js.UndefOr[NeedleType | String] = js.native
  /** Specify opacity value for pointer of circular gauge
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specify pointer Placement value of circular gauge. See PointerPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.native
  /** Specify pointer value text of circular gauge.
    * @Default {Object}
    */
  var pointerValueText: js.UndefOr[ScalesPointersPointerValueText] = js.native
  /** Specify radius value for pointer of circular gauge
    * @Default {null}
    */
  var radius: js.UndefOr[Double] = js.native
  /** Specify showBackNeedle value of circular gauge
    * @Default {false}
    */
  var showBackNeedle: js.UndefOr[Boolean] = js.native
  /** Specify pointer type value of circular gauge. See
    * @Default {Needle}
    */
  var `type`: js.UndefOr[PointerType | String] = js.native
  /** Specify value of the pointer of circular gauge
    * @Default {null}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specify pointer width of circular gauge
    * @Default {7}
    */
  var width: js.UndefOr[Double] = js.native
}

object ScalesPointer {
  @scala.inline
  def apply(): ScalesPointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesPointer]
  }
  @scala.inline
  implicit class ScalesPointerOps[Self <: ScalesPointer] (val x: Self) extends AnyVal {
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
    def setBackNeedleLength(value: Double): Self = this.set("backNeedleLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackNeedleLength: Self = this.set("backNeedleLength", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorder(value: ScalesPointersBorder): Self = this.set("border", value.asInstanceOf[js.Any])
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
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMarkerType(value: MarkerType | String): Self = this.set("markerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerType: Self = this.set("markerType", js.undefined)
    @scala.inline
    def setNeedleType(value: NeedleType | String): Self = this.set("needleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleType: Self = this.set("needleType", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPlacement(value: Placement | String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPointerValueText(value: ScalesPointersPointerValueText): Self = this.set("pointerValueText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerValueText: Self = this.set("pointerValueText", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setShowBackNeedle(value: Boolean): Self = this.set("showBackNeedle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackNeedle: Self = this.set("showBackNeedle", js.undefined)
    @scala.inline
    def setType(value: PointerType | String): Self = this.set("type", value.asInstanceOf[js.Any])
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


package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesLabel extends js.Object {
  
  /** Specifies the angle of labels.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  
  /** Specifies the DistanceFromScale of labels.
    * @Default {null}
    */
  var distanceFromScale: js.UndefOr[ScalesLabelsDistanceFromScale] = js.native
  
  /** Specifies the font of labels.
    * @Default {null}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.native
  
  /** need to includeFirstValue.
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[Boolean] = js.native
  
  /** Specifies the opacity of label.
    * @Default {0}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the label Placement of label. See
    * @Default {Near}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.native
  
  /** Specifies the textColor of font.
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.native
  
  /** Specifies the label Style of label. See
    * @Default {ej.datavisualization.LinearGauge.LabelType.Major}
    */
  var `type`: js.UndefOr[ScaleType | String] = js.native
  
  /** Specifies the unitText of label.
    */
  var unitText: js.UndefOr[String] = js.native
  
  /** Specifies the unitText Position of label.See
    * @Default {Back}
    */
  var unitTextPlacement: js.UndefOr[UnitTextPlacement | String] = js.native
}
object ScalesLabel {
  
  @scala.inline
  def apply(): ScalesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesLabel]
  }
  
  @scala.inline
  implicit class ScalesLabelOps[Self <: ScalesLabel] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setDistanceFromScale(value: ScalesLabelsDistanceFromScale): Self = this.set("distanceFromScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceFromScale: Self = this.set("distanceFromScale", js.undefined)
    
    @scala.inline
    def setFont(value: ScalesLabelsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setIncludeFirstValue(value: Boolean): Self = this.set("includeFirstValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFirstValue: Self = this.set("includeFirstValue", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPlacement(value: PointerPlacement | String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setType(value: ScaleType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnitText(value: String): Self = this.set("unitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitText: Self = this.set("unitText", js.undefined)
    
    @scala.inline
    def setUnitTextPlacement(value: UnitTextPlacement | String): Self = this.set("unitTextPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitTextPlacement: Self = this.set("unitTextPlacement", js.undefined)
  }
}

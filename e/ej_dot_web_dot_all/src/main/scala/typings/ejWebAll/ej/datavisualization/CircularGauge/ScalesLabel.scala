package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesLabel extends js.Object {
  
  /** Specify the angle for the labels of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  
  /** Specify labels autoAngle value of circular gauge
    * @Default {false}
    */
  var autoAngle: js.UndefOr[Boolean] = js.native
  
  /** Specify label color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specify distanceFromScale value for labels of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  
  /** Specify font for labels of circular gauge
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.native
  
  /** Specify includeFirstValue of circular gauge
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[Boolean] = js.native
  
  /** Specify opacity value for labels of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specify label placement of circular gauge. See
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.native
  
  /** Specify label Style of circular gauge. See
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | String] = js.native
  
  /** Specify unitText of circular gauge
    */
  var unitText: js.UndefOr[String] = js.native
  
  /** Specify unitTextPosition of circular gauge. See UnitTextPosition
    * @Default {Back}
    */
  var unitTextPosition: js.UndefOr[UnitTextPlacement | String] = js.native
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
    def setAutoAngle(value: Boolean): Self = this.set("autoAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAngle: Self = this.set("autoAngle", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDistanceFromScale(value: Double): Self = this.set("distanceFromScale", value.asInstanceOf[js.Any])
    
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
    def setPlacement(value: Placement | String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setType(value: LabelType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnitText(value: String): Self = this.set("unitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitText: Self = this.set("unitText", js.undefined)
    
    @scala.inline
    def setUnitTextPosition(value: UnitTextPlacement | String): Self = this.set("unitTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitTextPosition: Self = this.set("unitTextPosition", js.undefined)
  }
}

package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesMarkerDataLabelConnectorLine extends js.Object {
  
  /** Color of the connector.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Height of the connector.
    * @Default {null}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
    * @Default {line. See ConnectorLineType}
    */
  var `type`: js.UndefOr[Type | String] = js.native
  
  /** Width of the connector.
    * @Default {0.5}
    */
  var width: js.UndefOr[Double] = js.native
}
object SeriesMarkerDataLabelConnectorLine {
  
  @scala.inline
  def apply(): SeriesMarkerDataLabelConnectorLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMarkerDataLabelConnectorLine]
  }
  
  @scala.inline
  implicit class SeriesMarkerDataLabelConnectorLineOps[Self <: SeriesMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setType(value: Type | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

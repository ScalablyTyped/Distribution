package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorsSegment extends js.Object {
  
  /** Sets the direction of orthogonal segment
    */
  var direction: js.UndefOr[String] = js.native
  
  /** Describes the length of orthogonal segment
    * @Default {undefined}
    */
  var length: js.UndefOr[Double] = js.native
  
  /** Describes the end point of bezier/straight segment
    * @Default {Diagram.Point()}
    */
  var point: js.UndefOr[ConnectorsSourcePoint] = js.native
  
  /** Defines the first control point of the bezier segment
    * @Default {null}
    */
  var point1: js.UndefOr[ConnectorsSourcePoint] = js.native
  
  /** Defines the second control point of bezier segment
    * @Default {null}
    */
  var point2: js.UndefOr[ConnectorsSourcePoint] = js.native
  
  /** Sets the type of the segment.
    * @Default {ej.datavisualization.Diagram.Segments.Straight}
    */
  var `type`: js.UndefOr[Segments | String] = js.native
  
  /** Describes the length and angle between the first control point and the start point of bezier segment
    * @Default {null}
    */
  var vector1: js.UndefOr[js.Any] = js.native
  
  /** Describes the length and angle between the second control point and end point of bezier segment
    * @Default {null}
    */
  var vector2: js.UndefOr[js.Any] = js.native
}
object ConnectorsSegment {
  
  @scala.inline
  def apply(): ConnectorsSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsSegment]
  }
  
  @scala.inline
  implicit class ConnectorsSegmentOps[Self <: ConnectorsSegment] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPoint(value: ConnectorsSourcePoint): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setPoint1(value: ConnectorsSourcePoint): Self = this.set("point1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint1: Self = this.set("point1", js.undefined)
    
    @scala.inline
    def setPoint2(value: ConnectorsSourcePoint): Self = this.set("point2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint2: Self = this.set("point2", js.undefined)
    
    @scala.inline
    def setType(value: Segments | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVector1(value: js.Any): Self = this.set("vector1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVector1: Self = this.set("vector1", js.undefined)
    
    @scala.inline
    def setVector2(value: js.Any): Self = this.set("vector2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVector2: Self = this.set("vector2", js.undefined)
  }
}

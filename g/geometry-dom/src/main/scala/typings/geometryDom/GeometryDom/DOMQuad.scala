package typings.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMQuad extends js.Object {
  
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  var bounds: DOMRectReadOnly = js.native
  
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  var p1: DOMPoint = js.native
  
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  var p2: DOMPoint = js.native
  
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  var p3: DOMPoint = js.native
  
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  var p4: DOMPoint = js.native
}
object DOMQuad {
  
  @scala.inline
  def apply(bounds: DOMRectReadOnly, p1: DOMPoint, p2: DOMPoint, p3: DOMPoint, p4: DOMPoint): DOMQuad = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMQuad]
  }
  
  @scala.inline
  implicit class DOMQuadOps[Self <: DOMQuad] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: DOMRectReadOnly): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP1(value: DOMPoint): Self = this.set("p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2(value: DOMPoint): Self = this.set("p2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP3(value: DOMPoint): Self = this.set("p3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP4(value: DOMPoint): Self = this.set("p4", value.asInstanceOf[js.Any])
  }
}

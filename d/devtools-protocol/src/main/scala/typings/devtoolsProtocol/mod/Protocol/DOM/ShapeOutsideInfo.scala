package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeOutsideInfo extends StObject {
  
  /**
    * Shape bounds
    */
  var bounds: Quad = js.native
  
  /**
    * Margin shape bounds
    */
  var marginShape: js.Array[_] = js.native
  
  /**
    * Shape coordinate details
    */
  var shape: js.Array[_] = js.native
}
object ShapeOutsideInfo {
  
  @scala.inline
  def apply(bounds: Quad, marginShape: js.Array[_], shape: js.Array[_]): ShapeOutsideInfo = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], marginShape = marginShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeOutsideInfo]
  }
  
  @scala.inline
  implicit class ShapeOutsideInfoMutableBuilder[Self <: ShapeOutsideInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Quad): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setMarginShape(value: js.Array[_]): Self = StObject.set(x, "marginShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginShapeVarargs(value: js.Any*): Self = StObject.set(x, "marginShape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[_]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: js.Any*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}

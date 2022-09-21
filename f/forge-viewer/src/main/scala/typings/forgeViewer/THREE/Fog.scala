package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fog extends StObject {
  
  var color: Color
  
  var far: Double
  
  var name: String
  
  var near: Double
}
object Fog {
  
  inline def apply(color: Color, far: Double, name: String, near: Double): Fog = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fog]
  }
  
  extension [Self <: Fog](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
  }
}

package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusProps extends StObject {
  
  var children: js.UndefOr[js.Any] = js.undefined
  
  var index: Double
  
  var uniform: js.UndefOr[String] = js.undefined
}
object BusProps {
  
  inline def apply(index: Double): BusProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusProps]
  }
  
  extension [Self <: BusProps](x: Self) {
    
    inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setUniform(value: String): Self = StObject.set(x, "uniform", value.asInstanceOf[js.Any])
    
    inline def setUniformUndefined: Self = StObject.set(x, "uniform", js.undefined)
  }
}

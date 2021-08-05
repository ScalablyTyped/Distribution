package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////////
// Canvas Interfaces
//////////////////////////////////////////////////////////////////////////////
trait ICanvasDimensions extends StObject {
  
  /**
    * Height of canvas element
    */
  var height: Double | String
  
  /**
    * Width of canvas element
    */
  var width: Double | String
}
object ICanvasDimensions {
  
  inline def apply(height: Double | String, width: Double | String): ICanvasDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasDimensions]
  }
  
  extension [Self <: ICanvasDimensions](x: Self) {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

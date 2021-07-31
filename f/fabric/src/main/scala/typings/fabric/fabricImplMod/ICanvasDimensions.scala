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
  
  @scala.inline
  def apply(height: Double | String, width: Double | String): ICanvasDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasDimensions]
  }
  
  @scala.inline
  implicit class ICanvasDimensionsMutableBuilder[Self <: ICanvasDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

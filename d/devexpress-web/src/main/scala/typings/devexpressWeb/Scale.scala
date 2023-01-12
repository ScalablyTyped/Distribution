package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the scaling settings.
  */
trait Scale extends StObject {
  
  /**
    * Specifies the image's x-scale factor as a percent.
    */
  var x: Double
  
  /**
    * Specifies the image's y-scale factor as a percent.
    */
  var y: Double
}
object Scale {
  
  inline def apply(x: Double, y: Double): Scale = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

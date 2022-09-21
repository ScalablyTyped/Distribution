package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CENTER_ extends StObject {
  
  var CENTER: Double
  
  var INSIDE: Double
  
  var OUTSIDE: Double
}
object CENTER_ {
  
  inline def apply(CENTER: Double, INSIDE: Double, OUTSIDE: Double): CENTER_ = {
    val __obj = js.Dynamic.literal(CENTER = CENTER.asInstanceOf[js.Any], INSIDE = INSIDE.asInstanceOf[js.Any], OUTSIDE = OUTSIDE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CENTER_]
  }
  
  extension [Self <: CENTER_](x: Self) {
    
    inline def setCENTER(value: Double): Self = StObject.set(x, "CENTER", value.asInstanceOf[js.Any])
    
    inline def setINSIDE(value: Double): Self = StObject.set(x, "INSIDE", value.asInstanceOf[js.Any])
    
    inline def setOUTSIDE(value: Double): Self = StObject.set(x, "OUTSIDE", value.asInstanceOf[js.Any])
  }
}

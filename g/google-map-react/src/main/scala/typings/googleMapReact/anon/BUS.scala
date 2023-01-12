package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BUS extends StObject {
  
  var BUS: String
  
  var RAIL: String
  
  var SUBWAY: String
  
  var TRAIN: String
  
  var TRAM: String
}
object BUS {
  
  inline def apply(BUS: String, RAIL: String, SUBWAY: String, TRAIN: String, TRAM: String): BUS = {
    val __obj = js.Dynamic.literal(BUS = BUS.asInstanceOf[js.Any], RAIL = RAIL.asInstanceOf[js.Any], SUBWAY = SUBWAY.asInstanceOf[js.Any], TRAIN = TRAIN.asInstanceOf[js.Any], TRAM = TRAM.asInstanceOf[js.Any])
    __obj.asInstanceOf[BUS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BUS] (val x: Self) extends AnyVal {
    
    inline def setBUS(value: String): Self = StObject.set(x, "BUS", value.asInstanceOf[js.Any])
    
    inline def setRAIL(value: String): Self = StObject.set(x, "RAIL", value.asInstanceOf[js.Any])
    
    inline def setSUBWAY(value: String): Self = StObject.set(x, "SUBWAY", value.asInstanceOf[js.Any])
    
    inline def setTRAIN(value: String): Self = StObject.set(x, "TRAIN", value.asInstanceOf[js.Any])
    
    inline def setTRAM(value: String): Self = StObject.set(x, "TRAM", value.asInstanceOf[js.Any])
  }
}

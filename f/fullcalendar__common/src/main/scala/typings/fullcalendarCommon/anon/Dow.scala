package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dow extends StObject {
  
  var dow: Double
  
  var doy: Double
}
object Dow {
  
  inline def apply(dow: Double, doy: Double): Dow = {
    val __obj = js.Dynamic.literal(dow = dow.asInstanceOf[js.Any], doy = doy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dow] (val x: Self) extends AnyVal {
    
    inline def setDow(value: Double): Self = StObject.set(x, "dow", value.asInstanceOf[js.Any])
    
    inline def setDoy(value: Double): Self = StObject.set(x, "doy", value.asInstanceOf[js.Any])
  }
}

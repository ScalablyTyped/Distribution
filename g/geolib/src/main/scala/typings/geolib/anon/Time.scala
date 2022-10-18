package typings.geolib.anon

import typings.geolib.esTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time extends StObject {
  
  var time: Timestamp
}
object Time {
  
  inline def apply(time: Timestamp): Time = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setTime(value: Timestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

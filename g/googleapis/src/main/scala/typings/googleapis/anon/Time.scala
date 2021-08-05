package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time extends StObject {
  
  var time: js.UndefOr[String] = js.undefined
}
object Time {
  
  inline def apply(): Time = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}

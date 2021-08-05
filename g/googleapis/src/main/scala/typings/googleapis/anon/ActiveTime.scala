package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTime extends StObject {
  
  var activeTime: js.UndefOr[Double] = js.undefined
  
  var date: js.UndefOr[String] = js.undefined
}
object ActiveTime {
  
  inline def apply(): ActiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveTime]
  }
  
  extension [Self <: ActiveTime](x: Self) {
    
    inline def setActiveTime(value: Double): Self = StObject.set(x, "activeTime", value.asInstanceOf[js.Any])
    
    inline def setActiveTimeUndefined: Self = StObject.set(x, "activeTime", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}

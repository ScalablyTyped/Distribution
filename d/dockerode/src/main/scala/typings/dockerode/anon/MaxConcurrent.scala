package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxConcurrent extends StObject {
  
  var MaxConcurrent: js.UndefOr[Double] = js.undefined
  
  var TotalCompletions: js.UndefOr[Double] = js.undefined
}
object MaxConcurrent {
  
  inline def apply(): MaxConcurrent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxConcurrent]
  }
  
  extension [Self <: MaxConcurrent](x: Self) {
    
    inline def setMaxConcurrent(value: Double): Self = StObject.set(x, "MaxConcurrent", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentUndefined: Self = StObject.set(x, "MaxConcurrent", js.undefined)
    
    inline def setTotalCompletions(value: Double): Self = StObject.set(x, "TotalCompletions", value.asInstanceOf[js.Any])
    
    inline def setTotalCompletionsUndefined: Self = StObject.set(x, "TotalCompletions", js.undefined)
  }
}

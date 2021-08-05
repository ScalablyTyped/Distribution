package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailingStreak extends StObject {
  
  var FailingStreak: Double
  
  var Log: js.Array[End]
  
  var Status: String
}
object FailingStreak {
  
  inline def apply(FailingStreak: Double, Log: js.Array[End], Status: String): FailingStreak = {
    val __obj = js.Dynamic.literal(FailingStreak = FailingStreak.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingStreak]
  }
  
  extension [Self <: FailingStreak](x: Self) {
    
    inline def setFailingStreak(value: Double): Self = StObject.set(x, "FailingStreak", value.asInstanceOf[js.Any])
    
    inline def setLog(value: js.Array[End]): Self = StObject.set(x, "Log", value.asInstanceOf[js.Any])
    
    inline def setLogVarargs(value: End*): Self = StObject.set(x, "Log", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}

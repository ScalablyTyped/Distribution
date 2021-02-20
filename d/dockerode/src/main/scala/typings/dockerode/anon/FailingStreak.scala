package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailingStreak extends StObject {
  
  var FailingStreak: Double = js.native
  
  var Log: js.Array[End] = js.native
  
  var Status: String = js.native
}
object FailingStreak {
  
  @scala.inline
  def apply(FailingStreak: Double, Log: js.Array[End], Status: String): FailingStreak = {
    val __obj = js.Dynamic.literal(FailingStreak = FailingStreak.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingStreak]
  }
  
  @scala.inline
  implicit class FailingStreakMutableBuilder[Self <: FailingStreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailingStreak(value: Double): Self = StObject.set(x, "FailingStreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: js.Array[End]): Self = StObject.set(x, "Log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogVarargs(value: End*): Self = StObject.set(x, "Log", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}

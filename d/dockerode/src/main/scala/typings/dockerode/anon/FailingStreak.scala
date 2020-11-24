package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailingStreak extends js.Object {
  
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
  implicit class FailingStreakOps[Self <: FailingStreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailingStreak(value: Double): Self = this.set("FailingStreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogVarargs(value: End*): Self = this.set("Log", js.Array(value :_*))
    
    @scala.inline
    def setLog(value: js.Array[End]): Self = this.set("Log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}

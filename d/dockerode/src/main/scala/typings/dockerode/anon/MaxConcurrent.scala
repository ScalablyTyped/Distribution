package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxConcurrent extends js.Object {
  
  var MaxConcurrent: js.UndefOr[Double] = js.native
  
  var TotalCompletions: js.UndefOr[Double] = js.native
}
object MaxConcurrent {
  
  @scala.inline
  def apply(): MaxConcurrent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxConcurrent]
  }
  
  @scala.inline
  implicit class MaxConcurrentOps[Self <: MaxConcurrent] (val x: Self) extends AnyVal {
    
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
    def setMaxConcurrent(value: Double): Self = this.set("MaxConcurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrent: Self = this.set("MaxConcurrent", js.undefined)
    
    @scala.inline
    def setTotalCompletions(value: Double): Self = this.set("TotalCompletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCompletions: Self = this.set("TotalCompletions", js.undefined)
  }
}

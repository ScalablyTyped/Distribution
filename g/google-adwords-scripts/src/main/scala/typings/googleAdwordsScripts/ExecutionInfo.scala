package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionInfo extends js.Object {
  
  def getRemainingCreateQuota(): Double = js.native
  
  def getRemainingGetQuota(): Double = js.native
  
  def getRemainingTime(): Double = js.native
  
  def isPreview(): Boolean = js.native
}
object ExecutionInfo {
  
  @scala.inline
  def apply(
    getRemainingCreateQuota: () => Double,
    getRemainingGetQuota: () => Double,
    getRemainingTime: () => Double,
    isPreview: () => Boolean
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(getRemainingCreateQuota = js.Any.fromFunction0(getRemainingCreateQuota), getRemainingGetQuota = js.Any.fromFunction0(getRemainingGetQuota), getRemainingTime = js.Any.fromFunction0(getRemainingTime), isPreview = js.Any.fromFunction0(isPreview))
    __obj.asInstanceOf[ExecutionInfo]
  }
  
  @scala.inline
  implicit class ExecutionInfoOps[Self <: ExecutionInfo] (val x: Self) extends AnyVal {
    
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
    def setGetRemainingCreateQuota(value: () => Double): Self = this.set("getRemainingCreateQuota", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemainingGetQuota(value: () => Double): Self = this.set("getRemainingGetQuota", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemainingTime(value: () => Double): Self = this.set("getRemainingTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPreview(value: () => Boolean): Self = this.set("isPreview", js.Any.fromFunction0(value))
  }
}

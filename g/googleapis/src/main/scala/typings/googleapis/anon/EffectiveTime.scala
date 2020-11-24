package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectiveTime extends js.Object {
  
  var effectiveTime: js.UndefOr[String] = js.native
  
  var isLocked: js.UndefOr[Boolean] = js.native
  
  var retentionPeriod: js.UndefOr[String] = js.native
}
object EffectiveTime {
  
  @scala.inline
  def apply(): EffectiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveTime]
  }
  
  @scala.inline
  implicit class EffectiveTimeOps[Self <: EffectiveTime] (val x: Self) extends AnyVal {
    
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
    def setEffectiveTime(value: String): Self = this.set("effectiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveTime: Self = this.set("effectiveTime", js.undefined)
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: String): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
  }
}

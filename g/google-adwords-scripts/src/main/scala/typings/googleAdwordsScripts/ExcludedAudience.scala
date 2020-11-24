package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludedAudience extends isAdGroupChild {
  
  def getAudienceId(): Double = js.native
  
  def getAudienceType(): AudienceType = js.native
  
  def getId(): Double = js.native
  
  def remove(): Unit = js.native
}
object ExcludedAudience {
  
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getAudienceId: () => Double,
    getAudienceType: () => AudienceType,
    getCampaign: () => Campaign,
    getId: () => Double,
    remove: () => Unit
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getAudienceId = js.Any.fromFunction0(getAudienceId), getAudienceType = js.Any.fromFunction0(getAudienceType), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedAudience]
  }
  
  @scala.inline
  implicit class ExcludedAudienceOps[Self <: ExcludedAudience] (val x: Self) extends AnyVal {
    
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
    def setGetAudienceId(value: () => Double): Self = this.set("getAudienceId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAudienceType(value: () => AudienceType): Self = this.set("getAudienceType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
}

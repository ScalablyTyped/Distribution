package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
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
  implicit class ExcludedAudienceMutableBuilder[Self <: ExcludedAudience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAudienceId(value: () => Double): Self = StObject.set(x, "getAudienceId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAudienceType(value: () => AudienceType): Self = StObject.set(x, "getAudienceType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}

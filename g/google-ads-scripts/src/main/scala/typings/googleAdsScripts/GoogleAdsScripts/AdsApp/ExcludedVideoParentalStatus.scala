package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Parental Status criterion in a Video Campaign. */
trait ExcludedVideoParentalStatus extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoParentalStatus". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video parental status. */
  def getId(): Double
  
  /** Returns the parental status type. */
  def getParentType(): String
  
  /** Returns the ad group to which this excluded video parental status belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video parental status belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Enable this excluded video parental status in the ad group. */
  def include(): Unit
}
object ExcludedVideoParentalStatus {
  
  inline def apply(
    getEntityType: () => String,
    getId: () => Double,
    getParentType: () => String,
    getVideoAdGroup: () => VideoAdGroup,
    getVideoCampaign: () => VideoCampaign,
    include: () => Unit
  ): ExcludedVideoParentalStatus = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getParentType = js.Any.fromFunction0(getParentType), getVideoAdGroup = js.Any.fromFunction0(getVideoAdGroup), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), include = js.Any.fromFunction0(include))
    __obj.asInstanceOf[ExcludedVideoParentalStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedVideoParentalStatus] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetParentType(value: () => String): Self = StObject.set(x, "getParentType", js.Any.fromFunction0(value))
    
    inline def setGetVideoAdGroup(value: () => VideoAdGroup): Self = StObject.set(x, "getVideoAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetVideoCampaign(value: () => VideoCampaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    inline def setInclude(value: () => Unit): Self = StObject.set(x, "include", js.Any.fromFunction0(value))
  }
}

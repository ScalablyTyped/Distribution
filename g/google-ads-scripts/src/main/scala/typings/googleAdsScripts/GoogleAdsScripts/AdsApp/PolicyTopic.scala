package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ad's policy topic.
  * These are policy decisions that have been made about the ad.
  * For more information about policy topics, please see the Google Ads Help Center article.
  */
trait PolicyTopic extends StObject {
  
  /** Returns the ID of the policy topic. */
  def getId(): String
  
  /** Returns the name of the policy topic. */
  def getName(): String
  
  /** Returns the type of the policy topic. */
  def getType(): String
}
object PolicyTopic {
  
  inline def apply(getId: () => String, getName: () => String, getType: () => String): PolicyTopic = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[PolicyTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyTopic] (val x: Self) extends AnyVal {
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
  }
}

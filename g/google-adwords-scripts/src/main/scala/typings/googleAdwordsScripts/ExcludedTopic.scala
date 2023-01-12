package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedTopic
  extends StObject
     with isAdGroupChild {
  
  def getId(): Double
  
  def getTopicId(): Double
  
  def remove(): Unit
}
object ExcludedTopic {
  
  inline def apply(
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getId: () => Double,
    getTopicId: () => Double,
    remove: () => Unit
  ): ExcludedTopic = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getTopicId = js.Any.fromFunction0(getTopicId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedTopic] (val x: Self) extends AnyVal {
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetTopicId(value: () => Double): Self = StObject.set(x, "getTopicId", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}

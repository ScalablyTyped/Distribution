package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionInfo extends StObject {
  
  def getRemainingCreateQuota(): Double
  
  def getRemainingGetQuota(): Double
  
  def getRemainingTime(): Double
  
  def isPreview(): Boolean
}
object ExecutionInfo {
  
  inline def apply(
    getRemainingCreateQuota: () => Double,
    getRemainingGetQuota: () => Double,
    getRemainingTime: () => Double,
    isPreview: () => Boolean
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(getRemainingCreateQuota = js.Any.fromFunction0(getRemainingCreateQuota), getRemainingGetQuota = js.Any.fromFunction0(getRemainingGetQuota), getRemainingTime = js.Any.fromFunction0(getRemainingTime), isPreview = js.Any.fromFunction0(isPreview))
    __obj.asInstanceOf[ExecutionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionInfo] (val x: Self) extends AnyVal {
    
    inline def setGetRemainingCreateQuota(value: () => Double): Self = StObject.set(x, "getRemainingCreateQuota", js.Any.fromFunction0(value))
    
    inline def setGetRemainingGetQuota(value: () => Double): Self = StObject.set(x, "getRemainingGetQuota", js.Any.fromFunction0(value))
    
    inline def setGetRemainingTime(value: () => Double): Self = StObject.set(x, "getRemainingTime", js.Any.fromFunction0(value))
    
    inline def setIsPreview(value: () => Boolean): Self = StObject.set(x, "isPreview", js.Any.fromFunction0(value))
  }
}

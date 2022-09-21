package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Miscellaneous information about the current script execution. */
trait ExecutionInfo extends StObject {
  
  /** Returns the remaining number of Google Ads entities the script is allowed to create in this execution. */
  def getRemainingCreateQuota(): Double
  
  /** Returns the remaining number of Google Ads entities the script is allowed to fetch in this execution. */
  def getRemainingGetQuota(): Double
  
  /** Returns the remaining time in seconds the script is allowed to execute. */
  def getRemainingTime(): Double
  
  /** Returns true if the script is currently being previewed, or false if it is a live execution. */
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
  
  extension [Self <: ExecutionInfo](x: Self) {
    
    inline def setGetRemainingCreateQuota(value: () => Double): Self = StObject.set(x, "getRemainingCreateQuota", js.Any.fromFunction0(value))
    
    inline def setGetRemainingGetQuota(value: () => Double): Self = StObject.set(x, "getRemainingGetQuota", js.Any.fromFunction0(value))
    
    inline def setGetRemainingTime(value: () => Double): Self = StObject.set(x, "getRemainingTime", js.Any.fromFunction0(value))
    
    inline def setIsPreview(value: () => Boolean): Self = StObject.set(x, "isPreview", js.Any.fromFunction0(value))
  }
}

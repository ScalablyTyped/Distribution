package typings.firebaseAnalytics.getConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalyticsTypes.mod.ThrottleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stubbable retry data storage class.
  */
@js.native
trait RetryData extends js.Object {
  
  def deleteThrottleMetadata(appId: String): Unit = js.native
  
  def getThrottleMetadata(appId: String): ThrottleMetadata = js.native
  
  var intervalMillis: Double = js.native
  
  def setThrottleMetadata(appId: String, metadata: ThrottleMetadata): Unit = js.native
  
  var throttleMetadata: StringDictionary[ThrottleMetadata] = js.native
}
object RetryData {
  
  @scala.inline
  def apply(
    deleteThrottleMetadata: String => Unit,
    getThrottleMetadata: String => ThrottleMetadata,
    intervalMillis: Double,
    setThrottleMetadata: (String, ThrottleMetadata) => Unit,
    throttleMetadata: StringDictionary[ThrottleMetadata]
  ): RetryData = {
    val __obj = js.Dynamic.literal(deleteThrottleMetadata = js.Any.fromFunction1(deleteThrottleMetadata), getThrottleMetadata = js.Any.fromFunction1(getThrottleMetadata), intervalMillis = intervalMillis.asInstanceOf[js.Any], setThrottleMetadata = js.Any.fromFunction2(setThrottleMetadata), throttleMetadata = throttleMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryData]
  }
  
  @scala.inline
  implicit class RetryDataOps[Self <: RetryData] (val x: Self) extends AnyVal {
    
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
    def setDeleteThrottleMetadata(value: String => Unit): Self = this.set("deleteThrottleMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetThrottleMetadata(value: String => ThrottleMetadata): Self = this.set("getThrottleMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntervalMillis(value: Double): Self = this.set("intervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetThrottleMetadata(value: (String, ThrottleMetadata) => Unit): Self = this.set("setThrottleMetadata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setThrottleMetadata(value: StringDictionary[ThrottleMetadata]): Self = this.set("throttleMetadata", value.asInstanceOf[js.Any])
  }
}

package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveBroadcastStatistics extends js.Object {
  
  var concurrentViewers: js.UndefOr[String] = js.native
  
  var totalChatCount: js.UndefOr[String] = js.native
}
object LiveBroadcastStatistics {
  
  @scala.inline
  def apply(): LiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatistics]
  }
  
  @scala.inline
  implicit class LiveBroadcastStatisticsOps[Self <: LiveBroadcastStatistics] (val x: Self) extends AnyVal {
    
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
    def setConcurrentViewers(value: String): Self = this.set("concurrentViewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrentViewers: Self = this.set("concurrentViewers", js.undefined)
    
    @scala.inline
    def setTotalChatCount(value: String): Self = this.set("totalChatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalChatCount: Self = this.set("totalChatCount", js.undefined)
  }
}

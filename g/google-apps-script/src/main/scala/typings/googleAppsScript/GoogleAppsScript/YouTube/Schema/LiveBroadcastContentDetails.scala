package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveBroadcastContentDetails extends js.Object {
  
  var boundStreamId: js.UndefOr[String] = js.native
  
  var boundStreamLastUpdateTimeMs: js.UndefOr[String] = js.native
  
  var closedCaptionsType: js.UndefOr[String] = js.native
  
  var enableAutoStart: js.UndefOr[Boolean] = js.native
  
  var enableClosedCaptions: js.UndefOr[Boolean] = js.native
  
  var enableContentEncryption: js.UndefOr[Boolean] = js.native
  
  var enableDvr: js.UndefOr[Boolean] = js.native
  
  var enableEmbed: js.UndefOr[Boolean] = js.native
  
  var enableLowLatency: js.UndefOr[Boolean] = js.native
  
  var latencyPreference: js.UndefOr[String] = js.native
  
  var mesh: js.UndefOr[String] = js.native
  
  var monitorStream: js.UndefOr[MonitorStreamInfo] = js.native
  
  var projection: js.UndefOr[String] = js.native
  
  var recordFromStart: js.UndefOr[Boolean] = js.native
  
  var startWithSlate: js.UndefOr[Boolean] = js.native
  
  var stereoLayout: js.UndefOr[String] = js.native
}
object LiveBroadcastContentDetails {
  
  @scala.inline
  def apply(): LiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastContentDetails]
  }
  
  @scala.inline
  implicit class LiveBroadcastContentDetailsOps[Self <: LiveBroadcastContentDetails] (val x: Self) extends AnyVal {
    
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
    def setBoundStreamId(value: String): Self = this.set("boundStreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundStreamId: Self = this.set("boundStreamId", js.undefined)
    
    @scala.inline
    def setBoundStreamLastUpdateTimeMs(value: String): Self = this.set("boundStreamLastUpdateTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundStreamLastUpdateTimeMs: Self = this.set("boundStreamLastUpdateTimeMs", js.undefined)
    
    @scala.inline
    def setClosedCaptionsType(value: String): Self = this.set("closedCaptionsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosedCaptionsType: Self = this.set("closedCaptionsType", js.undefined)
    
    @scala.inline
    def setEnableAutoStart(value: Boolean): Self = this.set("enableAutoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoStart: Self = this.set("enableAutoStart", js.undefined)
    
    @scala.inline
    def setEnableClosedCaptions(value: Boolean): Self = this.set("enableClosedCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClosedCaptions: Self = this.set("enableClosedCaptions", js.undefined)
    
    @scala.inline
    def setEnableContentEncryption(value: Boolean): Self = this.set("enableContentEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableContentEncryption: Self = this.set("enableContentEncryption", js.undefined)
    
    @scala.inline
    def setEnableDvr(value: Boolean): Self = this.set("enableDvr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDvr: Self = this.set("enableDvr", js.undefined)
    
    @scala.inline
    def setEnableEmbed(value: Boolean): Self = this.set("enableEmbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEmbed: Self = this.set("enableEmbed", js.undefined)
    
    @scala.inline
    def setEnableLowLatency(value: Boolean): Self = this.set("enableLowLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLowLatency: Self = this.set("enableLowLatency", js.undefined)
    
    @scala.inline
    def setLatencyPreference(value: String): Self = this.set("latencyPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyPreference: Self = this.set("latencyPreference", js.undefined)
    
    @scala.inline
    def setMesh(value: String): Self = this.set("mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMesh: Self = this.set("mesh", js.undefined)
    
    @scala.inline
    def setMonitorStream(value: MonitorStreamInfo): Self = this.set("monitorStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorStream: Self = this.set("monitorStream", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRecordFromStart(value: Boolean): Self = this.set("recordFromStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordFromStart: Self = this.set("recordFromStart", js.undefined)
    
    @scala.inline
    def setStartWithSlate(value: Boolean): Self = this.set("startWithSlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartWithSlate: Self = this.set("startWithSlate", js.undefined)
    
    @scala.inline
    def setStereoLayout(value: String): Self = this.set("stereoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStereoLayout: Self = this.set("stereoLayout", js.undefined)
  }
}

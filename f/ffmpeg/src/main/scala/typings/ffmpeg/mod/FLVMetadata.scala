package typings.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  duration :number,   filesize :string,   encoder :string,   width :number,   height :number,   videodatarate :number,   videocodecid :string,   audiodatarate :number,   audiosamplerate :number,   stereo :boolean,   audiocodecid :string}> */
@js.native
trait FLVMetadata extends js.Object {
  
  var audiocodecid: js.UndefOr[String] = js.native
  
  var audiodatarate: js.UndefOr[Double] = js.native
  
  var audiosamplerate: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var encoder: js.UndefOr[String] = js.native
  
  var filesize: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var stereo: js.UndefOr[Boolean] = js.native
  
  var videocodecid: js.UndefOr[String] = js.native
  
  var videodatarate: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object FLVMetadata {
  
  @scala.inline
  def apply(): FLVMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FLVMetadata]
  }
  
  @scala.inline
  implicit class FLVMetadataOps[Self <: FLVMetadata] (val x: Self) extends AnyVal {
    
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
    def setAudiocodecid(value: String): Self = this.set("audiocodecid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiocodecid: Self = this.set("audiocodecid", js.undefined)
    
    @scala.inline
    def setAudiodatarate(value: Double): Self = this.set("audiodatarate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiodatarate: Self = this.set("audiodatarate", js.undefined)
    
    @scala.inline
    def setAudiosamplerate(value: Double): Self = this.set("audiosamplerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiosamplerate: Self = this.set("audiosamplerate", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEncoder(value: String): Self = this.set("encoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoder: Self = this.set("encoder", js.undefined)
    
    @scala.inline
    def setFilesize(value: String): Self = this.set("filesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilesize: Self = this.set("filesize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setStereo(value: Boolean): Self = this.set("stereo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStereo: Self = this.set("stereo", js.undefined)
    
    @scala.inline
    def setVideocodecid(value: String): Self = this.set("videocodecid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideocodecid: Self = this.set("videocodecid", js.undefined)
    
    @scala.inline
    def setVideodatarate(value: Double): Self = this.set("videodatarate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideodatarate: Self = this.set("videodatarate", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

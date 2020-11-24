package typings.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FfprobeStreamDisposition
  extends /* key */ StringDictionary[js.Any] {
  
  var attached_pic: js.UndefOr[Double] = js.native
  
  var clean_effects: js.UndefOr[Double] = js.native
  
  var comment: js.UndefOr[Double] = js.native
  
  var default: js.UndefOr[Double] = js.native
  
  var dub: js.UndefOr[Double] = js.native
  
  var forced: js.UndefOr[Double] = js.native
  
  var hearing_impaired: js.UndefOr[Double] = js.native
  
  var karaoke: js.UndefOr[Double] = js.native
  
  var lyrics: js.UndefOr[Double] = js.native
  
  var original: js.UndefOr[Double] = js.native
  
  var timed_thumbnails: js.UndefOr[Double] = js.native
  
  var visual_impaired: js.UndefOr[Double] = js.native
}
object FfprobeStreamDisposition {
  
  @scala.inline
  def apply(): FfprobeStreamDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FfprobeStreamDisposition]
  }
  
  @scala.inline
  implicit class FfprobeStreamDispositionOps[Self <: FfprobeStreamDisposition] (val x: Self) extends AnyVal {
    
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
    def setAttached_pic(value: Double): Self = this.set("attached_pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttached_pic: Self = this.set("attached_pic", js.undefined)
    
    @scala.inline
    def setClean_effects(value: Double): Self = this.set("clean_effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClean_effects: Self = this.set("clean_effects", js.undefined)
    
    @scala.inline
    def setComment(value: Double): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDefault(value: Double): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDub(value: Double): Self = this.set("dub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDub: Self = this.set("dub", js.undefined)
    
    @scala.inline
    def setForced(value: Double): Self = this.set("forced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForced: Self = this.set("forced", js.undefined)
    
    @scala.inline
    def setHearing_impaired(value: Double): Self = this.set("hearing_impaired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHearing_impaired: Self = this.set("hearing_impaired", js.undefined)
    
    @scala.inline
    def setKaraoke(value: Double): Self = this.set("karaoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKaraoke: Self = this.set("karaoke", js.undefined)
    
    @scala.inline
    def setLyrics(value: Double): Self = this.set("lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLyrics: Self = this.set("lyrics", js.undefined)
    
    @scala.inline
    def setOriginal(value: Double): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
    
    @scala.inline
    def setTimed_thumbnails(value: Double): Self = this.set("timed_thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimed_thumbnails: Self = this.set("timed_thumbnails", js.undefined)
    
    @scala.inline
    def setVisual_impaired(value: Double): Self = this.set("visual_impaired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisual_impaired: Self = this.set("visual_impaired", js.undefined)
  }
}

package typings.ffprobe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachedpic extends js.Object {
  
  var attached_pic: Double = js.native
  
  var clean_effects: Double = js.native
  
  var comment: Double = js.native
  
  var default: Double = js.native
  
  var dub: Double = js.native
  
  var forced: Double = js.native
  
  var hearing_impaired: Double = js.native
  
  var karaoke: Double = js.native
  
  var lyrics: Double = js.native
  
  var original: Double = js.native
  
  var visual_impaired: Double = js.native
}
object Attachedpic {
  
  @scala.inline
  def apply(
    attached_pic: Double,
    clean_effects: Double,
    comment: Double,
    default: Double,
    dub: Double,
    forced: Double,
    hearing_impaired: Double,
    karaoke: Double,
    lyrics: Double,
    original: Double,
    visual_impaired: Double
  ): Attachedpic = {
    val __obj = js.Dynamic.literal(attached_pic = attached_pic.asInstanceOf[js.Any], clean_effects = clean_effects.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], dub = dub.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], hearing_impaired = hearing_impaired.asInstanceOf[js.Any], karaoke = karaoke.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], visual_impaired = visual_impaired.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachedpic]
  }
  
  @scala.inline
  implicit class AttachedpicOps[Self <: Attachedpic] (val x: Self) extends AnyVal {
    
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
    def setClean_effects(value: Double): Self = this.set("clean_effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Double): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Double): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDub(value: Double): Self = this.set("dub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForced(value: Double): Self = this.set("forced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHearing_impaired(value: Double): Self = this.set("hearing_impaired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKaraoke(value: Double): Self = this.set("karaoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics(value: Double): Self = this.set("lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: Double): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisual_impaired(value: Double): Self = this.set("visual_impaired", value.asInstanceOf[js.Any])
  }
}

package typings.ffprobe

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attachedpic extends StObject {
    
    var default: Double
    
    var attached_pic: Double
    
    var clean_effects: Double
    
    var comment: Double
    
    var dub: Double
    
    var forced: Double
    
    var hearing_impaired: Double
    
    var karaoke: Double
    
    var lyrics: Double
    
    var original: Double
    
    var timed_thumbnails: js.UndefOr[Double] = js.undefined
    
    var visual_impaired: Double
  }
  object Attachedpic {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Attachedpic] (val x: Self) extends AnyVal {
      
      inline def setAttached_pic(value: Double): Self = StObject.set(x, "attached_pic", value.asInstanceOf[js.Any])
      
      inline def setClean_effects(value: Double): Self = StObject.set(x, "clean_effects", value.asInstanceOf[js.Any])
      
      inline def setComment(value: Double): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDub(value: Double): Self = StObject.set(x, "dub", value.asInstanceOf[js.Any])
      
      inline def setForced(value: Double): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      inline def setHearing_impaired(value: Double): Self = StObject.set(x, "hearing_impaired", value.asInstanceOf[js.Any])
      
      inline def setKaraoke(value: Double): Self = StObject.set(x, "karaoke", value.asInstanceOf[js.Any])
      
      inline def setLyrics(value: Double): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Double): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setTimed_thumbnails(value: Double): Self = StObject.set(x, "timed_thumbnails", value.asInstanceOf[js.Any])
      
      inline def setTimed_thumbnailsUndefined: Self = StObject.set(x, "timed_thumbnails", js.undefined)
      
      inline def setVisual_impaired(value: Double): Self = StObject.set(x, "visual_impaired", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dicttag
    extends StObject
       with /* tag */ StringDictionary[js.UndefOr[String]] {
    
    var creation_time: js.UndefOr[String] = js.undefined
    
    var handler_name: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
  }
  object Dicttag {
    
    inline def apply(): Dicttag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dicttag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dicttag] (val x: Self) extends AnyVal {
      
      inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
      
      inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
      
      inline def setHandler_name(value: String): Self = StObject.set(x, "handler_name", value.asInstanceOf[js.Any])
      
      inline def setHandler_nameUndefined: Self = StObject.set(x, "handler_name", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
}

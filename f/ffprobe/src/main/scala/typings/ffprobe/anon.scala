package typings.ffprobe

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
    
    var visual_impaired: Double
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
    implicit class AttachedpicMutableBuilder[Self <: Attachedpic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached_pic(value: Double): Self = StObject.set(x, "attached_pic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClean_effects(value: Double): Self = StObject.set(x, "clean_effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: Double): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDub(value: Double): Self = StObject.set(x, "dub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForced(value: Double): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHearing_impaired(value: Double): Self = StObject.set(x, "hearing_impaired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKaraoke(value: Double): Self = StObject.set(x, "karaoke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLyrics(value: Double): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal(value: Double): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisual_impaired(value: Double): Self = StObject.set(x, "visual_impaired", value.asInstanceOf[js.Any])
    }
  }
  
  trait Creationtime extends StObject {
    
    var creation_time: js.UndefOr[String] = js.undefined
    
    var handler_name: String
    
    var language: js.UndefOr[String] = js.undefined
  }
  object Creationtime {
    
    @scala.inline
    def apply(handler_name: String): Creationtime = {
      val __obj = js.Dynamic.literal(handler_name = handler_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Creationtime]
    }
    
    @scala.inline
    implicit class CreationtimeMutableBuilder[Self <: Creationtime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
      
      @scala.inline
      def setHandler_name(value: String): Self = StObject.set(x, "handler_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
}

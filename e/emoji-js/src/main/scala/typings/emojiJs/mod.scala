package typings.emojiJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.emojiJs.anon.Mask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emoji-js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Emoji {
    
    /* CompleteClass */
    override def addAliases(aliases: StringDictionary[String]): Unit = js.native
    
    /* CompleteClass */
    var allow_caps: Boolean = js.native
    
    /* CompleteClass */
    var allow_native: Boolean = js.native
    
    /* CompleteClass */
    var avoid_ms_emoji: Boolean = js.native
    
    /* CompleteClass */
    var colons_mode: Boolean = js.native
    
    /* CompleteClass */
    var img_set: String = js.native
    
    /* CompleteClass */
    var img_sets: StringDictionary[Mask] = js.native
    
    /* CompleteClass */
    var img_suffix: String = js.native
    
    /* CompleteClass */
    var include_text: Boolean = js.native
    
    /* CompleteClass */
    var include_title: Boolean = js.native
    
    /* CompleteClass */
    override def removeAliases(aliases: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def replace_colons(str: String): String = js.native
    
    /* CompleteClass */
    override def replace_emoticons(str: String): String = js.native
    
    /* CompleteClass */
    override def replace_emoticons_with_colons(str: String): String = js.native
    
    /* CompleteClass */
    var replace_mode: String = js.native
    
    /* CompleteClass */
    override def replace_unified(str: String): String = js.native
    
    /* CompleteClass */
    var text_mode: Boolean = js.native
    
    /* CompleteClass */
    var use_css_imgs: Boolean = js.native
    
    /* CompleteClass */
    var use_sheet: Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("emoji-js", "EmojiConvertor")
  @js.native
  open class EmojiConvertor ()
    extends StObject
       with Emoji {
    
    /* CompleteClass */
    override def addAliases(aliases: StringDictionary[String]): Unit = js.native
    
    /* CompleteClass */
    var allow_caps: Boolean = js.native
    
    /* CompleteClass */
    var allow_native: Boolean = js.native
    
    /* CompleteClass */
    var avoid_ms_emoji: Boolean = js.native
    
    /* CompleteClass */
    var colons_mode: Boolean = js.native
    
    /* CompleteClass */
    var img_set: String = js.native
    
    /* CompleteClass */
    var img_sets: StringDictionary[Mask] = js.native
    
    /* CompleteClass */
    var img_suffix: String = js.native
    
    /* CompleteClass */
    var include_text: Boolean = js.native
    
    /* CompleteClass */
    var include_title: Boolean = js.native
    
    /* CompleteClass */
    override def removeAliases(aliases: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def replace_colons(str: String): String = js.native
    
    /* CompleteClass */
    override def replace_emoticons(str: String): String = js.native
    
    /* CompleteClass */
    override def replace_emoticons_with_colons(str: String): String = js.native
    
    /* CompleteClass */
    var replace_mode: String = js.native
    
    /* CompleteClass */
    override def replace_unified(str: String): String = js.native
    
    /* CompleteClass */
    var text_mode: Boolean = js.native
    
    /* CompleteClass */
    var use_css_imgs: Boolean = js.native
    
    /* CompleteClass */
    var use_sheet: Boolean = js.native
  }
  @JSImport("emoji-js", "EmojiConvertor")
  @js.native
  val EmojiConvertor: Instantiable0[Emoji] = js.native
  
  trait Emoji extends StObject {
    
    def addAliases(aliases: StringDictionary[String]): Unit
    
    var allow_caps: Boolean
    
    var allow_native: Boolean
    
    var avoid_ms_emoji: Boolean
    
    var colons_mode: Boolean
    
    var img_set: String
    
    var img_sets: StringDictionary[Mask]
    
    var img_suffix: String
    
    var include_text: Boolean
    
    var include_title: Boolean
    
    def removeAliases(aliases: js.Array[String]): Unit
    
    def replace_colons(str: String): String
    
    def replace_emoticons(str: String): String
    
    def replace_emoticons_with_colons(str: String): String
    
    var replace_mode: String
    
    def replace_unified(str: String): String
    
    var text_mode: Boolean
    
    var use_css_imgs: Boolean
    
    var use_sheet: Boolean
  }
  object Emoji {
    
    inline def apply(
      addAliases: StringDictionary[String] => Unit,
      allow_caps: Boolean,
      allow_native: Boolean,
      avoid_ms_emoji: Boolean,
      colons_mode: Boolean,
      img_set: String,
      img_sets: StringDictionary[Mask],
      img_suffix: String,
      include_text: Boolean,
      include_title: Boolean,
      removeAliases: js.Array[String] => Unit,
      replace_colons: String => String,
      replace_emoticons: String => String,
      replace_emoticons_with_colons: String => String,
      replace_mode: String,
      replace_unified: String => String,
      text_mode: Boolean,
      use_css_imgs: Boolean,
      use_sheet: Boolean
    ): Emoji = {
      val __obj = js.Dynamic.literal(addAliases = js.Any.fromFunction1(addAliases), allow_caps = allow_caps.asInstanceOf[js.Any], allow_native = allow_native.asInstanceOf[js.Any], avoid_ms_emoji = avoid_ms_emoji.asInstanceOf[js.Any], colons_mode = colons_mode.asInstanceOf[js.Any], img_set = img_set.asInstanceOf[js.Any], img_sets = img_sets.asInstanceOf[js.Any], img_suffix = img_suffix.asInstanceOf[js.Any], include_text = include_text.asInstanceOf[js.Any], include_title = include_title.asInstanceOf[js.Any], removeAliases = js.Any.fromFunction1(removeAliases), replace_colons = js.Any.fromFunction1(replace_colons), replace_emoticons = js.Any.fromFunction1(replace_emoticons), replace_emoticons_with_colons = js.Any.fromFunction1(replace_emoticons_with_colons), replace_mode = replace_mode.asInstanceOf[js.Any], replace_unified = js.Any.fromFunction1(replace_unified), text_mode = text_mode.asInstanceOf[js.Any], use_css_imgs = use_css_imgs.asInstanceOf[js.Any], use_sheet = use_sheet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Emoji]
    }
    
    extension [Self <: Emoji](x: Self) {
      
      inline def setAddAliases(value: StringDictionary[String] => Unit): Self = StObject.set(x, "addAliases", js.Any.fromFunction1(value))
      
      inline def setAllow_caps(value: Boolean): Self = StObject.set(x, "allow_caps", value.asInstanceOf[js.Any])
      
      inline def setAllow_native(value: Boolean): Self = StObject.set(x, "allow_native", value.asInstanceOf[js.Any])
      
      inline def setAvoid_ms_emoji(value: Boolean): Self = StObject.set(x, "avoid_ms_emoji", value.asInstanceOf[js.Any])
      
      inline def setColons_mode(value: Boolean): Self = StObject.set(x, "colons_mode", value.asInstanceOf[js.Any])
      
      inline def setImg_set(value: String): Self = StObject.set(x, "img_set", value.asInstanceOf[js.Any])
      
      inline def setImg_sets(value: StringDictionary[Mask]): Self = StObject.set(x, "img_sets", value.asInstanceOf[js.Any])
      
      inline def setImg_suffix(value: String): Self = StObject.set(x, "img_suffix", value.asInstanceOf[js.Any])
      
      inline def setInclude_text(value: Boolean): Self = StObject.set(x, "include_text", value.asInstanceOf[js.Any])
      
      inline def setInclude_title(value: Boolean): Self = StObject.set(x, "include_title", value.asInstanceOf[js.Any])
      
      inline def setRemoveAliases(value: js.Array[String] => Unit): Self = StObject.set(x, "removeAliases", js.Any.fromFunction1(value))
      
      inline def setReplace_colons(value: String => String): Self = StObject.set(x, "replace_colons", js.Any.fromFunction1(value))
      
      inline def setReplace_emoticons(value: String => String): Self = StObject.set(x, "replace_emoticons", js.Any.fromFunction1(value))
      
      inline def setReplace_emoticons_with_colons(value: String => String): Self = StObject.set(x, "replace_emoticons_with_colons", js.Any.fromFunction1(value))
      
      inline def setReplace_mode(value: String): Self = StObject.set(x, "replace_mode", value.asInstanceOf[js.Any])
      
      inline def setReplace_unified(value: String => String): Self = StObject.set(x, "replace_unified", js.Any.fromFunction1(value))
      
      inline def setText_mode(value: Boolean): Self = StObject.set(x, "text_mode", value.asInstanceOf[js.Any])
      
      inline def setUse_css_imgs(value: Boolean): Self = StObject.set(x, "use_css_imgs", value.asInstanceOf[js.Any])
      
      inline def setUse_sheet(value: Boolean): Self = StObject.set(x, "use_sheet", value.asInstanceOf[js.Any])
    }
  }
}

package typings.emojiJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.emojiJs.anon.Mask
import typings.emojiJs.mod.Emoji
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object EmojiConvertor {
    
    @JSGlobal("EmojiConvertor")
    @js.native
    open class ^ ()
      extends typings.emojiJs.mod.^
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("EmojiConvertor.EmojiConvertor")
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
    @JSGlobal("EmojiConvertor.EmojiConvertor")
    @js.native
    val EmojiConvertor: Instantiable0[Emoji] = js.native
  }
}

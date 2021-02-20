package typings.emojiMart

import org.scalablytyped.runtime.StringDictionary
import typings.emojiMart.dataMod.Data
import typings.emojiMart.emojiMartStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nimbleEmojiIndexMod {
  
  @JSImport("emoji-mart/dist-es/utils/emoji-index/nimble-emoji-index", JSImport.Default)
  @js.native
  class default protected () extends NimbleEmojiIndex {
    def this(data: Data) = this()
  }
  
  @js.native
  trait BaseEmoji extends EmojiData {
    
    var colons: String = js.native
    
    /** Reverse mapping to keyof emoticons */
    var emoticons: js.Array[String] = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var native: String = js.native
    
    var skin: EmojiSkin | Null = js.native
    
    var unified: String = js.native
  }
  object BaseEmoji {
    
    @scala.inline
    def apply(
      colons: String,
      emoticons: js.Array[String],
      id: String,
      name: String,
      native: String,
      unified: String
    ): BaseEmoji = {
      val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEmoji]
    }
    
    @scala.inline
    implicit class BaseEmojiMutableBuilder[Self <: BaseEmoji] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColons(value: String): Self = StObject.set(x, "colons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmoticons(value: js.Array[String]): Self = StObject.set(x, "emoticons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmoticonsVarargs(value: String*): Self = StObject.set(x, "emoticons", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkin(value: EmojiSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinNull: Self = StObject.set(x, "skin", null)
      
      @scala.inline
      def setUnified(value: String): Self = StObject.set(x, "unified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomEmoji extends EmojiData {
    
    // colons is overridden by :id:
    var colons: js.UndefOr[String] = js.native
    
    var emoticons: js.UndefOr[js.Array[String]] = js.native
    
    // id is overridden by short_names[0]
    var id: js.UndefOr[String] = js.native
    
    var imageUrl: String = js.native
    
    var keywords: js.UndefOr[js.Array[String]] = js.native
    
    var name: String = js.native
    
    /** Must contain at least one name. The first name is used as the unique id. */
    var short_names: js.Array[String] = js.native
  }
  object CustomEmoji {
    
    @scala.inline
    def apply(imageUrl: String, name: String, short_names: js.Array[String]): CustomEmoji = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEmoji]
    }
    
    @scala.inline
    implicit class CustomEmojiMutableBuilder[Self <: CustomEmoji] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColons(value: String): Self = StObject.set(x, "colons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonsUndefined: Self = StObject.set(x, "colons", js.undefined)
      
      @scala.inline
      def setEmoticons(value: js.Array[String]): Self = StObject.set(x, "emoticons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmoticonsUndefined: Self = StObject.set(x, "emoticons", js.undefined)
      
      @scala.inline
      def setEmoticonsVarargs(value: String*): Self = StObject.set(x, "emoticons", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_names(value: js.Array[String]): Self = StObject.set(x, "short_names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_namesVarargs(value: String*): Self = StObject.set(x, "short_names", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji
    - typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji
  */
  trait EmojiData extends EmojiEntry
  object EmojiData {
    
    @scala.inline
    def BaseEmoji(
      colons: String,
      emoticons: js.Array[String],
      id: String,
      name: String,
      native: String,
      unified: String
    ): typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji = {
      val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji]
    }
    
    @scala.inline
    def CustomEmoji(imageUrl: String, name: String, short_names: js.Array[String]): typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emojiMart.nimbleEmojiIndexMod.EmojiData
    - typings.emojiMart.anon.variantinEmojiSkinEmojiDa
  */
  trait EmojiEntry extends StObject
  object EmojiEntry {
    
    @scala.inline
    def BaseEmoji(
      colons: String,
      emoticons: js.Array[String],
      id: String,
      name: String,
      native: String,
      unified: String
    ): typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji = {
      val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji]
    }
    
    @scala.inline
    def CustomEmoji(imageUrl: String, name: String, short_names: js.Array[String]): typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji]
    }
    
    @scala.inline
    def variantinEmojiSkinEmojiDa(`1`: EmojiData, `2`: EmojiData, `3`: EmojiData, `4`: EmojiData, `5`: EmojiData, `6`: EmojiData): typings.emojiMart.anon.variantinEmojiSkinEmojiDa = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emojiMart.anon.variantinEmojiSkinEmojiDa]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emojiMart.emojiMartNumbers.`1`
    - typings.emojiMart.emojiMartNumbers.`2`
    - typings.emojiMart.emojiMartNumbers.`3`
    - typings.emojiMart.emojiMartNumbers.`4`
    - typings.emojiMart.emojiMartNumbers.`5`
    - typings.emojiMart.emojiMartNumbers.`6`
  */
  trait EmojiSkin extends StObject
  object EmojiSkin {
    
    @scala.inline
    def `1`: typings.emojiMart.emojiMartNumbers.`1` = 1.asInstanceOf[typings.emojiMart.emojiMartNumbers.`1`]
    
    @scala.inline
    def `2`: typings.emojiMart.emojiMartNumbers.`2` = 2.asInstanceOf[typings.emojiMart.emojiMartNumbers.`2`]
    
    @scala.inline
    def `3`: typings.emojiMart.emojiMartNumbers.`3` = 3.asInstanceOf[typings.emojiMart.emojiMartNumbers.`3`]
    
    @scala.inline
    def `4`: typings.emojiMart.emojiMartNumbers.`4` = 4.asInstanceOf[typings.emojiMart.emojiMartNumbers.`4`]
    
    @scala.inline
    def `5`: typings.emojiMart.emojiMartNumbers.`5` = 5.asInstanceOf[typings.emojiMart.emojiMartNumbers.`5`]
    
    @scala.inline
    def `6`: typings.emojiMart.emojiMartNumbers.`6` = 6.asInstanceOf[typings.emojiMart.emojiMartNumbers.`6`]
  }
  
  @js.native
  trait NimbleEmojiIndex extends StObject {
    
    var emojis: StringDictionary[EmojiData] = js.native
    
    /** Mapping of string to keyof emojis */
    var emoticons: StringDictionary[String] = js.native
    
    def search(query: String): js.Array[EmojiData] | Null = js.native
    def search(query: _empty): Null = js.native
  }
}

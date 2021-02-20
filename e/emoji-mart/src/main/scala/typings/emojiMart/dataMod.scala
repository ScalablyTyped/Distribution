package typings.emojiMart

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("emoji-mart/dist-es/utils/data", "buildSearch")
  @js.native
  def buildSearch(emoji: Emoji): String = js.native
  
  @JSImport("emoji-mart/dist-es/utils/data", "compress")
  @js.native
  def compress(emoji: Emoji): Unit = js.native
  
  @JSImport("emoji-mart/dist-es/utils/data", "uncompress")
  @js.native
  def uncompress(data: Data): Unit = js.native
  
  @js.native
  trait Category extends StObject {
    
    var emojis: js.Array[String] = js.native
    
    var id: String = js.native
    
    var name: String = js.native
  }
  object Category {
    
    @scala.inline
    def apply(emojis: js.Array[String], id: String, name: String): Category = {
      val __obj = js.Dynamic.literal(emojis = emojis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmojis(value: js.Array[String]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojisVarargs(value: String*): Self = StObject.set(x, "emojis", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var aliases: StringDictionary[String] = js.native
    
    var categories: js.Array[Category] = js.native
    
    var compressed: Boolean = js.native
    
    var emojis: StringDictionary[Emoji] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(
      aliases: StringDictionary[String],
      categories: js.Array[Category],
      compressed: Boolean,
      emojis: StringDictionary[Emoji]
    ): Data = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: StringDictionary[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojis(value: StringDictionary[Emoji]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Emoji extends StObject {
    
    var a: js.UndefOr[String] = js.native
    
    var added_in: js.UndefOr[Double] = js.native
    
    var b: js.UndefOr[String] = js.native
    
    var c: js.UndefOr[String] = js.native
    
    var d: js.UndefOr[Boolean] = js.native
    
    var e: js.UndefOr[Boolean] = js.native
    
    var emoticons: js.UndefOr[js.Array[String]] = js.native
    
    var f: js.UndefOr[Boolean] = js.native
    
    var g: js.UndefOr[Boolean] = js.native
    
    var h: js.UndefOr[Boolean] = js.native
    
    var has_img_apple: js.UndefOr[Boolean] = js.native
    
    var has_img_emojione: js.UndefOr[Boolean] = js.native
    
    var has_img_facebook: js.UndefOr[Boolean] = js.native
    
    var has_img_google: js.UndefOr[Boolean] = js.native
    
    var has_img_messenger: js.UndefOr[Boolean] = js.native
    
    var has_img_twitter: js.UndefOr[Boolean] = js.native
    
    var i: js.UndefOr[Boolean] = js.native
    
    var j: js.UndefOr[js.Array[String]] = js.native
    
    var k: js.UndefOr[js.Array[Double]] = js.native
    
    var keywords: js.UndefOr[js.Array[String]] = js.native
    
    var l: js.UndefOr[js.Array[String]] = js.native
    
    var m: js.UndefOr[String] = js.native
    
    var n: js.UndefOr[js.Array[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var non_qualified: js.UndefOr[String] = js.native
    
    var o: js.UndefOr[Double] = js.native
    
    var obsoleted_by: js.UndefOr[String] = js.native
    
    var obsoletes: js.UndefOr[String] = js.native
    
    var sheet: js.UndefOr[js.Array[Double]] = js.native
    
    var sheet_x: js.UndefOr[Double] = js.native
    
    var sheet_y: js.UndefOr[Double] = js.native
    
    var short_names: js.UndefOr[js.Array[String]] = js.native
    
    var skin_variations: js.UndefOr[StringDictionary[SkinVariation]] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var unified: js.UndefOr[String] = js.native
  }
  object Emoji {
    
    @scala.inline
    def apply(): Emoji = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Emoji]
    }
    
    @scala.inline
    implicit class EmojiMutableBuilder[Self <: Emoji] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setAdded_in(value: Double): Self = StObject.set(x, "added_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdded_inUndefined: Self = StObject.set(x, "added_in", js.undefined)
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      @scala.inline
      def setD(value: Boolean): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setE(value: Boolean): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setEmoticons(value: js.Array[String]): Self = StObject.set(x, "emoticons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmoticonsUndefined: Self = StObject.set(x, "emoticons", js.undefined)
      
      @scala.inline
      def setEmoticonsVarargs(value: String*): Self = StObject.set(x, "emoticons", js.Array(value :_*))
      
      @scala.inline
      def setF(value: Boolean): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setG(value: Boolean): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGUndefined: Self = StObject.set(x, "g", js.undefined)
      
      @scala.inline
      def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setHas_img_apple(value: Boolean): Self = StObject.set(x, "has_img_apple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_appleUndefined: Self = StObject.set(x, "has_img_apple", js.undefined)
      
      @scala.inline
      def setHas_img_emojione(value: Boolean): Self = StObject.set(x, "has_img_emojione", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_emojioneUndefined: Self = StObject.set(x, "has_img_emojione", js.undefined)
      
      @scala.inline
      def setHas_img_facebook(value: Boolean): Self = StObject.set(x, "has_img_facebook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_facebookUndefined: Self = StObject.set(x, "has_img_facebook", js.undefined)
      
      @scala.inline
      def setHas_img_google(value: Boolean): Self = StObject.set(x, "has_img_google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_googleUndefined: Self = StObject.set(x, "has_img_google", js.undefined)
      
      @scala.inline
      def setHas_img_messenger(value: Boolean): Self = StObject.set(x, "has_img_messenger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_messengerUndefined: Self = StObject.set(x, "has_img_messenger", js.undefined)
      
      @scala.inline
      def setHas_img_twitter(value: Boolean): Self = StObject.set(x, "has_img_twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_twitterUndefined: Self = StObject.set(x, "has_img_twitter", js.undefined)
      
      @scala.inline
      def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      @scala.inline
      def setJ(value: js.Array[String]): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      @scala.inline
      def setJVarargs(value: String*): Self = StObject.set(x, "j", js.Array(value :_*))
      
      @scala.inline
      def setK(value: js.Array[Double]): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setKVarargs(value: Double*): Self = StObject.set(x, "k", js.Array(value :_*))
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setL(value: js.Array[String]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      @scala.inline
      def setLVarargs(value: String*): Self = StObject.set(x, "l", js.Array(value :_*))
      
      @scala.inline
      def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setN(value: js.Array[String]): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      @scala.inline
      def setNVarargs(value: String*): Self = StObject.set(x, "n", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNon_qualified(value: String): Self = StObject.set(x, "non_qualified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNon_qualifiedUndefined: Self = StObject.set(x, "non_qualified", js.undefined)
      
      @scala.inline
      def setO(value: Double): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      @scala.inline
      def setObsoleted_by(value: String): Self = StObject.set(x, "obsoleted_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObsoleted_byUndefined: Self = StObject.set(x, "obsoleted_by", js.undefined)
      
      @scala.inline
      def setObsoletes(value: String): Self = StObject.set(x, "obsoletes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObsoletesUndefined: Self = StObject.set(x, "obsoletes", js.undefined)
      
      @scala.inline
      def setSheet(value: js.Array[Double]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
      
      @scala.inline
      def setSheetVarargs(value: Double*): Self = StObject.set(x, "sheet", js.Array(value :_*))
      
      @scala.inline
      def setSheet_x(value: Double): Self = StObject.set(x, "sheet_x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheet_xUndefined: Self = StObject.set(x, "sheet_x", js.undefined)
      
      @scala.inline
      def setSheet_y(value: Double): Self = StObject.set(x, "sheet_y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheet_yUndefined: Self = StObject.set(x, "sheet_y", js.undefined)
      
      @scala.inline
      def setShort_names(value: js.Array[String]): Self = StObject.set(x, "short_names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_namesUndefined: Self = StObject.set(x, "short_names", js.undefined)
      
      @scala.inline
      def setShort_namesVarargs(value: String*): Self = StObject.set(x, "short_names", js.Array(value :_*))
      
      @scala.inline
      def setSkin_variations(value: StringDictionary[SkinVariation]): Self = StObject.set(x, "skin_variations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkin_variationsUndefined: Self = StObject.set(x, "skin_variations", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setUnified(value: String): Self = StObject.set(x, "unified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnifiedUndefined: Self = StObject.set(x, "unified", js.undefined)
    }
  }
  
  @js.native
  trait SkinVariation extends StObject {
    
    var added_in: String = js.native
    
    var has_img_apple: Boolean = js.native
    
    var has_img_emojione: Boolean = js.native
    
    var has_img_facebook: Boolean = js.native
    
    var has_img_google: Boolean = js.native
    
    var has_img_messenger: Boolean = js.native
    
    var has_img_twitter: Boolean = js.native
    
    var image: String = js.native
    
    var non_qualified: Null | String = js.native
    
    var obsoleted_by: js.UndefOr[String] = js.native
    
    var obsoletes: js.UndefOr[String] = js.native
    
    var sheet_x: Double = js.native
    
    var sheet_y: Double = js.native
    
    var unified: String = js.native
  }
  object SkinVariation {
    
    @scala.inline
    def apply(
      added_in: String,
      has_img_apple: Boolean,
      has_img_emojione: Boolean,
      has_img_facebook: Boolean,
      has_img_google: Boolean,
      has_img_messenger: Boolean,
      has_img_twitter: Boolean,
      image: String,
      sheet_x: Double,
      sheet_y: Double,
      unified: String
    ): SkinVariation = {
      val __obj = js.Dynamic.literal(added_in = added_in.asInstanceOf[js.Any], has_img_apple = has_img_apple.asInstanceOf[js.Any], has_img_emojione = has_img_emojione.asInstanceOf[js.Any], has_img_facebook = has_img_facebook.asInstanceOf[js.Any], has_img_google = has_img_google.asInstanceOf[js.Any], has_img_messenger = has_img_messenger.asInstanceOf[js.Any], has_img_twitter = has_img_twitter.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], sheet_x = sheet_x.asInstanceOf[js.Any], sheet_y = sheet_y.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkinVariation]
    }
    
    @scala.inline
    implicit class SkinVariationMutableBuilder[Self <: SkinVariation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded_in(value: String): Self = StObject.set(x, "added_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_apple(value: Boolean): Self = StObject.set(x, "has_img_apple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_emojione(value: Boolean): Self = StObject.set(x, "has_img_emojione", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_facebook(value: Boolean): Self = StObject.set(x, "has_img_facebook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_google(value: Boolean): Self = StObject.set(x, "has_img_google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_messenger(value: Boolean): Self = StObject.set(x, "has_img_messenger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_img_twitter(value: Boolean): Self = StObject.set(x, "has_img_twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNon_qualified(value: String): Self = StObject.set(x, "non_qualified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNon_qualifiedNull: Self = StObject.set(x, "non_qualified", null)
      
      @scala.inline
      def setObsoleted_by(value: String): Self = StObject.set(x, "obsoleted_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObsoleted_byUndefined: Self = StObject.set(x, "obsoleted_by", js.undefined)
      
      @scala.inline
      def setObsoletes(value: String): Self = StObject.set(x, "obsoletes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObsoletesUndefined: Self = StObject.set(x, "obsoletes", js.undefined)
      
      @scala.inline
      def setSheet_x(value: Double): Self = StObject.set(x, "sheet_x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheet_y(value: Double): Self = StObject.set(x, "sheet_y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnified(value: String): Self = StObject.set(x, "unified", value.asInstanceOf[js.Any])
    }
  }
}

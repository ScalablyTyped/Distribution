package typings.emojiMart

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("emoji-mart/dist-es/utils/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildSearch(emoji: Emoji): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSearch")(emoji.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def compress(emoji: Emoji): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(emoji.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def uncompress(data: Data): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uncompress")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Category extends StObject {
    
    var emojis: js.Array[String]
    
    var id: String
    
    var name: String
  }
  object Category {
    
    inline def apply(emojis: js.Array[String], id: String, name: String): Category = {
      val __obj = js.Dynamic.literal(emojis = emojis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setEmojis(value: js.Array[String]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setEmojisVarargs(value: String*): Self = StObject.set(x, "emojis", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var aliases: StringDictionary[String]
    
    var categories: js.Array[Category]
    
    var compressed: Boolean
    
    var emojis: StringDictionary[Emoji]
  }
  object Data {
    
    inline def apply(
      aliases: StringDictionary[String],
      categories: js.Array[Category],
      compressed: Boolean,
      emojis: StringDictionary[Emoji]
    ): Data = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setAliases(value: StringDictionary[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: StringDictionary[Emoji]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
    }
  }
  
  trait Emoji extends StObject {
    
    var a: js.UndefOr[String] = js.undefined
    
    var added_in: js.UndefOr[Double] = js.undefined
    
    var b: js.UndefOr[String] = js.undefined
    
    var c: js.UndefOr[String] = js.undefined
    
    var d: js.UndefOr[Boolean] = js.undefined
    
    var e: js.UndefOr[Boolean] = js.undefined
    
    var emoticons: js.UndefOr[js.Array[String]] = js.undefined
    
    var f: js.UndefOr[Boolean] = js.undefined
    
    var g: js.UndefOr[Boolean] = js.undefined
    
    var h: js.UndefOr[Boolean] = js.undefined
    
    var has_img_apple: js.UndefOr[Boolean] = js.undefined
    
    var has_img_emojione: js.UndefOr[Boolean] = js.undefined
    
    var has_img_facebook: js.UndefOr[Boolean] = js.undefined
    
    var has_img_google: js.UndefOr[Boolean] = js.undefined
    
    var has_img_messenger: js.UndefOr[Boolean] = js.undefined
    
    var has_img_twitter: js.UndefOr[Boolean] = js.undefined
    
    var i: js.UndefOr[Boolean] = js.undefined
    
    var j: js.UndefOr[js.Array[String]] = js.undefined
    
    var k: js.UndefOr[js.Array[Double]] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var l: js.UndefOr[js.Array[String]] = js.undefined
    
    var m: js.UndefOr[String] = js.undefined
    
    var n: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var non_qualified: js.UndefOr[String] = js.undefined
    
    var o: js.UndefOr[Double] = js.undefined
    
    var obsoleted_by: js.UndefOr[String] = js.undefined
    
    var obsoletes: js.UndefOr[String] = js.undefined
    
    var sheet: js.UndefOr[js.Array[Double]] = js.undefined
    
    var sheet_x: js.UndefOr[Double] = js.undefined
    
    var sheet_y: js.UndefOr[Double] = js.undefined
    
    var short_names: js.UndefOr[js.Array[String]] = js.undefined
    
    var skin_variations: js.UndefOr[StringDictionary[SkinVariation]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var unified: js.UndefOr[String] = js.undefined
  }
  object Emoji {
    
    inline def apply(): Emoji = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Emoji]
    }
    
    extension [Self <: Emoji](x: Self) {
      
      inline def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setAdded_in(value: Double): Self = StObject.set(x, "added_in", value.asInstanceOf[js.Any])
      
      inline def setAdded_inUndefined: Self = StObject.set(x, "added_in", js.undefined)
      
      inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setD(value: Boolean): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setE(value: Boolean): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setEmoticons(value: js.Array[String]): Self = StObject.set(x, "emoticons", value.asInstanceOf[js.Any])
      
      inline def setEmoticonsUndefined: Self = StObject.set(x, "emoticons", js.undefined)
      
      inline def setEmoticonsVarargs(value: String*): Self = StObject.set(x, "emoticons", js.Array(value*))
      
      inline def setF(value: Boolean): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setG(value: Boolean): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
      
      inline def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setHas_img_apple(value: Boolean): Self = StObject.set(x, "has_img_apple", value.asInstanceOf[js.Any])
      
      inline def setHas_img_appleUndefined: Self = StObject.set(x, "has_img_apple", js.undefined)
      
      inline def setHas_img_emojione(value: Boolean): Self = StObject.set(x, "has_img_emojione", value.asInstanceOf[js.Any])
      
      inline def setHas_img_emojioneUndefined: Self = StObject.set(x, "has_img_emojione", js.undefined)
      
      inline def setHas_img_facebook(value: Boolean): Self = StObject.set(x, "has_img_facebook", value.asInstanceOf[js.Any])
      
      inline def setHas_img_facebookUndefined: Self = StObject.set(x, "has_img_facebook", js.undefined)
      
      inline def setHas_img_google(value: Boolean): Self = StObject.set(x, "has_img_google", value.asInstanceOf[js.Any])
      
      inline def setHas_img_googleUndefined: Self = StObject.set(x, "has_img_google", js.undefined)
      
      inline def setHas_img_messenger(value: Boolean): Self = StObject.set(x, "has_img_messenger", value.asInstanceOf[js.Any])
      
      inline def setHas_img_messengerUndefined: Self = StObject.set(x, "has_img_messenger", js.undefined)
      
      inline def setHas_img_twitter(value: Boolean): Self = StObject.set(x, "has_img_twitter", value.asInstanceOf[js.Any])
      
      inline def setHas_img_twitterUndefined: Self = StObject.set(x, "has_img_twitter", js.undefined)
      
      inline def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setJ(value: js.Array[String]): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      inline def setJVarargs(value: String*): Self = StObject.set(x, "j", js.Array(value*))
      
      inline def setK(value: js.Array[Double]): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setKVarargs(value: Double*): Self = StObject.set(x, "k", js.Array(value*))
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setL(value: js.Array[String]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      inline def setLVarargs(value: String*): Self = StObject.set(x, "l", js.Array(value*))
      
      inline def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setN(value: js.Array[String]): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setNVarargs(value: String*): Self = StObject.set(x, "n", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNon_qualified(value: String): Self = StObject.set(x, "non_qualified", value.asInstanceOf[js.Any])
      
      inline def setNon_qualifiedUndefined: Self = StObject.set(x, "non_qualified", js.undefined)
      
      inline def setO(value: Double): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setObsoleted_by(value: String): Self = StObject.set(x, "obsoleted_by", value.asInstanceOf[js.Any])
      
      inline def setObsoleted_byUndefined: Self = StObject.set(x, "obsoleted_by", js.undefined)
      
      inline def setObsoletes(value: String): Self = StObject.set(x, "obsoletes", value.asInstanceOf[js.Any])
      
      inline def setObsoletesUndefined: Self = StObject.set(x, "obsoletes", js.undefined)
      
      inline def setSheet(value: js.Array[Double]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
      
      inline def setSheetVarargs(value: Double*): Self = StObject.set(x, "sheet", js.Array(value*))
      
      inline def setSheet_x(value: Double): Self = StObject.set(x, "sheet_x", value.asInstanceOf[js.Any])
      
      inline def setSheet_xUndefined: Self = StObject.set(x, "sheet_x", js.undefined)
      
      inline def setSheet_y(value: Double): Self = StObject.set(x, "sheet_y", value.asInstanceOf[js.Any])
      
      inline def setSheet_yUndefined: Self = StObject.set(x, "sheet_y", js.undefined)
      
      inline def setShort_names(value: js.Array[String]): Self = StObject.set(x, "short_names", value.asInstanceOf[js.Any])
      
      inline def setShort_namesUndefined: Self = StObject.set(x, "short_names", js.undefined)
      
      inline def setShort_namesVarargs(value: String*): Self = StObject.set(x, "short_names", js.Array(value*))
      
      inline def setSkin_variations(value: StringDictionary[SkinVariation]): Self = StObject.set(x, "skin_variations", value.asInstanceOf[js.Any])
      
      inline def setSkin_variationsUndefined: Self = StObject.set(x, "skin_variations", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUnified(value: String): Self = StObject.set(x, "unified", value.asInstanceOf[js.Any])
      
      inline def setUnifiedUndefined: Self = StObject.set(x, "unified", js.undefined)
    }
  }
  
  trait SkinVariation extends StObject {
    
    var added_in: String
    
    var has_img_apple: Boolean
    
    var has_img_emojione: js.UndefOr[Boolean] = js.undefined
    
    var has_img_facebook: Boolean
    
    var has_img_google: Boolean
    
    var has_img_messenger: js.UndefOr[Boolean] = js.undefined
    
    var has_img_twitter: Boolean
    
    var image: String
    
    var non_qualified: Null | String
    
    var obsoleted_by: js.UndefOr[String] = js.undefined
    
    var obsoletes: js.UndefOr[String] = js.undefined
    
    var sheet_x: Double
    
    var sheet_y: Double
    
    var unified: String
  }
  object SkinVariation {
    
    inline def apply(
      added_in: String,
      has_img_apple: Boolean,
      has_img_facebook: Boolean,
      has_img_google: Boolean,
      has_img_twitter: Boolean,
      image: String,
      sheet_x: Double,
      sheet_y: Double,
      unified: String
    ): SkinVariation = {
      val __obj = js.Dynamic.literal(added_in = added_in.asInstanceOf[js.Any], has_img_apple = has_img_apple.asInstanceOf[js.Any], has_img_facebook = has_img_facebook.asInstanceOf[js.Any], has_img_google = has_img_google.asInstanceOf[js.Any], has_img_twitter = has_img_twitter.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], sheet_x = sheet_x.asInstanceOf[js.Any], sheet_y = sheet_y.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any], non_qualified = null)
      __obj.asInstanceOf[SkinVariation]
    }
    
    extension [Self <: SkinVariation](x: Self) {
      
      inline def setAdded_in(value: String): Self = StObject.set(x, "added_in", value.asInstanceOf[js.Any])
      
      inline def setHas_img_apple(value: Boolean): Self = StObject.set(x, "has_img_apple", value.asInstanceOf[js.Any])
      
      inline def setHas_img_emojione(value: Boolean): Self = StObject.set(x, "has_img_emojione", value.asInstanceOf[js.Any])
      
      inline def setHas_img_emojioneUndefined: Self = StObject.set(x, "has_img_emojione", js.undefined)
      
      inline def setHas_img_facebook(value: Boolean): Self = StObject.set(x, "has_img_facebook", value.asInstanceOf[js.Any])
      
      inline def setHas_img_google(value: Boolean): Self = StObject.set(x, "has_img_google", value.asInstanceOf[js.Any])
      
      inline def setHas_img_messenger(value: Boolean): Self = StObject.set(x, "has_img_messenger", value.asInstanceOf[js.Any])
      
      inline def setHas_img_messengerUndefined: Self = StObject.set(x, "has_img_messenger", js.undefined)
      
      inline def setHas_img_twitter(value: Boolean): Self = StObject.set(x, "has_img_twitter", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setNon_qualified(value: String): Self = StObject.set(x, "non_qualified", value.asInstanceOf[js.Any])
      
      inline def setNon_qualifiedNull: Self = StObject.set(x, "non_qualified", null)
      
      inline def setObsoleted_by(value: String): Self = StObject.set(x, "obsoleted_by", value.asInstanceOf[js.Any])
      
      inline def setObsoleted_byUndefined: Self = StObject.set(x, "obsoleted_by", js.undefined)
      
      inline def setObsoletes(value: String): Self = StObject.set(x, "obsoletes", value.asInstanceOf[js.Any])
      
      inline def setObsoletesUndefined: Self = StObject.set(x, "obsoletes", js.undefined)
      
      inline def setSheet_x(value: Double): Self = StObject.set(x, "sheet_x", value.asInstanceOf[js.Any])
      
      inline def setSheet_y(value: Double): Self = StObject.set(x, "sheet_y", value.asInstanceOf[js.Any])
      
      inline def setUnified(value: String): Self = StObject.set(x, "unified", value.asInstanceOf[js.Any])
    }
  }
}

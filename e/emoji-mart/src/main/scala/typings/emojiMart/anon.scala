package typings.emojiMart

import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.nimbleEmojiIndexMod.EmojiEntry
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, string>> */
  trait PartialRecordCategoryName extends StObject {
    
    var activity: js.UndefOr[String] = js.undefined
    
    var custom: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var foods: js.UndefOr[String] = js.undefined
    
    var nature: js.UndefOr[String] = js.undefined
    
    var objects: js.UndefOr[String] = js.undefined
    
    var people: js.UndefOr[String] = js.undefined
    
    var places: js.UndefOr[String] = js.undefined
    
    var recent: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var symbols: js.UndefOr[String] = js.undefined
  }
  object PartialRecordCategoryName {
    
    inline def apply(): PartialRecordCategoryName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCategoryName]
    }
    
    extension [Self <: PartialRecordCategoryName](x: Self) {
      
      inline def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
      
      inline def setCustom(value: String): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFoods(value: String): Self = StObject.set(x, "foods", value.asInstanceOf[js.Any])
      
      inline def setFoodsUndefined: Self = StObject.set(x, "foods", js.undefined)
      
      inline def setNature(value: String): Self = StObject.set(x, "nature", value.asInstanceOf[js.Any])
      
      inline def setNatureUndefined: Self = StObject.set(x, "nature", js.undefined)
      
      inline def setObjects(value: String): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setPeople(value: String): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
      
      inline def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
      
      inline def setPlaces(value: String): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      inline def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
      
      inline def setRecent(value: String): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      inline def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSymbols(value: String): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
  
  /* Inlined std.Pick<emoji-mart.emoji-mart/dist-es.EmojiData, 'id'> */
  trait PickEmojiDataid extends StObject {
    
    var id: js.UndefOr[js.Any] = js.undefined
  }
  object PickEmojiDataid {
    
    inline def apply(): PickEmojiDataid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickEmojiDataid]
    }
    
    extension [Self <: PickEmojiDataid](x: Self) {
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, (): react.react.ReactNode> */
  trait RecordCategoryNameReactNo extends StObject {
    
    var activity: js.Function0[ReactNode]
    
    var custom: js.Function0[ReactNode]
    
    var flags: js.Function0[ReactNode]
    
    var foods: js.Function0[ReactNode]
    
    var nature: js.Function0[ReactNode]
    
    var objects: js.Function0[ReactNode]
    
    var people: js.Function0[ReactNode]
    
    var places: js.Function0[ReactNode]
    
    var recent: js.Function0[ReactNode]
    
    var search: js.Function0[ReactNode]
    
    var symbols: js.Function0[ReactNode]
  }
  object RecordCategoryNameReactNo {
    
    inline def apply(
      activity: () => ReactNode,
      custom: () => ReactNode,
      flags: () => ReactNode,
      foods: () => ReactNode,
      nature: () => ReactNode,
      objects: () => ReactNode,
      people: () => ReactNode,
      places: () => ReactNode,
      recent: () => ReactNode,
      search: () => ReactNode,
      symbols: () => ReactNode
    ): RecordCategoryNameReactNo = {
      val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), custom = js.Any.fromFunction0(custom), flags = js.Any.fromFunction0(flags), foods = js.Any.fromFunction0(foods), nature = js.Any.fromFunction0(nature), objects = js.Any.fromFunction0(objects), people = js.Any.fromFunction0(people), places = js.Any.fromFunction0(places), recent = js.Any.fromFunction0(recent), search = js.Any.fromFunction0(search), symbols = js.Any.fromFunction0(symbols))
      __obj.asInstanceOf[RecordCategoryNameReactNo]
    }
    
    extension [Self <: RecordCategoryNameReactNo](x: Self) {
      
      inline def setActivity(value: () => ReactNode): Self = StObject.set(x, "activity", js.Any.fromFunction0(value))
      
      inline def setCustom(value: () => ReactNode): Self = StObject.set(x, "custom", js.Any.fromFunction0(value))
      
      inline def setFlags(value: () => ReactNode): Self = StObject.set(x, "flags", js.Any.fromFunction0(value))
      
      inline def setFoods(value: () => ReactNode): Self = StObject.set(x, "foods", js.Any.fromFunction0(value))
      
      inline def setNature(value: () => ReactNode): Self = StObject.set(x, "nature", js.Any.fromFunction0(value))
      
      inline def setObjects(value: () => ReactNode): Self = StObject.set(x, "objects", js.Any.fromFunction0(value))
      
      inline def setPeople(value: () => ReactNode): Self = StObject.set(x, "people", js.Any.fromFunction0(value))
      
      inline def setPlaces(value: () => ReactNode): Self = StObject.set(x, "places", js.Any.fromFunction0(value))
      
      inline def setRecent(value: () => ReactNode): Self = StObject.set(x, "recent", js.Any.fromFunction0(value))
      
      inline def setSearch(value: () => ReactNode): Self = StObject.set(x, "search", js.Any.fromFunction0(value))
      
      inline def setSymbols(value: () => ReactNode): Self = StObject.set(x, "symbols", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, string> */
  trait RecordCategoryNamestring extends StObject {
    
    var activity: String
    
    var custom: String
    
    var flags: String
    
    var foods: String
    
    var nature: String
    
    var objects: String
    
    var people: String
    
    var places: String
    
    var recent: String
    
    var search: String
    
    var symbols: String
  }
  object RecordCategoryNamestring {
    
    inline def apply(
      activity: String,
      custom: String,
      flags: String,
      foods: String,
      nature: String,
      objects: String,
      people: String,
      places: String,
      recent: String,
      search: String,
      symbols: String
    ): RecordCategoryNamestring = {
      val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], foods = foods.asInstanceOf[js.Any], nature = nature.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordCategoryNamestring]
    }
    
    extension [Self <: RecordCategoryNamestring](x: Self) {
      
      inline def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setCustom(value: String): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFoods(value: String): Self = StObject.set(x, "foods", value.asInstanceOf[js.Any])
      
      inline def setNature(value: String): Self = StObject.set(x, "nature", value.asInstanceOf[js.Any])
      
      inline def setObjects(value: String): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setPeople(value: String): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
      
      inline def setPlaces(value: String): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      inline def setRecent(value: String): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSymbols(value: String): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ variant in emoji-mart.emoji-mart/dist-es/utils/emoji-index/nimble-emoji-index.EmojiSkin ]: emoji-mart.emoji-mart/dist-es/utils/emoji-index/nimble-emoji-index.EmojiData} */
  trait variantinEmojiSkinEmojiDa
    extends StObject
       with EmojiEntry {
    
    var `1`: EmojiData
    
    var `2`: EmojiData
    
    var `3`: EmojiData
    
    var `4`: EmojiData
    
    var `5`: EmojiData
    
    var `6`: EmojiData
  }
  object variantinEmojiSkinEmojiDa {
    
    inline def apply(`1`: EmojiData, `2`: EmojiData, `3`: EmojiData, `4`: EmojiData, `5`: EmojiData, `6`: EmojiData): variantinEmojiSkinEmojiDa = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.asInstanceOf[variantinEmojiSkinEmojiDa]
    }
    
    extension [Self <: variantinEmojiSkinEmojiDa](x: Self) {
      
      inline def set1(value: EmojiData): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: EmojiData): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: EmojiData): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: EmojiData): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: EmojiData): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: EmojiData): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    }
  }
}

package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Match
//#region Inventory
trait InventoryItem extends StObject {
  
  var account_id: js.UndefOr[Double] = js.undefined
  
  var attribute: js.UndefOr[js.Array[InventoryItemAttribute]] = js.undefined
  
  var casket_contained_item_count: js.UndefOr[Double] = js.undefined
  
  /**
    * If this item is contained in a casket (storage unit), this is a string containing that casket's item ID
    */
  var casket_id: js.UndefOr[Double] = js.undefined
  
  var custom_desc: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * This item's custom name, applied via name tag
    */
  var custom_name: String | Null
  
  var def_index: js.UndefOr[Double] = js.undefined
  
  var equipped_state: js.UndefOr[js.Array[Any]] = js.undefined
  
  var flags: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var in_use: js.UndefOr[Boolean] = js.undefined
  
  var interior_item: js.UndefOr[Any | Null] = js.undefined
  
  var inventory: js.UndefOr[Double] = js.undefined
  
  /**
    * What type of stat is tracked for StatTrak weapons.
    * Currently only 0 (Kills) is available.
    */
  var kill_eater_score_type: js.UndefOr[Double] = js.undefined
  
  /**
    * Tracked stat value for StatTrak weapons
    */
  var kill_eater_value: js.UndefOr[Double] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var origin: js.UndefOr[Double] = js.undefined
  
  var original_id: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * The item's paint index
    */
  var paint_index: js.UndefOr[Double] = js.undefined
  
  /**
    * The item's paint seed
    */
  var paint_seed: js.UndefOr[Double] = js.undefined
  
  /**
    * The item's paint wear, as a float
    * (often ignorantly referred to as "float value")
    */
  var paint_wear: js.UndefOr[Double] = js.undefined
  
  /**
    * This item's position in your inventory.
    * If the item is new and unacknowledged, this is 0
    */
  var position: Double
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var quest_id: js.UndefOr[Double] = js.undefined
  
  var rarity: js.UndefOr[Double] = js.undefined
  
  var stickers: js.UndefOr[js.Array[Sticker]] = js.undefined
  
  var style: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * A Date object representing when this item will become tradable.
    * May be a date in the past, as this is not removed when the date is reached.
    */
  var tradable_after: js.UndefOr[js.Date] = js.undefined
}
object InventoryItem {
  
  inline def apply(position: Double): InventoryItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], custom_name = null)
    __obj.asInstanceOf[InventoryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItem] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setAttribute(value: js.Array[InventoryItemAttribute]): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAttributeVarargs(value: InventoryItemAttribute*): Self = StObject.set(x, "attribute", js.Array(value*))
    
    inline def setCasket_contained_item_count(value: Double): Self = StObject.set(x, "casket_contained_item_count", value.asInstanceOf[js.Any])
    
    inline def setCasket_contained_item_countUndefined: Self = StObject.set(x, "casket_contained_item_count", js.undefined)
    
    inline def setCasket_id(value: Double): Self = StObject.set(x, "casket_id", value.asInstanceOf[js.Any])
    
    inline def setCasket_idUndefined: Self = StObject.set(x, "casket_id", js.undefined)
    
    inline def setCustom_desc(value: Any): Self = StObject.set(x, "custom_desc", value.asInstanceOf[js.Any])
    
    inline def setCustom_descNull: Self = StObject.set(x, "custom_desc", null)
    
    inline def setCustom_descUndefined: Self = StObject.set(x, "custom_desc", js.undefined)
    
    inline def setCustom_name(value: String): Self = StObject.set(x, "custom_name", value.asInstanceOf[js.Any])
    
    inline def setCustom_nameNull: Self = StObject.set(x, "custom_name", null)
    
    inline def setDef_index(value: Double): Self = StObject.set(x, "def_index", value.asInstanceOf[js.Any])
    
    inline def setDef_indexUndefined: Self = StObject.set(x, "def_index", js.undefined)
    
    inline def setEquipped_state(value: js.Array[Any]): Self = StObject.set(x, "equipped_state", value.asInstanceOf[js.Any])
    
    inline def setEquipped_stateUndefined: Self = StObject.set(x, "equipped_state", js.undefined)
    
    inline def setEquipped_stateVarargs(value: Any*): Self = StObject.set(x, "equipped_state", js.Array(value*))
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIn_use(value: Boolean): Self = StObject.set(x, "in_use", value.asInstanceOf[js.Any])
    
    inline def setIn_useUndefined: Self = StObject.set(x, "in_use", js.undefined)
    
    inline def setInterior_item(value: Any): Self = StObject.set(x, "interior_item", value.asInstanceOf[js.Any])
    
    inline def setInterior_itemNull: Self = StObject.set(x, "interior_item", null)
    
    inline def setInterior_itemUndefined: Self = StObject.set(x, "interior_item", js.undefined)
    
    inline def setInventory(value: Double): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    inline def setKill_eater_score_type(value: Double): Self = StObject.set(x, "kill_eater_score_type", value.asInstanceOf[js.Any])
    
    inline def setKill_eater_score_typeUndefined: Self = StObject.set(x, "kill_eater_score_type", js.undefined)
    
    inline def setKill_eater_value(value: Double): Self = StObject.set(x, "kill_eater_value", value.asInstanceOf[js.Any])
    
    inline def setKill_eater_valueUndefined: Self = StObject.set(x, "kill_eater_value", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setOrigin(value: Double): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginal_id(value: Any): Self = StObject.set(x, "original_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_idNull: Self = StObject.set(x, "original_id", null)
    
    inline def setOriginal_idUndefined: Self = StObject.set(x, "original_id", js.undefined)
    
    inline def setPaint_index(value: Double): Self = StObject.set(x, "paint_index", value.asInstanceOf[js.Any])
    
    inline def setPaint_indexUndefined: Self = StObject.set(x, "paint_index", js.undefined)
    
    inline def setPaint_seed(value: Double): Self = StObject.set(x, "paint_seed", value.asInstanceOf[js.Any])
    
    inline def setPaint_seedUndefined: Self = StObject.set(x, "paint_seed", js.undefined)
    
    inline def setPaint_wear(value: Double): Self = StObject.set(x, "paint_wear", value.asInstanceOf[js.Any])
    
    inline def setPaint_wearUndefined: Self = StObject.set(x, "paint_wear", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setQuest_id(value: Double): Self = StObject.set(x, "quest_id", value.asInstanceOf[js.Any])
    
    inline def setQuest_idUndefined: Self = StObject.set(x, "quest_id", js.undefined)
    
    inline def setRarity(value: Double): Self = StObject.set(x, "rarity", value.asInstanceOf[js.Any])
    
    inline def setRarityUndefined: Self = StObject.set(x, "rarity", js.undefined)
    
    inline def setStickers(value: js.Array[Sticker]): Self = StObject.set(x, "stickers", value.asInstanceOf[js.Any])
    
    inline def setStickersUndefined: Self = StObject.set(x, "stickers", js.undefined)
    
    inline def setStickersVarargs(value: Sticker*): Self = StObject.set(x, "stickers", js.Array(value*))
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTradable_after(value: js.Date): Self = StObject.set(x, "tradable_after", value.asInstanceOf[js.Any])
    
    inline def setTradable_afterUndefined: Self = StObject.set(x, "tradable_after", js.undefined)
  }
}

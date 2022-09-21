package typings.globaloffensive.mod

import typings.globaloffensive.anon.Stickertintidnumbernull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemInfo extends StObject {
  
  /**
    * Seems to alway be `null`
    */
  var accountid: Null
  
  /**
    * The item's custom name via a name tag,
    * or null if none
    */
  var customname: String | Null
  
  var defindex: Double
  
  var dropreason: Any | Null
  
  var entindex: Double | Null
  
  /**
    * An integer which has no use to you
    */
  var inventory: Double
  
  var itemid: String
  
  /**
    * What kind of statistic the StatTrak version of this item tracks
    * (may be null if not StatTrak)
    */
  var killeaterscoretype: Double | Null
  
  /**
    * The item's tracked statistic value (kills)
    */
  var killeatervalue: Double | Null
  
  var musicindex: Double | Null
  
  var origin: Double
  
  var paintindex: Double
  
  var paintseed: Double
  
  /**
    * The item's paint wear percentage,
    * as a float between 0 and 1
    * (frequently and incorrectly called "float value")
    */
  var paintwear: Double
  
  var quality: Double
  
  /**
    * You can ignore this
    */
  var questid: Any | Null
  
  var rarity: Double
  
  /**
    * An array of objects describing the stickers applied to this item
    */
  var stickers: js.Array[Stickertintidnumbernull]
}
object ItemInfo {
  
  inline def apply(
    accountid: Null,
    defindex: Double,
    inventory: Double,
    itemid: String,
    origin: Double,
    paintindex: Double,
    paintseed: Double,
    paintwear: Double,
    quality: Double,
    rarity: Double,
    stickers: js.Array[Stickertintidnumbernull]
  ): ItemInfo = {
    val __obj = js.Dynamic.literal(accountid = accountid.asInstanceOf[js.Any], defindex = defindex.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], itemid = itemid.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], paintindex = paintindex.asInstanceOf[js.Any], paintseed = paintseed.asInstanceOf[js.Any], paintwear = paintwear.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rarity = rarity.asInstanceOf[js.Any], stickers = stickers.asInstanceOf[js.Any], customname = null, dropreason = null, entindex = null, killeaterscoretype = null, killeatervalue = null, musicindex = null, questid = null)
    __obj.asInstanceOf[ItemInfo]
  }
  
  extension [Self <: ItemInfo](x: Self) {
    
    inline def setAccountid(value: Null): Self = StObject.set(x, "accountid", value.asInstanceOf[js.Any])
    
    inline def setCustomname(value: String): Self = StObject.set(x, "customname", value.asInstanceOf[js.Any])
    
    inline def setCustomnameNull: Self = StObject.set(x, "customname", null)
    
    inline def setDefindex(value: Double): Self = StObject.set(x, "defindex", value.asInstanceOf[js.Any])
    
    inline def setDropreason(value: Any): Self = StObject.set(x, "dropreason", value.asInstanceOf[js.Any])
    
    inline def setDropreasonNull: Self = StObject.set(x, "dropreason", null)
    
    inline def setEntindex(value: Double): Self = StObject.set(x, "entindex", value.asInstanceOf[js.Any])
    
    inline def setEntindexNull: Self = StObject.set(x, "entindex", null)
    
    inline def setInventory(value: Double): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setItemid(value: String): Self = StObject.set(x, "itemid", value.asInstanceOf[js.Any])
    
    inline def setKilleaterscoretype(value: Double): Self = StObject.set(x, "killeaterscoretype", value.asInstanceOf[js.Any])
    
    inline def setKilleaterscoretypeNull: Self = StObject.set(x, "killeaterscoretype", null)
    
    inline def setKilleatervalue(value: Double): Self = StObject.set(x, "killeatervalue", value.asInstanceOf[js.Any])
    
    inline def setKilleatervalueNull: Self = StObject.set(x, "killeatervalue", null)
    
    inline def setMusicindex(value: Double): Self = StObject.set(x, "musicindex", value.asInstanceOf[js.Any])
    
    inline def setMusicindexNull: Self = StObject.set(x, "musicindex", null)
    
    inline def setOrigin(value: Double): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPaintindex(value: Double): Self = StObject.set(x, "paintindex", value.asInstanceOf[js.Any])
    
    inline def setPaintseed(value: Double): Self = StObject.set(x, "paintseed", value.asInstanceOf[js.Any])
    
    inline def setPaintwear(value: Double): Self = StObject.set(x, "paintwear", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQuestid(value: Any): Self = StObject.set(x, "questid", value.asInstanceOf[js.Any])
    
    inline def setQuestidNull: Self = StObject.set(x, "questid", null)
    
    inline def setRarity(value: Double): Self = StObject.set(x, "rarity", value.asInstanceOf[js.Any])
    
    inline def setStickers(value: js.Array[Stickertintidnumbernull]): Self = StObject.set(x, "stickers", value.asInstanceOf[js.Any])
    
    inline def setStickersVarargs(value: Stickertintidnumbernull*): Self = StObject.set(x, "stickers", js.Array(value*))
  }
}

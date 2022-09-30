package typings.dynmap.mod

import typings.dynmap.mod.global.JQuery
import typings.dynmap.mod.leafletAugmentingMod.CustomMarker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Player extends StObject {
  
  var account: String
  
  var armor: Double
  
  var health: Double
  
  var healthBar: JQuery
  
  var healthContainer: JQuery
  
  var location: Location[String | World | Null, Double, Double, Double]
  
  var marker: CustomMarker
  
  var menuitem: JQuery
  
  var menuname: JQuery
  
  var name: String
  
  var namefield: JQuery
  
  var sort: Double
}
object Player {
  
  inline def apply(
    account: String,
    armor: Double,
    health: Double,
    healthBar: JQuery,
    healthContainer: JQuery,
    location: Location[String | World | Null, Double, Double, Double],
    marker: CustomMarker,
    menuitem: JQuery,
    menuname: JQuery,
    name: String,
    namefield: JQuery,
    sort: Double
  ): Player = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], armor = armor.asInstanceOf[js.Any], health = health.asInstanceOf[js.Any], healthBar = healthBar.asInstanceOf[js.Any], healthContainer = healthContainer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], menuname = menuname.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namefield = namefield.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  extension [Self <: Player](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setArmor(value: Double): Self = StObject.set(x, "armor", value.asInstanceOf[js.Any])
    
    inline def setHealth(value: Double): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthBar(value: JQuery): Self = StObject.set(x, "healthBar", value.asInstanceOf[js.Any])
    
    inline def setHealthContainer(value: JQuery): Self = StObject.set(x, "healthContainer", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location[String | World | Null, Double, Double, Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: CustomMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMenuitem(value: JQuery): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
    
    inline def setMenuname(value: JQuery): Self = StObject.set(x, "menuname", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamefield(value: JQuery): Self = StObject.set(x, "namefield", value.asInstanceOf[js.Any])
    
    inline def setSort(value: Double): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
  }
}

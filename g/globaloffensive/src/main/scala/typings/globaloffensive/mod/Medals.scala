package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medals extends StObject {
  
  /**
    * Array of copins
    */
  var display_items_defidx: js.Array[Double]
  
  var featured_display_item_defidx: Double
  
  var medal_arms: js.UndefOr[Any | Null] = js.undefined
  
  var medal_combat: js.UndefOr[Any | Null] = js.undefined
  
  var medal_global: js.UndefOr[Any | Null] = js.undefined
  
  var medal_team: js.UndefOr[Any | Null] = js.undefined
  
  var medal_weapon: js.UndefOr[Any | Null] = js.undefined
}
object Medals {
  
  inline def apply(display_items_defidx: js.Array[Double], featured_display_item_defidx: Double): Medals = {
    val __obj = js.Dynamic.literal(display_items_defidx = display_items_defidx.asInstanceOf[js.Any], featured_display_item_defidx = featured_display_item_defidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medals]
  }
  
  extension [Self <: Medals](x: Self) {
    
    inline def setDisplay_items_defidx(value: js.Array[Double]): Self = StObject.set(x, "display_items_defidx", value.asInstanceOf[js.Any])
    
    inline def setDisplay_items_defidxVarargs(value: Double*): Self = StObject.set(x, "display_items_defidx", js.Array(value*))
    
    inline def setFeatured_display_item_defidx(value: Double): Self = StObject.set(x, "featured_display_item_defidx", value.asInstanceOf[js.Any])
    
    inline def setMedal_arms(value: Any): Self = StObject.set(x, "medal_arms", value.asInstanceOf[js.Any])
    
    inline def setMedal_armsNull: Self = StObject.set(x, "medal_arms", null)
    
    inline def setMedal_armsUndefined: Self = StObject.set(x, "medal_arms", js.undefined)
    
    inline def setMedal_combat(value: Any): Self = StObject.set(x, "medal_combat", value.asInstanceOf[js.Any])
    
    inline def setMedal_combatNull: Self = StObject.set(x, "medal_combat", null)
    
    inline def setMedal_combatUndefined: Self = StObject.set(x, "medal_combat", js.undefined)
    
    inline def setMedal_global(value: Any): Self = StObject.set(x, "medal_global", value.asInstanceOf[js.Any])
    
    inline def setMedal_globalNull: Self = StObject.set(x, "medal_global", null)
    
    inline def setMedal_globalUndefined: Self = StObject.set(x, "medal_global", js.undefined)
    
    inline def setMedal_team(value: Any): Self = StObject.set(x, "medal_team", value.asInstanceOf[js.Any])
    
    inline def setMedal_teamNull: Self = StObject.set(x, "medal_team", null)
    
    inline def setMedal_teamUndefined: Self = StObject.set(x, "medal_team", js.undefined)
    
    inline def setMedal_weapon(value: Any): Self = StObject.set(x, "medal_weapon", value.asInstanceOf[js.Any])
    
    inline def setMedal_weaponNull: Self = StObject.set(x, "medal_weapon", null)
    
    inline def setMedal_weaponUndefined: Self = StObject.set(x, "medal_weapon", js.undefined)
  }
}

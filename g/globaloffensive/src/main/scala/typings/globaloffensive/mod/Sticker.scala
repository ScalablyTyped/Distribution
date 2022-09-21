package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sticker extends StObject {
  
  /**
    * Float, `null` if not applicable
    */
  var rotation: Double | Null
  
  /**
    * Float, `null` if not applicable
    */
  var scale: Double | Null
  
  /**
    * The sticker slot number, 0-5
    */
  var slot: Double
  
  var sticker_id: Double
  
  /**
    * The sticker's wear (how scratched it is), as a float.
    * `null` if not scratched at all.
    */
  var wear: Double | Null
}
object Sticker {
  
  inline def apply(slot: Double, sticker_id: Double): Sticker = {
    val __obj = js.Dynamic.literal(slot = slot.asInstanceOf[js.Any], sticker_id = sticker_id.asInstanceOf[js.Any], rotation = null, scale = null, wear = null)
    __obj.asInstanceOf[Sticker]
  }
  
  extension [Self <: Sticker](x: Self) {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationNull: Self = StObject.set(x, "rotation", null)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSticker_id(value: Double): Self = StObject.set(x, "sticker_id", value.asInstanceOf[js.Any])
    
    inline def setWear(value: Double): Self = StObject.set(x, "wear", value.asInstanceOf[js.Any])
    
    inline def setWearNull: Self = StObject.set(x, "wear", null)
  }
}

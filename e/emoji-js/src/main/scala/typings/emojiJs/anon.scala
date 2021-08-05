package typings.emojiJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mask extends StObject {
    
    var mask: Double
    
    var path: String
    
    var sheet: String
    
    var sheet_size: Double
  }
  object Mask {
    
    inline def apply(mask: Double, path: String, sheet: String, sheet_size: Double): Mask = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], sheet_size = sheet_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mask]
    }
    
    extension [Self <: Mask](x: Self) {
      
      inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSheet(value: String): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSheet_size(value: Double): Self = StObject.set(x, "sheet_size", value.asInstanceOf[js.Any])
    }
  }
}

package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewItemCount extends StObject {
  
  /**
    *
    */
  var newItemCount: Double
  
  /**
    *
    */
  var totalItemCount: Double
}
object NewItemCount {
  
  inline def apply(newItemCount: Double, totalItemCount: Double): NewItemCount = {
    val __obj = js.Dynamic.literal(newItemCount = newItemCount.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewItemCount]
  }
  
  extension [Self <: NewItemCount](x: Self) {
    
    inline def setNewItemCount(value: Double): Self = StObject.set(x, "newItemCount", value.asInstanceOf[js.Any])
    
    inline def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
  }
}

package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tuple of values from the last game of a previous page (look up "keyset pagination"). */
trait PageTuple extends StObject {
  
  /** ID of the game (unique value). */
  var id: String
  
  /** Primary order value. */
  var orderVal: Any
  
  /** Title of the game (secondary order value). */
  var title: String
}
object PageTuple {
  
  inline def apply(id: String, orderVal: Any, title: String): PageTuple = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], orderVal = orderVal.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageTuple]
  }
  
  extension [Self <: PageTuple](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrderVal(value: Any): Self = StObject.set(x, "orderVal", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

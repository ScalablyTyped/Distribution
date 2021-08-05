package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /**
    * `true` if the value was inserted into the new string.
    */
  var added: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * `true` if the value was removed from the old string.
    */
  var removed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text content.
    */
  var value: String
}
object Change {
  
  inline def apply(value: String): Change = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setAdded(value: Boolean): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRange extends StObject {
  
  /**
    * Lower bound.
    */
  var lower: js.UndefOr[Key] = js.undefined
  
  /**
    * If true lower bound is open.
    */
  var lowerOpen: Boolean
  
  /**
    * Upper bound.
    */
  var upper: js.UndefOr[Key] = js.undefined
  
  /**
    * If true upper bound is open.
    */
  var upperOpen: Boolean
}
object KeyRange {
  
  inline def apply(lowerOpen: Boolean, upperOpen: Boolean): KeyRange = {
    val __obj = js.Dynamic.literal(lowerOpen = lowerOpen.asInstanceOf[js.Any], upperOpen = upperOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRange]
  }
  
  extension [Self <: KeyRange](x: Self) {
    
    inline def setLower(value: Key): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLowerOpen(value: Boolean): Self = StObject.set(x, "lowerOpen", value.asInstanceOf[js.Any])
    
    inline def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
    
    inline def setUpper(value: Key): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpperOpen(value: Boolean): Self = StObject.set(x, "upperOpen", value.asInstanceOf[js.Any])
    
    inline def setUpperUndefined: Self = StObject.set(x, "upper", js.undefined)
  }
}

package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetPoolsScopedList extends StObject {
  
  /**
    * A list of target pools contained in this scope.
    */
  var targetPools: js.UndefOr[js.Array[SchemaTargetPool]] = js.undefined
  
  /**
    * Informational warning which replaces the list of addresses when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaTargetPoolsScopedList {
  
  inline def apply(): SchemaTargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsScopedList]
  }
  
  extension [Self <: SchemaTargetPoolsScopedList](x: Self) {
    
    inline def setTargetPools(value: js.Array[SchemaTargetPool]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    inline def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    inline def setTargetPoolsVarargs(value: SchemaTargetPool*): Self = StObject.set(x, "targetPools", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

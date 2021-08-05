package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesScopedList extends StObject {
  
  /**
    * [Output Only] A list of instances contained in this scope.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of instances
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaInstancesScopedList {
  
  inline def apply(): SchemaInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesScopedList]
  }
  
  extension [Self <: SchemaInstancesScopedList](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

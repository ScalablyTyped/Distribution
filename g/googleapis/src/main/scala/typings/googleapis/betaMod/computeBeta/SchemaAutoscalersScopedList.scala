package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalersScopedList extends StObject {
  
  /**
    * [Output Only] A list of autoscalers contained in this scope.
    */
  var autoscalers: js.UndefOr[js.Array[SchemaAutoscaler]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of
    * autoscalers when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaAutoscalersScopedList {
  
  inline def apply(): SchemaAutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalersScopedList]
  }
  
  extension [Self <: SchemaAutoscalersScopedList](x: Self) {
    
    inline def setAutoscalers(value: js.Array[SchemaAutoscaler]): Self = StObject.set(x, "autoscalers", value.asInstanceOf[js.Any])
    
    inline def setAutoscalersUndefined: Self = StObject.set(x, "autoscalers", js.undefined)
    
    inline def setAutoscalersVarargs(value: SchemaAutoscaler*): Self = StObject.set(x, "autoscalers", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

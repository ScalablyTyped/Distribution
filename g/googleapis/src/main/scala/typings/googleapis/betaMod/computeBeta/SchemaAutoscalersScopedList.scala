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
  
  @scala.inline
  def apply(): SchemaAutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalersScopedList]
  }
  
  @scala.inline
  implicit class SchemaAutoscalersScopedListMutableBuilder[Self <: SchemaAutoscalersScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalers(value: js.Array[SchemaAutoscaler]): Self = StObject.set(x, "autoscalers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalersUndefined: Self = StObject.set(x, "autoscalers", js.undefined)
    
    @scala.inline
    def setAutoscalersVarargs(value: SchemaAutoscaler*): Self = StObject.set(x, "autoscalers", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

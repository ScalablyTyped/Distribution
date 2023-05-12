package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.ValidationRule
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowValidatingInfo[TRowData, TKey] extends StObject {
  
  val brokenRules: js.Array[ValidationRule]
  
  var errorText: String
  
  var isValid: Boolean
  
  val key: TKey
  
  val newData: DeepPartial[TRowData]
  
  val oldData: TRowData
  
  var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
}
object RowValidatingInfo {
  
  inline def apply[TRowData, TKey](
    brokenRules: js.Array[ValidationRule],
    errorText: String,
    isValid: Boolean,
    key: TKey,
    newData: DeepPartial[TRowData],
    oldData: TRowData
  ): RowValidatingInfo[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(brokenRules = brokenRules.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowValidatingInfo[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowValidatingInfo[?, ?], TRowData, TKey] (val x: Self & (RowValidatingInfo[TRowData, TKey])) extends AnyVal {
    
    inline def setBrokenRules(value: js.Array[ValidationRule]): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
    
    inline def setBrokenRulesVarargs(value: ValidationRule*): Self = StObject.set(x, "brokenRules", js.Array(value*))
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewData(value: DeepPartial[TRowData]): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    inline def setOldData(value: TRowData): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}

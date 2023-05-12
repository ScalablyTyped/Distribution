package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.core.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataChange[TRowData, TKey] extends StObject {
  
  /**
    * An object with updated row fields.
    */
  var data: DeepPartial[TRowData]
  
  /**
    * A key that identifies a record after which a new record should be inserted. Applies only if the type is &apos;insert&apos;.
    */
  var insertAfterKey: js.UndefOr[TKey] = js.undefined
  
  /**
    * A key that identifies the record before which a new record should be inserted. Applies only if the type is &apos;insert&apos;.
    */
  var insertBeforeKey: js.UndefOr[TKey] = js.undefined
  
  /**
    * The key of the row being updated or removed.
    */
  var key: TKey
  
  /**
    * Data change type.
    */
  var `type`: DataChangeType
}
object DataChange {
  
  inline def apply[TRowData, TKey](data: DeepPartial[TRowData], key: TKey, `type`: DataChangeType): DataChange[TRowData, TKey] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChange[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataChange[?, ?], TRowData, TKey] (val x: Self & (DataChange[TRowData, TKey])) extends AnyVal {
    
    inline def setData(value: DeepPartial[TRowData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setInsertAfterKey(value: TKey): Self = StObject.set(x, "insertAfterKey", value.asInstanceOf[js.Any])
    
    inline def setInsertAfterKeyUndefined: Self = StObject.set(x, "insertAfterKey", js.undefined)
    
    inline def setInsertBeforeKey(value: TKey): Self = StObject.set(x, "insertBeforeKey", value.asInstanceOf[js.Any])
    
    inline def setInsertBeforeKeyUndefined: Self = StObject.set(x, "insertBeforeKey", js.undefined)
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowKeyInfo[TKey] extends StObject {
  
  val key: TKey
}
object RowKeyInfo {
  
  inline def apply[TKey](key: TKey): RowKeyInfo[TKey] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowKeyInfo[TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowKeyInfo[?], TKey] (val x: Self & RowKeyInfo[TKey]) extends AnyVal {
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

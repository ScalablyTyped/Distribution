package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayStoreOptions[T]
  extends StObject
     with StoreOptions[T] {
  
  /**
    * [descr:ArrayStore.Options.data]
    */
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object ArrayStoreOptions {
  
  inline def apply[T](): ArrayStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayStoreOptions[T]]
  }
  
  extension [Self <: ArrayStoreOptions[?], T](x: Self & ArrayStoreOptions[T]) {
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}

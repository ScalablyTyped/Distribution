package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataKey extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
}
object DataKey {
  
  @scala.inline
  def apply(): DataKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataKey]
  }
  
  @scala.inline
  implicit class DataKeyMutableBuilder[Self <: DataKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}

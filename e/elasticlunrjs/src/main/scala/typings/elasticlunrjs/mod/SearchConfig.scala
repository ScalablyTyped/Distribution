package typings.elasticlunrjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchConfig[T /* <: js.Object */] extends StObject {
  
  var bool: js.UndefOr[Bool] = js.undefined
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[FieldSearchConfig[T]] = js.undefined
}
object SearchConfig {
  
  inline def apply[T /* <: js.Object */](): SearchConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchConfig[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchConfig[?], T /* <: js.Object */] (val x: Self & SearchConfig[T]) extends AnyVal {
    
    inline def setBool(value: Bool): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFields(value: FieldSearchConfig[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}

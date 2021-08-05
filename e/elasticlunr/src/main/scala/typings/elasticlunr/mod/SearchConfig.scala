package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchConfig[T] extends StObject {
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[FieldSearchConfig[T]] = js.undefined
}
object SearchConfig {
  
  inline def apply[T](): SearchConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchConfig[T]]
  }
  
  extension [Self <: SearchConfig[?], T](x: Self & SearchConfig[T]) {
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFields(value: FieldSearchConfig[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}

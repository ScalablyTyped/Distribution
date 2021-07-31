package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchConfig[T] extends StObject {
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[FieldSearchConfig[T]] = js.undefined
}
object SearchConfig {
  
  @scala.inline
  def apply[T](): SearchConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchConfig[T]]
  }
  
  @scala.inline
  implicit class SearchConfigMutableBuilder[Self <: SearchConfig[?], T] (val x: Self & SearchConfig[T]) extends AnyVal {
    
    @scala.inline
    def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFields(value: FieldSearchConfig[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}

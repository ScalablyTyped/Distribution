package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldIndex extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var fieldIndex: js.UndefOr[Double] = js.undefined
  
  var replaceString: js.UndefOr[String] = js.undefined
  
  var searchString: js.UndefOr[String] = js.undefined
}
object FieldIndex {
  
  @scala.inline
  def apply(): FieldIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldIndex]
  }
  
  @scala.inline
  implicit class FieldIndexMutableBuilder[Self <: FieldIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIndex(value: Double): Self = StObject.set(x, "fieldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIndexUndefined: Self = StObject.set(x, "fieldIndex", js.undefined)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setReplaceString(value: String): Self = StObject.set(x, "replaceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceStringUndefined: Self = StObject.set(x, "replaceString", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
  }
}

package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllFields extends StObject {
  
  var allFields: js.UndefOr[String] = js.native
  
  var columnFields: js.UndefOr[String] = js.native
  
  var dataFields: js.UndefOr[String] = js.native
  
  var filterFields: js.UndefOr[String] = js.native
  
  var rowFields: js.UndefOr[String] = js.native
}
object AllFields {
  
  @scala.inline
  def apply(): AllFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllFields]
  }
  
  @scala.inline
  implicit class AllFieldsMutableBuilder[Self <: AllFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllFields(value: String): Self = StObject.set(x, "allFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllFieldsUndefined: Self = StObject.set(x, "allFields", js.undefined)
    
    @scala.inline
    def setColumnFields(value: String): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
    
    @scala.inline
    def setDataFields(value: String): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
    
    @scala.inline
    def setFilterFields(value: String): Self = StObject.set(x, "filterFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFieldsUndefined: Self = StObject.set(x, "filterFields", js.undefined)
    
    @scala.inline
    def setRowFields(value: String): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
  }
}

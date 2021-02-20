package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormDataItem extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The selected value in a list.
    */
  var listSelectedValue: js.UndefOr[String] = js.native
  
  /**
    * The name of the form field.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The initial value associated with the form field.
    */
  var originalValue: js.UndefOr[String] = js.native
  
  /**
    * The current value associated with the form field.
    */
  var value: js.UndefOr[String] = js.native
}
object FormDataItem {
  
  @scala.inline
  def apply(): FormDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormDataItem]
  }
  
  @scala.inline
  implicit class FormDataItemMutableBuilder[Self <: FormDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setListSelectedValue(value: String): Self = StObject.set(x, "listSelectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelectedValueUndefined: Self = StObject.set(x, "listSelectedValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

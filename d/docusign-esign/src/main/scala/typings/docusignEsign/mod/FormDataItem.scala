package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormDataItem extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The selected value in a list.
    */
  var listSelectedValue: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the form field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The initial value associated with the form field.
    */
  var originalValue: js.UndefOr[String] = js.undefined
  
  /**
    * The current value associated with the form field.
    */
  var value: js.UndefOr[String] = js.undefined
}
object FormDataItem {
  
  inline def apply(): FormDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormDataItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormDataItem] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setListSelectedValue(value: String): Self = StObject.set(x, "listSelectedValue", value.asInstanceOf[js.Any])
    
    inline def setListSelectedValueUndefined: Self = StObject.set(x, "listSelectedValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

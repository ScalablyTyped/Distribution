package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCustomFields extends StObject {
  
  /**
    * An array of list custom fields.
    */
  var listCustomFields: js.UndefOr[
    js.Array[
      /* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField
    ]
  ] = js.undefined
  
  /**
    * An array of text custom fields.
    */
  var textCustomFields: js.UndefOr[
    js.Array[
      /* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField
    ]
  ] = js.undefined
}
object AccountCustomFields {
  
  inline def apply(): AccountCustomFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCustomFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountCustomFields] (val x: Self) extends AnyVal {
    
    inline def setListCustomFields(
      value: js.Array[
          /* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField
        ]
    ): Self = StObject.set(x, "listCustomFields", value.asInstanceOf[js.Any])
    
    inline def setListCustomFieldsUndefined: Self = StObject.set(x, "listCustomFields", js.undefined)
    
    inline def setListCustomFieldsVarargs(
      value: (/* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField)*
    ): Self = StObject.set(x, "listCustomFields", js.Array(value*))
    
    inline def setTextCustomFields(
      value: js.Array[
          /* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField
        ]
    ): Self = StObject.set(x, "textCustomFields", value.asInstanceOf[js.Any])
    
    inline def setTextCustomFieldsUndefined: Self = StObject.set(x, "textCustomFields", js.undefined)
    
    inline def setTextCustomFieldsVarargs(
      value: (/* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField)*
    ): Self = StObject.set(x, "textCustomFields", js.Array(value*))
  }
}

package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFields extends js.Object {
  
  /**
    * An array of list custom fields.
    */
  var listCustomFields: js.UndefOr[
    js.Array[
      /* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField
    ]
  ] = js.native
  
  /**
    * An array of text custom fields.
    */
  var textCustomFields: js.UndefOr[
    js.Array[
      /* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField
    ]
  ] = js.native
}
object CustomFields {
  
  @scala.inline
  def apply(): CustomFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFields]
  }
  
  @scala.inline
  implicit class CustomFieldsOps[Self <: CustomFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setListCustomFieldsVarargs(
      value: (/* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField)*
    ): Self = this.set("listCustomFields", js.Array(value :_*))
    
    @scala.inline
    def setListCustomFields(
      value: js.Array[
          /* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField
        ]
    ): Self = this.set("listCustomFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListCustomFields: Self = this.set("listCustomFields", js.undefined)
    
    @scala.inline
    def setTextCustomFieldsVarargs(
      value: (/* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField)*
    ): Self = this.set("textCustomFields", js.Array(value :_*))
    
    @scala.inline
    def setTextCustomFields(
      value: js.Array[
          /* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField
        ]
    ): Self = this.set("textCustomFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextCustomFields: Self = this.set("textCustomFields", js.undefined)
  }
}

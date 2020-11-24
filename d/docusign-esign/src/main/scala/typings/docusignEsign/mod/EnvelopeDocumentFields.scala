package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeDocumentFields extends js.Object {
  
  /**
    * The array of name/value custom data strings to be added to a document. Custom document field information is returned in the status, but otherwise is not used by DocuSign.
    * The array contains the elements:
    *
    * * name - A string that can be a maximum of 50 characters.
    * * value - A string that can be a maximum of 200 characters.
    *
    * *IMPORTANT*: If you are using xml, the name/value pair is contained in a nameValue element.
    *
    */
  var documentFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
}
object EnvelopeDocumentFields {
  
  @scala.inline
  def apply(): EnvelopeDocumentFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocumentFields]
  }
  
  @scala.inline
  implicit class EnvelopeDocumentFieldsOps[Self <: EnvelopeDocumentFields] (val x: Self) extends AnyVal {
    
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
    def setDocumentFieldsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("documentFields", js.Array(value :_*))
    
    @scala.inline
    def setDocumentFields(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("documentFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentFields: Self = this.set("documentFields", js.undefined)
  }
}

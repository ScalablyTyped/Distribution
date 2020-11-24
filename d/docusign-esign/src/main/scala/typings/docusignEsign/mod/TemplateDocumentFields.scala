package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateDocumentFields extends js.Object {
  
  /**
    * The array of name/value custom data strings to add to a document. Custom document field information is returned in the status,
    * but otherwise is not used by DocuSign. The array contains the following elements:
    *
    * * `name` - A string that can be a maximum of 50 characters.
    * * `value` - A string that can be a maximum of 200 characters.
    *
    * **Important**: If you are using XML, the name/value pair is contained in a `nameValue` element.
    *
    */
  var documentFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
}
object TemplateDocumentFields {
  
  @scala.inline
  def apply(): TemplateDocumentFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocumentFields]
  }
  
  @scala.inline
  implicit class TemplateDocumentFieldsOps[Self <: TemplateDocumentFields] (val x: Self) extends AnyVal {
    
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

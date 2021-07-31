package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateDocumentFields extends StObject {
  
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
  ] = js.undefined
}
object TemplateDocumentFields {
  
  @scala.inline
  def apply(): TemplateDocumentFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocumentFields]
  }
  
  @scala.inline
  implicit class TemplateDocumentFieldsMutableBuilder[Self <: TemplateDocumentFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentFields(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "documentFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFieldsUndefined: Self = StObject.set(x, "documentFields", js.undefined)
    
    @scala.inline
    def setDocumentFieldsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "documentFields", js.Array(value :_*))
  }
}

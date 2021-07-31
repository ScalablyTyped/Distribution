package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeDocumentFields extends StObject {
  
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
  ] = js.undefined
}
object EnvelopeDocumentFields {
  
  @scala.inline
  def apply(): EnvelopeDocumentFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocumentFields]
  }
  
  @scala.inline
  implicit class EnvelopeDocumentFieldsMutableBuilder[Self <: EnvelopeDocumentFields] (val x: Self) extends AnyVal {
    
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

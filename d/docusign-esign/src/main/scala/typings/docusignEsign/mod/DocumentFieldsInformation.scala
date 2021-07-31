package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFieldsInformation extends StObject {
  
  var documentFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
}
object DocumentFieldsInformation {
  
  @scala.inline
  def apply(): DocumentFieldsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFieldsInformation]
  }
  
  @scala.inline
  implicit class DocumentFieldsInformationMutableBuilder[Self <: DocumentFieldsInformation] (val x: Self) extends AnyVal {
    
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

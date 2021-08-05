package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateDocumentVisibilityList extends StObject {
  
  /**
    * An array of `documentVisibility` objects that specifies which documents are visible to which recipients.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.undefined
}
object TemplateDocumentVisibilityList {
  
  inline def apply(): TemplateDocumentVisibilityList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocumentVisibilityList]
  }
  
  extension [Self <: TemplateDocumentVisibilityList](x: Self) {
    
    inline def setDocumentVisibility(
      value: js.Array[
          /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
        ]
    ): Self = StObject.set(x, "documentVisibility", value.asInstanceOf[js.Any])
    
    inline def setDocumentVisibilityUndefined: Self = StObject.set(x, "documentVisibility", js.undefined)
    
    inline def setDocumentVisibilityVarargs(
      value: (/* This object configures a recipient's read/write access to a document. */ DocumentVisibility)*
    ): Self = StObject.set(x, "documentVisibility", js.Array(value :_*))
  }
}

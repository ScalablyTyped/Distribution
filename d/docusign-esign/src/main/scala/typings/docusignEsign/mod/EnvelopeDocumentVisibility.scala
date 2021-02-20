package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeDocumentVisibility extends StObject {
  
  /**
    * An array of `documentVisibility` objects that specifies which documents are visible to which recipients.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.native
}
object EnvelopeDocumentVisibility {
  
  @scala.inline
  def apply(): EnvelopeDocumentVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocumentVisibility]
  }
  
  @scala.inline
  implicit class EnvelopeDocumentVisibilityMutableBuilder[Self <: EnvelopeDocumentVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVisibility(
      value: js.Array[
          /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
        ]
    ): Self = StObject.set(x, "documentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVisibilityUndefined: Self = StObject.set(x, "documentVisibility", js.undefined)
    
    @scala.inline
    def setDocumentVisibilityVarargs(
      value: (/* This object configures a recipient's read/write access to a document. */ DocumentVisibility)*
    ): Self = StObject.set(x, "documentVisibility", js.Array(value :_*))
  }
}

package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Document referenced
  */
@js.native
trait DocumentReferenceContent extends BackboneElement {
  
  /**
    * Where to access the document
    */
  var attachment: Attachment = js.native
  
  /**
    * Format/content rules for the document
    */
  var format: js.UndefOr[Coding] = js.native
}
object DocumentReferenceContent {
  
  @scala.inline
  def apply(attachment: Attachment): DocumentReferenceContent = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceContent]
  }
  
  @scala.inline
  implicit class DocumentReferenceContentMutableBuilder[Self <: DocumentReferenceContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Coding): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}

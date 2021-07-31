package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerTemplate extends StObject {
  
  var sequence: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object ServerTemplate {
  
  @scala.inline
  def apply(): ServerTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerTemplate]
  }
  
  @scala.inline
  implicit class ServerTemplateMutableBuilder[Self <: ServerTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}

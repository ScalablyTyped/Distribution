package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateInformation extends StObject {
  
  /**
    * An array of `templateSummary` objects that contain information about templates.
    */
  var templates: js.UndefOr[js.Array[/* Summary of a template request. */ TemplateSummary]] = js.undefined
}
object TemplateInformation {
  
  @scala.inline
  def apply(): TemplateInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateInformation]
  }
  
  @scala.inline
  implicit class TemplateInformationMutableBuilder[Self <: TemplateInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplates(value: js.Array[/* Summary of a template request. */ TemplateSummary]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: (/* Summary of a template request. */ TemplateSummary)*): Self = StObject.set(x, "templates", js.Array(value :_*))
  }
}

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
  
  inline def apply(): TemplateInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateInformation]
  }
  
  extension [Self <: TemplateInformation](x: Self) {
    
    inline def setTemplates(value: js.Array[/* Summary of a template request. */ TemplateSummary]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: (/* Summary of a template request. */ TemplateSummary)*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}

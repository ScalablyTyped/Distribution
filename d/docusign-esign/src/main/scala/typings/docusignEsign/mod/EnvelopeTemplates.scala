package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeTemplates extends StObject {
  
  /**
    * An array of `templateSummary` objects that contain information about templates.
    */
  var templates: js.UndefOr[js.Array[/* Summary of a template request. */ TemplateSummary]] = js.undefined
}
object EnvelopeTemplates {
  
  inline def apply(): EnvelopeTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTemplates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopeTemplates] (val x: Self) extends AnyVal {
    
    inline def setTemplates(value: js.Array[/* Summary of a template request. */ TemplateSummary]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: (/* Summary of a template request. */ TemplateSummary)*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}

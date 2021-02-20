package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeTemplates extends StObject {
  
  /**
    * An array of `templateSummary` objects that contain information about templates.
    */
  var templates: js.UndefOr[js.Array[/* Summary of a template request. */ TemplateSummary]] = js.native
}
object EnvelopeTemplates {
  
  @scala.inline
  def apply(): EnvelopeTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTemplates]
  }
  
  @scala.inline
  implicit class EnvelopeTemplatesMutableBuilder[Self <: EnvelopeTemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplates(value: js.Array[/* Summary of a template request. */ TemplateSummary]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: (/* Summary of a template request. */ TemplateSummary)*): Self = StObject.set(x, "templates", js.Array(value :_*))
  }
}

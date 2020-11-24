package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeTemplates extends js.Object {
  
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
  implicit class EnvelopeTemplatesOps[Self <: EnvelopeTemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTemplatesVarargs(value: (/* Summary of a template request. */ TemplateSummary)*): Self = this.set("templates", js.Array(value :_*))
    
    @scala.inline
    def setTemplates(value: js.Array[/* Summary of a template request. */ TemplateSummary]): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
}

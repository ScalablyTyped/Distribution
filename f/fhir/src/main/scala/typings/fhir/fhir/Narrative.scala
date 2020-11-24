package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A human-readable formatted text, including images
  */
@js.native
trait Narrative extends Element {
  
  /**
    * Contains extended information for property 'div'.
    */
  var _div: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Limited xhtml content
    */
  var div: String = js.native
  
  /**
    * generated | extensions | additional | empty
    */
  var status: code = js.native
}
object Narrative {
  
  @scala.inline
  def apply(div: String, status: code): Narrative = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Narrative]
  }
  
  @scala.inline
  implicit class NarrativeOps[Self <: Narrative] (val x: Self) extends AnyVal {
    
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
    def setDiv(value: String): Self = this.set("div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_div(value: Element): Self = this.set("_div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_div: Self = this.set("_div", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
  }
}

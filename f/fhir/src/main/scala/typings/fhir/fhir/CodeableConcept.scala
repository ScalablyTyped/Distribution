package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concept - reference to a terminology or just  text
  */
@js.native
trait CodeableConcept extends Element {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Code defined by a terminology system
    */
  var coding: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Plain text representation of the concept
    */
  var text: js.UndefOr[String] = js.native
}
object CodeableConcept {
  
  @scala.inline
  def apply(): CodeableConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeableConcept]
  }
  
  @scala.inline
  implicit class CodeableConceptOps[Self <: CodeableConcept] (val x: Self) extends AnyVal {
    
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
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    
    @scala.inline
    def setCodingVarargs(value: Coding*): Self = this.set("coding", js.Array(value :_*))
    
    @scala.inline
    def setCoding(value: js.Array[Coding]): Self = this.set("coding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoding: Self = this.set("coding", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}

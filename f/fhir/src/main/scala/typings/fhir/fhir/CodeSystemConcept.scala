package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concepts in the code system
  */
@js.native
trait CodeSystemConcept extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Code that identifies concept
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Child Concepts (is-a/contains/categorizes)
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.native
  
  /**
    * Formal definition
    */
  var definition: js.UndefOr[String] = js.native
  
  /**
    * Additional representations for the concept
    */
  var designation: js.UndefOr[js.Array[CodeSystemConceptDesignation]] = js.native
  
  /**
    * Text to display to the user
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * Property value for the concept
    */
  var property: js.UndefOr[js.Array[CodeSystemConceptProperty]] = js.native
}
object CodeSystemConcept {
  
  @scala.inline
  def apply(code: code): CodeSystemConcept = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConcept]
  }
  
  @scala.inline
  implicit class CodeSystemConceptOps[Self <: CodeSystemConcept] (val x: Self) extends AnyVal {
    
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_definition(value: Element): Self = this.set("_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_definition: Self = this.set("_definition", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    
    @scala.inline
    def setConceptVarargs(value: CodeSystemConcept*): Self = this.set("concept", js.Array(value :_*))
    
    @scala.inline
    def setConcept(value: js.Array[CodeSystemConcept]): Self = this.set("concept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcept: Self = this.set("concept", js.undefined)
    
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setDesignationVarargs(value: CodeSystemConceptDesignation*): Self = this.set("designation", js.Array(value :_*))
    
    @scala.inline
    def setDesignation(value: js.Array[CodeSystemConceptDesignation]): Self = this.set("designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesignation: Self = this.set("designation", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setPropertyVarargs(value: CodeSystemConceptProperty*): Self = this.set("property", js.Array(value :_*))
    
    @scala.inline
    def setProperty(value: js.Array[CodeSystemConceptProperty]): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
}

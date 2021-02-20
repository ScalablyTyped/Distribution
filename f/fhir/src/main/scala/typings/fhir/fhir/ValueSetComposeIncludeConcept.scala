package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A concept defined in the system
  */
@js.native
trait ValueSetComposeIncludeConcept extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Code or expression from system
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Additional representations for this concept
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.native
  
  /**
    * Text to display for this code for this value set in this valueset
    */
  var display: js.UndefOr[String] = js.native
}
object ValueSetComposeIncludeConcept {
  
  @scala.inline
  def apply(code: code): ValueSetComposeIncludeConcept = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeConcept]
  }
  
  @scala.inline
  implicit class ValueSetComposeIncludeConceptMutableBuilder[Self <: ValueSetComposeIncludeConcept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignation(value: js.Array[ValueSetComposeIncludeConceptDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    @scala.inline
    def setDesignationVarargs(value: ValueSetComposeIncludeConceptDesignation*): Self = StObject.set(x, "designation", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
  }
}

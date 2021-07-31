package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What operations are supported?
  */
trait CapabilityStatementRestInteraction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * transaction | batch | search-system | history-system
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Anything special about operation behavior
    */
  var documentation: js.UndefOr[String] = js.undefined
}
object CapabilityStatementRestInteraction {
  
  @scala.inline
  def apply(code: code): CapabilityStatementRestInteraction = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestInteraction]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestInteractionMutableBuilder[Self <: CapabilityStatementRestInteraction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
  }
}

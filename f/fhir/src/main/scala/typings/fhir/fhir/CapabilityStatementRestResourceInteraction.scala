package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What operations are supported?
  */
@js.native
trait CapabilityStatementRestResourceInteraction extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * read | vread | update | patch | delete | history-instance | history-type | create | search-type
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Anything special about operation behavior
    */
  var documentation: js.UndefOr[String] = js.native
}
object CapabilityStatementRestResourceInteraction {
  
  @scala.inline
  def apply(code: code): CapabilityStatementRestResourceInteraction = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResourceInteraction]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestResourceInteractionMutableBuilder[Self <: CapabilityStatementRestResourceInteraction] (val x: Self) extends AnyVal {
    
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

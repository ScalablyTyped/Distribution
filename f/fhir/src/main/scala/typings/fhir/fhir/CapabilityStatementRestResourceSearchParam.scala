package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search parameters supported by implementation
  */
@js.native
trait CapabilityStatementRestResourceSearchParam extends BackboneElement {
  
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Source of definition for parameter
    */
  var definition: js.UndefOr[uri] = js.native
  
  /**
    * Server-specific usage
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Name of search parameter
    */
  var name: String = js.native
  
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var `type`: code = js.native
}
object CapabilityStatementRestResourceSearchParam {
  
  @scala.inline
  def apply(name: String, `type`: code): CapabilityStatementRestResourceSearchParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResourceSearchParam]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestResourceSearchParamMutableBuilder[Self <: CapabilityStatementRestResourceSearchParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: uri): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}

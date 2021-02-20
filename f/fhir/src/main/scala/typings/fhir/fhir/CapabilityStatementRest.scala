package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If the endpoint is a RESTful one
  */
@js.native
trait CapabilityStatementRest extends BackboneElement {
  
  /**
    * Contains extended information for property 'compartment'.
    */
  var _compartment: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  
  /**
    * Compartments served/used by system
    */
  var compartment: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * General description of implementation
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * What operations are supported?
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestInteraction]] = js.native
  
  /**
    * client | server
    */
  var mode: code = js.native
  
  /**
    * Definition of an operation or a custom query
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestOperation]] = js.native
  
  /**
    * Resource served on the REST interface
    */
  var resource: js.UndefOr[js.Array[CapabilityStatementRestResource]] = js.native
  
  /**
    * Search parameters for searching all resources
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.native
  
  /**
    * Information about security of implementation
    */
  var security: js.UndefOr[CapabilityStatementRestSecurity] = js.native
}
object CapabilityStatementRest {
  
  @scala.inline
  def apply(mode: code): CapabilityStatementRest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRest]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestMutableBuilder[Self <: CapabilityStatementRest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompartment(value: js.Array[uri]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    @scala.inline
    def setCompartmentVarargs(value: uri*): Self = StObject.set(x, "compartment", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setInteraction(value: js.Array[CapabilityStatementRestInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    @scala.inline
    def setInteractionVarargs(value: CapabilityStatementRestInteraction*): Self = StObject.set(x, "interaction", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: js.Array[CapabilityStatementRestOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setOperationVarargs(value: CapabilityStatementRestOperation*): Self = StObject.set(x, "operation", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: js.Array[CapabilityStatementRestResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: CapabilityStatementRestResource*): Self = StObject.set(x, "resource", js.Array(value :_*))
    
    @scala.inline
    def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    @scala.inline
    def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: CapabilityStatementRestSecurity): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def set_compartment(value: js.Array[Element]): Self = StObject.set(x, "_compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_compartmentUndefined: Self = StObject.set(x, "_compartment", js.undefined)
    
    @scala.inline
    def set_compartmentVarargs(value: Element*): Self = StObject.set(x, "_compartment", js.Array(value :_*))
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}

package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If the endpoint is a RESTful one
  */
trait CapabilityStatementRest
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'compartment'.
    */
  var _compartment: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Compartments served/used by system
    */
  var compartment: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * General description of implementation
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * What operations are supported?
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestInteraction]] = js.undefined
  
  /**
    * client | server
    */
  var mode: code
  
  /**
    * Definition of an operation or a custom query
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestOperation]] = js.undefined
  
  /**
    * Resource served on the REST interface
    */
  var resource: js.UndefOr[js.Array[CapabilityStatementRestResource]] = js.undefined
  
  /**
    * Search parameters for searching all resources
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  
  /**
    * Information about security of implementation
    */
  var security: js.UndefOr[CapabilityStatementRestSecurity] = js.undefined
}
object CapabilityStatementRest {
  
  inline def apply(mode: code): CapabilityStatementRest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRest]
  }
  
  extension [Self <: CapabilityStatementRest](x: Self) {
    
    inline def setCompartment(value: js.Array[uri]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setCompartmentVarargs(value: uri*): Self = StObject.set(x, "compartment", js.Array(value :_*))
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setInteraction(value: js.Array[CapabilityStatementRestInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setInteractionVarargs(value: CapabilityStatementRestInteraction*): Self = StObject.set(x, "interaction", js.Array(value :_*))
    
    inline def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: js.Array[CapabilityStatementRestOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: CapabilityStatementRestOperation*): Self = StObject.set(x, "operation", js.Array(value :_*))
    
    inline def setResource(value: js.Array[CapabilityStatementRestResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: CapabilityStatementRestResource*): Self = StObject.set(x, "resource", js.Array(value :_*))
    
    inline def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value :_*))
    
    inline def setSecurity(value: CapabilityStatementRestSecurity): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def set_compartment(value: js.Array[Element]): Self = StObject.set(x, "_compartment", value.asInstanceOf[js.Any])
    
    inline def set_compartmentUndefined: Self = StObject.set(x, "_compartment", js.undefined)
    
    inline def set_compartmentVarargs(value: Element*): Self = StObject.set(x, "_compartment", js.Array(value :_*))
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}

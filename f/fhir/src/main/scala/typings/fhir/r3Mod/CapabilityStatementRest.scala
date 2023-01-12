package typings.fhir.r3Mod

import typings.fhir.fhirStrings.client
import typings.fhir.fhirStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementRest
  extends StObject
     with BackboneElement {
  
  var _compartment: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * At present, the only defined compartments are at [CompartmentDefinition](compartmentdefinition.html).
    */
  var compartment: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Information about the system's restful capabilities that apply across all applications, such as security.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * A specification of restful operations supported by the system.
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestInteraction]] = js.undefined
  
  /**
    * Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
    */
  var mode: client | server
  
  /**
    * Definition of an operation or a named query together with its parameters and their meaning and type.
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestOperation]] = js.undefined
  
  /**
    * Max of one repetition per resource type.
    */
  var resource: js.UndefOr[js.Array[CapabilityStatementRestResource]] = js.undefined
  
  /**
    * Typically, the only search parameters supported for all searchse are those that apply to all resources - tags, profiles, text search etc.
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  
  /**
    * Information about security implementation from an interface perspective - what a client needs to know.
    */
  var security: js.UndefOr[CapabilityStatementRestSecurity] = js.undefined
}
object CapabilityStatementRest {
  
  inline def apply(mode: client | server): CapabilityStatementRest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityStatementRest] (val x: Self) extends AnyVal {
    
    inline def setCompartment(value: js.Array[String]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setCompartmentVarargs(value: String*): Self = StObject.set(x, "compartment", js.Array(value*))
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setInteraction(value: js.Array[CapabilityStatementRestInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setInteractionVarargs(value: CapabilityStatementRestInteraction*): Self = StObject.set(x, "interaction", js.Array(value*))
    
    inline def setMode(value: client | server): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: js.Array[CapabilityStatementRestOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: CapabilityStatementRestOperation*): Self = StObject.set(x, "operation", js.Array(value*))
    
    inline def setResource(value: js.Array[CapabilityStatementRestResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: CapabilityStatementRestResource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value*))
    
    inline def setSecurity(value: CapabilityStatementRestSecurity): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def set_compartment(value: js.Array[Element]): Self = StObject.set(x, "_compartment", value.asInstanceOf[js.Any])
    
    inline def set_compartmentUndefined: Self = StObject.set(x, "_compartment", js.undefined)
    
    inline def set_compartmentVarargs(value: Element*): Self = StObject.set(x, "_compartment", js.Array(value*))
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}

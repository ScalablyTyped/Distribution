package typings.fhir.mod

import typings.fhir.fhirStrings.`not-supported`
import typings.fhir.fhirStrings.batch
import typings.fhir.fhirStrings.both
import typings.fhir.fhirStrings.client
import typings.fhir.fhirStrings.server
import typings.fhir.fhirStrings.transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceRest
  extends StObject
     with BackboneElement {
  
  var _compartment: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _transactionMode: js.UndefOr[Element] = js.undefined
  
  /**
    * An absolute URI which is a reference to the definition of a compartment hosted by the system.
    */
  var compartment: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Information about the system's restful capabilities that apply across all applications, such as security.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * A specification of restful operations supported by the system.
    */
  var interaction: js.UndefOr[js.Array[ConformanceRestInteraction]] = js.undefined
  
  /**
    * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
    */
  var mode: client | server
  
  /**
    * Definition of an operation or a named query and with its parameters and their meaning and type.
    */
  var operation: js.UndefOr[js.Array[ConformanceRestOperation]] = js.undefined
  
  /**
    * A specification of the restful capabilities of the solution for a specific resource type.
    */
  var resource: js.Array[ConformanceRestResource]
  
  /**
    * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
    */
  var searchParam: js.UndefOr[js.Array[ConformanceRestResourceSearchParam]] = js.undefined
  
  /**
    * Information about security implementation from an interface perspective - what a client needs to know.
    */
  var security: js.UndefOr[ConformanceRestSecurity] = js.undefined
  
  /**
    * A code that indicates how transactions are supported.
    */
  var transactionMode: js.UndefOr[`not-supported` | batch | transaction | both] = js.undefined
}
object ConformanceRest {
  
  inline def apply(mode: client | server, resource: js.Array[ConformanceRestResource]): ConformanceRest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceRest]
  }
  
  extension [Self <: ConformanceRest](x: Self) {
    
    inline def setCompartment(value: js.Array[String]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setCompartmentVarargs(value: String*): Self = StObject.set(x, "compartment", js.Array(value*))
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setInteraction(value: js.Array[ConformanceRestInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setInteractionVarargs(value: ConformanceRestInteraction*): Self = StObject.set(x, "interaction", js.Array(value*))
    
    inline def setMode(value: client | server): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: js.Array[ConformanceRestOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: ConformanceRestOperation*): Self = StObject.set(x, "operation", js.Array(value*))
    
    inline def setResource(value: js.Array[ConformanceRestResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceVarargs(value: ConformanceRestResource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setSearchParam(value: js.Array[ConformanceRestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: ConformanceRestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value*))
    
    inline def setSecurity(value: ConformanceRestSecurity): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setTransactionMode(value: `not-supported` | batch | transaction | both): Self = StObject.set(x, "transactionMode", value.asInstanceOf[js.Any])
    
    inline def setTransactionModeUndefined: Self = StObject.set(x, "transactionMode", js.undefined)
    
    inline def set_compartment(value: js.Array[Element]): Self = StObject.set(x, "_compartment", value.asInstanceOf[js.Any])
    
    inline def set_compartmentUndefined: Self = StObject.set(x, "_compartment", js.undefined)
    
    inline def set_compartmentVarargs(value: Element*): Self = StObject.set(x, "_compartment", js.Array(value*))
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_transactionMode(value: Element): Self = StObject.set(x, "_transactionMode", value.asInstanceOf[js.Any])
    
    inline def set_transactionModeUndefined: Self = StObject.set(x, "_transactionMode", js.undefined)
  }
}

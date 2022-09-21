package typings.fhir.r5Mod

import typings.fhir.fhirStrings.client
import typings.fhir.fhirStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatement2Rest
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
    * A statement that affirms support for a feature.
    */
  var feature: js.UndefOr[js.Array[CapabilityStatement2RestFeature]] = js.undefined
  
  /**
    * A specification of restful operations supported by the system.
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatement2RestInteraction]] = js.undefined
  
  /**
    * Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
    */
  var mode: client | server
  
  /**
    * CapabilityStatement2.rest.operation is for operations invoked at the system level, or for operations that are supported across multiple resource types. Operations linked from CapabilityStatement2.rest.operation must have OperationDefinition.system = true, or more than one Operation.resource.
    */
  var operation: js.UndefOr[js.Array[CapabilityStatement2RestResourceOperation]] = js.undefined
  
  /**
    * Max of one repetition per resource type.
    */
  var resource: js.UndefOr[js.Array[CapabilityStatement2RestResource]] = js.undefined
  
  /**
    * Typically, the only search parameters supported for all searches are those that apply to all resources - tags, profiles, text search etc. These search parameters should include the control search parameters such as _sort, _count, etc. that also apply to this resource (though many will be listed at [CapabilityStatement2.rest.searchParam](capabilitystatement2-definitions.html#CapabilityStatement2.rest.searchParam)). The behavior of some search parameters may be further described by other code or extension elements, or narrative within the capability statement or linked [SearchParameter](searchparameter.html#) definitions.
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatement2RestResourceSearchParam]] = js.undefined
}
object CapabilityStatement2Rest {
  
  inline def apply(mode: client | server): CapabilityStatement2Rest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatement2Rest]
  }
  
  extension [Self <: CapabilityStatement2Rest](x: Self) {
    
    inline def setCompartment(value: js.Array[String]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setCompartmentVarargs(value: String*): Self = StObject.set(x, "compartment", js.Array(value*))
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setFeature(value: js.Array[CapabilityStatement2RestFeature]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setFeatureVarargs(value: CapabilityStatement2RestFeature*): Self = StObject.set(x, "feature", js.Array(value*))
    
    inline def setInteraction(value: js.Array[CapabilityStatement2RestInteraction]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setInteractionVarargs(value: CapabilityStatement2RestInteraction*): Self = StObject.set(x, "interaction", js.Array(value*))
    
    inline def setMode(value: client | server): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: js.Array[CapabilityStatement2RestResourceOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: CapabilityStatement2RestResourceOperation*): Self = StObject.set(x, "operation", js.Array(value*))
    
    inline def setResource(value: js.Array[CapabilityStatement2RestResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: CapabilityStatement2RestResource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setSearchParam(value: js.Array[CapabilityStatement2RestResourceSearchParam]): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setSearchParamVarargs(value: CapabilityStatement2RestResourceSearchParam*): Self = StObject.set(x, "searchParam", js.Array(value*))
    
    inline def set_compartment(value: js.Array[Element]): Self = StObject.set(x, "_compartment", value.asInstanceOf[js.Any])
    
    inline def set_compartmentUndefined: Self = StObject.set(x, "_compartment", js.undefined)
    
    inline def set_compartmentVarargs(value: Element*): Self = StObject.set(x, "_compartment", js.Array(value*))
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}

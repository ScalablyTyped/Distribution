package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptMetadataCapability
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _link: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _required: js.UndefOr[Element] = js.undefined
  
  var _validated: js.UndefOr[Element] = js.undefined
  
  /**
    * Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.
    */
  var conformance: Reference
  
  /**
    * Description of the capabilities that this test script is requiring the server to support.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Which server these requirements apply to.
    */
  var destination: js.UndefOr[Double] = js.undefined
  
  /**
    * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
    */
  var link: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
    */
  var validated: js.UndefOr[Boolean] = js.undefined
}
object TestScriptMetadataCapability {
  
  inline def apply(conformance: Reference): TestScriptMetadataCapability = {
    val __obj = js.Dynamic.literal(conformance = conformance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadataCapability]
  }
  
  extension [Self <: TestScriptMetadataCapability](x: Self) {
    
    inline def setConformance(value: Reference): Self = StObject.set(x, "conformance", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setLink(value: js.Array[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: String*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    inline def setValidatedUndefined: Self = StObject.set(x, "validated", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_link(value: js.Array[Element]): Self = StObject.set(x, "_link", value.asInstanceOf[js.Any])
    
    inline def set_linkUndefined: Self = StObject.set(x, "_link", js.undefined)
    
    inline def set_linkVarargs(value: Element*): Self = StObject.set(x, "_link", js.Array(value*))
    
    inline def set_required(value: Element): Self = StObject.set(x, "_required", value.asInstanceOf[js.Any])
    
    inline def set_requiredUndefined: Self = StObject.set(x, "_required", js.undefined)
    
    inline def set_validated(value: Element): Self = StObject.set(x, "_validated", value.asInstanceOf[js.Any])
    
    inline def set_validatedUndefined: Self = StObject.set(x, "_validated", js.undefined)
  }
}

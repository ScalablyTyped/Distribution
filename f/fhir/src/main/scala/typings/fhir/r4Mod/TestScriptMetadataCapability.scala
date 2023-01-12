package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptMetadataCapability
  extends StObject
     with BackboneElement {
  
  var _capabilities: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _link: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _required: js.UndefOr[Element] = js.undefined
  
  var _validated: js.UndefOr[Element] = js.undefined
  
  /**
    * The conformance statement of the server has to contain at a minimum the contents of the reference pointed to by this element.
    */
  var capabilities: String
  
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
    * Which origin server these requirements apply to.
    */
  var origin: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
    */
  var required: Boolean
  
  /**
    * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
    */
  var validated: Boolean
}
object TestScriptMetadataCapability {
  
  inline def apply(capabilities: String, required: Boolean, validated: Boolean): TestScriptMetadataCapability = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadataCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptMetadataCapability] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: String): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setLink(value: js.Array[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: String*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setOrigin(value: js.Array[Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    inline def set_capabilities(value: Element): Self = StObject.set(x, "_capabilities", value.asInstanceOf[js.Any])
    
    inline def set_capabilitiesUndefined: Self = StObject.set(x, "_capabilities", js.undefined)
    
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

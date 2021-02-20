package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Capabilities  that are assumed to function correctly on the FHIR server being tested
  */
@js.native
trait TestScriptMetadataCapability extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'link'.
    */
  var _link: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'validated'.
    */
  var _validated: js.UndefOr[Element] = js.native
  
  /**
    * Required Capability Statement
    */
  var capabilities: Reference = js.native
  
  /**
    * The expected capabilities of the server
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Which server these requirements apply to
    */
  var destination: js.UndefOr[integer] = js.native
  
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * Which origin server these requirements apply to
    */
  var origin: js.UndefOr[js.Array[integer]] = js.native
  
  /**
    * Are the capabilities required?
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * Are the capabilities validated?
    */
  var validated: js.UndefOr[Boolean] = js.native
}
object TestScriptMetadataCapability {
  
  @scala.inline
  def apply(capabilities: Reference): TestScriptMetadataCapability = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadataCapability]
  }
  
  @scala.inline
  implicit class TestScriptMetadataCapabilityMutableBuilder[Self <: TestScriptMetadataCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: Reference): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestination(value: integer): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setLink(value: js.Array[uri]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: uri*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: js.Array[integer]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOriginVarargs(value: integer*): Self = StObject.set(x, "origin", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatedUndefined: Self = StObject.set(x, "validated", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_destination(value: Element): Self = StObject.set(x, "_destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_destinationUndefined: Self = StObject.set(x, "_destination", js.undefined)
    
    @scala.inline
    def set_link(value: js.Array[Element]): Self = StObject.set(x, "_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_linkUndefined: Self = StObject.set(x, "_link", js.undefined)
    
    @scala.inline
    def set_linkVarargs(value: Element*): Self = StObject.set(x, "_link", js.Array(value :_*))
    
    @scala.inline
    def set_origin(value: js.Array[Element]): Self = StObject.set(x, "_origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_originUndefined: Self = StObject.set(x, "_origin", js.undefined)
    
    @scala.inline
    def set_originVarargs(value: Element*): Self = StObject.set(x, "_origin", js.Array(value :_*))
    
    @scala.inline
    def set_required(value: Element): Self = StObject.set(x, "_required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_requiredUndefined: Self = StObject.set(x, "_required", js.undefined)
    
    @scala.inline
    def set_validated(value: Element): Self = StObject.set(x, "_validated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_validatedUndefined: Self = StObject.set(x, "_validated", js.undefined)
  }
}

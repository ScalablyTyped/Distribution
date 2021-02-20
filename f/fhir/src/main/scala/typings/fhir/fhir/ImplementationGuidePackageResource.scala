package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource in the implementation guide
  */
@js.native
trait ImplementationGuidePackageResource extends BackboneElement {
  
  /**
    * Contains extended information for property 'acronym'.
    */
  var _acronym: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'example'.
    */
  var _example: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sourceUri'.
    */
  var _sourceUri: js.UndefOr[Element] = js.native
  
  /**
    * Short code to identify the resource
    */
  var acronym: js.UndefOr[String] = js.native
  
  /**
    * Reason why included in guide
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * If not an example, has its normal meaning
    */
  var example: Boolean = js.native
  
  /**
    * Resource this is an example of (if applicable)
    */
  var exampleFor: js.UndefOr[Reference] = js.native
  
  /**
    * Human Name for the resource
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Location of the resource
    */
  var sourceReference: js.UndefOr[Reference] = js.native
  
  /**
    * Location of the resource
    */
  var sourceUri: js.UndefOr[uri] = js.native
}
object ImplementationGuidePackageResource {
  
  @scala.inline
  def apply(example: Boolean): ImplementationGuidePackageResource = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePackageResource]
  }
  
  @scala.inline
  implicit class ImplementationGuidePackageResourceMutableBuilder[Self <: ImplementationGuidePackageResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcronym(value: String): Self = StObject.set(x, "acronym", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcronymUndefined: Self = StObject.set(x, "acronym", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExample(value: Boolean): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleFor(value: Reference): Self = StObject.set(x, "exampleFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleForUndefined: Self = StObject.set(x, "exampleFor", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    @scala.inline
    def setSourceUri(value: uri): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    @scala.inline
    def set_acronym(value: Element): Self = StObject.set(x, "_acronym", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_acronymUndefined: Self = StObject.set(x, "_acronym", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_example(value: Element): Self = StObject.set(x, "_example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_exampleUndefined: Self = StObject.set(x, "_example", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_sourceUri(value: Element): Self = StObject.set(x, "_sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUriUndefined: Self = StObject.set(x, "_sourceUri", js.undefined)
  }
}

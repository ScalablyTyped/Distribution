package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideManifestResource
  extends StObject
     with BackboneElement {
  
  var _isExample: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _relativePath: js.UndefOr[Element] = js.undefined
  
  /**
    * If true, indicates the resource is an example instance.
    */
  var isExample: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Examples:
    * * StructureDefinition -> Any
    * * ValueSet -> expansion
    * * OperationDefinition -> Parameters
    * * Questionnaire -> QuestionnaireResponse.
    */
  var profile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Usually this is a relative URL that locates the resource within the implementation guide. If you authoring an implementation guide, and will publish it using the FHIR publication tooling, use a URI that may point to a resource, or to one of various alternative representations (e.g. spreadsheet). The tooling will convert this when it publishes it.
    */
  var reference: Reference
  
  /**
    * Appending 'rendering' + "/" + this should resolve to the resource page.
    */
  var relativePath: js.UndefOr[String] = js.undefined
}
object ImplementationGuideManifestResource {
  
  inline def apply(reference: Reference): ImplementationGuideManifestResource = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideManifestResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideManifestResource] (val x: Self) extends AnyVal {
    
    inline def setIsExample(value: Boolean): Self = StObject.set(x, "isExample", value.asInstanceOf[js.Any])
    
    inline def setIsExampleUndefined: Self = StObject.set(x, "isExample", js.undefined)
    
    inline def setProfile(value: js.Array[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: String*): Self = StObject.set(x, "profile", js.Array(value*))
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def set_isExample(value: Element): Self = StObject.set(x, "_isExample", value.asInstanceOf[js.Any])
    
    inline def set_isExampleUndefined: Self = StObject.set(x, "_isExample", js.undefined)
    
    inline def set_profile(value: js.Array[Element]): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_profileVarargs(value: Element*): Self = StObject.set(x, "_profile", js.Array(value*))
    
    inline def set_relativePath(value: Element): Self = StObject.set(x, "_relativePath", value.asInstanceOf[js.Any])
    
    inline def set_relativePathUndefined: Self = StObject.set(x, "_relativePath", js.undefined)
  }
}

package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideManifestResource
  extends StObject
     with BackboneElement {
  
  var _exampleBoolean: js.UndefOr[Element] = js.undefined
  
  var _exampleCanonical: js.UndefOr[Element] = js.undefined
  
  var _relativePath: js.UndefOr[Element] = js.undefined
  
  /**
    * Typically, conformance resources and knowledge resources are directly part of the implementation guide, with their normal meaning, and patient linked resources are usually examples. However this is not always true.
    */
  var exampleBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Typically, conformance resources and knowledge resources are directly part of the implementation guide, with their normal meaning, and patient linked resources are usually examples. However this is not always true.
    */
  var exampleCanonical: js.UndefOr[String] = js.undefined
  
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
  
  extension [Self <: ImplementationGuideManifestResource](x: Self) {
    
    inline def setExampleBoolean(value: Boolean): Self = StObject.set(x, "exampleBoolean", value.asInstanceOf[js.Any])
    
    inline def setExampleBooleanUndefined: Self = StObject.set(x, "exampleBoolean", js.undefined)
    
    inline def setExampleCanonical(value: String): Self = StObject.set(x, "exampleCanonical", value.asInstanceOf[js.Any])
    
    inline def setExampleCanonicalUndefined: Self = StObject.set(x, "exampleCanonical", js.undefined)
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def set_exampleBoolean(value: Element): Self = StObject.set(x, "_exampleBoolean", value.asInstanceOf[js.Any])
    
    inline def set_exampleBooleanUndefined: Self = StObject.set(x, "_exampleBoolean", js.undefined)
    
    inline def set_exampleCanonical(value: Element): Self = StObject.set(x, "_exampleCanonical", value.asInstanceOf[js.Any])
    
    inline def set_exampleCanonicalUndefined: Self = StObject.set(x, "_exampleCanonical", js.undefined)
    
    inline def set_relativePath(value: Element): Self = StObject.set(x, "_relativePath", value.asInstanceOf[js.Any])
    
    inline def set_relativePathUndefined: Self = StObject.set(x, "_relativePath", js.undefined)
  }
}

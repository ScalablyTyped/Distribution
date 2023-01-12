package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideManifest
  extends StObject
     with BackboneElement {
  
  var _image: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _other: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _rendering: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates a relative path to an image that exists within the IG.
    */
  var image: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.
    */
  var other: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Information about a page within the IG.
    */
  var page: js.UndefOr[js.Array[ImplementationGuideManifestPage]] = js.undefined
  
  /**
    * A pointer to official web page, PDF or other rendering of the implementation guide.
    */
  var rendering: js.UndefOr[String] = js.undefined
  
  /**
    * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
    */
  var resource: js.Array[ImplementationGuideManifestResource]
}
object ImplementationGuideManifest {
  
  inline def apply(resource: js.Array[ImplementationGuideManifestResource]): ImplementationGuideManifest = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideManifest] (val x: Self) extends AnyVal {
    
    inline def setImage(value: js.Array[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: String*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setOther(value: js.Array[String]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setOtherVarargs(value: String*): Self = StObject.set(x, "other", js.Array(value*))
    
    inline def setPage(value: js.Array[ImplementationGuideManifestPage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageVarargs(value: ImplementationGuideManifestPage*): Self = StObject.set(x, "page", js.Array(value*))
    
    inline def setRendering(value: String): Self = StObject.set(x, "rendering", value.asInstanceOf[js.Any])
    
    inline def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    inline def setResource(value: js.Array[ImplementationGuideManifestResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceVarargs(value: ImplementationGuideManifestResource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def set_image(value: js.Array[Element]): Self = StObject.set(x, "_image", value.asInstanceOf[js.Any])
    
    inline def set_imageUndefined: Self = StObject.set(x, "_image", js.undefined)
    
    inline def set_imageVarargs(value: Element*): Self = StObject.set(x, "_image", js.Array(value*))
    
    inline def set_other(value: js.Array[Element]): Self = StObject.set(x, "_other", value.asInstanceOf[js.Any])
    
    inline def set_otherUndefined: Self = StObject.set(x, "_other", js.undefined)
    
    inline def set_otherVarargs(value: Element*): Self = StObject.set(x, "_other", js.Array(value*))
    
    inline def set_rendering(value: Element): Self = StObject.set(x, "_rendering", value.asInstanceOf[js.Any])
    
    inline def set_renderingUndefined: Self = StObject.set(x, "_rendering", js.undefined)
  }
}

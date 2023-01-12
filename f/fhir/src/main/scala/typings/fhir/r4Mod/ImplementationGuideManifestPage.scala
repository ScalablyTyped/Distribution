package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideManifestPage
  extends StObject
     with BackboneElement {
  
  var _anchor: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Appending 'rendering' + "/" + page.name + "#" + page.anchor should resolve to the anchor.
    */
  var anchor: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Appending 'rendering' + "/" + this should resolve to the page.
    */
  var name: String
  
  /**
    * Label for the page intended for human display.
    */
  var title: js.UndefOr[String] = js.undefined
}
object ImplementationGuideManifestPage {
  
  inline def apply(name: String): ImplementationGuideManifestPage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideManifestPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideManifestPage] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: js.Array[String]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnchorVarargs(value: String*): Self = StObject.set(x, "anchor", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_anchor(value: js.Array[Element]): Self = StObject.set(x, "_anchor", value.asInstanceOf[js.Any])
    
    inline def set_anchorUndefined: Self = StObject.set(x, "_anchor", js.undefined)
    
    inline def set_anchorVarargs(value: Element*): Self = StObject.set(x, "_anchor", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}

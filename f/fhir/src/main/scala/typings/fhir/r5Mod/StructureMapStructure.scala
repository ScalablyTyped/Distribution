package typings.fhir.r5Mod

import typings.fhir.fhirStrings.produced
import typings.fhir.fhirStrings.queried
import typings.fhir.fhirStrings.source
import typings.fhir.fhirStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapStructure
  extends StObject
     with BackboneElement {
  
  var _alias: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * This is needed if both types have the same name (e.g. version conversion).
    */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
    * Documentation that describes how the structure is used in the mapping.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * How the referenced structure is used in this mapping.
    */
  var mode: source | queried | target | produced
  
  /**
    * The canonical reference to the structure.
    */
  var url: String
}
object StructureMapStructure {
  
  inline def apply(mode: source | queried | target | produced, url: String): StructureMapStructure = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapStructure]
  }
  
  extension [Self <: StructureMapStructure](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setMode(value: source | queried | target | produced): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_alias(value: Element): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    inline def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}

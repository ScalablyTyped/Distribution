package typings.fhir.r5Mod

import typings.fhir.fhirStrings.generated
import typings.fhir.fhirStrings.html
import typings.fhir.fhirStrings.markdown
import typings.fhir.fhirStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideDefinitionPage
  extends StObject
     with BackboneElement {
  
  var _generation: js.UndefOr[Element] = js.undefined
  
  var _nameUrl: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that indicates how the page is generated.
    */
  var generation: html | markdown | xml | generated
  
  /**
    * The publishing tool will autogenerate source for list (source = n/a) and inject included implementations for include (source = uri of guide to include).
    */
  var nameReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The publishing tool will autogenerate source for list (source = n/a) and inject included implementations for include (source = uri of guide to include).
    */
  var nameUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The implementation guide breadcrumbs may be generated from this structure.
    */
  var page: js.UndefOr[js.Array[ImplementationGuideDefinitionPage]] = js.undefined
  
  /**
    * A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
    */
  var title: String
}
object ImplementationGuideDefinitionPage {
  
  inline def apply(generation: html | markdown | xml | generated, title: String): ImplementationGuideDefinitionPage = {
    val __obj = js.Dynamic.literal(generation = generation.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDefinitionPage]
  }
  
  extension [Self <: ImplementationGuideDefinitionPage](x: Self) {
    
    inline def setGeneration(value: html | markdown | xml | generated): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setNameReference(value: Reference): Self = StObject.set(x, "nameReference", value.asInstanceOf[js.Any])
    
    inline def setNameReferenceUndefined: Self = StObject.set(x, "nameReference", js.undefined)
    
    inline def setNameUrl(value: String): Self = StObject.set(x, "nameUrl", value.asInstanceOf[js.Any])
    
    inline def setNameUrlUndefined: Self = StObject.set(x, "nameUrl", js.undefined)
    
    inline def setPage(value: js.Array[ImplementationGuideDefinitionPage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageVarargs(value: ImplementationGuideDefinitionPage*): Self = StObject.set(x, "page", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def set_generation(value: Element): Self = StObject.set(x, "_generation", value.asInstanceOf[js.Any])
    
    inline def set_generationUndefined: Self = StObject.set(x, "_generation", js.undefined)
    
    inline def set_nameUrl(value: Element): Self = StObject.set(x, "_nameUrl", value.asInstanceOf[js.Any])
    
    inline def set_nameUrlUndefined: Self = StObject.set(x, "_nameUrl", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}

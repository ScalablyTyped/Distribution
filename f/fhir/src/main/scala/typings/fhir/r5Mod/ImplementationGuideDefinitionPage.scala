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
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _sourceMarkdown: js.UndefOr[Element] = js.undefined
  
  var _sourceString: js.UndefOr[Element] = js.undefined
  
  var _sourceUrl: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that indicates how the page is generated.
    */
  var generation: html | markdown | xml | generated
  
  /**
    * This SHALL be a local reference, expressed with respect to the root of the IG output folder.  No suffix is required.  If no suffix is specified, .html will be appended.
    */
  var name: String
  
  /**
    * The implementation guide breadcrumbs may be generated from this structure.
    */
  var page: js.UndefOr[js.Array[ImplementationGuideDefinitionPage]] = js.undefined
  
  /**
    * If absent and the page isn't a generated page, this may be inferred from the page name by checking input locations.  String is used for XHTML content - sent as an escaped string.  FHIR tooling can't support 'direct' XHTML anywhere other than in narrative.
    */
  var sourceMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * If absent and the page isn't a generated page, this may be inferred from the page name by checking input locations.  String is used for XHTML content - sent as an escaped string.  FHIR tooling can't support 'direct' XHTML anywhere other than in narrative.
    */
  var sourceString: js.UndefOr[String] = js.undefined
  
  /**
    * If absent and the page isn't a generated page, this may be inferred from the page name by checking input locations.  String is used for XHTML content - sent as an escaped string.  FHIR tooling can't support 'direct' XHTML anywhere other than in narrative.
    */
  var sourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
    */
  var title: String
}
object ImplementationGuideDefinitionPage {
  
  inline def apply(generation: html | markdown | xml | generated, name: String, title: String): ImplementationGuideDefinitionPage = {
    val __obj = js.Dynamic.literal(generation = generation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDefinitionPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideDefinitionPage] (val x: Self) extends AnyVal {
    
    inline def setGeneration(value: html | markdown | xml | generated): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPage(value: js.Array[ImplementationGuideDefinitionPage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageVarargs(value: ImplementationGuideDefinitionPage*): Self = StObject.set(x, "page", js.Array(value*))
    
    inline def setSourceMarkdown(value: String): Self = StObject.set(x, "sourceMarkdown", value.asInstanceOf[js.Any])
    
    inline def setSourceMarkdownUndefined: Self = StObject.set(x, "sourceMarkdown", js.undefined)
    
    inline def setSourceString(value: String): Self = StObject.set(x, "sourceString", value.asInstanceOf[js.Any])
    
    inline def setSourceStringUndefined: Self = StObject.set(x, "sourceString", js.undefined)
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def set_generation(value: Element): Self = StObject.set(x, "_generation", value.asInstanceOf[js.Any])
    
    inline def set_generationUndefined: Self = StObject.set(x, "_generation", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_sourceMarkdown(value: Element): Self = StObject.set(x, "_sourceMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_sourceMarkdownUndefined: Self = StObject.set(x, "_sourceMarkdown", js.undefined)
    
    inline def set_sourceString(value: Element): Self = StObject.set(x, "_sourceString", value.asInstanceOf[js.Any])
    
    inline def set_sourceStringUndefined: Self = StObject.set(x, "_sourceString", js.undefined)
    
    inline def set_sourceUrl(value: Element): Self = StObject.set(x, "_sourceUrl", value.asInstanceOf[js.Any])
    
    inline def set_sourceUrlUndefined: Self = StObject.set(x, "_sourceUrl", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}

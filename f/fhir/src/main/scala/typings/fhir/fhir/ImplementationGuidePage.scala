package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Page/Section in the Guide
  */
trait ImplementationGuidePage
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'format'.
    */
  var _format: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  
  /**
    * Name of package to include
    */
  @JSName("package")
  var _package: js.UndefOr[js.Array[Element | String]] = js.undefined
  
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Format of the page (e.g. html, markdown, etc.)
    */
  var format: js.UndefOr[code] = js.undefined
  
  /**
    * page | example | list | include | directory | dictionary | toc | resource
    */
  var kind: code
  
  /**
    * Nested Pages / Sections
    */
  var page: js.UndefOr[js.Array[ImplementationGuidePage]] = js.undefined
  
  /**
    * Where to find that page
    */
  var source: uri
  
  /**
    * Short title shown for navigational assistance
    */
  var title: String
  
  /**
    * Kind of resource to include in the list
    */
  var `type`: js.UndefOr[js.Array[code]] = js.undefined
}
object ImplementationGuidePage {
  
  @scala.inline
  def apply(kind: code, source: uri, title: String): ImplementationGuidePage = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePage]
  }
  
  @scala.inline
  implicit class ImplementationGuidePageMutableBuilder[Self <: ImplementationGuidePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: code): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: js.Array[ImplementationGuidePage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPageVarargs(value: ImplementationGuidePage*): Self = StObject.set(x, "page", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Array[code]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: code*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def set_format(value: Element): Self = StObject.set(x, "_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_formatUndefined: Self = StObject.set(x, "_format", js.undefined)
    
    @scala.inline
    def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    @scala.inline
    def set_package(value: js.Array[Element | String]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    
    @scala.inline
    def set_packageVarargs(value: (Element | String)*): Self = StObject.set(x, "package", js.Array(value :_*))
    
    @scala.inline
    def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    @scala.inline
    def set_type(value: js.Array[Element]): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_typeVarargs(value: Element*): Self = StObject.set(x, "_type", js.Array(value :_*))
  }
}

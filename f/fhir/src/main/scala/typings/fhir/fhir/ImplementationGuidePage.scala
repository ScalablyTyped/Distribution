package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Page/Section in the Guide
  */
@js.native
trait ImplementationGuidePage extends BackboneElement {
  
  /**
    * Contains extended information for property 'format'.
    */
  var _format: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.native
  
  /**
    * Name of package to include
    */
  @JSName("package")
  var _package: js.UndefOr[js.Array[Element | String]] = js.native
  
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Format of the page (e.g. html, markdown, etc.)
    */
  var format: js.UndefOr[code] = js.native
  
  /**
    * page | example | list | include | directory | dictionary | toc | resource
    */
  var kind: code = js.native
  
  /**
    * Nested Pages / Sections
    */
  var page: js.UndefOr[js.Array[ImplementationGuidePage]] = js.native
  
  /**
    * Where to find that page
    */
  var source: uri = js.native
  
  /**
    * Short title shown for navigational assistance
    */
  var title: String = js.native
  
  /**
    * Kind of resource to include in the list
    */
  var `type`: js.UndefOr[js.Array[code]] = js.native
}
object ImplementationGuidePage {
  
  @scala.inline
  def apply(kind: code, source: uri, title: String): ImplementationGuidePage = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePage]
  }
  
  @scala.inline
  implicit class ImplementationGuidePageOps[Self <: ImplementationGuidePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: code): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: uri): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_format(value: Element): Self = this.set("_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_format: Self = this.set("_format", js.undefined)
    
    @scala.inline
    def set_kind(value: Element): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_kind: Self = this.set("_kind", js.undefined)
    
    @scala.inline
    def set_packageVarargs(value: (Element | String)*): Self = this.set("package", js.Array(value :_*))
    
    @scala.inline
    def set_package(value: js.Array[Element | String]): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def set_source(value: Element): Self = this.set("_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    
    @scala.inline
    def set_typeVarargs(value: Element*): Self = this.set("_type", js.Array(value :_*))
    
    @scala.inline
    def set_type(value: js.Array[Element]): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def setFormat(value: code): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setPageVarargs(value: ImplementationGuidePage*): Self = this.set("page", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: js.Array[ImplementationGuidePage]): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: code*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[code]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

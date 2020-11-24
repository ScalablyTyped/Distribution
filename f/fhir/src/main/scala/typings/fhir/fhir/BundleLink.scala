package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Links related to this Bundle
  */
@js.native
trait BundleLink extends BackboneElement {
  
  /**
    * Contains extended information for property 'relation'.
    */
  var _relation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1
    */
  var relation: String = js.native
  
  /**
    * Reference details for the link
    */
  var url: uri = js.native
}
object BundleLink {
  
  @scala.inline
  def apply(relation: String, url: uri): BundleLink = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleLink]
  }
  
  @scala.inline
  implicit class BundleLinkOps[Self <: BundleLink] (val x: Self) extends AnyVal {
    
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
    def setRelation(value: String): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_relation(value: Element): Self = this.set("_relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_relation: Self = this.set("_relation", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
  }
}

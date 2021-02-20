package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class BundleLinkMutableBuilder[Self <: BundleLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_relation(value: Element): Self = StObject.set(x, "_relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_relationUndefined: Self = StObject.set(x, "_relation", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}

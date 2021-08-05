package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Links related to this Bundle
  */
trait BundleLink
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'relation'.
    */
  var _relation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1
    */
  var relation: String
  
  /**
    * Reference details for the link
    */
  var url: uri
}
object BundleLink {
  
  inline def apply(relation: String, url: uri): BundleLink = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleLink]
  }
  
  extension [Self <: BundleLink](x: Self) {
    
    inline def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_relation(value: Element): Self = StObject.set(x, "_relation", value.asInstanceOf[js.Any])
    
    inline def set_relationUndefined: Self = StObject.set(x, "_relation", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}

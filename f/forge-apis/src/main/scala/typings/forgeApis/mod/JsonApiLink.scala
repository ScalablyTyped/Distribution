package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonApiLink extends StObject {
  
  var href: String
}
object JsonApiLink {
  
  @scala.inline
  def apply(href: String): JsonApiLink = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonApiLink]
  }
  
  @scala.inline
  implicit class JsonApiLinkMutableBuilder[Self <: JsonApiLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}

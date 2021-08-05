package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaOptions
  extends StObject
     with RequestOptions {
  
  /** HTTP ContentType header value. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** HTTP Slug header value. */
  var slug: js.UndefOr[String] = js.undefined
}
object MediaOptions {
  
  inline def apply(): MediaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaOptions]
  }
  
  extension [Self <: MediaOptions](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
  }
}

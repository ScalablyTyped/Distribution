package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaOptions extends RequestOptions {
  
  /** HTTP ContentType header value. */
  var contentType: js.UndefOr[String] = js.native
  
  /** HTTP Slug header value. */
  var slug: js.UndefOr[String] = js.native
}
object MediaOptions {
  
  @scala.inline
  def apply(): MediaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaOptions]
  }
  
  @scala.inline
  implicit class MediaOptionsMutableBuilder[Self <: MediaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
  }
}

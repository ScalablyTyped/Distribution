package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchInResourceRequest extends StObject {
  
  /**
    * If true, search is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * Frame id for resource to search in.
    */
  var frameId: FrameId = js.native
  
  /**
    * If true, treats string parameter as regex.
    */
  var isRegex: js.UndefOr[Boolean] = js.native
  
  /**
    * String to search for.
    */
  var query: String = js.native
  
  /**
    * URL of the resource to search in.
    */
  var url: String = js.native
}
object SearchInResourceRequest {
  
  @scala.inline
  def apply(frameId: FrameId, query: String, url: String): SearchInResourceRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInResourceRequest]
  }
  
  @scala.inline
  implicit class SearchInResourceRequestMutableBuilder[Self <: SearchInResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRegex(value: Boolean): Self = StObject.set(x, "isRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRegexUndefined: Self = StObject.set(x, "isRegex", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

package typings.electron.Electron

import typings.electron.electronStrings.default
import typings.electron.electronStrings.json
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedURLOptions extends StObject {
  
  /**
    * HTTP request headers.
    *
    * @platform darwin
    */
  var headers: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * Can be `json` or `default`, see the Squirrel.Mac README for more information.
    *
    * @platform darwin
    */
  var serverType: js.UndefOr[json | default] = js.native
  
  var url: String = js.native
}
object FeedURLOptions {
  
  @scala.inline
  def apply(url: String): FeedURLOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedURLOptions]
  }
  
  @scala.inline
  implicit class FeedURLOptionsMutableBuilder[Self <: FeedURLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setServerType(value: json | default): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

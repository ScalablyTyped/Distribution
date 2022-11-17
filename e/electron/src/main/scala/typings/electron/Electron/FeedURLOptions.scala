package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeedURLOptions extends StObject {
  
  /**
    * HTTP request headers.
    *
    * @platform darwin
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Can be `json` or `default`, see the Squirrel.Mac README for more information.
    *
    * @platform darwin
    */
  var serverType: js.UndefOr["json" | "default"] = js.undefined
  
  var url: String
}
object FeedURLOptions {
  
  inline def apply(url: String): FeedURLOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedURLOptions]
  }
  
  extension [Self <: FeedURLOptions](x: Self) {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setServerType(value: "json" | "default"): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

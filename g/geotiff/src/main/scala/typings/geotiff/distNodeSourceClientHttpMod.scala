package typings.geotiff

import typings.geotiff.anon.Typeofhttp
import typings.geotiff.anon.Typeofhttps
import typings.geotiff.distNodeSourceClientBaseMod.BaseClient
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSourceClientHttpMod {
  
  @JSImport("geotiff/dist-node/source/client/http", "HttpClient")
  @js.native
  open class HttpClient protected () extends BaseClient {
    def this(url: Any) = this()
    
    def constructRequest(headers: Any, signal: Any): js.Promise[Any] = js.native
    
    var httpApi: Typeofhttp | Typeofhttps = js.native
    
    var parsedUrl: UrlWithStringQuery = js.native
  }
}

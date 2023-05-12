package typings.geotiff

import typings.geotiff.distModuleSourceClientBaseMod.BaseClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleSourceClientHttpMod {
  
  @JSImport("geotiff/dist-module/source/client/http", "HttpClient")
  @js.native
  open class HttpClient protected () extends BaseClient {
    def this(url: Any) = this()
    
    def constructRequest(headers: Any, signal: Any): js.Promise[Any] = js.native
    
    var httpApi: Any = js.native
    
    var parsedUrl: Any = js.native
  }
}

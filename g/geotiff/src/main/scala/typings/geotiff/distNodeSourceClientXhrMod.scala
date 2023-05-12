package typings.geotiff

import typings.geotiff.distNodeSourceClientBaseMod.BaseClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSourceClientXhrMod {
  
  @JSImport("geotiff/dist-node/source/client/xhr", "XHRClient")
  @js.native
  open class XHRClient protected () extends BaseClient {
    def this(url: Any) = this()
    
    def constructRequest(headers: Any, signal: Any): js.Promise[Any] = js.native
  }
}

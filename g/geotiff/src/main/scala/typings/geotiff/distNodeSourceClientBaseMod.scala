package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSourceClientBaseMod {
  
  @JSImport("geotiff/dist-node/source/client/base", "BaseClient")
  @js.native
  open class BaseClient protected () extends StObject {
    def this(url: Any) = this()
    
    /**
      * Send a request with the options
      * @param {object} [options]
      */
    def request(): js.Promise[Unit] = js.native
    def request(param0: js.Object): js.Promise[Unit] = js.native
    
    var url: Any = js.native
  }
  
  @JSImport("geotiff/dist-node/source/client/base", "BaseResponse")
  @js.native
  open class BaseResponse () extends StObject {
    
    /**
      * @returns {ArrayBuffer} the response data of the request
      */
    def getData(): js.typedarray.ArrayBuffer = js.native
    
    /**
      * Returns the value of the specified header
      * @param {string} headerName the header name
      * @returns {string} the header value
      */
    def getHeader(headerName: String): String = js.native
    
    /**
      * Returns whether the response has an ok'ish status code
      */
    def ok: Boolean = js.native
    
    /**
      * Returns the status code of the response
      */
    def status: Unit = js.native
  }
}

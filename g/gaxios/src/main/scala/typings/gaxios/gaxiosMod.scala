package typings.gaxios

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaxiosMod {
  
  @JSImport("gaxios/build/src/gaxios", "Gaxios")
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  class Gaxios () extends StObject {
    def this(defaults: GaxiosOptions) = this()
    
    var _defaultAdapter: js.Any = js.native
    
    /**
      * Internal, retryable version of the `request` method.
      * @param opts Set of HTTP options that will be used for this HTTP request.
      */
    var _request: js.Any = js.native
    
    var agentCache: js.Any = js.native
    
    /**
      * Default HTTP options that will be used for every HTTP request.
      */
    var defaults: GaxiosOptions = js.native
    
    var getResponseData: js.Any = js.native
    
    /**
      * Encode a set of key/value pars into a querystring format (?foo=bar&baz=boo)
      * @param params key value pars to encode
      */
    var paramsSerializer: js.Any = js.native
    
    /**
      * Perform an HTTP request with the given options.
      * @param opts Set of HTTP options that will be used for this HTTP request.
      */
    def request[T](): GaxiosPromise[T] = js.native
    def request[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    
    var translateResponse: js.Any = js.native
    
    /**
      * Validates the options, and merges them with defaults.
      * @param opts The original options passed from the client.
      */
    var validateOpts: js.Any = js.native
    
    /**
      * By default, throw for any non-2xx status code
      * @param status status code from the HTTP response
      */
    var validateStatus: js.Any = js.native
  }
}

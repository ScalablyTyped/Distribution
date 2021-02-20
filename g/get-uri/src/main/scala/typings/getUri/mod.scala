package typings.getUri

import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-uri", JSImport.Namespace)
  @js.native
  def apply(uri: String): js.Promise[Readable] = js.native
  /**
    * Async function that returns a `stream.Readable` instance to the
    * callback function that will output the contents of the given URI.
    *
    * For caching purposes, you can pass in a `stream` instance from a previous
    * `getUri()` call as a `cache: stream` option, and if the destination has
    * not changed since the last time the endpoint was retreived then the callback
    * will be invoked with an Error object with `code` set to "ENOTMODIFIED" and
    * `null` for the "stream" instance argument. In this case, you can skip
    * retreiving the file again and continue to use the previous payload.
    *
    * @param {String} uri URI to retrieve
    * @param {Object} opts optional "options" object
    * @param {Function} fn callback function
    * @api public
    */
  @JSImport("get-uri", JSImport.Namespace)
  @js.native
  def apply(uri: String, fn: GetUriCallback): Unit = js.native
  @JSImport("get-uri", JSImport.Namespace)
  @js.native
  def apply(uri: String, opts: GetUriOptions): js.Promise[Readable] = js.native
  @JSImport("get-uri", JSImport.Namespace)
  @js.native
  def apply(uri: String, opts: GetUriOptions, fn: GetUriCallback): Unit = js.native
  
  type GetUriCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* res */ js.UndefOr[Readable], Unit]
  
  @js.native
  trait GetUriOptions extends StObject {
    
    var cache: js.UndefOr[Readable] = js.native
  }
  object GetUriOptions {
    
    @scala.inline
    def apply(): GetUriOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetUriOptions]
    }
    
    @scala.inline
    implicit class GetUriOptionsMutableBuilder[Self <: GetUriOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Readable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  type GetUriProtocol = js.Function2[/* parsed */ UrlWithStringQuery, /* opts */ GetUriOptions, js.Promise[Readable]]
}

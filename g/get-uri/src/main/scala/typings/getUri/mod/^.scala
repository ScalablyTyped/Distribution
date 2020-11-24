package typings.getUri.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("get-uri", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply(uri: String, fn: GetUriCallback): Unit = js.native
  def apply(uri: String, opts: GetUriOptions): js.Promise[Readable] = js.native
  def apply(uri: String, opts: GetUriOptions, fn: GetUriCallback): Unit = js.native
}

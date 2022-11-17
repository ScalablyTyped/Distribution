package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingMessage extends EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_end")
  def addListener(event: "end", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_aborted")
  def addListener(event: "aborted", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_data")
  def addListener(event: "data", listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  
  /**
    * A `Record<string, string | string[]>` representing the HTTP response headers.
    * The `headers` object is formatted as follows:
    *
    * * All header names are lowercased.
    * * Duplicates of `age`, `authorization`, `content-length`, `content-type`,
    * `etag`, `expires`, `from`, `host`, `if-modified-since`, `if-unmodified-since`,
    * `last-modified`, `location`, `max-forwards`, `proxy-authorization`, `referer`,
    * `retry-after`, `server`, or `user-agent` are discarded.
    * * `set-cookie` is always an array. Duplicates are added to the array.
    * * For duplicate `cookie` headers, the values are joined together with '; '.
    * * For all other headers, the values are joined together with ', '.
    */
  var headers: Record[String, String | js.Array[String]] = js.native
  
  /**
    * A `string` indicating the HTTP protocol version number. Typical values are '1.0'
    * or '1.1'. Additionally `httpVersionMajor` and `httpVersionMinor` are two
    * Integer-valued readable properties that return respectively the HTTP major and
    * minor version numbers.
    */
  var httpVersion: String = js.native
  
  /**
    * An `Integer` indicating the HTTP protocol major version number.
    */
  var httpVersionMajor: Double = js.native
  
  /**
    * An `Integer` indicating the HTTP protocol minor version number.
    */
  var httpVersionMinor: Double = js.native
  
  /**
    * Indicates that response body has ended. Must be placed before 'data' event.
    */
  @JSName("on")
  @scala.annotation.targetName("on_end")
  def on(event: "end", listener: js.Function): this.type = js.native
  // Docs: https://electronjs.org/docs/api/incoming-message
  /**
    * Emitted when a request has been canceled during an ongoing HTTP transaction.
    */
  @JSName("on")
  @scala.annotation.targetName("on_aborted")
  def on(event: "aborted", listener: js.Function): this.type = js.native
  /**
    * Returns:
    *
    * `error` Error - Typically holds an error string identifying failure root cause.
    *
    * Emitted when an error was encountered while streaming response data events. For
    * instance, if the server closes the underlying while the response is still
    * streaming, an `error` event will be emitted on the response object and a `close`
    * event will subsequently follow on the request object.
    */
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function): this.type = js.native
  /**
    * The `data` event is the usual method of transferring response data into
    * applicative code.
    */
  @JSName("on")
  @scala.annotation.targetName("on_data")
  def on(event: "data", listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_end")
  def once(event: "end", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_aborted")
  def once(event: "aborted", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_data")
  def once(event: "data", listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  
  /**
    * A `string[]` containing the raw HTTP response headers exactly as they were
    * received. The keys and values are in the same list. It is not a list of tuples.
    * So, the even-numbered offsets are key values, and the odd-numbered offsets are
    * the associated values. Header names are not lowercased, and duplicates are not
    * merged.
    */
  var rawHeaders: js.Array[String] = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_error")
  def removeListener(event: "error", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_end")
  def removeListener(event: "end", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_aborted")
  def removeListener(event: "aborted", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_data")
  def removeListener(event: "data", listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  
  /**
    * An `Integer` indicating the HTTP response status code.
    */
  var statusCode: Double = js.native
  
  /**
    * A `string` representing the HTTP status message.
    */
  var statusMessage: String = js.native
}

package typings.fflate.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "Deflate")
@js.native
class Deflate_ () extends js.Object {
  def this(cb: FlateStreamHandler) = this()
  /**
    * Creates a DEFLATE stream
    * @param opts The compression options
    * @param cb The callback to call whenever data is deflated
    */
  def this(opts: DeflateOptions) = this()
  def this(opts: DeflateOptions, cb: FlateStreamHandler) = this()
  
  var d: js.Any = js.native
  
  var o: js.Any = js.native
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(data: Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: FlateStreamHandler = js.native
  
  var p: js.Any = js.native
  
  /**
    * Pushes a chunk to be deflated
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: Uint8Array): Unit = js.native
  def push(chunk: Uint8Array, `final`: Boolean): Unit = js.native
}

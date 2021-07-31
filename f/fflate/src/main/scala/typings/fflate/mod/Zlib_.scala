package typings.fflate.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "Zlib")
@js.native
/**
  * Creates a Zlib stream
  * @param cb The callback to call whenever data is deflated
  */
class Zlib_ () extends StObject {
  def this(cb: FlateStreamHandler) = this()
  /**
    * Creates a Zlib stream
    * @param opts The compression options
    * @param cb The callback to call whenever data is deflated
    */
  def this(opts: ZlibOptions) = this()
  def this(opts: ZlibOptions, cb: FlateStreamHandler) = this()
  
  var c: js.Any = js.native
  
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
    * Pushes a chunk to be zlibbed
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: Uint8Array): Unit = js.native
  def push(chunk: Uint8Array, `final`: Boolean): Unit = js.native
  
  var v: js.Any = js.native
}

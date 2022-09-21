package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "Inflate")
@js.native
/**
  * Creates an inflation stream
  * @param cb The callback to call whenever data is inflated
  */
open class Inflate_ () extends StObject {
  def this(cb: FlateStreamHandler) = this()
  
  /* private */ var c: Any = js.native
  
  /* private */ var d: Any = js.native
  
  /* private */ var e: Any = js.native
  
  /* private */ var o: Any = js.native
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: FlateStreamHandler = js.native
  
  /* private */ var p: Any = js.native
  
  /**
    * Pushes a chunk to be inflated
    * @param chunk The chunk to push
    * @param final Whether this is the final chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Unit = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  /* private */ var s: Any = js.native
}

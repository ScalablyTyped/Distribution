package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnzipDecoder extends StObject {
  
  def ondata(err: Null, data: js.typedarray.Uint8Array, `final`: Boolean): Unit
  /**
    * The handler to call whenever data is available
    */
  def ondata(err: FlateError, data: js.typedarray.Uint8Array, `final`: Boolean): Unit
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler
  
  /**
    * Pushes a chunk to be decompressed
    * @param data The data in this chunk. Do not consume (detach) this data.
    * @param final Whether this is the last chunk in the data stream
    */
  def push(data: js.typedarray.Uint8Array, `final`: Boolean): Unit
  
  /**
    * A method to terminate any internal workers used by the stream. Subsequent
    * calls to push() should silently fail.
    */
  var terminate: js.UndefOr[AsyncTerminable] = js.undefined
}
object UnzipDecoder {
  
  inline def apply(
    ondata: (/* err */ FlateError | Null, /* data */ js.typedarray.Uint8Array, /* final */ Boolean) => Unit,
    push: (js.typedarray.Uint8Array, Boolean) => Unit
  ): UnzipDecoder = {
    val __obj = js.Dynamic.literal(ondata = js.Any.fromFunction3(ondata), push = js.Any.fromFunction2(push))
    __obj.asInstanceOf[UnzipDecoder]
  }
  
  extension [Self <: UnzipDecoder](x: Self) {
    
    inline def setOndata(
      value: (/* err */ FlateError | Null, /* data */ js.typedarray.Uint8Array, /* final */ Boolean) => Unit
    ): Self = StObject.set(x, "ondata", js.Any.fromFunction3(value))
    
    inline def setPush(value: (js.typedarray.Uint8Array, Boolean) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    
    inline def setTerminateUndefined: Self = StObject.set(x, "terminate", js.undefined)
  }
}

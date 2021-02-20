package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputStream extends StObject {
  
  /**
    * Closes the stream, releasing resources related to it. Once the stream is closed, all other operations will fail.
    * Closing a stream multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[Unit] = js.native
  
  def write(data: js.Array[Double]): js.Promise[Double] = js.native
  /**
    * Tries to write `data` to the stream. Returns how many bytes of `data` were written to the stream.
    */
  def write(data: ArrayBuffer): js.Promise[Double] = js.native
  
  def writeAll(data: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Keeps writing to the stream until all of `data` has been written. Premature error or end of stream results in an
    * `Error` object with a `partialSize` property specifying how many bytes of `data` were written to the stream
    * before the error occurred.
    */
  def writeAll(data: ArrayBuffer): js.Promise[Unit] = js.native
  
  /**
    * Tries to write `size` bytes to the stream, reading them from `address`. Returns how many bytes were written
    * to the stream. Premature error or end of stream results in an `Error` object with a `partialSize` property
    * specifying how many bytes of `data` were written to the stream before the error occurred.
    */
  def writeMemoryRegion(address: NativePointerValue, size: Double): js.Promise[Double] = js.native
}

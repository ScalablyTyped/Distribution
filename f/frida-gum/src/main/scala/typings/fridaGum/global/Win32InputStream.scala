package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import typings.fridaGum.NativePointerValue
import typings.fridaGum.WindowsStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input stream backed by a Windows file handle.
  *
  * Only available on Windows.
  */
@JSGlobal("Win32InputStream")
@js.native
open class Win32InputStream protected ()
  extends StObject
     with typings.fridaGum.InputStream {
  /**
    * Creates a new input stream from the specified Windows file handle.
    *
    * @param handle Windows file `HANDLE` to read from.
    * @param options Options to customize the stream.
    */
  def this(handle: NativePointerValue) = this()
  def this(handle: NativePointerValue, options: WindowsStreamOptions) = this()
  
  /**
    * Closes the stream, releasing resources related to it. Once the stream is closed, all other operations will fail.
    * Closing a stream multiple times is allowed and will not result in an error.
    */
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  
  /**
    * Reads up to `size` bytes from the stream. The resulting buffer is up to `size` bytes long. End of stream is
    * signalled through an empty buffer.
    */
  /* CompleteClass */
  override def read(size: Double): js.Promise[ArrayBuffer] = js.native
  
  /**
    * Keeps reading from the stream until exactly `size` bytes have been consumed. The resulting buffer is exactly
    * `size` bytes long. Premature error or end of stream results in an `Error` object with a `partialData` property
    * containing the incomplete data.
    */
  /* CompleteClass */
  override def readAll(size: Double): js.Promise[ArrayBuffer] = js.native
}

package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import typings.fridaGum.WindowsStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output stream backed by a Windows file handle.
  *
  * Only available on Windows.
  */
@JSGlobal("Win32OutputStream")
@js.native
class Win32OutputStream protected ()
  extends typings.fridaGum.OutputStream {
  /**
    * Creates a new output stream from the specified Windows file handle.
    *
    * @param handle Windows file `HANDLE` to write to.
    * @param options Options to customize the stream.
    */
  def this(handle: NativePointerValue) = this()
  def this(handle: NativePointerValue, options: WindowsStreamOptions) = this()
}

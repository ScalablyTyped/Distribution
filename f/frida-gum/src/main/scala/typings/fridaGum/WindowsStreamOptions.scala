package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsStreamOptions extends StObject {
  
  /**
    * Whether the Windows `HANDLE` should be closed when the stream is closed,
    * either through `close()` or future garbage-collection.
    */
  var autoClose: js.UndefOr[Boolean] = js.native
}
object WindowsStreamOptions {
  
  @scala.inline
  def apply(): WindowsStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsStreamOptions]
  }
  
  @scala.inline
  implicit class WindowsStreamOptionsMutableBuilder[Self <: WindowsStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
  }
}

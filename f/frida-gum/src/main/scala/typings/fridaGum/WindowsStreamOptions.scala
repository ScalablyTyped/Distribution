package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsStreamOptions extends StObject {
  
  /**
    * Whether the Windows `HANDLE` should be closed when the stream is closed,
    * either through `close()` or future garbage-collection.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
}
object WindowsStreamOptions {
  
  inline def apply(): WindowsStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsStreamOptions]
  }
  
  extension [Self <: WindowsStreamOptions](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
  }
}

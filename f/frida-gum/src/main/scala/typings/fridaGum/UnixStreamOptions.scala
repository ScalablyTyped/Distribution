package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnixStreamOptions extends StObject {
  
  /**
    * Whether the file descriptor should be closed when the stream is closed,
    * either through `close()` or future garbage-collection.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
}
object UnixStreamOptions {
  
  @scala.inline
  def apply(): UnixStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnixStreamOptions]
  }
  
  @scala.inline
  implicit class UnixStreamOptionsMutableBuilder[Self <: UnixStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
  }
}

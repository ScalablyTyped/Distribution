package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseOpts extends StObject {
  
  /**
    * if true, fire the `beforeunload` event before closing the page. If the page
    * prevents the unload, the WebContents will not be closed. The
    * `will-prevent-unload` will be fired if the page requests prevention of unload.
    */
  var waitForBeforeUnload: Boolean
}
object CloseOpts {
  
  inline def apply(waitForBeforeUnload: Boolean): CloseOpts = {
    val __obj = js.Dynamic.literal(waitForBeforeUnload = waitForBeforeUnload.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseOpts] (val x: Self) extends AnyVal {
    
    inline def setWaitForBeforeUnload(value: Boolean): Self = StObject.set(x, "waitForBeforeUnload", value.asInstanceOf[js.Any])
  }
}

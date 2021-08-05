package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreMouseEventsOptions extends StObject {
  
  /**
    * If true, forwards mouse move messages to Chromium, enabling mouse related events
    * such as `mouseleave`. Only used when `ignore` is true. If `ignore` is false,
    * forwarding is always disabled regardless of this value.
    *
    * @platform darwin,win32
    */
  var forward: js.UndefOr[Boolean] = js.undefined
}
object IgnoreMouseEventsOptions {
  
  inline def apply(): IgnoreMouseEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreMouseEventsOptions]
  }
  
  extension [Self <: IgnoreMouseEventsOptions](x: Self) {
    
    inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
  }
}

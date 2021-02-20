package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreMouseEventsOptions extends StObject {
  
  /**
    * If true, forwards mouse move messages to Chromium, enabling mouse related events
    * such as `mouseleave`. Only used when `ignore` is true. If `ignore` is false,
    * forwarding is always disabled regardless of this value.
    *
    * @platform darwin,win32
    */
  var forward: js.UndefOr[Boolean] = js.native
}
object IgnoreMouseEventsOptions {
  
  @scala.inline
  def apply(): IgnoreMouseEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreMouseEventsOptions]
  }
  
  @scala.inline
  implicit class IgnoreMouseEventsOptionsMutableBuilder[Self <: IgnoreMouseEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
  }
}

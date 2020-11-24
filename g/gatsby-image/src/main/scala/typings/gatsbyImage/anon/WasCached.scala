package typings.gatsbyImage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WasCached extends js.Object {
  
  var wasCached: Boolean = js.native
}
object WasCached {
  
  @scala.inline
  def apply(wasCached: Boolean): WasCached = {
    val __obj = js.Dynamic.literal(wasCached = wasCached.asInstanceOf[js.Any])
    __obj.asInstanceOf[WasCached]
  }
  
  @scala.inline
  implicit class WasCachedOps[Self <: WasCached] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWasCached(value: Boolean): Self = this.set("wasCached", value.asInstanceOf[js.Any])
  }
}

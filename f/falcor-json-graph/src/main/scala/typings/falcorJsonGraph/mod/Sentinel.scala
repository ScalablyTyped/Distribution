package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sentinel extends js.Object {
  
  @JSName("$expires")
  var $expires: js.UndefOr[Double] = js.native
}
object Sentinel {
  
  @scala.inline
  def apply(): Sentinel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sentinel]
  }
  
  @scala.inline
  implicit class SentinelOps[Self <: Sentinel] (val x: Self) extends AnyVal {
    
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
    def set$expires(value: Double): Self = this.set("$expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$expires: Self = this.set("$expires", js.undefined)
  }
}

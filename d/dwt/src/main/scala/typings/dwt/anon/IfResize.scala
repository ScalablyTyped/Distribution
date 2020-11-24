package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfResize extends js.Object {
  
  var ifResize: js.UndefOr[Boolean] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
   // Example: 26,
  var minSize: js.UndefOr[Double] = js.native
}
object IfResize {
  
  @scala.inline
  def apply(): IfResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfResize]
  }
  
  @scala.inline
  implicit class IfResizeOps[Self <: IfResize] (val x: Self) extends AnyVal {
    
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
    def setIfResize(value: Boolean): Self = this.set("ifResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfResize: Self = this.set("ifResize", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
}

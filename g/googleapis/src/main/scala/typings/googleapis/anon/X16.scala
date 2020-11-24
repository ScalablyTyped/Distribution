package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X16 extends js.Object {
  
  var x16: js.UndefOr[String] = js.native
  
  var x32: js.UndefOr[String] = js.native
}
object X16 {
  
  @scala.inline
  def apply(): X16 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X16]
  }
  
  @scala.inline
  implicit class X16Ops[Self <: X16] (val x: Self) extends AnyVal {
    
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
    def setX16(value: String): Self = this.set("x16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX16: Self = this.set("x16", js.undefined)
    
    @scala.inline
    def setX32(value: String): Self = this.set("x32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX32: Self = this.set("x32", js.undefined)
  }
}

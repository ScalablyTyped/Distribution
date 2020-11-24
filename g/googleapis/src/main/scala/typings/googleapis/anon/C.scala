package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait C extends js.Object {
  
  var c: js.UndefOr[js.Array[V]] = js.native
}
object C {
  
  @scala.inline
  def apply(): C = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[C]
  }
  
  @scala.inline
  implicit class COps[Self <: C] (val x: Self) extends AnyVal {
    
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
    def setCVarargs(value: V*): Self = this.set("c", js.Array(value :_*))
    
    @scala.inline
    def setC(value: js.Array[V]): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
  }
}

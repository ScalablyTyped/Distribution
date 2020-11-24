package typings.elasticlunr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tf extends js.Object {
  
  var tf: js.UndefOr[Double] = js.native
}
object Tf {
  
  @scala.inline
  def apply(): Tf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tf]
  }
  
  @scala.inline
  implicit class TfOps[Self <: Tf] (val x: Self) extends AnyVal {
    
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
    def setTf(value: Double): Self = this.set("tf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTf: Self = this.set("tf", js.undefined)
  }
}

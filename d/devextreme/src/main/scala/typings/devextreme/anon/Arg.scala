package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arg extends js.Object {
  
  var arg: js.UndefOr[typings.std.Date | Double | String] = js.native
  
  var `val`: js.UndefOr[typings.std.Date | Double | String] = js.native
}
object Arg {
  
  @scala.inline
  def apply(): Arg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arg]
  }
  
  @scala.inline
  implicit class ArgOps[Self <: Arg] (val x: Self) extends AnyVal {
    
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
    def setArg(value: typings.std.Date | Double | String): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    
    @scala.inline
    def setVal(value: typings.std.Date | Double | String): Self = this.set("val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVal: Self = this.set("val", js.undefined)
  }
}

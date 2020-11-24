package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IForceOptions extends js.Object {
  
  var targets: js.UndefOr[js.Array[_]] = js.native
}
object IForceOptions {
  
  @scala.inline
  def apply(): IForceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IForceOptions]
  }
  
  @scala.inline
  implicit class IForceOptionsOps[Self <: IForceOptions] (val x: Self) extends AnyVal {
    
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
    def setTargetsVarargs(value: js.Any*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[_]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
}

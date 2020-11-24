package typings.dtsGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveModuleIdParams extends js.Object {
  
  /** The identifier of the module being declared in the generated d.ts */
  var currentModuleId: String = js.native
}
object ResolveModuleIdParams {
  
  @scala.inline
  def apply(currentModuleId: String): ResolveModuleIdParams = {
    val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveModuleIdParams]
  }
  
  @scala.inline
  implicit class ResolveModuleIdParamsOps[Self <: ResolveModuleIdParams] (val x: Self) extends AnyVal {
    
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
    def setCurrentModuleId(value: String): Self = this.set("currentModuleId", value.asInstanceOf[js.Any])
  }
}

package typings.diff2html.hoganjsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoganJsUtilsConfig extends js.Object {
  
  var compiledTemplates: js.UndefOr[CompiledTemplates] = js.native
  
  var rawTemplates: js.UndefOr[RawTemplates] = js.native
}
object HoganJsUtilsConfig {
  
  @scala.inline
  def apply(): HoganJsUtilsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoganJsUtilsConfig]
  }
  
  @scala.inline
  implicit class HoganJsUtilsConfigOps[Self <: HoganJsUtilsConfig] (val x: Self) extends AnyVal {
    
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
    def setCompiledTemplates(value: CompiledTemplates): Self = this.set("compiledTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiledTemplates: Self = this.set("compiledTemplates", js.undefined)
    
    @scala.inline
    def setRawTemplates(value: RawTemplates): Self = this.set("rawTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawTemplates: Self = this.set("rawTemplates", js.undefined)
  }
}

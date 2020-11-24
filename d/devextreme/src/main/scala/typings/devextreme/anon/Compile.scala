package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compile extends js.Object {
  
  var compile: js.UndefOr[js.Function] = js.native
  
  var render: js.UndefOr[js.Function] = js.native
}
object Compile {
  
  @scala.inline
  def apply(): Compile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compile]
  }
  
  @scala.inline
  implicit class CompileOps[Self <: Compile] (val x: Self) extends AnyVal {
    
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
    def setCompile(value: js.Function): Self = this.set("compile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompile: Self = this.set("compile", js.undefined)
    
    @scala.inline
    def setRender(value: js.Function): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}

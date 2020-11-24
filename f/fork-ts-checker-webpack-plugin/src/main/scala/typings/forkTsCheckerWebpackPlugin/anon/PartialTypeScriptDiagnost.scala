package typings.forkTsCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/typescript-reporter/TypeScriptDiagnosticsOptions.TypeScriptDiagnosticsOptions> */
@js.native
trait PartialTypeScriptDiagnost extends js.Object {
  
  var declaration: js.UndefOr[Boolean] = js.native
  
  var global: js.UndefOr[Boolean] = js.native
  
  var semantic: js.UndefOr[Boolean] = js.native
  
  var syntactic: js.UndefOr[Boolean] = js.native
}
object PartialTypeScriptDiagnost {
  
  @scala.inline
  def apply(): PartialTypeScriptDiagnost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeScriptDiagnost]
  }
  
  @scala.inline
  implicit class PartialTypeScriptDiagnostOps[Self <: PartialTypeScriptDiagnost] (val x: Self) extends AnyVal {
    
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
    def setDeclaration(value: Boolean): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setSemantic(value: Boolean): Self = this.set("semantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemantic: Self = this.set("semantic", js.undefined)
    
    @scala.inline
    def setSyntactic(value: Boolean): Self = this.set("syntactic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntactic: Self = this.set("syntactic", js.undefined)
  }
}

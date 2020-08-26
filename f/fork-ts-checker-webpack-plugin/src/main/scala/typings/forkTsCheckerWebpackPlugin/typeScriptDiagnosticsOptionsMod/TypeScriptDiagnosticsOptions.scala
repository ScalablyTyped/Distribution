package typings.forkTsCheckerWebpackPlugin.typeScriptDiagnosticsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeScriptDiagnosticsOptions extends js.Object {
  var declaration: Boolean = js.native
  var global: Boolean = js.native
  var semantic: Boolean = js.native
  var syntactic: Boolean = js.native
}

object TypeScriptDiagnosticsOptions {
  @scala.inline
  def apply(declaration: Boolean, global: Boolean, semantic: Boolean, syntactic: Boolean): TypeScriptDiagnosticsOptions = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any], syntactic = syntactic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptDiagnosticsOptions]
  }
  @scala.inline
  implicit class TypeScriptDiagnosticsOptionsOps[Self <: TypeScriptDiagnosticsOptions] (val x: Self) extends AnyVal {
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
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemantic(value: Boolean): Self = this.set("semantic", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyntactic(value: Boolean): Self = this.set("syntactic", value.asInstanceOf[js.Any])
  }
  
}


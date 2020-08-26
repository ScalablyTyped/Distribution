package typings.forkTsCheckerWebpackPlugin.typeScriptVueExtensionConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeScriptVueExtensionConfiguration extends js.Object {
  var compiler: String = js.native
  var enabled: Boolean = js.native
}

object TypeScriptVueExtensionConfiguration {
  @scala.inline
  def apply(compiler: String, enabled: Boolean): TypeScriptVueExtensionConfiguration = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptVueExtensionConfiguration]
  }
  @scala.inline
  implicit class TypeScriptVueExtensionConfigurationOps[Self <: TypeScriptVueExtensionConfiguration] (val x: Self) extends AnyVal {
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
    def setCompiler(value: String): Self = this.set("compiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}


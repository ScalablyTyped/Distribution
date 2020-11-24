package typings.forkTsCheckerWebpackPlugin.anon

import typings.forkTsCheckerWebpackPlugin.typeScriptVueExtensionConfigurationMod.TypeScriptVueExtensionConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vue extends js.Object {
  
  var vue: TypeScriptVueExtensionConfiguration = js.native
}
object Vue {
  
  @scala.inline
  def apply(vue: TypeScriptVueExtensionConfiguration): Vue = {
    val __obj = js.Dynamic.literal(vue = vue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
  
  @scala.inline
  implicit class VueOps[Self <: Vue] (val x: Self) extends AnyVal {
    
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
    def setVue(value: TypeScriptVueExtensionConfiguration): Self = this.set("vue", value.asInstanceOf[js.Any])
  }
}

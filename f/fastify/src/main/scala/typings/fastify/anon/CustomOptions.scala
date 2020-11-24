package typings.fastify.anon

import typings.ajv.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomOptions extends js.Object {
  
  var customOptions: js.UndefOr[Options] = js.native
  
  var plugins: js.UndefOr[js.Array[js.Function]] = js.native
}
object CustomOptions {
  
  @scala.inline
  def apply(): CustomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomOptions]
  }
  
  @scala.inline
  implicit class CustomOptionsOps[Self <: CustomOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomOptions(value: Options): Self = this.set("customOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomOptions: Self = this.set("customOptions", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Function*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[js.Function]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}

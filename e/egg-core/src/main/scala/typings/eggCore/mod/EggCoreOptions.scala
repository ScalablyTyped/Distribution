package typings.eggCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggCoreOptions extends js.Object {
  
  /** the directory of application */
  var baseDir: js.UndefOr[String] = js.native
  
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.native
  
  /** server scope */
  var serverScope: js.UndefOr[String] = js.native
  
  /** egg type, application or agent */
  var `type`: js.UndefOr[EggType] = js.native
}
object EggCoreOptions {
  
  @scala.inline
  def apply(): EggCoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EggCoreOptions]
  }
  
  @scala.inline
  implicit class EggCoreOptionsOps[Self <: EggCoreOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    
    @scala.inline
    def setPlugins(value: Plugins): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setServerScope(value: String): Self = this.set("serverScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerScope: Self = this.set("serverScope", js.undefined)
    
    @scala.inline
    def setType(value: EggType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

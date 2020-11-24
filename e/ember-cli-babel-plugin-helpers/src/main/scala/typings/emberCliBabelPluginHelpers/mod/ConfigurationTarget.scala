package typings.emberCliBabelPluginHelpers.mod

import typings.emberCliBabelPluginHelpers.anon.Babel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationTarget extends js.Object {
  
  var options: js.UndefOr[Babel] = js.native
}
object ConfigurationTarget {
  
  @scala.inline
  def apply(): ConfigurationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationTarget]
  }
  
  @scala.inline
  implicit class ConfigurationTargetOps[Self <: ConfigurationTarget] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: Babel): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}

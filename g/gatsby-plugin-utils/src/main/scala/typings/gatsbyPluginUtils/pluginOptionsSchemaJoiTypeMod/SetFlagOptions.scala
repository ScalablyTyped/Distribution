package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFlagOptions extends js.Object {
  
  @JSName("clone")
  var clone_FSetFlagOptions: Boolean = js.native
}
object SetFlagOptions {
  
  @scala.inline
  def apply(clone: Boolean): SetFlagOptions = {
    val __obj = js.Dynamic.literal(clone = clone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFlagOptions]
  }
  
  @scala.inline
  implicit class SetFlagOptionsOps[Self <: SetFlagOptions] (val x: Self) extends AnyVal {
    
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
  }
}

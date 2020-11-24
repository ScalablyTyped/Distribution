package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionFlag extends js.Object {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var setter: js.UndefOr[String] = js.native
}
object ExtensionFlag {
  
  @scala.inline
  def apply(): ExtensionFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionFlag]
  }
  
  @scala.inline
  implicit class ExtensionFlagOps[Self <: ExtensionFlag] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setSetter(value: String): Self = this.set("setter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetter: Self = this.set("setter", js.undefined)
  }
}

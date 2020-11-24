package typings.gatsbyPluginUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISiteConfig extends IRawSiteConfig {
  
  @JSName("plugins")
  var plugins_ISiteConfig: js.UndefOr[js.Array[IPluginRefObject]] = js.native
}
object ISiteConfig {
  
  @scala.inline
  def apply(): ISiteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISiteConfig]
  }
  
  @scala.inline
  implicit class ISiteConfigOps[Self <: ISiteConfig] (val x: Self) extends AnyVal {
    
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
    def setPluginsVarargs(value: IPluginRefObject*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[IPluginRefObject]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}

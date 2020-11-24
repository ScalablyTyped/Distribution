package typings.gatsbyPluginUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPluginInfo extends js.Object {
  
  /** Unique ID describing a plugin */
  var id: String = js.native
  
  /** The plugin name */
  var name: String = js.native
  
  /** Options passed to the plugin */
  var pluginOptions: js.UndefOr[IPluginInfoOptions] = js.native
  
  /** The absolute path to the plugin */
  var resolve: String = js.native
  
  /** The plugin version (can be content hash) */
  var version: String = js.native
}
object IPluginInfo {
  
  @scala.inline
  def apply(id: String, name: String, resolve: String, version: String): IPluginInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginInfo]
  }
  
  @scala.inline
  implicit class IPluginInfoOps[Self <: IPluginInfo] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: String): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginOptions(value: IPluginInfoOptions): Self = this.set("pluginOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginOptions: Self = this.set("pluginOptions", js.undefined)
  }
}

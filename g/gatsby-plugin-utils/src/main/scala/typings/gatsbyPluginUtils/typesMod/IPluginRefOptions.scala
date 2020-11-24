package typings.gatsbyPluginUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPluginRefOptions
  extends /* option */ StringDictionary[js.Any] {
  
  var path: js.UndefOr[String] = js.native
  
  var plugins: js.UndefOr[js.Array[PluginRef]] = js.native
}
object IPluginRefOptions {
  
  @scala.inline
  def apply(): IPluginRefOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPluginRefOptions]
  }
  
  @scala.inline
  implicit class IPluginRefOptionsOps[Self <: IPluginRefOptions] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: PluginRef*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[PluginRef]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}

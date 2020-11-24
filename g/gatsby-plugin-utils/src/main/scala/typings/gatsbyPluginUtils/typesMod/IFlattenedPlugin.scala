package typings.gatsbyPluginUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFlattenedPlugin extends IPluginInfo {
  
  var browserAPIs: js.Array[String] = js.native
  
  var nodeAPIs: js.Array[String] = js.native
  
  var skipSSR: js.UndefOr[Boolean] = js.native
  
  var ssrAPIs: js.Array[String] = js.native
}
object IFlattenedPlugin {
  
  @scala.inline
  def apply(
    browserAPIs: js.Array[String],
    id: String,
    name: String,
    nodeAPIs: js.Array[String],
    resolve: String,
    ssrAPIs: js.Array[String],
    version: String
  ): IFlattenedPlugin = {
    val __obj = js.Dynamic.literal(browserAPIs = browserAPIs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeAPIs = nodeAPIs.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], ssrAPIs = ssrAPIs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFlattenedPlugin]
  }
  
  @scala.inline
  implicit class IFlattenedPluginOps[Self <: IFlattenedPlugin] (val x: Self) extends AnyVal {
    
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
    def setBrowserAPIsVarargs(value: String*): Self = this.set("browserAPIs", js.Array(value :_*))
    
    @scala.inline
    def setBrowserAPIs(value: js.Array[String]): Self = this.set("browserAPIs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAPIsVarargs(value: String*): Self = this.set("nodeAPIs", js.Array(value :_*))
    
    @scala.inline
    def setNodeAPIs(value: js.Array[String]): Self = this.set("nodeAPIs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrAPIsVarargs(value: String*): Self = this.set("ssrAPIs", js.Array(value :_*))
    
    @scala.inline
    def setSsrAPIs(value: js.Array[String]): Self = this.set("ssrAPIs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipSSR(value: Boolean): Self = this.set("skipSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipSSR: Self = this.set("skipSSR", js.undefined)
  }
}

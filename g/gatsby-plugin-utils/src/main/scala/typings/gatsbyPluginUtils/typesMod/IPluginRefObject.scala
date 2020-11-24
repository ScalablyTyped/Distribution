package typings.gatsbyPluginUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPluginRefObject extends js.Object {
  
  var options: js.UndefOr[IPluginRefOptions] = js.native
  
  var parentDir: js.UndefOr[String] = js.native
  
  var resolve: String = js.native
}
object IPluginRefObject {
  
  @scala.inline
  def apply(resolve: String): IPluginRefObject = {
    val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginRefObject]
  }
  
  @scala.inline
  implicit class IPluginRefObjectOps[Self <: IPluginRefObject] (val x: Self) extends AnyVal {
    
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
    def setResolve(value: String): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IPluginRefOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParentDir(value: String): Self = this.set("parentDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentDir: Self = this.set("parentDir", js.undefined)
  }
}

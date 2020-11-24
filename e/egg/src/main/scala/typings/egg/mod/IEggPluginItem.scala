package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEggPluginItem extends js.Object {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[js.Array[EggEnvType]] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object IEggPluginItem {
  
  @scala.inline
  def apply(): IEggPluginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEggPluginItem]
  }
  
  @scala.inline
  implicit class IEggPluginItemOps[Self <: IEggPluginItem] (val x: Self) extends AnyVal {
    
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: EggEnvType*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[EggEnvType]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}

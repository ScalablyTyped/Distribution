package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEggPluginItem extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[js.Array[EggEnvType]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object IEggPluginItem {
  
  @scala.inline
  def apply(): IEggPluginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEggPluginItem]
  }
  
  @scala.inline
  implicit class IEggPluginItemMutableBuilder[Self <: IEggPluginItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[EggEnvType]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: EggEnvType*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}

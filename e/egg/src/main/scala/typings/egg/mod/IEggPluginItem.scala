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
  
  inline def apply(): IEggPluginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEggPluginItem]
  }
  
  extension [Self <: IEggPluginItem](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setEnv(value: js.Array[EggEnvType]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: EggEnvType*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}

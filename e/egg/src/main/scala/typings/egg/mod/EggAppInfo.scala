package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EggAppInfo extends StObject {
  
  // equals to serverEnv
  var HOME: String
  
  // the application name from package.json
  var baseDir: String
  
  // current directory of application
  var env: EggEnvType
  
  // package.json
  var name: String
  
  var pkg: Any
  
  // home directory of the OS
  var root: String
}
object EggAppInfo {
  
  inline def apply(HOME: String, baseDir: String, env: EggEnvType, name: String, pkg: Any, root: String): EggAppInfo = {
    val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppInfo]
  }
  
  extension [Self <: EggAppInfo](x: Self) {
    
    inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: EggEnvType): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setHOME(value: String): Self = StObject.set(x, "HOME", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPkg(value: Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}

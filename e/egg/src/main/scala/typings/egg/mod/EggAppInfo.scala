package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggAppInfo extends StObject {
  
  // equals to serverEnv
  var HOME: String = js.native
  
  // the application name from package.json
  var baseDir: String = js.native
  
  // current directory of application
  var env: EggEnvType = js.native
  
  // package.json
  var name: String = js.native
  
  var pkg: js.Any = js.native
  
  // home directory of the OS
  var root: String = js.native
}
object EggAppInfo {
  
  @scala.inline
  def apply(HOME: String, baseDir: String, env: EggEnvType, name: String, pkg: js.Any, root: String): EggAppInfo = {
    val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppInfo]
  }
  
  @scala.inline
  implicit class EggAppInfoMutableBuilder[Self <: EggAppInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: EggEnvType): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOME(value: String): Self = StObject.set(x, "HOME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkg(value: js.Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}

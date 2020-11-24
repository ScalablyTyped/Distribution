package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggAppInfo extends js.Object {
  
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
  implicit class EggAppInfoOps[Self <: EggAppInfo] (val x: Self) extends AnyVal {
    
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
    def setHOME(value: String): Self = this.set("HOME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: EggEnvType): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkg(value: js.Any): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}

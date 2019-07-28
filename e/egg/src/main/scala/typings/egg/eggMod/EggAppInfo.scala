package typings.egg.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppInfo extends js.Object {
   // equals to serverEnv
  var HOME: String
   // the application name from package.json
  var baseDir: String
   // current directory of application
  var env: EggEnvType
   // package.json
  var name: String
  var pkg: js.Any
   // home directory of the OS
  var root: String
}

object EggAppInfo {
  @scala.inline
  def apply(HOME: String, baseDir: String, env: EggEnvType, name: String, pkg: js.Any, root: String): EggAppInfo = {
    val __obj = js.Dynamic.literal(HOME = HOME, baseDir = baseDir, env = env.asInstanceOf[js.Any], name = name, pkg = pkg, root = root)
  
    __obj.asInstanceOf[EggAppInfo]
  }
}


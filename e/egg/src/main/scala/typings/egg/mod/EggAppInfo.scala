package typings.egg.mod

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
    val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppInfo]
  }
}


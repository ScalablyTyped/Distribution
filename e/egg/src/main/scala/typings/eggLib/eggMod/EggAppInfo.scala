package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppInfo extends js.Object {
   // equals to serverEnv
  var HOME: java.lang.String
   // the application name from package.json
  var baseDir: java.lang.String
   // current directory of application
  var env: EggEnvType
   // package.json
  var name: java.lang.String
  var pkg: js.Any
   // home directory of the OS
  var root: java.lang.String
}

object EggAppInfo {
  @scala.inline
  def apply(
    HOME: java.lang.String,
    baseDir: java.lang.String,
    env: EggEnvType,
    name: java.lang.String,
    pkg: js.Any,
    root: java.lang.String
  ): EggAppInfo = {
    val __obj = js.Dynamic.literal(HOME = HOME, baseDir = baseDir, env = env.asInstanceOf[js.Any], name = name, pkg = pkg, root = root)
  
    __obj.asInstanceOf[EggAppInfo]
  }
}


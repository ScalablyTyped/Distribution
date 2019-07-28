package typings.eggDashCore.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppInfo extends js.Object {
  /** home directory of the OS */
  var HOME: String
  /** current directory of application */
  var baseDir: String
  /** equals to serverEnv */
  var env: String
  /** the application name from package.json */
  var name: String
  /** package.json */
  var pkg: PlainObject[_]
  /** baseDir when local and unittest, HOME when other environment */
  var root: String
}

object EggAppInfo {
  @scala.inline
  def apply(HOME: String, baseDir: String, env: String, name: String, pkg: PlainObject[_], root: String): EggAppInfo = {
    val __obj = js.Dynamic.literal(HOME = HOME, baseDir = baseDir, env = env, name = name, pkg = pkg, root = root)
  
    __obj.asInstanceOf[EggAppInfo]
  }
}


package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppInfo extends js.Object {
  /** home directory of the OS */
  var HOME: java.lang.String
  /** current directory of application */
  var baseDir: java.lang.String
  /** equals to serverEnv */
  var env: java.lang.String
  /** the application name from package.json */
  var name: java.lang.String
  /** package.json */
  var pkg: PlainObject[_]
  /** baseDir when local and unittest, HOME when other environment */
  var root: java.lang.String
}

object EggAppInfo {
  @scala.inline
  def apply(
    HOME: java.lang.String,
    baseDir: java.lang.String,
    env: java.lang.String,
    name: java.lang.String,
    pkg: PlainObject[_],
    root: java.lang.String
  ): EggAppInfo = {
    val __obj = js.Dynamic.literal(HOME = HOME, baseDir = baseDir, env = env, name = name, pkg = pkg, root = root)
  
    __obj.asInstanceOf[EggAppInfo]
  }
}


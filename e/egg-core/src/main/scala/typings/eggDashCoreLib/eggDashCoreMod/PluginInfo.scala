package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInfo extends js.Object {
  /** the dependent plugins, you can use the plugin name */
  var dependencies: js.Array[java.lang.String]
  /** whether enabled */
  var enable: scala.Boolean
  /** specify the serverEnv that only enable the plugin in it */
  var env: js.Array[java.lang.String]
  /** the file plugin config in. */
  var from: java.lang.String
  /** the plugin name, it can be used in `dep` */
  var name: java.lang.String
  /** the optional dependent plugins. */
  var optionalDependencies: js.Array[java.lang.String]
  /** the package name of plugin */
  var `package`: java.lang.String
  /** the directory of the plugin package */
  var path: java.lang.String
}

object PluginInfo {
  @scala.inline
  def apply(
    dependencies: js.Array[java.lang.String],
    enable: scala.Boolean,
    env: js.Array[java.lang.String],
    from: java.lang.String,
    name: java.lang.String,
    optionalDependencies: js.Array[java.lang.String],
    `package`: java.lang.String,
    path: java.lang.String
  ): PluginInfo = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, enable = enable, env = env, from = from, name = name, optionalDependencies = optionalDependencies, path = path)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[PluginInfo]
  }
}


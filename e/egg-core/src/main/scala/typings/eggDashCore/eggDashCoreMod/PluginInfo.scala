package typings.eggDashCore.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInfo extends js.Object {
  /** the dependent plugins, you can use the plugin name */
  var dependencies: js.Array[String]
  /** whether enabled */
  var enable: Boolean
  /** specify the serverEnv that only enable the plugin in it */
  var env: js.Array[String]
  /** the file plugin config in. */
  var from: String
  /** the plugin name, it can be used in `dep` */
  var name: String
  /** the optional dependent plugins. */
  var optionalDependencies: js.Array[String]
  /** the package name of plugin */
  var `package`: String
  /** the directory of the plugin package */
  var path: String
}

object PluginInfo {
  @scala.inline
  def apply(
    dependencies: js.Array[String],
    enable: Boolean,
    env: js.Array[String],
    from: String,
    name: String,
    optionalDependencies: js.Array[String],
    `package`: String,
    path: String
  ): PluginInfo = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, enable = enable, env = env, from = from, name = name, optionalDependencies = optionalDependencies, path = path)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[PluginInfo]
  }
}


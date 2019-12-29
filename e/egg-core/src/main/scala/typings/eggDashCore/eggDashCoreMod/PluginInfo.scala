package typings.eggDashCore.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInfo extends js.Object {
  /** the package name of plugin */
  @JSName("package")
  var _package: String
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
  /** the directory of the plugin package */
  var path: String
}

object PluginInfo {
  @scala.inline
  def apply(
    _package: String,
    dependencies: js.Array[String],
    enable: Boolean,
    env: js.Array[String],
    from: String,
    name: String,
    optionalDependencies: js.Array[String],
    path: String
  ): PluginInfo = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInfo]
  }
}


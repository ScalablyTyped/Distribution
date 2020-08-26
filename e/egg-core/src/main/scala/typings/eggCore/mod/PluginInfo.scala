package typings.eggCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginInfo extends js.Object {
  /** the package name of plugin */
  @JSName("package")
  var _package: String = js.native
  /** the dependent plugins, you can use the plugin name */
  var dependencies: js.Array[String] = js.native
  /** whether enabled */
  var enable: Boolean = js.native
  /** specify the serverEnv that only enable the plugin in it */
  var env: js.Array[String] = js.native
  /** the file plugin config in. */
  var from: String = js.native
  /** the plugin name, it can be used in `dep` */
  var name: String = js.native
  /** the optional dependent plugins. */
  var optionalDependencies: js.Array[String] = js.native
  /** the directory of the plugin package */
  var path: String = js.native
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
  @scala.inline
  implicit class PluginInfoOps[Self <: PluginInfo] (val x: Self) extends AnyVal {
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalDependenciesVarargs(value: String*): Self = this.set("optionalDependencies", js.Array(value :_*))
    @scala.inline
    def setOptionalDependencies(value: js.Array[String]): Self = this.set("optionalDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}


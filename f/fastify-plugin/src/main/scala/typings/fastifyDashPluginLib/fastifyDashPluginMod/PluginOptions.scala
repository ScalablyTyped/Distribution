package typings
package fastifyDashPluginLib.fastifyDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  /** Decorator dependencies for this plugin */
  var decorators: js.UndefOr[fastifyDashPluginLib.Anon_Fastify] = js.undefined
  /** The plugin dependencies */
  var dependencies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Bare-minimum version of Fastify for your plugin, just add the semver range that you need. */
  var fastify: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    decorators: fastifyDashPluginLib.Anon_Fastify = null,
    dependencies: js.Array[java.lang.String] = null,
    fastify: java.lang.String = null,
    name: java.lang.String = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (fastify != null) __obj.updateDynamic("fastify")(fastify)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PluginOptions]
  }
}


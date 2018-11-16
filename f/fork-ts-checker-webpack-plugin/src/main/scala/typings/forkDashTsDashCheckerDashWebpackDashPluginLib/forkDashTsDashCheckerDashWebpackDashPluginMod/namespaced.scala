package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * ForkTsCheckerWebpackPlugin
 * Runs typescript type checker and linter (tslint) on separate process.
 * This speed-ups build a lot.
 *
 * Options description in README.md
 */
@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
class namespaced () extends ForkTsCheckerWebpackPlugin {
  def this(options: stdLib.Partial[Options]) = this()
}

/**
 * ForkTsCheckerWebpackPlugin
 * Runs typescript type checker and linter (tslint) on separate process.
 * This speed-ups build a lot.
 *
 * Options description in README.md
 */
@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var ALL_CPUS: scala.Double = js.native
  var DEFAULT_MEMORY_LIMIT: scala.Double = js.native
  var ONE_CPU: scala.Double = js.native
  var ONE_CPU_FREE: scala.Double = js.native
  var TWO_CPUS_FREE: scala.Double = js.native
  @JSName("createFormatter")
  def createFormatter_codeframe(
    `type`: forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.codeframe,
    options: js.Any
  ): js.Function2[
    /* message */ forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage, 
    /* useColors */ scala.Boolean, 
    java.lang.String
  ] = js.native
  @JSName("createFormatter")
  def createFormatter_default(
    `type`: forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.default,
    options: js.Any
  ): js.Function2[
    /* message */ forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage, 
    /* useColors */ scala.Boolean, 
    java.lang.String
  ] = js.native
}


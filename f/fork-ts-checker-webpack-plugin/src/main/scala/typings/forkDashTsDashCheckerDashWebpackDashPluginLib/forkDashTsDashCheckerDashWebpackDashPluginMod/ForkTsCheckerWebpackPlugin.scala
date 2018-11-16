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
@js.native
trait ForkTsCheckerWebpackPlugin extends js.Object {
  var async: scala.Boolean = js.native
  var cancellationToken: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesCancellationTokenMod.CancellationToken = js.native
  var checkDone: scala.Boolean = js.native
  var checkSyntacticErrors: scala.Boolean = js.native
  @JSName("colors")
  var colors_Original: chalkLib.chalkMod.Chalk = js.native
  var compilationDone: scala.Boolean = js.native
  var compiler: js.Any = js.native
  var compilerOptions: js.Object = js.native
  var diagnostics: js.Array[
    forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage
  ] = js.native
  var elapsed: js.Tuple2[scala.Double, scala.Double] = js.native
  @JSName("formatter")
  var formatter_Original: forkDashTsDashCheckerDashWebpackDashPluginLib.Formatter = js.native
  var ignoreDiagnostics: js.Array[scala.Double] = js.native
  var ignoreLints: js.Array[java.lang.String] = js.native
  var isWatching: scala.Boolean = js.native
  var lints: js.Array[
    forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage
  ] = js.native
  var logger: Logger = js.native
  var memoryLimit: scala.Double = js.native
  var options: stdLib.Partial[Options] = js.native
  var reportFiles: js.Array[java.lang.String] = js.native
  var service: nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  var silent: scala.Boolean = js.native
  var started: js.Tuple2[scala.Double, scala.Double] = js.native
  var tsconfig: java.lang.String = js.native
  var tsconfigPath: java.lang.String = js.native
  var tslint: java.lang.String | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibNumbers.`true` = js.native
  var tslintPath: java.lang.String = js.native
  var tslintVersion: js.Any = js.native
  var typescriptVersion: js.Any = js.native
  var useColors: scala.Boolean = js.native
  var vue: scala.Boolean = js.native
  var watch: js.Array[java.lang.String] = js.native
  var watchPaths: js.Array[java.lang.String] = js.native
  var workersNumber: scala.Double = js.native
  @JSName("apply")
  def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit = js.native
  def colors(text: java.lang.String*): java.lang.String = js.native
  def colors(text: stdLib.TemplateStringsArray, placeholders: java.lang.String*): java.lang.String = js.native
  def computeContextPath(filePath: java.lang.String): java.lang.String = js.native
  def createDoneCallback(): js.ThisFunction0[/* this */ this.type, scala.Unit] = js.native
  def createEmitCallback(compilation: js.Any, callback: js.Function0[scala.Unit]): js.ThisFunction0[/* this */ this.type, scala.Unit] = js.native
  def createNoopEmitCallback(): js.Function0[scala.Unit] = js.native
  def doneCallback(): scala.Unit = js.native
  def emitCallback(): scala.Unit = js.native
  def formatter(message: js.Any, useColors: scala.Boolean): java.lang.String = js.native
  def handleServiceExit(_code: java.lang.String, signal: java.lang.String): scala.Unit = js.native
  def handleServiceExit(_code: scala.Double, signal: java.lang.String): scala.Unit = js.native
  def handleServiceMessage(message: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesMessageMod.Message): scala.Unit = js.native
  def killService(): scala.Unit = js.native
  def pluginCompile(): scala.Unit = js.native
  def pluginDone(): scala.Unit = js.native
  def pluginEmit(): scala.Unit = js.native
  def pluginStart(): scala.Unit = js.native
  def pluginStop(): scala.Unit = js.native
  def registerCustomHooks(): scala.Unit = js.native
  def spawnService(): scala.Unit = js.native
}


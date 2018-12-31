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
trait ForkTsCheckerWebpackPlugin extends js.Object {
  var async: js.Any
  var cancellationToken: js.UndefOr[js.Any] = js.undefined
  var checkDone: js.Any
  var checkSyntacticErrors: js.Any
  var colors: js.Any
  var compilationDone: js.Any
  var compiler: js.Any
  var compilerOptions: js.Any
  var computeContextPath: js.Any
  var createDoneCallback: js.Any
  var createEmitCallback: js.Any
  var createNoopEmitCallback: js.Any
  var diagnostics: js.Any
  var doneCallback: js.Any
  var elapsed: js.UndefOr[js.Any] = js.undefined
  var emitCallback: js.Any
  var formatter: js.Any
  var handleServiceExit: js.Any
  var handleServiceMessage: js.Any
  var ignoreDiagnostics: js.Any
  var ignoreLints: js.Any
  var isWatching: js.Any
  var killService: js.Any
  var lints: js.Any
  var logger: js.Any
  var memoryLimit: js.Any
  val options: stdLib.Partial[Options]
  var pluginCompile: js.Any
  var pluginDone: js.Any
  var pluginEmit: js.Any
  var pluginStart: js.Any
  var pluginStop: js.Any
  var registerCustomHooks: js.Any
  var reportFiles: js.Any
  var service: js.UndefOr[js.Any] = js.undefined
  var silent: js.Any
  var spawnService: js.Any
  var started: js.UndefOr[js.Any] = js.undefined
  var tsconfig: js.Any
  var tsconfigPath: js.UndefOr[js.Any] = js.undefined
  var tslint: js.UndefOr[js.Any] = js.undefined
  var tslintAutoFix: js.Any
  var tslintPath: js.UndefOr[js.Any] = js.undefined
  var tslintVersion: js.Any
  var typescriptVersion: js.Any
  var useColors: js.Any
  var vue: js.Any
  var watch: js.Any
  var watchPaths: js.Any
  var workersNumber: js.Any
  @JSName("apply")
  def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit
}


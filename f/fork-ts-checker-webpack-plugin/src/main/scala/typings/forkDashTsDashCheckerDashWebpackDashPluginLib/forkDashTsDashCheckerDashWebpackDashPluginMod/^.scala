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
class ^ () extends ForkTsCheckerWebpackPlugin {
  def this(options: stdLib.Partial[Options]) = this()
  /* CompleteClass */
  override var async: js.Any = js.native
  /* CompleteClass */
  override var checkDone: js.Any = js.native
  /* CompleteClass */
  override var checkSyntacticErrors: js.Any = js.native
  /* CompleteClass */
  override var colors: js.Any = js.native
  /* CompleteClass */
  override var compilationDone: js.Any = js.native
  /* CompleteClass */
  override var compiler: js.Any = js.native
  /* CompleteClass */
  override var compilerOptions: js.Any = js.native
  /* CompleteClass */
  override var computeContextPath: js.Any = js.native
  /* CompleteClass */
  override var createDoneCallback: js.Any = js.native
  /* CompleteClass */
  override var createEmitCallback: js.Any = js.native
  /* CompleteClass */
  override var createNoopEmitCallback: js.Any = js.native
  /* CompleteClass */
  override var diagnostics: js.Any = js.native
  /* CompleteClass */
  override var doneCallback: js.Any = js.native
  /* CompleteClass */
  override var emitCallback: js.Any = js.native
  /* CompleteClass */
  override var formatter: js.Any = js.native
  /* CompleteClass */
  override var handleServiceExit: js.Any = js.native
  /* CompleteClass */
  override var handleServiceMessage: js.Any = js.native
  /* CompleteClass */
  override var ignoreDiagnostics: js.Any = js.native
  /* CompleteClass */
  override var ignoreLintWarnings: js.Any = js.native
  /* CompleteClass */
  override var ignoreLints: js.Any = js.native
  /* CompleteClass */
  override var isWatching: js.Any = js.native
  /* CompleteClass */
  override var killService: js.Any = js.native
  /* CompleteClass */
  override var lints: js.Any = js.native
  /* CompleteClass */
  override var logger: js.Any = js.native
  /* CompleteClass */
  override var measureTime: js.Any = js.native
  /* CompleteClass */
  override var memoryLimit: js.Any = js.native
  /* CompleteClass */
  override var nodeArgs: js.Any = js.native
  /* CompleteClass */
  override val options: stdLib.Partial[Options] = js.native
  /* CompleteClass */
  override var performance: js.Any = js.native
  /* CompleteClass */
  override var pluginCompile: js.Any = js.native
  /* CompleteClass */
  override var pluginDone: js.Any = js.native
  /* CompleteClass */
  override var pluginEmit: js.Any = js.native
  /* CompleteClass */
  override var pluginStart: js.Any = js.native
  /* CompleteClass */
  override var pluginStop: js.Any = js.native
  /* CompleteClass */
  override var printLoggerMessage: js.Any = js.native
  /* CompleteClass */
  override var reportFiles: js.Any = js.native
  /* CompleteClass */
  override var silent: js.Any = js.native
  /* CompleteClass */
  override var spawnService: js.Any = js.native
  /* CompleteClass */
  override var startAt: js.Any = js.native
  /* CompleteClass */
  override var tsconfig: js.Any = js.native
  /* CompleteClass */
  override var tslintAutoFix: js.Any = js.native
  /* CompleteClass */
  override var tslintVersion: js.Any = js.native
  /* CompleteClass */
  override var typescript: js.Any = js.native
  /* CompleteClass */
  override var typescriptPath: js.Any = js.native
  /* CompleteClass */
  override var typescriptVersion: js.Any = js.native
  /* CompleteClass */
  override var useColors: js.Any = js.native
  /* CompleteClass */
  override var useTypescriptIncrementalApi: js.Any = js.native
  /* CompleteClass */
  override var validateVersions: js.Any = js.native
  /* CompleteClass */
  override var vue: js.Any = js.native
  /* CompleteClass */
  override var watch: js.Any = js.native
  /* CompleteClass */
  override var watchPaths: js.Any = js.native
  /* CompleteClass */
  override var workersNumber: js.Any = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit = js.native
}

@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ALL_CPUS: scala.Double = js.native
  val DEFAULT_MEMORY_LIMIT: forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibNumbers.`2048` = js.native
  val ONE_CPU: forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibNumbers.`1` = js.native
  val ONE_CPU_FREE: scala.Double = js.native
  val TWO_CPUS_FREE: scala.Double = js.native
  var createFormatter: js.Any = js.native
  def getCompilerHooks(compiler: webpackLib.webpackMod.Compiler): stdLib.Record[
    forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.serviceBeforeStart | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.cancel | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.serviceStartError | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.waiting | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.serviceStart | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.receive | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.serviceOutOfMemory | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.emit | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.done, 
    (tapableLib.tapableMod.SyncHook[_, _, _]) | (tapableLib.tapableMod.AsyncSeriesHook[_, _, _])
  ] = js.native
}


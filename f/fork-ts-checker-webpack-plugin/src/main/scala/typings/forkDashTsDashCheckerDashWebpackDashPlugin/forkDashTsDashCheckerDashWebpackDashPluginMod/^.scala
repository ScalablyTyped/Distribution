package typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginNumbers.`1`
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginNumbers.`2048`
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libHooksMod.ForkTsCheckerHooks
import typings.std.Partial
import typings.std.Record
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
  def this(options: Partial[Options]) = this()
  /* CompleteClass */
  override var async: js.Any = js.native
  /* CompleteClass */
  override var cancellationToken: js.Any = js.native
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
  override var elapsed: js.Any = js.native
  /* CompleteClass */
  override var emitCallback: js.Any = js.native
  /* CompleteClass */
  override var eslint: js.Any = js.native
  /* CompleteClass */
  override var eslintOptions: js.Any = js.native
  /* CompleteClass */
  override var eslintVersion: js.Any = js.native
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
  override var nodeArgs: js.Array[String] = js.native
  /* CompleteClass */
  override val options: Partial[Options] = js.native
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
  override var resolveModuleNameModule: js.Any = js.native
  /* CompleteClass */
  override var resolveTypeReferenceDirectiveModule: js.Any = js.native
  /* CompleteClass */
  override var silent: js.Any = js.native
  /* CompleteClass */
  override var spawnService: js.Any = js.native
  /* CompleteClass */
  override var startAt: js.Any = js.native
  /* CompleteClass */
  override var started: js.Any = js.native
  /* CompleteClass */
  override var tsconfig: js.Any = js.native
  /* CompleteClass */
  override var tsconfigPath: js.Any = js.native
  /* CompleteClass */
  override var tslint: js.Any = js.native
  /* CompleteClass */
  override var tslintAutoFix: js.Any = js.native
  /* CompleteClass */
  override var tslintPath: js.Any = js.native
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
  override var validateEslint: js.Any = js.native
  /* CompleteClass */
  override var validateTslint: js.Any = js.native
  /* CompleteClass */
  override var validateTypeScript: js.Any = js.native
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
  override def apply(compiler: js.Any): Unit = js.native
}

@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ALL_CPUS: Double = js.native
  val DEFAULT_MEMORY_LIMIT: `2048` = js.native
  val ONE_CPU: `1` = js.native
  val ONE_CPU_FREE: Double = js.native
  val TWO_CPUS_FREE: Double = js.native
  var createFormatter: js.Any = js.native
  def getCompilerHooks(compiler: js.Any): Record[ForkTsCheckerHooks, _] = js.native
}


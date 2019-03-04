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

object ForkTsCheckerWebpackPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[webpackLib.webpackMod.Compiler, scala.Unit],
    async: js.Any,
    checkDone: js.Any,
    checkSyntacticErrors: js.Any,
    colors: js.Any,
    compilationDone: js.Any,
    compiler: js.Any,
    compilerOptions: js.Any,
    computeContextPath: js.Any,
    createDoneCallback: js.Any,
    createEmitCallback: js.Any,
    createNoopEmitCallback: js.Any,
    diagnostics: js.Any,
    doneCallback: js.Any,
    emitCallback: js.Any,
    formatter: js.Any,
    handleServiceExit: js.Any,
    handleServiceMessage: js.Any,
    ignoreDiagnostics: js.Any,
    ignoreLints: js.Any,
    isWatching: js.Any,
    killService: js.Any,
    lints: js.Any,
    logger: js.Any,
    memoryLimit: js.Any,
    options: stdLib.Partial[Options],
    pluginCompile: js.Any,
    pluginDone: js.Any,
    pluginEmit: js.Any,
    pluginStart: js.Any,
    pluginStop: js.Any,
    registerCustomHooks: js.Any,
    reportFiles: js.Any,
    silent: js.Any,
    spawnService: js.Any,
    tsconfig: js.Any,
    tslintAutoFix: js.Any,
    tslintVersion: js.Any,
    typescriptVersion: js.Any,
    useColors: js.Any,
    vue: js.Any,
    watch: js.Any,
    watchPaths: js.Any,
    workersNumber: js.Any,
    cancellationToken: js.Any = null,
    elapsed: js.Any = null,
    service: js.Any = null,
    started: js.Any = null,
    tsconfigPath: js.Any = null,
    tslint: js.Any = null,
    tslintPath: js.Any = null
  ): ForkTsCheckerWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = apply, async = async, checkDone = checkDone, checkSyntacticErrors = checkSyntacticErrors, colors = colors, compilationDone = compilationDone, compiler = compiler, compilerOptions = compilerOptions, computeContextPath = computeContextPath, createDoneCallback = createDoneCallback, createEmitCallback = createEmitCallback, createNoopEmitCallback = createNoopEmitCallback, diagnostics = diagnostics, doneCallback = doneCallback, emitCallback = emitCallback, formatter = formatter, handleServiceExit = handleServiceExit, handleServiceMessage = handleServiceMessage, ignoreDiagnostics = ignoreDiagnostics, ignoreLints = ignoreLints, isWatching = isWatching, killService = killService, lints = lints, logger = logger, memoryLimit = memoryLimit, options = options, pluginCompile = pluginCompile, pluginDone = pluginDone, pluginEmit = pluginEmit, pluginStart = pluginStart, pluginStop = pluginStop, registerCustomHooks = registerCustomHooks, reportFiles = reportFiles, silent = silent, spawnService = spawnService, tsconfig = tsconfig, tslintAutoFix = tslintAutoFix, tslintVersion = tslintVersion, typescriptVersion = typescriptVersion, useColors = useColors, vue = vue, watch = watch, watchPaths = watchPaths, workersNumber = workersNumber)
    if (cancellationToken != null) __obj.updateDynamic("cancellationToken")(cancellationToken)
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed)
    if (service != null) __obj.updateDynamic("service")(service)
    if (started != null) __obj.updateDynamic("started")(started)
    if (tsconfigPath != null) __obj.updateDynamic("tsconfigPath")(tsconfigPath)
    if (tslint != null) __obj.updateDynamic("tslint")(tslint)
    if (tslintPath != null) __obj.updateDynamic("tslintPath")(tslintPath)
    __obj.asInstanceOf[ForkTsCheckerWebpackPlugin]
  }
}


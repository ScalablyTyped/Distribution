package typings.forkTsCheckerWebpackPlugin.mod

import typings.std.Partial
import typings.workerRpc.mod.RpcProvider
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
  var cancellationToken: js.Any
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
  var elapsed: js.Any
  var emitCallback: js.Any
  var eslint: js.Any
  var eslintOptions: js.Any
  var eslintVersion: js.Any
  var formatter: js.Any
  var handleServiceExit: js.Any
  var handleServiceMessage: js.Any
  var ignoreDiagnostics: js.Any
  var ignoreLintWarnings: js.Any
  var ignoreLints: js.Any
  var isWatching: js.Any
  var killService: js.Any
  var lints: js.Any
  var logger: js.Any
  var measureTime: js.Any
  var memoryLimit: js.Any
  var nodeArgs: js.Array[String]
  val options: Partial[Options]
  var performance: js.Any
  var pluginCompile: js.Any
  var pluginDone: js.Any
  var pluginEmit: js.Any
  var pluginStart: js.Any
  var pluginStop: js.Any
  var printLoggerMessage: js.Any
  var reportFiles: js.Any
  var resolveModuleNameModule: js.Any
  var resolveTypeReferenceDirectiveModule: js.Any
  var service: js.UndefOr[js.Any] = js.undefined
  var serviceRpc: js.UndefOr[RpcProvider] = js.undefined
  var silent: js.Any
  var spawnService: js.Any
  var startAt: js.Any
  var started: js.Any
  var tsconfig: js.Any
  var tsconfigPath: js.Any
  var tslint: js.Any
  var tslintAutoFix: js.Any
  var tslintPath: js.Any
  var tslintVersion: js.Any
  var typescript: js.Any
  var typescriptPath: js.Any
  var typescriptVersion: js.Any
  var useColors: js.Any
  var useTypescriptIncrementalApi: js.Any
  var validateEslint: js.Any
  var validateTslint: js.Any
  var validateTypeScript: js.Any
  var vue: js.Any
  var watch: js.Any
  var watchPaths: js.Any
  var workersNumber: js.Any
  @JSName("apply")
  def apply(compiler: js.Any): Unit
}

object ForkTsCheckerWebpackPlugin {
  @scala.inline
  def apply(
    apply: js.Any => Unit,
    async: js.Any,
    cancellationToken: js.Any,
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
    elapsed: js.Any,
    emitCallback: js.Any,
    eslint: js.Any,
    eslintOptions: js.Any,
    eslintVersion: js.Any,
    formatter: js.Any,
    handleServiceExit: js.Any,
    handleServiceMessage: js.Any,
    ignoreDiagnostics: js.Any,
    ignoreLintWarnings: js.Any,
    ignoreLints: js.Any,
    isWatching: js.Any,
    killService: js.Any,
    lints: js.Any,
    logger: js.Any,
    measureTime: js.Any,
    memoryLimit: js.Any,
    nodeArgs: js.Array[String],
    options: Partial[Options],
    performance: js.Any,
    pluginCompile: js.Any,
    pluginDone: js.Any,
    pluginEmit: js.Any,
    pluginStart: js.Any,
    pluginStop: js.Any,
    printLoggerMessage: js.Any,
    reportFiles: js.Any,
    resolveModuleNameModule: js.Any,
    resolveTypeReferenceDirectiveModule: js.Any,
    silent: js.Any,
    spawnService: js.Any,
    startAt: js.Any,
    started: js.Any,
    tsconfig: js.Any,
    tsconfigPath: js.Any,
    tslint: js.Any,
    tslintAutoFix: js.Any,
    tslintPath: js.Any,
    tslintVersion: js.Any,
    typescript: js.Any,
    typescriptPath: js.Any,
    typescriptVersion: js.Any,
    useColors: js.Any,
    useTypescriptIncrementalApi: js.Any,
    validateEslint: js.Any,
    validateTslint: js.Any,
    validateTypeScript: js.Any,
    vue: js.Any,
    watch: js.Any,
    watchPaths: js.Any,
    workersNumber: js.Any,
    service: js.Any = null,
    serviceRpc: RpcProvider = null
  ): ForkTsCheckerWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), async = async.asInstanceOf[js.Any], cancellationToken = cancellationToken.asInstanceOf[js.Any], checkDone = checkDone.asInstanceOf[js.Any], checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compilationDone = compilationDone.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], computeContextPath = computeContextPath.asInstanceOf[js.Any], createDoneCallback = createDoneCallback.asInstanceOf[js.Any], createEmitCallback = createEmitCallback.asInstanceOf[js.Any], createNoopEmitCallback = createNoopEmitCallback.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], doneCallback = doneCallback.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], emitCallback = emitCallback.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], eslintOptions = eslintOptions.asInstanceOf[js.Any], eslintVersion = eslintVersion.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], handleServiceExit = handleServiceExit.asInstanceOf[js.Any], handleServiceMessage = handleServiceMessage.asInstanceOf[js.Any], ignoreDiagnostics = ignoreDiagnostics.asInstanceOf[js.Any], ignoreLintWarnings = ignoreLintWarnings.asInstanceOf[js.Any], ignoreLints = ignoreLints.asInstanceOf[js.Any], isWatching = isWatching.asInstanceOf[js.Any], killService = killService.asInstanceOf[js.Any], lints = lints.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], measureTime = measureTime.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], nodeArgs = nodeArgs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], pluginCompile = pluginCompile.asInstanceOf[js.Any], pluginDone = pluginDone.asInstanceOf[js.Any], pluginEmit = pluginEmit.asInstanceOf[js.Any], pluginStart = pluginStart.asInstanceOf[js.Any], pluginStop = pluginStop.asInstanceOf[js.Any], printLoggerMessage = printLoggerMessage.asInstanceOf[js.Any], reportFiles = reportFiles.asInstanceOf[js.Any], resolveModuleNameModule = resolveModuleNameModule.asInstanceOf[js.Any], resolveTypeReferenceDirectiveModule = resolveTypeReferenceDirectiveModule.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], spawnService = spawnService.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], tsconfigPath = tsconfigPath.asInstanceOf[js.Any], tslint = tslint.asInstanceOf[js.Any], tslintAutoFix = tslintAutoFix.asInstanceOf[js.Any], tslintPath = tslintPath.asInstanceOf[js.Any], tslintVersion = tslintVersion.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], typescriptPath = typescriptPath.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any], useColors = useColors.asInstanceOf[js.Any], useTypescriptIncrementalApi = useTypescriptIncrementalApi.asInstanceOf[js.Any], validateEslint = validateEslint.asInstanceOf[js.Any], validateTslint = validateTslint.asInstanceOf[js.Any], validateTypeScript = validateTypeScript.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPaths = watchPaths.asInstanceOf[js.Any], workersNumber = workersNumber.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (serviceRpc != null) __obj.updateDynamic("serviceRpc")(serviceRpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForkTsCheckerWebpackPlugin]
  }
}


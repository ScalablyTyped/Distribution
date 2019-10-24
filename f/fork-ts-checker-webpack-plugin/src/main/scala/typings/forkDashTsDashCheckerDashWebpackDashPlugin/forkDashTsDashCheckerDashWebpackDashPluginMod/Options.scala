package typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginNumbers.`true`
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.codeframe
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: Boolean
  var checkSyntacticErrors: Boolean
  var colors: Boolean
  var compilerOptions: js.Object
  var eslint: Boolean
  /** Options to supply to eslint https://eslint.org/docs/1.0.0/developer-guide/nodejs-api#cliengine */
  var eslintOptions: js.Object
  var formatter: default | codeframe | Formatter
  var formatterOptions: js.Any
  var ignoreDiagnostics: js.Array[Double]
  var ignoreLintWarnings: Boolean
  var ignoreLints: js.Array[String]
  var logger: Logger
  var measureCompilationTime: Boolean
  var memoryLimit: Double
  var reportFiles: js.Array[String]
  var resolveModuleNameModule: String
  var resolveTypeReferenceDirectiveModule: String
  var silent: Boolean
  var tsconfig: String
  var tslint: js.UndefOr[String | `true`] = js.undefined
  var tslintAutoFix: Boolean
  var typescript: String
  var useTypescriptIncrementalApi: Boolean
  var vue: Boolean
  var watch: String | js.Array[String]
  var workers: Double
}

object Options {
  @scala.inline
  def apply(
    async: Boolean,
    checkSyntacticErrors: Boolean,
    colors: Boolean,
    compilerOptions: js.Object,
    eslint: Boolean,
    eslintOptions: js.Object,
    formatter: default | codeframe | Formatter,
    formatterOptions: js.Any,
    ignoreDiagnostics: js.Array[Double],
    ignoreLintWarnings: Boolean,
    ignoreLints: js.Array[String],
    logger: Logger,
    measureCompilationTime: Boolean,
    memoryLimit: Double,
    reportFiles: js.Array[String],
    resolveModuleNameModule: String,
    resolveTypeReferenceDirectiveModule: String,
    silent: Boolean,
    tsconfig: String,
    tslintAutoFix: Boolean,
    typescript: String,
    useTypescriptIncrementalApi: Boolean,
    vue: Boolean,
    watch: String | js.Array[String],
    workers: Double,
    tslint: String | `true` = null
  ): Options = {
    val __obj = js.Dynamic.literal(async = async, checkSyntacticErrors = checkSyntacticErrors, colors = colors, compilerOptions = compilerOptions, eslint = eslint, eslintOptions = eslintOptions, formatter = formatter.asInstanceOf[js.Any], formatterOptions = formatterOptions, ignoreDiagnostics = ignoreDiagnostics, ignoreLintWarnings = ignoreLintWarnings, ignoreLints = ignoreLints, logger = logger, measureCompilationTime = measureCompilationTime, memoryLimit = memoryLimit, reportFiles = reportFiles, resolveModuleNameModule = resolveModuleNameModule, resolveTypeReferenceDirectiveModule = resolveTypeReferenceDirectiveModule, silent = silent, tsconfig = tsconfig, tslintAutoFix = tslintAutoFix, typescript = typescript, useTypescriptIncrementalApi = useTypescriptIncrementalApi, vue = vue, watch = watch.asInstanceOf[js.Any], workers = workers)
    if (tslint != null) __obj.updateDynamic("tslint")(tslint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


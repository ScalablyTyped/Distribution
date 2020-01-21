package typings.forkTsCheckerWebpackPlugin.mod

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.default
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
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], eslintOptions = eslintOptions.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], ignoreDiagnostics = ignoreDiagnostics.asInstanceOf[js.Any], ignoreLintWarnings = ignoreLintWarnings.asInstanceOf[js.Any], ignoreLints = ignoreLints.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], measureCompilationTime = measureCompilationTime.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], reportFiles = reportFiles.asInstanceOf[js.Any], resolveModuleNameModule = resolveModuleNameModule.asInstanceOf[js.Any], resolveTypeReferenceDirectiveModule = resolveTypeReferenceDirectiveModule.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], tslintAutoFix = tslintAutoFix.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], useTypescriptIncrementalApi = useTypescriptIncrementalApi.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    if (tslint != null) __obj.updateDynamic("tslint")(tslint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


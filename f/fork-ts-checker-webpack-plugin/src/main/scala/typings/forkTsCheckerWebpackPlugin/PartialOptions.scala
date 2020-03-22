package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import typings.forkTsCheckerWebpackPlugin.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin.Options> */
trait PartialOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var checkSyntacticErrors: js.UndefOr[Boolean] = js.undefined
  var compilerOptions: js.UndefOr[js.Object] = js.undefined
  var eslint: js.UndefOr[Boolean] = js.undefined
  var eslintOptions: js.UndefOr[js.Object] = js.undefined
  var formatter: js.UndefOr[FormatterType] = js.undefined
  var formatterOptions: js.UndefOr[FormatterOptions] = js.undefined
  var ignoreDiagnostics: js.UndefOr[js.Array[Double]] = js.undefined
  var ignoreLintWarnings: js.UndefOr[Boolean] = js.undefined
  var ignoreLints: js.UndefOr[js.Array[String]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var measureCompilationTime: js.UndefOr[Boolean] = js.undefined
  var memoryLimit: js.UndefOr[Double] = js.undefined
  var reportFiles: js.UndefOr[js.Array[String]] = js.undefined
  var resolveModuleNameModule: js.UndefOr[String] = js.undefined
  var resolveTypeReferenceDirectiveModule: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var tsconfig: js.UndefOr[String] = js.undefined
  var typescript: js.UndefOr[String] = js.undefined
  var useTypescriptIncrementalApi: js.UndefOr[Boolean] = js.undefined
  var vue: js.UndefOr[Boolean | PartialVueOptions] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    checkSyntacticErrors: js.UndefOr[Boolean] = js.undefined,
    compilerOptions: js.Object = null,
    eslint: js.UndefOr[Boolean] = js.undefined,
    eslintOptions: js.Object = null,
    formatter: FormatterType = null,
    formatterOptions: FormatterOptions = null,
    ignoreDiagnostics: js.Array[Double] = null,
    ignoreLintWarnings: js.UndefOr[Boolean] = js.undefined,
    ignoreLints: js.Array[String] = null,
    logger: Logger = null,
    measureCompilationTime: js.UndefOr[Boolean] = js.undefined,
    memoryLimit: Int | Double = null,
    reportFiles: js.Array[String] = null,
    resolveModuleNameModule: String = null,
    resolveTypeReferenceDirectiveModule: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    tsconfig: String = null,
    typescript: String = null,
    useTypescriptIncrementalApi: js.UndefOr[Boolean] = js.undefined,
    vue: Boolean | PartialVueOptions = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(checkSyntacticErrors)) __obj.updateDynamic("checkSyntacticErrors")(checkSyntacticErrors.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(eslint)) __obj.updateDynamic("eslint")(eslint.asInstanceOf[js.Any])
    if (eslintOptions != null) __obj.updateDynamic("eslintOptions")(eslintOptions.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formatterOptions != null) __obj.updateDynamic("formatterOptions")(formatterOptions.asInstanceOf[js.Any])
    if (ignoreDiagnostics != null) __obj.updateDynamic("ignoreDiagnostics")(ignoreDiagnostics.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLintWarnings)) __obj.updateDynamic("ignoreLintWarnings")(ignoreLintWarnings.asInstanceOf[js.Any])
    if (ignoreLints != null) __obj.updateDynamic("ignoreLints")(ignoreLints.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(measureCompilationTime)) __obj.updateDynamic("measureCompilationTime")(measureCompilationTime.asInstanceOf[js.Any])
    if (memoryLimit != null) __obj.updateDynamic("memoryLimit")(memoryLimit.asInstanceOf[js.Any])
    if (reportFiles != null) __obj.updateDynamic("reportFiles")(reportFiles.asInstanceOf[js.Any])
    if (resolveModuleNameModule != null) __obj.updateDynamic("resolveModuleNameModule")(resolveModuleNameModule.asInstanceOf[js.Any])
    if (resolveTypeReferenceDirectiveModule != null) __obj.updateDynamic("resolveTypeReferenceDirectiveModule")(resolveTypeReferenceDirectiveModule.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (tsconfig != null) __obj.updateDynamic("tsconfig")(tsconfig.asInstanceOf[js.Any])
    if (typescript != null) __obj.updateDynamic("typescript")(typescript.asInstanceOf[js.Any])
    if (!js.isUndefined(useTypescriptIncrementalApi)) __obj.updateDynamic("useTypescriptIncrementalApi")(useTypescriptIncrementalApi.asInstanceOf[js.Any])
    if (vue != null) __obj.updateDynamic("vue")(vue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}


package typings.forkTsCheckerWebpackPlugin.mod

import typings.forkTsCheckerWebpackPlugin.anon.PartialVueOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: Boolean
  var checkSyntacticErrors: Boolean
  var compilerOptions: js.Object
  var eslint: Boolean
  /** Options to supply to eslint https://eslint.org/docs/developer-guide/nodejs-api#cliengine */
  var eslintOptions: typings.forkTsCheckerWebpackPlugin.typesEslintMod.Options
  var formatter: FormatterType
  var formatterOptions: FormatterOptions
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
  var typescript: String
  var useTypescriptIncrementalApi: Boolean
  var vue: Boolean | PartialVueOptions
}

object Options {
  @scala.inline
  def apply(
    async: Boolean,
    checkSyntacticErrors: Boolean,
    compilerOptions: js.Object,
    eslint: Boolean,
    eslintOptions: typings.forkTsCheckerWebpackPlugin.typesEslintMod.Options,
    formatterOptions: FormatterOptions,
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
    typescript: String,
    useTypescriptIncrementalApi: Boolean,
    vue: Boolean | PartialVueOptions,
    formatter: FormatterType = null
  ): Options = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], eslintOptions = eslintOptions.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], ignoreDiagnostics = ignoreDiagnostics.asInstanceOf[js.Any], ignoreLintWarnings = ignoreLintWarnings.asInstanceOf[js.Any], ignoreLints = ignoreLints.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], measureCompilationTime = measureCompilationTime.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], reportFiles = reportFiles.asInstanceOf[js.Any], resolveModuleNameModule = resolveModuleNameModule.asInstanceOf[js.Any], resolveTypeReferenceDirectiveModule = resolveTypeReferenceDirectiveModule.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], useTypescriptIncrementalApi = useTypescriptIncrementalApi.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


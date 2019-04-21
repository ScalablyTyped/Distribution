package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: scala.Boolean
  var checkSyntacticErrors: scala.Boolean
  var colors: scala.Boolean
  var compilerOptions: js.Object
  var formatter: forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.default | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.codeframe | forkDashTsDashCheckerDashWebpackDashPluginLib.Formatter
  var formatterOptions: js.Any
  var ignoreDiagnostics: js.Array[scala.Double]
  var ignoreLintWarnings: scala.Boolean
  var ignoreLints: js.Array[java.lang.String]
  var logger: Logger
  var measureCompilationTime: scala.Boolean
  var memoryLimit: scala.Double
  var reportFiles: js.Array[java.lang.String]
  var resolveModuleNameModule: java.lang.String
  var resolveTypeReferenceDirectiveModule: java.lang.String
  var silent: scala.Boolean
  var tsconfig: java.lang.String
  var tslint: java.lang.String | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibNumbers.`true`
  var tslintAutoFix: scala.Boolean
  var typescript: java.lang.String
  var useTypescriptIncrementalApi: scala.Boolean
  var vue: scala.Boolean
  var watch: java.lang.String | js.Array[java.lang.String]
  var workers: scala.Double
}

object Options {
  @scala.inline
  def apply(
    async: scala.Boolean,
    checkSyntacticErrors: scala.Boolean,
    colors: scala.Boolean,
    compilerOptions: js.Object,
    formatter: forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.default | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibStrings.codeframe | forkDashTsDashCheckerDashWebpackDashPluginLib.Formatter,
    formatterOptions: js.Any,
    ignoreDiagnostics: js.Array[scala.Double],
    ignoreLintWarnings: scala.Boolean,
    ignoreLints: js.Array[java.lang.String],
    logger: Logger,
    measureCompilationTime: scala.Boolean,
    memoryLimit: scala.Double,
    reportFiles: js.Array[java.lang.String],
    resolveModuleNameModule: java.lang.String,
    resolveTypeReferenceDirectiveModule: java.lang.String,
    silent: scala.Boolean,
    tsconfig: java.lang.String,
    tslint: java.lang.String | forkDashTsDashCheckerDashWebpackDashPluginLib.forkDashTsDashCheckerDashWebpackDashPluginLibNumbers.`true`,
    tslintAutoFix: scala.Boolean,
    typescript: java.lang.String,
    useTypescriptIncrementalApi: scala.Boolean,
    vue: scala.Boolean,
    watch: java.lang.String | js.Array[java.lang.String],
    workers: scala.Double
  ): Options = {
    val __obj = js.Dynamic.literal(async = async, checkSyntacticErrors = checkSyntacticErrors, colors = colors, compilerOptions = compilerOptions, formatter = formatter.asInstanceOf[js.Any], formatterOptions = formatterOptions, ignoreDiagnostics = ignoreDiagnostics, ignoreLintWarnings = ignoreLintWarnings, ignoreLints = ignoreLints, logger = logger, measureCompilationTime = measureCompilationTime, memoryLimit = memoryLimit, reportFiles = reportFiles, resolveModuleNameModule = resolveModuleNameModule, resolveTypeReferenceDirectiveModule = resolveTypeReferenceDirectiveModule, silent = silent, tsconfig = tsconfig, tslint = tslint.asInstanceOf[js.Any], tslintAutoFix = tslintAutoFix, typescript = typescript, useTypescriptIncrementalApi = useTypescriptIncrementalApi, vue = vue, watch = watch.asInstanceOf[js.Any], workers = workers)
  
    __obj.asInstanceOf[Options]
  }
}


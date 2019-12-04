package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libPatchTypescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptPatchConfig extends js.Object {
  /**
    * Ususally, the compilerHost created with typescript.createWatchCompilerHost will bail out of diagnostics collection if there has been any syntactic error.
    * (see [`emitFilesAndReportErrors`](https://github.com/Microsoft/TypeScript/blob/89386ddda7dafc63cb35560e05412487f47cc267/src/compiler/watch.ts#L141) )
    * If this plugin is running with `checkSyntacticErrors: false`, this might lead to situations where no syntactic errors are reported within webpack
    * (because the file causing a syntactic error might not get processed by ts-loader), but there are semantic errors that would be missed due to this behavior.
    * This ensures that the compilerHost always assumes that there were no syntactic errors to be found and continues to check for semantic errors.
    */
  var skipGetSyntacticDiagnostics: Boolean
}

object TypeScriptPatchConfig {
  @scala.inline
  def apply(skipGetSyntacticDiagnostics: Boolean): TypeScriptPatchConfig = {
    val __obj = js.Dynamic.literal(skipGetSyntacticDiagnostics = skipGetSyntacticDiagnostics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeScriptPatchConfig]
  }
}


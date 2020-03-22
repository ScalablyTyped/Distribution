package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken
import typings.forkTsCheckerWebpackPlugin.compilerHostMod.CompilerHost
import typings.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod.IncrementalCheckerInterface
import typings.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod.IncrementalCheckerParams
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/ApiIncrementalChecker", JSImport.Namespace)
@js.native
object apiIncrementalCheckerMod extends js.Object {
  @js.native
  class ApiIncrementalChecker protected () extends IncrementalCheckerInterface {
    def this(hasTypescriptProgramConfigFileCompilerOptionsEslinterVueCheckSyntacticErrorsResolveModuleNameResolveTypeReferenceDirective: IncrementalCheckerParams) = this()
    var currentEsLintErrors: js.Any = js.native
    val eslinter: js.Any = js.native
    var lastRemovedFiles: js.Any = js.native
    var lastUpdatedFiles: js.Any = js.native
    val tsIncrementalCompiler: CompilerHost = js.native
    val typescript: Typeofts = js.native
    /* CompleteClass */
    override def getEsLintIssues(cancellationToken: CancellationToken): js.Promise[js.Array[Issue]] = js.native
    def getTypeScriptIssues(): js.Promise[js.Array[Issue]] = js.native
    /* CompleteClass */
    override def getTypeScriptIssues(cancellationToken: CancellationToken): js.Promise[js.Array[Issue]] = js.native
    /* CompleteClass */
    override def hasEsLinter(): Boolean = js.native
    def isFileExcluded(filePath: String): Boolean = js.native
    /* CompleteClass */
    override def nextIteration(): Unit = js.native
  }
  
}


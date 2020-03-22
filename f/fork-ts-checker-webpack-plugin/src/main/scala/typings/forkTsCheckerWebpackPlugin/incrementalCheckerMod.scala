package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken
import typings.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod.IncrementalCheckerInterface
import typings.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod.IncrementalCheckerParams
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/IncrementalChecker", JSImport.Namespace)
@js.native
object incrementalCheckerMod extends js.Object {
  @js.native
  class IncrementalChecker protected () extends IncrementalCheckerInterface {
    def this(hasTypescriptProgramConfigFileCompilerOptionsEslinterVueCheckSyntacticErrorsResolveModuleNameResolveTypeReferenceDirective: IncrementalCheckerParams) = this()
    val checkSyntacticErrors: js.Any = js.native
    val compilerOptions: js.Any = js.native
    val eslinter: js.Any = js.native
    var files: js.Any = js.native
    var loadDefaultProgram: js.Any = js.native
    var loadVueProgram: js.Any = js.native
    var program: js.UndefOr[Program] = js.native
    var programConfig: js.UndefOr[ParsedCommandLine] = js.native
    val programConfigFile: js.Any = js.native
    val resolveModuleName: js.Any = js.native
    val resolveTypeReferenceDirective: js.Any = js.native
    val typescript: js.Any = js.native
    val vue: js.Any = js.native
    /* CompleteClass */
    override def getEsLintIssues(cancellationToken: CancellationToken): js.Promise[js.Array[Issue]] = js.native
    /* CompleteClass */
    override def getTypeScriptIssues(cancellationToken: CancellationToken): js.Promise[js.Array[Issue]] = js.native
    /* CompleteClass */
    override def hasEsLinter(): Boolean = js.native
    /* CompleteClass */
    override def nextIteration(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object IncrementalChecker extends js.Object {
    var createProgram: js.Any = js.native
    def isFileExcluded(filePath: String): Boolean = js.native
    def loadProgramConfig(typescript: Typeofts, configFile: String, compilerOptions: js.Object): ParsedCommandLine = js.native
  }
  
}


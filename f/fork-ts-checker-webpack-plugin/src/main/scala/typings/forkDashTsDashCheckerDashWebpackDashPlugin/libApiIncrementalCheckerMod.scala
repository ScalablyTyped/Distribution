package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libCancellationTokenMod.CancellationToken
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libCompilerHostMod.CompilerHost
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libIncrementalCheckerInterfaceMod.ApiIncrementalCheckerParams
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libIncrementalCheckerInterfaceMod.IncrementalCheckerInterface
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libNormalizedMessageMod.NormalizedMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/ApiIncrementalChecker", JSImport.Namespace)
@js.native
object libApiIncrementalCheckerMod extends js.Object {
  @js.native
  class ApiIncrementalChecker protected () extends IncrementalCheckerInterface {
    def this(hasTypescriptContextProgramConfigFileCompilerOptionsCreateNormalizedMessageFromDiagnosticLinterConfigFileLinterAutoFixCreateNormalizedMessageFromRuleFailureEslinterCheckSyntacticErrorsResolveModuleNameResolveTypeReferenceDirective: ApiIncrementalCheckerParams) = this()
    val context: js.Any = js.native
    var createLinter: js.Any = js.native
    val createNormalizedMessageFromDiagnostic: js.Any = js.native
    val createNormalizedMessageFromRuleFailure: js.Any = js.native
    var currentEsLintErrors: js.Any = js.native
    var currentLintErrors: js.Any = js.native
    val eslinter: js.Any = js.native
    var getLinterConfig: js.Any = js.native
    val hasFixedConfig: js.Any = js.native
    var initLinterConfig: js.Any = js.native
    var lastRemovedFiles: js.Any = js.native
    var lastUpdatedFiles: js.Any = js.native
    val linterAutoFix: js.Any = js.native
    var linterConfig: js.UndefOr[js.Any] = js.native
    val linterConfigFile: js.Any = js.native
    var linterConfigs: js.Any = js.native
    var linterExclusions: js.Any = js.native
    val tsIncrementalCompiler: CompilerHost = js.native
    /* CompleteClass */
    override def getDiagnostics(cancellationToken: CancellationToken): js.Promise[js.Array[NormalizedMessage]] = js.native
    /* CompleteClass */
    override def getEsLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage] = js.native
    /* CompleteClass */
    override def getLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage] = js.native
    /* CompleteClass */
    override def hasEsLinter(): Boolean = js.native
    /* CompleteClass */
    override def hasLinter(): Boolean = js.native
    def isFileExcluded(filePath: String): Boolean = js.native
    /* CompleteClass */
    override def nextIteration(): Unit = js.native
  }
  
}


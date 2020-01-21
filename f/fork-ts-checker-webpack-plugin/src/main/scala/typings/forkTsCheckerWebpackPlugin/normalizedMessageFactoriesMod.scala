package typings.forkTsCheckerWebpackPlugin

import typings.eslint.mod.Linter.LintMessage
import typings.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typings.tslint.mod.RuleFailure
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/NormalizedMessageFactories", JSImport.Namespace)
@js.native
object normalizedMessageFactoriesMod extends js.Object {
  def makeCreateNormalizedMessageFromDiagnostic(typescript: Typeofts): js.Function1[/* diagnostic */ Diagnostic, NormalizedMessage] = js.native
  def makeCreateNormalizedMessageFromEsLintFailure(): js.Function2[/* lint */ LintMessage, /* filePath */ String, NormalizedMessage] = js.native
  def makeCreateNormalizedMessageFromInternalError(): js.Function1[/* error */ js.Any, NormalizedMessage] = js.native
  def makeCreateNormalizedMessageFromRuleFailure(): js.Function1[/* lint */ RuleFailure, NormalizedMessage] = js.native
}


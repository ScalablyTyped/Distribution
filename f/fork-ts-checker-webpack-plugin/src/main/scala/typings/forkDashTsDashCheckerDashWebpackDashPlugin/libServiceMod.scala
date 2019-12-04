package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libNormalizedMessageMod.NormalizedMessage
import typings.tslint.tslintMod.RuleFailure
import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/service", JSImport.Namespace)
@js.native
object libServiceMod extends js.Object {
  def createNormalizedMessageFromDiagnostic(diagnostic: Diagnostic): NormalizedMessage = js.native
  def createNormalizedMessageFromInternalError(error: js.Any): NormalizedMessage = js.native
  def createNormalizedMessageFromRuleFailure(lint: RuleFailure): NormalizedMessage = js.native
}


package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typings.tslint.mod.RuleFailure
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/service", JSImport.Namespace)
@js.native
object serviceMod extends js.Object {
  def createNormalizedMessageFromDiagnostic(diagnostic: Diagnostic): NormalizedMessage = js.native
  def createNormalizedMessageFromInternalError(error: js.Any): NormalizedMessage = js.native
  def createNormalizedMessageFromRuleFailure(lint: RuleFailure): NormalizedMessage = js.native
}


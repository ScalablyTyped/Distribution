package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/NormalizedMessage", "NormalizedMessage")
@js.native
class NormalizedMessage protected () extends js.Object {
  def this(data: NormalizedMessageJson) = this()
  val character: js.UndefOr[scala.Double] = js.native
  val code: java.lang.String | scala.Double = js.native
  val content: java.lang.String = js.native
  val file: js.UndefOr[java.lang.String] = js.native
  val line: js.UndefOr[scala.Double] = js.native
  val severity: Severity = js.native
  val `type`: ErrorType = js.native
  def getFormattedCode(): java.lang.String | scala.Double = js.native
  def isDiagnosticType(): scala.Boolean = js.native
  def isErrorSeverity(): scala.Boolean = js.native
  def isLintType(): scala.Boolean = js.native
  def isWarningSeverity(): scala.Boolean = js.native
  def toJSON(): NormalizedMessageJson = js.native
}

/* static members */
@JSImport("fork-ts-checker-webpack-plugin/lib/NormalizedMessage", "NormalizedMessage")
@js.native
object NormalizedMessage extends js.Object {
  val SEVERITY_ERROR: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.Severity = js.native
  val SEVERITY_WARNING: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.Severity = js.native
  val TYPE_DIAGNOSTIC: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.ErrorType = js.native
  val TYPE_LINT: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.ErrorType = js.native
  def compare(
    messageA: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage,
    messageB: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage
  ): scala.Double = js.native
  def compareNumbers(): scala.Double = js.native
  def compareNumbers(numberA: scala.Double): scala.Double = js.native
  def compareNumbers(numberA: scala.Double, numberB: scala.Double): scala.Double = js.native
  def compareOptionalStrings(): scala.Double = js.native
  def compareOptionalStrings(stringA: java.lang.String): scala.Double = js.native
  def compareOptionalStrings(stringA: java.lang.String, stringB: java.lang.String): scala.Double = js.native
  def compareSeverities(
    severityA: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.Severity,
    severityB: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.Severity
  ): scala.Double = js.native
  def compareTypes(
    typeA: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.ErrorType,
    typeB: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.ErrorType
  ): scala.Double = js.native
  def createFromDiagnostic(diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic): forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage = js.native
  def createFromJSON(json: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessageJson): forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage = js.native
  def createFromLint(
    lint: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RuleFailure */ js.Any
  ): forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage = js.native
  def deduplicate(
    messages: js.Array[
      forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage
    ]
  ): js.Array[
    forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage
  ] = js.native
  def equals(
    messageA: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage,
    messageB: forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.NormalizedMessage
  ): scala.Boolean = js.native
}


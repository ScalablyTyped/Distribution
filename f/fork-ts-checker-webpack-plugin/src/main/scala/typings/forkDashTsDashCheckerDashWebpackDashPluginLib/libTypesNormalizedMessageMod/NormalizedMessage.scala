package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/types/NormalizedMessage", "NormalizedMessage")
@js.native
class NormalizedMessage protected () extends js.Object {
  def this(data: NormalizedMessageJson) = this()
  var character: scala.Double = js.native
  var code: java.lang.String | scala.Double = js.native
  var content: java.lang.String = js.native
  var file: java.lang.String = js.native
  var line: scala.Double = js.native
  var severity: Severity = js.native
  var `type`: ErrorType = js.native
  def getCharacter(): scala.Double = js.native
  def getCode(): java.lang.String | scala.Double = js.native
  def getContent(): java.lang.String = js.native
  def getFile(): java.lang.String = js.native
  def getFormattedCode(): java.lang.String | scala.Double = js.native
  def getLine(): scala.Double = js.native
  def getSeverity(): Severity = js.native
  def getType(): ErrorType = js.native
  def isDiagnosticType(): scala.Boolean = js.native
  def isErrorSeverity(): scala.Boolean = js.native
  def isLintType(): scala.Boolean = js.native
  def isWarningSeverity(): scala.Boolean = js.native
  def toJSON(): NormalizedMessageJson = js.native
}

@JSImport("fork-ts-checker-webpack-plugin/lib/types/NormalizedMessage", "NormalizedMessage")
@js.native
object NormalizedMessage extends js.Object {
  var SEVERITY_ERROR: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.Severity = js.native
  var SEVERITY_WARNING: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.Severity = js.native
  var TYPE_DIAGNOSTIC: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.ErrorType = js.native
  var TYPE_LINT: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.ErrorType = js.native
  def compare(
    messageA: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage,
    messageB: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage
  ): scala.Double = js.native
  def compareNumbers(numberA: scala.Double, numberB: scala.Double): scala.Double = js.native
  def compareOptionalStrings(stringA: java.lang.String, stringB: java.lang.String): scala.Double = js.native
  def compareSeverities(
    severityA: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.Severity,
    severityB: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.Severity
  ): scala.Double = js.native
  def compareTypes(
    typeA: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.ErrorType,
    typeB: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.ErrorType
  ): scala.Double = js.native
  def createFromDiagnostic(diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic): forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage = js.native
  def createFromJSON(
    json: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessageJson
  ): forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage = js.native
  def createFromLint(lint: tslintLib.tslintMod.RuleFailure): forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage = js.native
  def deduplicate(
    messages: js.Array[
      forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage
    ]
  ): js.Array[
    forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage
  ] = js.native
  def equals(
    messageA: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage,
    messageB: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesNormalizedMessageMod.NormalizedMessage
  ): scala.Boolean = js.native
}


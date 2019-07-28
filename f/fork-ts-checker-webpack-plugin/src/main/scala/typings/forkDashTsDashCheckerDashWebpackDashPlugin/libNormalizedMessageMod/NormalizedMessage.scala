package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libNormalizedMessageMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.forkDashTsDashCheckerDashWebpackDashPluginStrings.INTERNAL_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/NormalizedMessage", "NormalizedMessage")
@js.native
class NormalizedMessage protected () extends js.Object {
  def this(data: NormalizedMessageJson) = this()
  val character: js.UndefOr[Double] = js.native
  val code: String | Double = js.native
  val content: String = js.native
  val file: js.UndefOr[String] = js.native
  val line: js.UndefOr[Double] = js.native
  val severity: Severity = js.native
  val stack: js.UndefOr[String] = js.native
  val `type`: ErrorType = js.native
  def getFormattedCode(): String | Double = js.native
  def isDiagnosticType(): Boolean = js.native
  def isErrorSeverity(): Boolean = js.native
  def isLintType(): Boolean = js.native
  def isWarningSeverity(): Boolean = js.native
  def toJSON(): NormalizedMessageJson = js.native
}

/* static members */
@JSImport("fork-ts-checker-webpack-plugin/lib/NormalizedMessage", "NormalizedMessage")
@js.native
object NormalizedMessage extends js.Object {
  val ERROR_CODE_INTERNAL: INTERNAL_ERROR = js.native
  val SEVERITY_ERROR: Severity = js.native
  val SEVERITY_WARNING: Severity = js.native
  val TYPE_DIAGNOSTIC: ErrorType = js.native
  val TYPE_LINT: ErrorType = js.native
  def compare(messageA: NormalizedMessage, messageB: NormalizedMessage): Double = js.native
  def compareNumbers(): Double = js.native
  def compareNumbers(numberA: Double): Double = js.native
  def compareNumbers(numberA: Double, numberB: Double): Double = js.native
  def compareOptionalStrings(): Double = js.native
  def compareOptionalStrings(stringA: String): Double = js.native
  def compareOptionalStrings(stringA: String, stringB: String): Double = js.native
  def compareSeverities(severityA: Severity, severityB: Severity): Double = js.native
  def compareTypes(typeA: ErrorType, typeB: ErrorType): Double = js.native
  def createFromJSON(json: NormalizedMessageJson): NormalizedMessage = js.native
  def deduplicate(messages: js.Array[NormalizedMessage]): js.Array[NormalizedMessage] = js.native
  def equals(messageA: NormalizedMessage, messageB: NormalizedMessage): Boolean = js.native
}


package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libCancellationTokenMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.Anon_CancellationFileName
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.Typeofts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/CancellationToken", "CancellationToken")
@js.native
class CancellationToken protected () extends js.Object {
  def this(typescript: Typeofts) = this()
  def this(typescript: Typeofts, cancellationFileName: String) = this()
  def this(typescript: Typeofts, cancellationFileName: String, isCancelled: Boolean) = this()
  var cancellationFileName: js.Any = js.native
  var isCancelled: js.Any = js.native
  var lastCancellationCheckTime: js.Any = js.native
  var typescript: js.Any = js.native
  def cleanupCancellation(): Unit = js.native
  def getCancellationFilePath(): String = js.native
  def isCancellationRequested(): Boolean = js.native
  def requestCancellation(): Unit = js.native
  def throwIfCancellationRequested(): Unit = js.native
  def toJSON(): Anon_CancellationFileName = js.native
}

/* static members */
@JSImport("fork-ts-checker-webpack-plugin/lib/CancellationToken", "CancellationToken")
@js.native
object CancellationToken extends js.Object {
  def createFromJSON(typescript: Typeofts, json: CancellationTokenData): CancellationToken = js.native
}


package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesCancellationTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/types/CancellationToken", "CancellationToken")
@js.native
class CancellationToken protected () extends js.Object {
  def this(cancellationFileName: java.lang.String, isCancelled: scala.Boolean) = this()
  var cancellationFileName: java.lang.String = js.native
  var isCancelled: scala.Boolean = js.native
  var lastCancellationCheckTime: scala.Double = js.native
  def cleanupCancellation(): scala.Unit = js.native
  def getCancellationFilePath(): java.lang.String = js.native
  def isCancellationRequested(): scala.Boolean = js.native
  def requestCancellation(): scala.Unit = js.native
  def throwIfCancellationRequested(): scala.Unit = js.native
  def toJSON(): forkDashTsDashCheckerDashWebpackDashPluginLib.Anon_IsCancelled = js.native
}

@JSImport("fork-ts-checker-webpack-plugin/lib/types/CancellationToken", "CancellationToken")
@js.native
object CancellationToken extends js.Object {
  def createFromJSON(
    json: forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesCancellationTokenMod.CancellationTokenData
  ): forkDashTsDashCheckerDashWebpackDashPluginLib.libTypesCancellationTokenMod.CancellationToken = js.native
}


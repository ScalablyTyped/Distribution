package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: gapiDotClientDotDriveLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[StartPageToken]
  /** Lists the changes for a user or Team Drive. */
  def list(request: gapiDotClientDotDriveLib.Anon_PageSize): gapiDotClientLib.gapiNs.clientNs.Request[ChangeList]
  /** Subscribes to changes for a user. */
  def watch(request: gapiDotClientDotDriveLib.Anon_PageSize): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}


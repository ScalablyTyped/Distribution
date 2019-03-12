package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: gapiDotClientDotDriveLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[StartPageToken]
  /** Lists the changes for a user or Team Drive. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltFieldsIncludeCorpusRemovals): gapiDotClientLib.gapiNs.clientNs.Request[ChangeList]
  /** Subscribes to changes for a user. */
  def watch(request: gapiDotClientDotDriveLib.Anon_AltFieldsIncludeCorpusRemovals): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object ChangesResource {
  @scala.inline
  def apply(
    getStartPageToken: gapiDotClientDotDriveLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[StartPageToken],
    list: gapiDotClientDotDriveLib.Anon_AltFieldsIncludeCorpusRemovals => gapiDotClientLib.gapiNs.clientNs.Request[ChangeList],
    watch: gapiDotClientDotDriveLib.Anon_AltFieldsIncludeCorpusRemovals => gapiDotClientLib.gapiNs.clientNs.Request[Channel]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(getStartPageToken = js.Any.fromFunction1(getStartPageToken), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[ChangesResource]
  }
}


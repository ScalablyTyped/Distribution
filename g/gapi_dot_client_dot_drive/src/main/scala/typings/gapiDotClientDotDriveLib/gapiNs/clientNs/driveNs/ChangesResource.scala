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
    getStartPageToken: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[StartPageToken]
    ],
    list: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsIncludeCorpusRemovals, 
      gapiDotClientLib.gapiNs.clientNs.Request[ChangeList]
    ],
    watch: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsIncludeCorpusRemovals, 
      gapiDotClientLib.gapiNs.clientNs.Request[Channel]
    ]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(getStartPageToken = getStartPageToken, list = list, watch = watch)
  
    __obj.asInstanceOf[ChangesResource]
  }
}


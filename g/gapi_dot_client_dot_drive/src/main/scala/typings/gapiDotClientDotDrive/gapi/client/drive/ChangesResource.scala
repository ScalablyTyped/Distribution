package typings.gapiDotClientDotDrive.gapi.client.drive

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDrive.Anon_AltFields
import typings.gapiDotClientDotDrive.Anon_AltFieldsIncludeCorpusRemovals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: Anon_AltFields): Request[StartPageToken]
  /** Lists the changes for a user or Team Drive. */
  def list(request: Anon_AltFieldsIncludeCorpusRemovals): Request[ChangeList]
  /** Subscribes to changes for a user. */
  def watch(request: Anon_AltFieldsIncludeCorpusRemovals): Request[Channel]
}

object ChangesResource {
  @scala.inline
  def apply(
    getStartPageToken: Anon_AltFields => Request[StartPageToken],
    list: Anon_AltFieldsIncludeCorpusRemovals => Request[ChangeList],
    watch: Anon_AltFieldsIncludeCorpusRemovals => Request[Channel]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(getStartPageToken = js.Any.fromFunction1(getStartPageToken), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[ChangesResource]
  }
}


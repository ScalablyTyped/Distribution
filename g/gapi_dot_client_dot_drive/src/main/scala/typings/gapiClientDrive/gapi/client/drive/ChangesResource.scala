package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonAltFields
import typings.gapiClientDrive.AnonAltFieldsIncludeCorpusRemovals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: AnonAltFields): Request_[StartPageToken]
  /** Lists the changes for a user or Team Drive. */
  def list(request: AnonAltFieldsIncludeCorpusRemovals): Request_[ChangeList]
  /** Subscribes to changes for a user. */
  def watch(request: AnonAltFieldsIncludeCorpusRemovals): Request_[Channel]
}

object ChangesResource {
  @scala.inline
  def apply(
    getStartPageToken: AnonAltFields => Request_[StartPageToken],
    list: AnonAltFieldsIncludeCorpusRemovals => Request_[ChangeList],
    watch: AnonAltFieldsIncludeCorpusRemovals => Request_[Channel]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(getStartPageToken = js.Any.fromFunction1(getStartPageToken), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[ChangesResource]
  }
}


package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonFields
import typings.gapiClientDrive.AnonIncludeCorpusRemovals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: AnonFields): Request_[StartPageToken]
  /** Lists the changes for a user or Team Drive. */
  def list(request: AnonIncludeCorpusRemovals): Request_[ChangeList]
  /** Subscribes to changes for a user. */
  def watch(request: AnonIncludeCorpusRemovals): Request_[Channel]
}

object ChangesResource {
  @scala.inline
  def apply(
    getStartPageToken: AnonFields => Request_[StartPageToken],
    list: AnonIncludeCorpusRemovals => Request_[ChangeList],
    watch: AnonIncludeCorpusRemovals => Request_[Channel]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(getStartPageToken = js.Any.fromFunction1(getStartPageToken), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[ChangesResource]
  }
}


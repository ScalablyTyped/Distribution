package typings.gapiClientGroupsmigration.gapi.client.groupsmigration

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGroupsmigration.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveResource extends js.Object {
  /** Inserts a new mail into the archive of the Google group. */
  def insert(request: AnonAlt): Request_[Groups]
}

object ArchiveResource {
  @scala.inline
  def apply(insert: AnonAlt => Request_[Groups]): ArchiveResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[ArchiveResource]
  }
}


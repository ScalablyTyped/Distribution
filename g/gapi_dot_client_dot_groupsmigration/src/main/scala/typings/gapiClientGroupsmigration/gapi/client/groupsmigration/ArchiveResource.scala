package typings.gapiClientGroupsmigration.gapi.client.groupsmigration

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGroupsmigration.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveResource extends js.Object {
  /** Inserts a new mail into the archive of the Google group. */
  def insert(request: Alt): Request[Groups]
}

object ArchiveResource {
  @scala.inline
  def apply(insert: Alt => Request[Groups]): ArchiveResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[ArchiveResource]
  }
}


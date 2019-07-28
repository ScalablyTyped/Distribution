package typings.gapiDotClientDotGroupsmigration.gapiNs.clientNs.groupsmigrationNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGroupsmigration.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveResource extends js.Object {
  /** Inserts a new mail into the archive of the Google group. */
  def insert(request: Anon_Alt): Request[Groups]
}

object ArchiveResource {
  @scala.inline
  def apply(insert: Anon_Alt => Request[Groups]): ArchiveResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[ArchiveResource]
  }
}


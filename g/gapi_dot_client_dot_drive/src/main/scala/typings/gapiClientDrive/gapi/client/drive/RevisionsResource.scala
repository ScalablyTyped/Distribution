package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.AcknowledgeAbuseAlt
import typings.gapiClientDrive.anon.AltFields
import typings.gapiClientDrive.anon.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Permanently deletes a revision. This method is only applicable to files with binary content in Drive. */
  def delete(request: RevisionId): Request[Unit]
  /** Gets a revision's metadata or content by ID. */
  def get(request: AcknowledgeAbuseAlt): Request[Revision]
  /** Lists a file's revisions. */
  def list(request: AltFields): Request[RevisionList]
  /** Updates a revision with patch semantics. */
  def update(request: RevisionId): Request[Revision]
}

object RevisionsResource {
  @scala.inline
  def apply(
    delete: RevisionId => Request[Unit],
    get: AcknowledgeAbuseAlt => Request[Revision],
    list: AltFields => Request[RevisionList],
    update: RevisionId => Request[Revision]
  ): RevisionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RevisionsResource]
  }
}


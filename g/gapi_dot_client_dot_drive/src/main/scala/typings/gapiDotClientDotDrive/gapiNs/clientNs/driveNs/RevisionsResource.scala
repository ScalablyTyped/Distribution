package typings.gapiDotClientDotDrive.gapiNs.clientNs.driveNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDrive.Anon_AcknowledgeAbuseAlt
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdKeyOauthtokenPageSizePageToken
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Permanently deletes a revision. This method is only applicable to files with binary content in Drive. */
  def delete(request: Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint): Request[Unit]
  /** Gets a revision's metadata or content by ID. */
  def get(request: Anon_AcknowledgeAbuseAlt): Request[Revision]
  /** Lists a file's revisions. */
  def list(request: Anon_AltFieldsFileIdKeyOauthtokenPageSizePageToken): Request[RevisionList]
  /** Updates a revision with patch semantics. */
  def update(request: Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint): Request[Revision]
}

object RevisionsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint => Request[Unit],
    get: Anon_AcknowledgeAbuseAlt => Request[Revision],
    list: Anon_AltFieldsFileIdKeyOauthtokenPageSizePageToken => Request[RevisionList],
    update: Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint => Request[Revision]
  ): RevisionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RevisionsResource]
  }
}


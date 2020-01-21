package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonAcknowledgeAbuseAlt
import typings.gapiClientDrive.AnonAltFieldsFileIdKeyOauthtokenPageSizePageToken
import typings.gapiClientDrive.AnonAltFieldsFileIdKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Permanently deletes a revision. This method is only applicable to files with binary content in Drive. */
  def delete(request: AnonAltFieldsFileIdKeyOauthtokenPrettyPrint): Request_[Unit]
  /** Gets a revision's metadata or content by ID. */
  def get(request: AnonAcknowledgeAbuseAlt): Request_[Revision]
  /** Lists a file's revisions. */
  def list(request: AnonAltFieldsFileIdKeyOauthtokenPageSizePageToken): Request_[RevisionList]
  /** Updates a revision with patch semantics. */
  def update(request: AnonAltFieldsFileIdKeyOauthtokenPrettyPrint): Request_[Revision]
}

object RevisionsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsFileIdKeyOauthtokenPrettyPrint => Request_[Unit],
    get: AnonAcknowledgeAbuseAlt => Request_[Revision],
    list: AnonAltFieldsFileIdKeyOauthtokenPageSizePageToken => Request_[RevisionList],
    update: AnonAltFieldsFileIdKeyOauthtokenPrettyPrint => Request_[Revision]
  ): RevisionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RevisionsResource]
  }
}


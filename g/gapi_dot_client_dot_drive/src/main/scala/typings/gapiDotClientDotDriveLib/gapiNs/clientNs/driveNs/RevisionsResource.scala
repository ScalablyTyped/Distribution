package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Permanently deletes a revision. This method is only applicable to files with binary content in Drive. */
  def delete(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a revision's metadata or content by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_AcknowledgeAbuseAlt): gapiDotClientLib.gapiNs.clientNs.Request[Revision]
  /** Lists a file's revisions. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPageSizePageToken): gapiDotClientLib.gapiNs.clientNs.Request[RevisionList]
  /** Updates a revision with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Revision]
}

object RevisionsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotDriveLib.Anon_AcknowledgeAbuseAlt => gapiDotClientLib.gapiNs.clientNs.Request[Revision],
    list: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPageSizePageToken => gapiDotClientLib.gapiNs.clientNs.Request[RevisionList],
    update: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Revision]
  ): RevisionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RevisionsResource]
  }
}


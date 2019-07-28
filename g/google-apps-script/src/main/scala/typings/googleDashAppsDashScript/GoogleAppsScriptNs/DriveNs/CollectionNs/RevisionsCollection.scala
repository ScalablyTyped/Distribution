package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Revision
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.RevisionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionsCollection extends js.Object {
  // Gets a specific revision.
  def get(fileId: String, revisionId: String): Revision = js.native
  // Lists a file's revisions.
  def list(fileId: String): RevisionList = js.native
  // Lists a file's revisions.
  def list(fileId: String, optionalArgs: js.Object): RevisionList = js.native
  // Updates a revision. This method supports patch semantics.
  def patch(resource: Revision, fileId: String, revisionId: String): Revision = js.native
  // Permanently deletes a file version. You can only delete revisions for files with binary content, like images or videos. Revisions for other files, like Google Docs or Sheets, and the last remaining file version can't be deleted.
  def remove(fileId: String, revisionId: String): Unit = js.native
  // Updates a revision.
  def update(resource: Revision, fileId: String, revisionId: String): Revision = js.native
}


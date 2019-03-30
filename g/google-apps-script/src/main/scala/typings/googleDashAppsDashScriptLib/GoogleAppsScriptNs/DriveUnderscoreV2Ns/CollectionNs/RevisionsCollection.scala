package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionsCollection extends js.Object {
  // Gets a specific revision.
  def get(fileId: java.lang.String, revisionId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Revision = js.native
  // Lists a file's revisions.
  def list(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.RevisionList = js.native
  // Lists a file's revisions.
  def list(fileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.RevisionList = js.native
  // Updates a revision. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Revision,
    fileId: java.lang.String,
    revisionId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Revision = js.native
  // Permanently deletes a file version. You can only delete revisions for files with binary content, like images or videos. Revisions for other files, like Google Docs or Sheets, and the last remaining file version can't be deleted.
  def remove(fileId: java.lang.String, revisionId: java.lang.String): scala.Unit = js.native
  // Updates a revision.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Revision,
    fileId: java.lang.String,
    revisionId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Revision = js.native
}


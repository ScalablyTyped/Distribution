package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadsCollection extends js.Object {
  // Gets the specified thread.
  def get(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Thread = js.native
  // Gets the specified thread.
  def get(userId: java.lang.String, id: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Thread = js.native
  // Lists the threads in the user's mailbox.
  def list(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListThreadsResponse = js.native
  // Lists the threads in the user's mailbox.
  def list(userId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListThreadsResponse = js.native
  // Modifies the labels applied to the thread. This applies to all messages in the thread.
  def modify(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ModifyThreadRequest,
    userId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Thread = js.native
  // Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead.
  def remove(userId: java.lang.String, id: java.lang.String): scala.Unit = js.native
  // Moves the specified thread to the trash.
  def trash(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Thread = js.native
  // Removes the specified thread from the trash.
  def untrash(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Thread = js.native
}


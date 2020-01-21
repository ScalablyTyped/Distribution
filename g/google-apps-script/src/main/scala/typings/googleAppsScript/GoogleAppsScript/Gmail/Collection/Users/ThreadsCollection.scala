package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListThreadsResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ModifyThreadRequest
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Thread
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadsCollection extends js.Object {
  // Gets the specified thread.
  def get(userId: String, id: String): Thread = js.native
  // Gets the specified thread.
  def get(userId: String, id: String, optionalArgs: js.Object): Thread = js.native
  // Lists the threads in the user's mailbox.
  def list(userId: String): ListThreadsResponse = js.native
  // Lists the threads in the user's mailbox.
  def list(userId: String, optionalArgs: js.Object): ListThreadsResponse = js.native
  // Modifies the labels applied to the thread. This applies to all messages in the thread.
  def modify(resource: ModifyThreadRequest, userId: String, id: String): Thread = js.native
  // Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead.
  def remove(userId: String, id: String): Unit = js.native
  // Moves the specified thread to the trash.
  def trash(userId: String, id: String): Thread = js.native
  // Removes the specified thread from the trash.
  def untrash(userId: String, id: String): Thread = js.native
}


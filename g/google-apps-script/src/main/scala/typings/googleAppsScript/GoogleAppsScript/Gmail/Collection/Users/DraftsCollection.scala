package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Draft
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListDraftsResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraftsCollection extends js.Object {
  
  // Creates a new draft with the DRAFT label.
  def create(resource: Draft, userId: String): Draft = js.native
  // Creates a new draft with the DRAFT label.
  def create(resource: Draft, userId: String, mediaData: js.Any): Draft = js.native
  
  // Gets the specified draft.
  def get(userId: String, id: String): Draft = js.native
  // Gets the specified draft.
  def get(userId: String, id: String, optionalArgs: js.Object): Draft = js.native
  
  // Lists the drafts in the user's mailbox.
  def list(userId: String): ListDraftsResponse = js.native
  // Lists the drafts in the user's mailbox.
  def list(userId: String, optionalArgs: js.Object): ListDraftsResponse = js.native
  
  // Immediately and permanently deletes the specified draft. Does not simply trash it.
  def remove(userId: String, id: String): Unit = js.native
  
  // Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers.
  def send(resource: Draft, userId: String): Message = js.native
  // Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers.
  def send(resource: Draft, userId: String, mediaData: js.Any): Message = js.native
  
  // Replaces a draft's content.
  def update(resource: Draft, userId: String, id: String): Draft = js.native
  // Replaces a draft's content.
  def update(resource: Draft, userId: String, id: String, mediaData: js.Any): Draft = js.native
}

package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListLabelsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsCollection extends js.Object {
  // Creates a new label.
  def create(resource: Label, userId: String): Label
  // Gets the specified label.
  def get(userId: String, id: String): Label
  // Lists all labels in the user's mailbox.
  def list(userId: String): ListLabelsResponse
  // Updates the specified label. This method supports patch semantics.
  def patch(resource: Label, userId: String, id: String): Label
  // Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to.
  def remove(userId: String, id: String): Unit
  // Updates the specified label.
  def update(resource: Label, userId: String, id: String): Label
}

object LabelsCollection {
  @scala.inline
  def apply(
    create: (Label, String) => Label,
    get: (String, String) => Label,
    list: String => ListLabelsResponse,
    patch: (Label, String, String) => Label,
    remove: (String, String) => Unit,
    update: (Label, String, String) => Label
  ): LabelsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[LabelsCollection]
  }
}


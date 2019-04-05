package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.MessagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsCollection extends js.Object {
  // Gets the specified message attachment.
  def get(userId: java.lang.String, messageId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePartBody
}

object AttachmentsCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePartBody
  ): AttachmentsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[AttachmentsCollection]
  }
}


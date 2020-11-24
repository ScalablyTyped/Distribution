package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Messages

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsCollection extends js.Object {
  
  // Gets the specified message attachment.
  def get(userId: String, messageId: String, id: String): MessagePartBody = js.native
}
object AttachmentsCollection {
  
  @scala.inline
  def apply(get: (String, String, String) => MessagePartBody): AttachmentsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[AttachmentsCollection]
  }
  
  @scala.inline
  implicit class AttachmentsCollectionOps[Self <: AttachmentsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: (String, String, String) => MessagePartBody): Self = this.set("get", js.Any.fromFunction3(value))
  }
}

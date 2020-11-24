package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatBansCollection extends js.Object {
  
  // Adds a new ban to the chat.
  def insert(resource: LiveChatBan, part: String): LiveChatBan = js.native
  
  // Removes a chat ban.
  def remove(id: String): Unit = js.native
}
object LiveChatBansCollection {
  
  @scala.inline
  def apply(insert: (LiveChatBan, String) => LiveChatBan, remove: String => Unit): LiveChatBansCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[LiveChatBansCollection]
  }
  
  @scala.inline
  implicit class LiveChatBansCollectionOps[Self <: LiveChatBansCollection] (val x: Self) extends AnyVal {
    
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
    def setInsert(value: (LiveChatBan, String) => LiveChatBan): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}

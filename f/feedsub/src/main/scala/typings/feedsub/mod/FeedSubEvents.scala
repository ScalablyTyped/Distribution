package typings.feedsub.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedSubEvents extends js.Object {
  
  // Emitted when there is an error downloading or parsing the feed.
  // Not emitted if callback is given for read or readInterval.
  def error(error: Error): Unit = js.native
  
  // Emitted whenever there is a new item.
  def item(item: FeedItem): Unit = js.native
  
  // Emits all new items from one request in one array.
  def items(items: js.Array[FeedItem]): Unit = js.native
}
object FeedSubEvents {
  
  @scala.inline
  def apply(error: Error => Unit, item: FeedItem => Unit, items: js.Array[FeedItem] => Unit): FeedSubEvents = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), item = js.Any.fromFunction1(item), items = js.Any.fromFunction1(items))
    __obj.asInstanceOf[FeedSubEvents]
  }
  
  @scala.inline
  implicit class FeedSubEventsOps[Self <: FeedSubEvents] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: FeedItem => Unit): Self = this.set("item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItems(value: js.Array[FeedItem] => Unit): Self = this.set("items", js.Any.fromFunction1(value))
  }
}

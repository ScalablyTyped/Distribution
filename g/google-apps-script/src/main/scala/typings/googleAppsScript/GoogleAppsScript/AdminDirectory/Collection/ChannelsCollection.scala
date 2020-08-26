package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsCollection extends js.Object {
  // Stop watching resources through this channel
  def stop(resource: Channel): Unit = js.native
}

object ChannelsCollection {
  @scala.inline
  def apply(stop: Channel => Unit): ChannelsCollection = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[ChannelsCollection]
  }
  @scala.inline
  implicit class ChannelsCollectionOps[Self <: ChannelsCollection] (val x: Self) extends AnyVal {
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
    def setStop(value: Channel => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
  }
  
}


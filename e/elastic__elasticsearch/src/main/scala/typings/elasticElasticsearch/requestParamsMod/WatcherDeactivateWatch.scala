package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatcherDeactivateWatch extends Generic {
  var watch_id: String = js.native
}

object WatcherDeactivateWatch {
  @scala.inline
  def apply(watch_id: String): WatcherDeactivateWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeactivateWatch]
  }
  @scala.inline
  implicit class WatcherDeactivateWatchOps[Self <: WatcherDeactivateWatch] (val x: Self) extends AnyVal {
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
    def setWatch_id(value: String): Self = this.set("watch_id", value.asInstanceOf[js.Any])
  }
  
}


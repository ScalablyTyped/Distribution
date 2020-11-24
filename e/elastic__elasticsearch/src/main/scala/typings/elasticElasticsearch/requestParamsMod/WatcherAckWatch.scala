package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherAckWatch extends Generic {
  
  var action_id: js.UndefOr[String | js.Array[String]] = js.native
  
  var watch_id: String = js.native
}
object WatcherAckWatch {
  
  @scala.inline
  def apply(watch_id: String): WatcherAckWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAckWatch]
  }
  
  @scala.inline
  implicit class WatcherAckWatchOps[Self <: WatcherAckWatch] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setAction_idVarargs(value: String*): Self = this.set("action_id", js.Array(value :_*))
    
    @scala.inline
    def setAction_id(value: String | js.Array[String]): Self = this.set("action_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction_id: Self = this.set("action_id", js.undefined)
  }
}

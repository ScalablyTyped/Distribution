package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.block
import typings.elasticElasticsearch.elasticElasticsearchStrings.cpu
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesHotThreads extends Generic {
  
  var ignore_idle_threads: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[String] = js.native
  
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  
  var snapshots: js.UndefOr[Double] = js.native
  
  var threads: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[cpu | wait | block] = js.native
}
object NodesHotThreads {
  
  @scala.inline
  def apply(): NodesHotThreads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesHotThreads]
  }
  
  @scala.inline
  implicit class NodesHotThreadsOps[Self <: NodesHotThreads] (val x: Self) extends AnyVal {
    
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
    def setIgnore_idle_threads(value: Boolean): Self = this.set("ignore_idle_threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore_idle_threads: Self = this.set("ignore_idle_threads", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setNode_idVarargs(value: String*): Self = this.set("node_id", js.Array(value :_*))
    
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_id: Self = this.set("node_id", js.undefined)
    
    @scala.inline
    def setSnapshots(value: Double): Self = this.set("snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshots: Self = this.set("snapshots", js.undefined)
    
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setType(value: cpu | wait | block): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

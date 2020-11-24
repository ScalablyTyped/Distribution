package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherStats extends Generic {
  
  var emit_stacktraces: js.UndefOr[Boolean] = js.native
  
  var metric: js.UndefOr[String | js.Array[String]] = js.native
}
object WatcherStats {
  
  @scala.inline
  def apply(): WatcherStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherStats]
  }
  
  @scala.inline
  implicit class WatcherStatsOps[Self <: WatcherStats] (val x: Self) extends AnyVal {
    
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
    def setEmit_stacktraces(value: Boolean): Self = this.set("emit_stacktraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmit_stacktraces: Self = this.set("emit_stacktraces", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
  }
}

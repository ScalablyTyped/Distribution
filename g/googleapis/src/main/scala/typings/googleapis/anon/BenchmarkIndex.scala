package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BenchmarkIndex extends js.Object {
  
  var benchmarkIndex: js.UndefOr[Double] = js.native
  
  var hostUserAgent: js.UndefOr[String] = js.native
  
  var networkUserAgent: js.UndefOr[String] = js.native
}
object BenchmarkIndex {
  
  @scala.inline
  def apply(): BenchmarkIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BenchmarkIndex]
  }
  
  @scala.inline
  implicit class BenchmarkIndexOps[Self <: BenchmarkIndex] (val x: Self) extends AnyVal {
    
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
    def setBenchmarkIndex(value: Double): Self = this.set("benchmarkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenchmarkIndex: Self = this.set("benchmarkIndex", js.undefined)
    
    @scala.inline
    def setHostUserAgent(value: String): Self = this.set("hostUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostUserAgent: Self = this.set("hostUserAgent", js.undefined)
    
    @scala.inline
    def setNetworkUserAgent(value: String): Self = this.set("networkUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUserAgent: Self = this.set("networkUserAgent", js.undefined)
  }
}

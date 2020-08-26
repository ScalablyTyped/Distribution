package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapTotal extends js.Object {
  var heapTotal: Double = js.native
  var heapUsed: Double = js.native
  var rss: Double = js.native
}

object HeapTotal {
  @scala.inline
  def apply(heapTotal: Double, heapUsed: Double, rss: Double): HeapTotal = {
    val __obj = js.Dynamic.literal(heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapTotal]
  }
  @scala.inline
  implicit class HeapTotalOps[Self <: HeapTotal] (val x: Self) extends AnyVal {
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
    def setHeapTotal(value: Double): Self = this.set("heapTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapUsed(value: Double): Self = this.set("heapUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRss(value: Double): Self = this.set("rss", value.asInstanceOf[js.Any])
  }
  
}


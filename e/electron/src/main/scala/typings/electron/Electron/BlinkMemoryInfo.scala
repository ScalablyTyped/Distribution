package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlinkMemoryInfo extends js.Object {
  /**
    * Size of all allocated objects in Kilobytes.
    */
  var allocated: Double = js.native
  /**
    * Size of all marked objects in Kilobytes.
    */
  var marked: Double = js.native
  /**
    * Total allocated space in Kilobytes.
    */
  var total: Double = js.native
}

object BlinkMemoryInfo {
  @scala.inline
  def apply(allocated: Double, marked: Double, total: Double): BlinkMemoryInfo = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlinkMemoryInfo]
  }
  @scala.inline
  implicit class BlinkMemoryInfoOps[Self <: BlinkMemoryInfo] (val x: Self) extends AnyVal {
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
    def setAllocated(value: Double): Self = this.set("allocated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarked(value: Double): Self = this.set("marked", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}


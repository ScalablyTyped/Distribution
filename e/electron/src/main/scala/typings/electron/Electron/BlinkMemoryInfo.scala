package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlinkMemoryInfo extends js.Object {
  /**
    * Size of all allocated objects in Kilobytes.
    */
  var allocated: Double
  /**
    * Size of all marked objects in Kilobytes.
    */
  var marked: Double
  /**
    * Total allocated space in Kilobytes.
    */
  var total: Double
}

object BlinkMemoryInfo {
  @scala.inline
  def apply(allocated: Double, marked: Double, total: Double): BlinkMemoryInfo = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlinkMemoryInfo]
  }
}


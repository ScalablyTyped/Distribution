package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryInfo extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/memory-info
  /**
    * The maximum amount of memory that has ever been pinned to actual physical RAM.
    */
  var peakWorkingSetSize: Double = js.native
  
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content.
    *
    * @platform win32
    */
  var privateBytes: js.UndefOr[Double] = js.native
  
  /**
    * The amount of memory currently pinned to actual physical RAM.
    */
  var workingSetSize: Double = js.native
}
object MemoryInfo {
  
  @scala.inline
  def apply(peakWorkingSetSize: Double, workingSetSize: Double): MemoryInfo = {
    val __obj = js.Dynamic.literal(peakWorkingSetSize = peakWorkingSetSize.asInstanceOf[js.Any], workingSetSize = workingSetSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    
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
    def setPeakWorkingSetSize(value: Double): Self = this.set("peakWorkingSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingSetSize(value: Double): Self = this.set("workingSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateBytes(value: Double): Self = this.set("privateBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateBytes: Self = this.set("privateBytes", js.undefined)
  }
}

package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessMemoryInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/process-memory-info
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content in Kilobytes.
    */
  var `private`: Double = js.native
  /**
    * The amount of memory currently pinned to actual physical RAM in Kilobytes.
    *
    * @platform linux,win32
    */
  var residentSet: Double = js.native
  /**
    * The amount of memory shared between processes, typically memory consumed by the
    * Electron code itself in Kilobytes.
    */
  var shared: Double = js.native
}

object ProcessMemoryInfo {
  @scala.inline
  def apply(`private`: Double, residentSet: Double, shared: Double): ProcessMemoryInfo = {
    val __obj = js.Dynamic.literal(residentSet = residentSet.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMemoryInfo]
  }
  @scala.inline
  implicit class ProcessMemoryInfoOps[Self <: ProcessMemoryInfo] (val x: Self) extends AnyVal {
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
    def setPrivate(value: Double): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setResidentSet(value: Double): Self = this.set("residentSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setShared(value: Double): Self = this.set("shared", value.asInstanceOf[js.Any])
  }
  
}


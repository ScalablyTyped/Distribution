package typings.domMediacaptureRecord

import typings.std.Blob
import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobEventInit extends EventInit {
  
  var data: Blob = js.native
  
  var timecode: js.UndefOr[Double] = js.native
}
object BlobEventInit {
  
  @scala.inline
  def apply(data: Blob): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
  
  @scala.inline
  implicit class BlobEventInitOps[Self <: BlobEventInit] (val x: Self) extends AnyVal {
    
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
    def setData(value: Blob): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecode(value: Double): Self = this.set("timecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimecode: Self = this.set("timecode", js.undefined)
  }
}

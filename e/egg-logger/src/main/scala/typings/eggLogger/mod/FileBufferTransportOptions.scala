package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBufferTransportOptions extends FileTransportOptions {
  
  var flushInterval: js.UndefOr[Double] = js.native
  
  var maxBufferLength: js.UndefOr[Double] = js.native
}
object FileBufferTransportOptions {
  
  @scala.inline
  def apply(file: String): FileBufferTransportOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBufferTransportOptions]
  }
  
  @scala.inline
  implicit class FileBufferTransportOptionsOps[Self <: FileBufferTransportOptions] (val x: Self) extends AnyVal {
    
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
    def setFlushInterval(value: Double): Self = this.set("flushInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushInterval: Self = this.set("flushInterval", js.undefined)
    
    @scala.inline
    def setMaxBufferLength(value: Double): Self = this.set("maxBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBufferLength: Self = this.set("maxBufferLength", js.undefined)
  }
}

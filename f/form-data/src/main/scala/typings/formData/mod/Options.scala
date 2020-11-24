package typings.formData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends ReadableOptions {
  
  var dataSize: js.UndefOr[Double] = js.native
  
  var maxDataSize: js.UndefOr[Double] = js.native
  
  var pauseStreams: js.UndefOr[Boolean] = js.native
  
  var readable: js.UndefOr[Boolean] = js.native
  
  var writable: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSize: Self = this.set("dataSize", js.undefined)
    
    @scala.inline
    def setMaxDataSize(value: Double): Self = this.set("maxDataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDataSize: Self = this.set("maxDataSize", js.undefined)
    
    @scala.inline
    def setPauseStreams(value: Boolean): Self = this.set("pauseStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseStreams: Self = this.set("pauseStreams", js.undefined)
    
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
}

package typings.exceljs.mod.stream.xlsx

import typings.exceljs.anon.PartialZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiverZipOptions extends js.Object {
  
  var comment: String = js.native
  
  var forceLocalTime: Boolean = js.native
  
  var forceZip64: Boolean = js.native
  
  var store: Boolean = js.native
  
  var zlib: PartialZlibOptions = js.native
}
object ArchiverZipOptions {
  
  @scala.inline
  def apply(
    comment: String,
    forceLocalTime: Boolean,
    forceZip64: Boolean,
    store: Boolean,
    zlib: PartialZlibOptions
  ): ArchiverZipOptions = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], forceLocalTime = forceLocalTime.asInstanceOf[js.Any], forceZip64 = forceZip64.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiverZipOptions]
  }
  
  @scala.inline
  implicit class ArchiverZipOptionsOps[Self <: ArchiverZipOptions] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceLocalTime(value: Boolean): Self = this.set("forceLocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceZip64(value: Boolean): Self = this.set("forceZip64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: Boolean): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZlib(value: PartialZlibOptions): Self = this.set("zlib", value.asInstanceOf[js.Any])
  }
}

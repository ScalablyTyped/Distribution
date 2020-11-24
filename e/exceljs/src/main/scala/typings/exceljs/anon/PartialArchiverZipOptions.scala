package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.ArchiverZipOptions> */
@js.native
trait PartialArchiverZipOptions extends js.Object {
  
  var comment: js.UndefOr[String] = js.native
  
  var forceLocalTime: js.UndefOr[Boolean] = js.native
  
  var forceZip64: js.UndefOr[Boolean] = js.native
  
  var store: js.UndefOr[Boolean] = js.native
  
  var zlib: js.UndefOr[PartialZlibOptions] = js.native
}
object PartialArchiverZipOptions {
  
  @scala.inline
  def apply(): PartialArchiverZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArchiverZipOptions]
  }
  
  @scala.inline
  implicit class PartialArchiverZipOptionsOps[Self <: PartialArchiverZipOptions] (val x: Self) extends AnyVal {
    
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
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setForceLocalTime(value: Boolean): Self = this.set("forceLocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceLocalTime: Self = this.set("forceLocalTime", js.undefined)
    
    @scala.inline
    def setForceZip64(value: Boolean): Self = this.set("forceZip64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceZip64: Self = this.set("forceZip64", js.undefined)
    
    @scala.inline
    def setStore(value: Boolean): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setZlib(value: PartialZlibOptions): Self = this.set("zlib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlib: Self = this.set("zlib", js.undefined)
  }
}

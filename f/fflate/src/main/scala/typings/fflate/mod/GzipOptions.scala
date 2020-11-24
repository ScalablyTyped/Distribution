package typings.fflate.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GzipOptions extends DeflateOptions {
  
  /**
    * The filename of the data. If the `gunzip` command is used to decompress the data, it will output a file
    * with this name instead of the name of the compressed file.
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * When the file was last modified. Defaults to the current time.
    * If you're using GZIP, set this to 0 to avoid revealing a modification date entirely.
    */
  var mtime: js.UndefOr[Date | String | Double] = js.native
}
object GzipOptions {
  
  @scala.inline
  def apply(): GzipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GzipOptions]
  }
  
  @scala.inline
  implicit class GzipOptionsOps[Self <: GzipOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setMtime(value: Date | String | Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
  }
}

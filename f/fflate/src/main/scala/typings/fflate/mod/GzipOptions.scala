package typings.fflate.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
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
  implicit class GzipOptionsMutableBuilder[Self <: GzipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setMtime(value: Date | String | Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
  }
}

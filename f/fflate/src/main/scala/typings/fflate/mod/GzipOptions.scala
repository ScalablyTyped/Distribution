package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GzipOptions
  extends StObject
     with DeflateOptions {
  
  /**
    * The filename of the data. If the `gunzip` command is used to decompress the data, it will output a file
    * with this name instead of the name of the compressed file.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * When the file was last modified. Defaults to the current time.
    * Set this to 0 to avoid revealing a modification date entirely.
    */
  var mtime: js.UndefOr[js.Date | String | Double] = js.undefined
}
object GzipOptions {
  
  inline def apply(): GzipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GzipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GzipOptions] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setMtime(value: js.Date | String | Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
  }
}

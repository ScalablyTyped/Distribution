package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnzipOptions extends StObject {
  
  /**
    * A filter function to extract only certain files from a ZIP archive
    */
  var filter: js.UndefOr[UnzipFileFilter] = js.undefined
}
object UnzipOptions {
  
  inline def apply(): UnzipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnzipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnzipOptions] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: /* file */ UnzipFileInfo => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}

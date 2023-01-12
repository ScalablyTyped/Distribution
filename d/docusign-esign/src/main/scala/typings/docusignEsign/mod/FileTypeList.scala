package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTypeList extends StObject {
  
  /**
    * A collection of file types.
    */
  var fileTypes: js.UndefOr[js.Array[FileType]] = js.undefined
}
object FileTypeList {
  
  inline def apply(): FileTypeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileTypeList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileTypeList] (val x: Self) extends AnyVal {
    
    inline def setFileTypes(value: js.Array[FileType]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setFileTypesVarargs(value: FileType*): Self = StObject.set(x, "fileTypes", js.Array(value*))
  }
}

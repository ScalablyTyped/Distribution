package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoundUploadItems
  extends StObject
     with UploadFilter {
  
  /**
    * the name of the file
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * the size of the file
    */
  var size: js.UndefOr[String] = js.undefined
}
object FoundUploadItems {
  
  inline def apply(): FoundUploadItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoundUploadItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoundUploadItems] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

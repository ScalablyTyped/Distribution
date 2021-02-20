package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoundUploadItems extends UploadFilter {
  
  /**
    * the name of the file
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * the size of the file
    */
  var size: js.UndefOr[String] = js.native
}
object FoundUploadItems {
  
  @scala.inline
  def apply(): FoundUploadItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoundUploadItems]
  }
  
  @scala.inline
  implicit class FoundUploadItemsMutableBuilder[Self <: FoundUploadItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MimeTypeValue extends StObject {
  
  var mimeType: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object MimeTypeValue {
  
  @scala.inline
  def apply(): MimeTypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeTypeValue]
  }
  
  @scala.inline
  implicit class MimeTypeValueMutableBuilder[Self <: MimeTypeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

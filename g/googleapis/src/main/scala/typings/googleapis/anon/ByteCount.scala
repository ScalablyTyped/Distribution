package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteCount extends StObject {
  
  var byteCount: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ByteCount {
  
  @scala.inline
  def apply(): ByteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteCount]
  }
  
  @scala.inline
  implicit class ByteCountMutableBuilder[Self <: ByteCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteCount(value: String): Self = StObject.set(x, "byteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteCountUndefined: Self = StObject.set(x, "byteCount", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

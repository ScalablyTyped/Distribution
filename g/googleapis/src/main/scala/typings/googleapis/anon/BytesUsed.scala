package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesUsed extends StObject {
  
  var bytesUsed: js.UndefOr[String] = js.undefined
  
  var serviceName: js.UndefOr[String] = js.undefined
}
object BytesUsed {
  
  @scala.inline
  def apply(): BytesUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesUsed]
  }
  
  @scala.inline
  implicit class BytesUsedMutableBuilder[Self <: BytesUsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesUsed(value: String): Self = StObject.set(x, "bytesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUsedUndefined: Self = StObject.set(x, "bytesUsed", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}

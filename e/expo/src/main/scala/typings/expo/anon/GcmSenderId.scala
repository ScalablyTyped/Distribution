package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcmSenderId extends StObject {
  
  var gcmSenderId: js.UndefOr[String] = js.undefined
}
object GcmSenderId {
  
  @scala.inline
  def apply(): GcmSenderId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcmSenderId]
  }
  
  @scala.inline
  implicit class GcmSenderIdMutableBuilder[Self <: GcmSenderId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcmSenderId(value: String): Self = StObject.set(x, "gcmSenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcmSenderIdUndefined: Self = StObject.set(x, "gcmSenderId", js.undefined)
  }
}

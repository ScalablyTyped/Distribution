package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdHocVerified extends StObject {
  
  var adHocVerified: js.UndefOr[String] = js.undefined
}
object AdHocVerified {
  
  @scala.inline
  def apply(): AdHocVerified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdHocVerified]
  }
  
  @scala.inline
  implicit class AdHocVerifiedMutableBuilder[Self <: AdHocVerified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdHocVerified(value: String): Self = StObject.set(x, "adHocVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdHocVerifiedUndefined: Self = StObject.set(x, "adHocVerified", js.undefined)
  }
}

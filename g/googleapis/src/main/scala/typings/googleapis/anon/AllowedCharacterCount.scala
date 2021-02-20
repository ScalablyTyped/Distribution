package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedCharacterCount extends StObject {
  
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  
  var limitType: js.UndefOr[String] = js.native
  
  var remainingCharacterCount: js.UndefOr[Double] = js.native
}
object AllowedCharacterCount {
  
  @scala.inline
  def apply(): AllowedCharacterCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedCharacterCount]
  }
  
  @scala.inline
  implicit class AllowedCharacterCountMutableBuilder[Self <: AllowedCharacterCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedCharacterCount(value: Double): Self = StObject.set(x, "allowedCharacterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCharacterCountUndefined: Self = StObject.set(x, "allowedCharacterCount", js.undefined)
    
    @scala.inline
    def setLimitType(value: String): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
    
    @scala.inline
    def setRemainingCharacterCount(value: Double): Self = StObject.set(x, "remainingCharacterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingCharacterCountUndefined: Self = StObject.set(x, "remainingCharacterCount", js.undefined)
  }
}

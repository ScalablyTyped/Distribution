package typings.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnlyFirstError extends StObject {
  
  var onlyFirstError: js.UndefOr[Boolean] = js.native
}
object OnlyFirstError {
  
  @scala.inline
  def apply(): OnlyFirstError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFirstError]
  }
  
  @scala.inline
  implicit class OnlyFirstErrorMutableBuilder[Self <: OnlyFirstError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnlyFirstError(value: Boolean): Self = StObject.set(x, "onlyFirstError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyFirstErrorUndefined: Self = StObject.set(x, "onlyFirstError", js.undefined)
  }
}

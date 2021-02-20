package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPropsCommonOptions extends StObject {
  
  var suppressRefError: js.UndefOr[Boolean] = js.native
}
object GetPropsCommonOptions {
  
  @scala.inline
  def apply(): GetPropsCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPropsCommonOptions]
  }
  
  @scala.inline
  implicit class GetPropsCommonOptionsMutableBuilder[Self <: GetPropsCommonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuppressRefError(value: Boolean): Self = StObject.set(x, "suppressRefError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressRefErrorUndefined: Self = StObject.set(x, "suppressRefError", js.undefined)
  }
}

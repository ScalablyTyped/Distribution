package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDataCallbackEventArgs extends EventArgs {
  
  var result: String = js.native
}
object CustomDataCallbackEventArgs {
  
  @scala.inline
  def apply(result: String, sender: Control): CustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataCallbackEventArgs]
  }
  
  @scala.inline
  implicit class CustomDataCallbackEventArgsMutableBuilder[Self <: CustomDataCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}

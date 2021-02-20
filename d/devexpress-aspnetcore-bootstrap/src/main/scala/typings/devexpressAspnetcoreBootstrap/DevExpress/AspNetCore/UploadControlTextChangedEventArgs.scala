package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadControlTextChangedEventArgs extends EventArgs {
  
  val inputIndex: Double = js.native
}
object UploadControlTextChangedEventArgs {
  
  @scala.inline
  def apply(inputIndex: Double, sender: Control): UploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlTextChangedEventArgs]
  }
  
  @scala.inline
  implicit class UploadControlTextChangedEventArgsMutableBuilder[Self <: UploadControlTextChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
  }
}

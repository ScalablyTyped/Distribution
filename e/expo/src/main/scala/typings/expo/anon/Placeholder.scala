package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placeholder extends StObject {
  
  var placeholder: String = js.native
  
  var submitButtonTitle: String = js.native
}
object Placeholder {
  
  @scala.inline
  def apply(placeholder: String, submitButtonTitle: String): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], submitButtonTitle = submitButtonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  @scala.inline
  implicit class PlaceholderMutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitButtonTitle(value: String): Self = StObject.set(x, "submitButtonTitle", value.asInstanceOf[js.Any])
  }
}

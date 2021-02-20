package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolMethodDescription extends StObject {
  
  /**
    * Whether this method is required or optional.
    */
  var required: Boolean = js.native
  
  /**
    * Method signature.
    */
  var types: String = js.native
}
object ProtocolMethodDescription {
  
  @scala.inline
  def apply(required: Boolean, types: String): ProtocolMethodDescription = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMethodDescription]
  }
  
  @scala.inline
  implicit class ProtocolMethodDescriptionMutableBuilder[Self <: ProtocolMethodDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}

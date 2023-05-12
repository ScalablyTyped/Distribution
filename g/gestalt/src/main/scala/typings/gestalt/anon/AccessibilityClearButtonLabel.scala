package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityClearButtonLabel extends StObject {
  
  var accessibilityClearButtonLabel: String
}
object AccessibilityClearButtonLabel {
  
  inline def apply(accessibilityClearButtonLabel: String): AccessibilityClearButtonLabel = {
    val __obj = js.Dynamic.literal(accessibilityClearButtonLabel = accessibilityClearButtonLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityClearButtonLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityClearButtonLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityClearButtonLabel(value: String): Self = StObject.set(x, "accessibilityClearButtonLabel", value.asInstanceOf[js.Any])
  }
}

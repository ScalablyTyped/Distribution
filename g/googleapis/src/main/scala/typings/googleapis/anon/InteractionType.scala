package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionType extends StObject {
  
  var interactionType: js.UndefOr[String] = js.undefined
  
  var nodeValue: js.UndefOr[String] = js.undefined
}
object InteractionType {
  
  inline def apply(): InteractionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractionType]
  }
  
  extension [Self <: InteractionType](x: Self) {
    
    inline def setInteractionType(value: String): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    
    inline def setInteractionTypeUndefined: Self = StObject.set(x, "interactionType", js.undefined)
    
    inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
  }
}

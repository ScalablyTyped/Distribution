package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewLabelId extends StObject {
  
  var viewLabelId: String
}
object ViewLabelId {
  
  inline def apply(viewLabelId: String): ViewLabelId = {
    val __obj = js.Dynamic.literal(viewLabelId = viewLabelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewLabelId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewLabelId] (val x: Self) extends AnyVal {
    
    inline def setViewLabelId(value: String): Self = StObject.set(x, "viewLabelId", value.asInstanceOf[js.Any])
  }
}

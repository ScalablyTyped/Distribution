package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeParamNames extends StObject {
  
  var parentId: js.UndefOr[String] = js.undefined
}
object TreeParamNames {
  
  inline def apply(): TreeParamNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeParamNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeParamNames] (val x: Self) extends AnyVal {
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
  }
}

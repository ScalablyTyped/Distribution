package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearestCopyProps extends StObject {
  
  var children: js.UndefOr[Any] = js.undefined
}
object NearestCopyProps {
  
  inline def apply(): NearestCopyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestCopyProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NearestCopyProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}

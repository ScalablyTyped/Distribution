package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElProps
  extends StObject
     with ElAttrsProps {
  
  var elTag: String
}
object ElProps {
  
  inline def apply(elTag: String): ElProps = {
    val __obj = js.Dynamic.literal(elTag = elTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElProps] (val x: Self) extends AnyVal {
    
    inline def setElTag(value: String): Self = StObject.set(x, "elTag", value.asInstanceOf[js.Any])
  }
}

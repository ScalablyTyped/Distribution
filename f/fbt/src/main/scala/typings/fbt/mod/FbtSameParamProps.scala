package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtSameParamProps extends StObject {
  
  var name: String
}
object FbtSameParamProps {
  
  inline def apply(name: String): FbtSameParamProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtSameParamProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FbtSameParamProps] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

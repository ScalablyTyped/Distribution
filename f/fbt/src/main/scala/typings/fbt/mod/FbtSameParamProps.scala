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
  
  extension [Self <: FbtSameParamProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

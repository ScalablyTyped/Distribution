package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtParamProps
  extends StObject
     with ParamOptions {
  
  var name: String
}
object FbtParamProps {
  
  inline def apply(name: String): FbtParamProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtParamProps]
  }
  
  extension [Self <: FbtParamProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

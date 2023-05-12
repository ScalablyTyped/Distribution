package typings.ethers.anon

import typings.ethers.typesAbiFragmentsMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components extends StObject {
  
  var components: js.Array[ParamType]
}
object Components {
  
  inline def apply(components: js.Array[ParamType]): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[ParamType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: ParamType*): Self = StObject.set(x, "components", js.Array(value*))
  }
}

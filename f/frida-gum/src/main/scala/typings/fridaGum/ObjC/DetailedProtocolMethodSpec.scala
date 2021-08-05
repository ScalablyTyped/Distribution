package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedProtocolMethodSpec
  extends StObject
     with ProtocolMethodSpec {
  
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Method signature.
    */
  var types: String
}
object DetailedProtocolMethodSpec {
  
  inline def apply(types: String): DetailedProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedProtocolMethodSpec]
  }
  
  extension [Self <: DetailedProtocolMethodSpec](x: Self) {
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}

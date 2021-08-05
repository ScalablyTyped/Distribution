package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRootPropsOptions extends StObject {
  
  var refKey: String
}
object GetRootPropsOptions {
  
  inline def apply(refKey: String): GetRootPropsOptions = {
    val __obj = js.Dynamic.literal(refKey = refKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootPropsOptions]
  }
  
  extension [Self <: GetRootPropsOptions](x: Self) {
    
    inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
  }
}

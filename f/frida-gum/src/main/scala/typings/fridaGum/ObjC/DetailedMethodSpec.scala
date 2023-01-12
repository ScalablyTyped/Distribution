package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedMethodSpec[I]
  extends StObject
     with MethodSpec[I] {
  
  /**
    * Implementation.
    */
  var implementation: I
  
  /**
    * Signature.
    */
  var types: String
}
object DetailedMethodSpec {
  
  inline def apply[I](implementation: I, types: String): DetailedMethodSpec[I] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedMethodSpec[I]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailedMethodSpec[?], I] (val x: Self & DetailedMethodSpec[I]) extends AnyVal {
    
    inline def setImplementation(value: I): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}

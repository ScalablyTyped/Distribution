package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedMethodSpec[I] extends MethodSpec[I] {
  
  /**
    * Implementation.
    */
  var implementation: I = js.native
  
  /**
    * Signature.
    */
  var types: String = js.native
}
object DetailedMethodSpec {
  
  @scala.inline
  def apply[I](implementation: I, types: String): DetailedMethodSpec[I] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedMethodSpec[I]]
  }
  
  @scala.inline
  implicit class DetailedMethodSpecMutableBuilder[Self <: DetailedMethodSpec[_], I] (val x: Self with DetailedMethodSpec[I]) extends AnyVal {
    
    @scala.inline
    def setImplementation(value: I): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}

package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleMethodSpec[I] extends MethodSpec[I] {
  
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  
  /**
    * Implementation.
    */
  var implementation: I = js.native
  
  /**
    * Return type.
    */
  var retType: String = js.native
}
object SimpleMethodSpec {
  
  @scala.inline
  def apply[I](argTypes: js.Array[String], implementation: I, retType: String): SimpleMethodSpec[I] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMethodSpec[I]]
  }
  
  @scala.inline
  implicit class SimpleMethodSpecMutableBuilder[Self <: SimpleMethodSpec[_], I] (val x: Self with SimpleMethodSpec[I]) extends AnyVal {
    
    @scala.inline
    def setArgTypes(value: js.Array[String]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgTypesVarargs(value: String*): Self = StObject.set(x, "argTypes", js.Array(value :_*))
    
    @scala.inline
    def setImplementation(value: I): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetType(value: String): Self = StObject.set(x, "retType", value.asInstanceOf[js.Any])
  }
}

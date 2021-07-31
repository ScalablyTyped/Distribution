package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleProtocolMethodSpec
  extends StObject
     with ProtocolMethodSpec {
  
  /**
    * Argument types.
    */
  var argTypes: js.Array[String]
  
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return type.
    */
  var retType: String
}
object SimpleProtocolMethodSpec {
  
  @scala.inline
  def apply(argTypes: js.Array[String], retType: String): SimpleProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleProtocolMethodSpec]
  }
  
  @scala.inline
  implicit class SimpleProtocolMethodSpecMutableBuilder[Self <: SimpleProtocolMethodSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgTypes(value: js.Array[String]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgTypesVarargs(value: String*): Self = StObject.set(x, "argTypes", js.Array(value :_*))
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setRetType(value: String): Self = StObject.set(x, "retType", value.asInstanceOf[js.Any])
  }
}

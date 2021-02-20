package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleBlockSignature extends BlockSignature {
  
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  
  /**
    * Return type.
    */
  var retType: String = js.native
}
object SimpleBlockSignature {
  
  @scala.inline
  def apply(argTypes: js.Array[String], retType: String): SimpleBlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBlockSignature]
  }
  
  @scala.inline
  implicit class SimpleBlockSignatureMutableBuilder[Self <: SimpleBlockSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgTypes(value: js.Array[String]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgTypesVarargs(value: String*): Self = StObject.set(x, "argTypes", js.Array(value :_*))
    
    @scala.inline
    def setRetType(value: String): Self = StObject.set(x, "retType", value.asInstanceOf[js.Any])
  }
}

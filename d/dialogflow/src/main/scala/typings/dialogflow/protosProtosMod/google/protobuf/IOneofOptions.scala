package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OneofOptions. */
trait IOneofOptions extends StObject {
  
  /** OneofOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}
object IOneofOptions {
  
  inline def apply(): IOneofOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneofOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOneofOptions] (val x: Self) extends AnyVal {
    
    inline def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}

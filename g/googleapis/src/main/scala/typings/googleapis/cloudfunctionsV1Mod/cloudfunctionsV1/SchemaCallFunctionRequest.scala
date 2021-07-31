package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `CallFunction` method.
  */
trait SchemaCallFunctionRequest extends StObject {
  
  /**
    * Input to be passed to the function.
    */
  var data: js.UndefOr[String] = js.undefined
}
object SchemaCallFunctionRequest {
  
  @scala.inline
  def apply(): SchemaCallFunctionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallFunctionRequest]
  }
  
  @scala.inline
  implicit class SchemaCallFunctionRequestMutableBuilder[Self <: SchemaCallFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}

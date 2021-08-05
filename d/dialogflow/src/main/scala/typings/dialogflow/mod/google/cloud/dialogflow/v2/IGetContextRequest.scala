package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetContextRequest. */
trait IGetContextRequest extends StObject {
  
  /** GetContextRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetContextRequest {
  
  inline def apply(): IGetContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetContextRequest]
  }
  
  extension [Self <: IGetContextRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

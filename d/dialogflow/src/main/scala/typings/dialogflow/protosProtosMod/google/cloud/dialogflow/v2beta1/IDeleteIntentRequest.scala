package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteIntentRequest. */
trait IDeleteIntentRequest extends StObject {
  
  /** DeleteIntentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteIntentRequest {
  
  inline def apply(): IDeleteIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteIntentRequest]
  }
  
  extension [Self <: IDeleteIntentRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

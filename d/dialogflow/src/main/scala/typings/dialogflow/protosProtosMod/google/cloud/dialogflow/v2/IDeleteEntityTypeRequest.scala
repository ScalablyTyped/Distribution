package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteEntityTypeRequest. */
trait IDeleteEntityTypeRequest extends StObject {
  
  /** DeleteEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteEntityTypeRequest {
  
  inline def apply(): IDeleteEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteEntityTypeRequest]
  }
  
  extension [Self <: IDeleteEntityTypeRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

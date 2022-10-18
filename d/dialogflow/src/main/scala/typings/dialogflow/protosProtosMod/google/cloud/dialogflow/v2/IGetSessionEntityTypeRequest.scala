package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetSessionEntityTypeRequest. */
trait IGetSessionEntityTypeRequest extends StObject {
  
  /** GetSessionEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetSessionEntityTypeRequest {
  
  inline def apply(): IGetSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSessionEntityTypeRequest]
  }
  
  extension [Self <: IGetSessionEntityTypeRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

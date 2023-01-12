package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteContextRequest. */
trait IDeleteContextRequest extends StObject {
  
  /** DeleteContextRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteContextRequest {
  
  inline def apply(): IDeleteContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteContextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDeleteContextRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

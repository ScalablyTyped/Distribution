package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateContextRequest. */
trait ICreateContextRequest extends StObject {
  
  /** CreateContextRequest context */
  var context: js.UndefOr[IContext | Null] = js.undefined
  
  /** CreateContextRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateContextRequest {
  
  inline def apply(): ICreateContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateContextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICreateContextRequest] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

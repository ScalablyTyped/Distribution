package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateContextRequest. */
trait IUpdateContextRequest extends StObject {
  
  /** UpdateContextRequest context */
  var context: js.UndefOr[IContext | Null] = js.undefined
  
  /** UpdateContextRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateContextRequest {
  
  inline def apply(): IUpdateContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateContextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUpdateContextRequest] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateContextRequest. */
@js.native
trait IUpdateContextRequest extends StObject {
  
  /** UpdateContextRequest context */
  var context: js.UndefOr[IContext | Null] = js.native
  
  /** UpdateContextRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IUpdateContextRequest {
  
  @scala.inline
  def apply(): IUpdateContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateContextRequest]
  }
  
  @scala.inline
  implicit class IUpdateContextRequestMutableBuilder[Self <: IUpdateContextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: IContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

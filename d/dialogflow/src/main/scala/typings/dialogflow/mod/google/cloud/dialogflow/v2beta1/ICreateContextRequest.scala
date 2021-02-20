package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateContextRequest. */
@js.native
trait ICreateContextRequest extends StObject {
  
  /** CreateContextRequest context */
  var context: js.UndefOr[IContext | Null] = js.native
  
  /** CreateContextRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object ICreateContextRequest {
  
  @scala.inline
  def apply(): ICreateContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateContextRequest]
  }
  
  @scala.inline
  implicit class ICreateContextRequestMutableBuilder[Self <: ICreateContextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: IContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

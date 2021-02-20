package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteDocumentRequest. */
@js.native
trait IDeleteDocumentRequest extends StObject {
  
  /** DeleteDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IDeleteDocumentRequest {
  
  @scala.inline
  def apply(): IDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteDocumentRequest]
  }
  
  @scala.inline
  implicit class IDeleteDocumentRequestMutableBuilder[Self <: IDeleteDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

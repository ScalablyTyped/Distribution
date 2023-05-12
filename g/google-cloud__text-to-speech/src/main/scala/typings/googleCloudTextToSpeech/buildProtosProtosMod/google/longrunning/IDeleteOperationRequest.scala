package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteOperationRequest. */
trait IDeleteOperationRequest extends StObject {
  
  /** DeleteOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteOperationRequest {
  
  inline def apply(): IDeleteOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteOperationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDeleteOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

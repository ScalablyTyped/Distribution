package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetEntityTypeRequest. */
trait IGetEntityTypeRequest extends StObject {
  
  /** GetEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** GetEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetEntityTypeRequest {
  
  inline def apply(): IGetEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetEntityTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGetEntityTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

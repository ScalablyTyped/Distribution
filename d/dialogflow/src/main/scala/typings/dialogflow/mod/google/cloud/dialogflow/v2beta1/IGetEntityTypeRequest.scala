package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetEntityTypeRequest. */
@js.native
trait IGetEntityTypeRequest extends StObject {
  
  /** GetEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** GetEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IGetEntityTypeRequest {
  
  @scala.inline
  def apply(): IGetEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetEntityTypeRequest]
  }
  
  @scala.inline
  implicit class IGetEntityTypeRequestMutableBuilder[Self <: IGetEntityTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

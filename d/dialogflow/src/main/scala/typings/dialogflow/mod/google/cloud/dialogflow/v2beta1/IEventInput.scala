package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EventInput. */
trait IEventInput extends StObject {
  
  /** EventInput languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** EventInput name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** EventInput parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
}
object IEventInput {
  
  inline def apply(): IEventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventInput]
  }
  
  extension [Self <: IEventInput](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: IStruct): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}

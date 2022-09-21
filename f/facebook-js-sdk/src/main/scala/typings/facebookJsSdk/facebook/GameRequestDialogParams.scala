package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.anon.Name
import typings.facebookJsSdk.facebookJsSdkStrings.app_non_users
import typings.facebookJsSdk.facebookJsSdkStrings.app_users
import typings.facebookJsSdk.facebookJsSdkStrings.apprequests
import typings.facebookJsSdk.facebookJsSdkStrings.askfor
import typings.facebookJsSdk.facebookJsSdkStrings.send
import typings.facebookJsSdk.facebookJsSdkStrings.turn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameRequestDialogParams
  extends StObject
     with DialogParams {
  
  var action_type: js.UndefOr[send | askfor | turn] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var exclude_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var filters: js.UndefOr[app_users | app_non_users | js.Array[Name]] = js.undefined
  
  var max_recipients: js.UndefOr[Double] = js.undefined
  
  var message: String
  
  var method: apprequests
  
  var object_id: js.UndefOr[String] = js.undefined
  
  var suggestions: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String | Double] = js.undefined
}
object GameRequestDialogParams {
  
  inline def apply(message: String): GameRequestDialogParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = "apprequests")
    __obj.asInstanceOf[GameRequestDialogParams]
  }
  
  extension [Self <: GameRequestDialogParams](x: Self) {
    
    inline def setAction_type(value: send | askfor | turn): Self = StObject.set(x, "action_type", value.asInstanceOf[js.Any])
    
    inline def setAction_typeUndefined: Self = StObject.set(x, "action_type", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setExclude_ids(value: js.Array[String]): Self = StObject.set(x, "exclude_ids", value.asInstanceOf[js.Any])
    
    inline def setExclude_idsUndefined: Self = StObject.set(x, "exclude_ids", js.undefined)
    
    inline def setExclude_idsVarargs(value: String*): Self = StObject.set(x, "exclude_ids", js.Array(value*))
    
    inline def setFilters(value: app_users | app_non_users | js.Array[Name]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Name*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMax_recipients(value: Double): Self = StObject.set(x, "max_recipients", value.asInstanceOf[js.Any])
    
    inline def setMax_recipientsUndefined: Self = StObject.set(x, "max_recipients", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: apprequests): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setObject_id(value: String): Self = StObject.set(x, "object_id", value.asInstanceOf[js.Any])
    
    inline def setObject_idUndefined: Self = StObject.set(x, "object_id", js.undefined)
    
    inline def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}

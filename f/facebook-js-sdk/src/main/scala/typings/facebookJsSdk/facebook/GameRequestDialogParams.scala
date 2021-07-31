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
  
  @scala.inline
  def apply(message: String): GameRequestDialogParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = "apprequests")
    __obj.asInstanceOf[GameRequestDialogParams]
  }
  
  @scala.inline
  implicit class GameRequestDialogParamsMutableBuilder[Self <: GameRequestDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction_type(value: send | askfor | turn): Self = StObject.set(x, "action_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction_typeUndefined: Self = StObject.set(x, "action_type", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setExclude_ids(value: js.Array[String]): Self = StObject.set(x, "exclude_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_idsUndefined: Self = StObject.set(x, "exclude_ids", js.undefined)
    
    @scala.inline
    def setExclude_idsVarargs(value: String*): Self = StObject.set(x, "exclude_ids", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: app_users | app_non_users | js.Array[Name]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Name*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMax_recipients(value: Double): Self = StObject.set(x, "max_recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_recipientsUndefined: Self = StObject.set(x, "max_recipients", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: apprequests): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject_id(value: String): Self = StObject.set(x, "object_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject_idUndefined: Self = StObject.set(x, "object_id", js.undefined)
    
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}

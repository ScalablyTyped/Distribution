package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.anon.Name
import typings.facebookJsSdk.facebookJsSdkStrings.app_non_users
import typings.facebookJsSdk.facebookJsSdkStrings.app_users
import typings.facebookJsSdk.facebookJsSdkStrings.apprequests
import typings.facebookJsSdk.facebookJsSdkStrings.askfor
import typings.facebookJsSdk.facebookJsSdkStrings.send
import typings.facebookJsSdk.facebookJsSdkStrings.turn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameRequestDialogParams extends DialogParams {
  
  var action_type: js.UndefOr[send | askfor | turn] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var exclude_ids: js.UndefOr[js.Array[String]] = js.native
  
  var filters: js.UndefOr[app_users | app_non_users | js.Array[Name]] = js.native
  
  var max_recipients: js.UndefOr[Double] = js.native
  
  var message: String = js.native
  
  var method: apprequests = js.native
  
  var object_id: js.UndefOr[String] = js.native
  
  var suggestions: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String | Double] = js.native
}
object GameRequestDialogParams {
  
  @scala.inline
  def apply(message: String, method: apprequests): GameRequestDialogParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogParams]
  }
  
  @scala.inline
  implicit class GameRequestDialogParamsOps[Self <: GameRequestDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: apprequests): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction_type(value: send | askfor | turn): Self = this.set("action_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction_type: Self = this.set("action_type", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setExclude_idsVarargs(value: String*): Self = this.set("exclude_ids", js.Array(value :_*))
    
    @scala.inline
    def setExclude_ids(value: js.Array[String]): Self = this.set("exclude_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_ids: Self = this.set("exclude_ids", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Name*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: app_users | app_non_users | js.Array[Name]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMax_recipients(value: Double): Self = this.set("max_recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_recipients: Self = this.set("max_recipients", js.undefined)
    
    @scala.inline
    def setObject_id(value: String): Self = this.set("object_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject_id: Self = this.set("object_id", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTo(value: String | Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}

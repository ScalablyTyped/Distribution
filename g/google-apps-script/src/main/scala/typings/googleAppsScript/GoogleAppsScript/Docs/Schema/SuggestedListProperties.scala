package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedListProperties extends js.Object {
  
  var listProperties: js.UndefOr[ListProperties] = js.native
  
  var listPropertiesSuggestionState: js.UndefOr[ListPropertiesSuggestionState] = js.native
}
object SuggestedListProperties {
  
  @scala.inline
  def apply(): SuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedListProperties]
  }
  
  @scala.inline
  implicit class SuggestedListPropertiesOps[Self <: SuggestedListProperties] (val x: Self) extends AnyVal {
    
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
    def setListProperties(value: ListProperties): Self = this.set("listProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListProperties: Self = this.set("listProperties", js.undefined)
    
    @scala.inline
    def setListPropertiesSuggestionState(value: ListPropertiesSuggestionState): Self = this.set("listPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListPropertiesSuggestionState: Self = this.set("listPropertiesSuggestionState", js.undefined)
  }
}

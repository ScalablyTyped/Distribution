package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedPositionedObjectProperties extends js.Object {
  
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.native
  
  var positionedObjectPropertiesSuggestionState: js.UndefOr[PositionedObjectPropertiesSuggestionState] = js.native
}
object SuggestedPositionedObjectProperties {
  
  @scala.inline
  def apply(): SuggestedPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedPositionedObjectProperties]
  }
  
  @scala.inline
  implicit class SuggestedPositionedObjectPropertiesOps[Self <: SuggestedPositionedObjectProperties] (val x: Self) extends AnyVal {
    
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
    def setPositionedObjectProperties(value: PositionedObjectProperties): Self = this.set("positionedObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjectProperties: Self = this.set("positionedObjectProperties", js.undefined)
    
    @scala.inline
    def setPositionedObjectPropertiesSuggestionState(value: PositionedObjectPropertiesSuggestionState): Self = this.set("positionedObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjectPropertiesSuggestionState: Self = this.set("positionedObjectPropertiesSuggestionState", js.undefined)
  }
}

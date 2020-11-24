package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPropertiesSuggestionState extends js.Object {
  
  var nestingLevelsSuggestionStates: js.UndefOr[js.Array[NestingLevelSuggestionState]] = js.native
}
object ListPropertiesSuggestionState {
  
  @scala.inline
  def apply(): ListPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class ListPropertiesSuggestionStateOps[Self <: ListPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setNestingLevelsSuggestionStatesVarargs(value: NestingLevelSuggestionState*): Self = this.set("nestingLevelsSuggestionStates", js.Array(value :_*))
    
    @scala.inline
    def setNestingLevelsSuggestionStates(value: js.Array[NestingLevelSuggestionState]): Self = this.set("nestingLevelsSuggestionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestingLevelsSuggestionStates: Self = this.set("nestingLevelsSuggestionStates", js.undefined)
  }
}

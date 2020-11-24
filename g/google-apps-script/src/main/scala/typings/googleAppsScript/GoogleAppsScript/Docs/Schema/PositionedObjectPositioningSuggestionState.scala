package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionedObjectPositioningSuggestionState extends js.Object {
  
  var layoutSuggested: js.UndefOr[Boolean] = js.native
  
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.native
  
  var topOffsetSuggested: js.UndefOr[Boolean] = js.native
}
object PositionedObjectPositioningSuggestionState {
  
  @scala.inline
  def apply(): PositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPositioningSuggestionState]
  }
  
  @scala.inline
  implicit class PositionedObjectPositioningSuggestionStateOps[Self <: PositionedObjectPositioningSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setLayoutSuggested(value: Boolean): Self = this.set("layoutSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutSuggested: Self = this.set("layoutSuggested", js.undefined)
    
    @scala.inline
    def setLeftOffsetSuggested(value: Boolean): Self = this.set("leftOffsetSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftOffsetSuggested: Self = this.set("leftOffsetSuggested", js.undefined)
    
    @scala.inline
    def setTopOffsetSuggested(value: Boolean): Self = this.set("topOffsetSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopOffsetSuggested: Self = this.set("topOffsetSuggested", js.undefined)
  }
}

package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for UpdateDraftActionResponse objects.
  */
@js.native
trait UpdateDraftActionResponseBuilder extends js.Object {
  
  def build(): UpdateDraftActionResponse = js.native
  
  def setUpdateDraftBodyAction(updateDraftBodyAction: UpdateDraftBodyAction): UpdateDraftActionResponseBuilder = js.native
}
object UpdateDraftActionResponseBuilder {
  
  @scala.inline
  def apply(
    build: () => UpdateDraftActionResponse,
    setUpdateDraftBodyAction: UpdateDraftBodyAction => UpdateDraftActionResponseBuilder
  ): UpdateDraftActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setUpdateDraftBodyAction = js.Any.fromFunction1(setUpdateDraftBodyAction))
    __obj.asInstanceOf[UpdateDraftActionResponseBuilder]
  }
  
  @scala.inline
  implicit class UpdateDraftActionResponseBuilderOps[Self <: UpdateDraftActionResponseBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => UpdateDraftActionResponse): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetUpdateDraftBodyAction(value: UpdateDraftBodyAction => UpdateDraftActionResponseBuilder): Self = this.set("setUpdateDraftBodyAction", js.Any.fromFunction1(value))
  }
}

package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for UpdateDraftActionResponse objects.
  */
trait UpdateDraftActionResponseBuilder extends StObject {
  
  def build(): UpdateDraftActionResponse
  
  def setUpdateDraftBodyAction(updateDraftBodyAction: UpdateDraftBodyAction): UpdateDraftActionResponseBuilder
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
  implicit class UpdateDraftActionResponseBuilderMutableBuilder[Self <: UpdateDraftActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => UpdateDraftActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetUpdateDraftBodyAction(value: UpdateDraftBodyAction => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "setUpdateDraftBodyAction", js.Any.fromFunction1(value))
  }
}

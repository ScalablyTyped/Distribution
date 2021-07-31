package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for ActionResponse objects.
  */
trait ActionResponseBuilder extends StObject {
  
  def build(): ActionResponse
  
  def setNavigation(navigation: Navigation): ActionResponseBuilder
  
  def setNotification(notification: Notification): ActionResponseBuilder
  
  def setOpenLink(openLink: OpenLink): ActionResponseBuilder
  
  def setStateChanged(stateChanged: Boolean): ActionResponseBuilder
}
object ActionResponseBuilder {
  
  @scala.inline
  def apply(
    build: () => ActionResponse,
    setNavigation: Navigation => ActionResponseBuilder,
    setNotification: Notification => ActionResponseBuilder,
    setOpenLink: OpenLink => ActionResponseBuilder,
    setStateChanged: Boolean => ActionResponseBuilder
  ): ActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setNavigation = js.Any.fromFunction1(setNavigation), setNotification = js.Any.fromFunction1(setNotification), setOpenLink = js.Any.fromFunction1(setOpenLink), setStateChanged = js.Any.fromFunction1(setStateChanged))
    __obj.asInstanceOf[ActionResponseBuilder]
  }
  
  @scala.inline
  implicit class ActionResponseBuilderMutableBuilder[Self <: ActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => ActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetNavigation(value: Navigation => ActionResponseBuilder): Self = StObject.set(x, "setNavigation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotification(value: Notification => ActionResponseBuilder): Self = StObject.set(x, "setNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => ActionResponseBuilder): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStateChanged(value: Boolean => ActionResponseBuilder): Self = StObject.set(x, "setStateChanged", js.Any.fromFunction1(value))
  }
}

package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for ActionResponse objects.
  */
@js.native
trait ActionResponseBuilder extends js.Object {
  
  def build(): ActionResponse = js.native
  
  def setNavigation(navigation: Navigation): ActionResponseBuilder = js.native
  
  def setNotification(notification: Notification): ActionResponseBuilder = js.native
  
  def setOpenLink(openLink: OpenLink): ActionResponseBuilder = js.native
  
  def setStateChanged(stateChanged: Boolean): ActionResponseBuilder = js.native
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
  implicit class ActionResponseBuilderOps[Self <: ActionResponseBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => ActionResponse): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetNavigation(value: Navigation => ActionResponseBuilder): Self = this.set("setNavigation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotification(value: Notification => ActionResponseBuilder): Self = this.set("setNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => ActionResponseBuilder): Self = this.set("setOpenLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStateChanged(value: Boolean => ActionResponseBuilder): Self = this.set("setStateChanged", js.Any.fromFunction1(value))
  }
}

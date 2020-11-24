package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for the UniversalActionResponse objects.
  */
@js.native
trait UniversalActionResponseBuilder extends js.Object {
  
  def build(): UniversalActionResponse = js.native
  
  def displayAddOnCards(cardObjects: js.Array[Card]): UniversalActionResponseBuilder = js.native
  
  def setOpenLink(openLink: OpenLink): UniversalActionResponseBuilder = js.native
}
object UniversalActionResponseBuilder {
  
  @scala.inline
  def apply(
    build: () => UniversalActionResponse,
    displayAddOnCards: js.Array[Card] => UniversalActionResponseBuilder,
    setOpenLink: OpenLink => UniversalActionResponseBuilder
  ): UniversalActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), displayAddOnCards = js.Any.fromFunction1(displayAddOnCards), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
  
  @scala.inline
  implicit class UniversalActionResponseBuilderOps[Self <: UniversalActionResponseBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => UniversalActionResponse): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayAddOnCards(value: js.Array[Card] => UniversalActionResponseBuilder): Self = this.set("displayAddOnCards", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => UniversalActionResponseBuilder): Self = this.set("setOpenLink", js.Any.fromFunction1(value))
  }
}

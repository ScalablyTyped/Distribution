package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for the UniversalActionResponse objects.
  */
@js.native
trait UniversalActionResponseBuilder extends StObject {
  
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
  implicit class UniversalActionResponseBuilderMutableBuilder[Self <: UniversalActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => UniversalActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayAddOnCards(value: js.Array[Card] => UniversalActionResponseBuilder): Self = StObject.set(x, "displayAddOnCards", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => UniversalActionResponseBuilder): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
  }
}

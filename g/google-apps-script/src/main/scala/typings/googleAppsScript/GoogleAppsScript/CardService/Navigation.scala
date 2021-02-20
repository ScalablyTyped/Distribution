package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A helper object that controls card navigation. See the card navigation guide for more details.
  */
@js.native
trait Navigation extends StObject {
  
  def popCard(): Navigation = js.native
  
  def popToNamedCard(cardName: String): Navigation = js.native
  
  def popToRoot(): Navigation = js.native
  
  def printJson(): String = js.native
  
  def pushCard(card: Card): Navigation = js.native
  
  def updateCard(card: Card): Navigation = js.native
}
object Navigation {
  
  @scala.inline
  def apply(
    popCard: () => Navigation,
    popToNamedCard: String => Navigation,
    popToRoot: () => Navigation,
    printJson: () => String,
    pushCard: Card => Navigation,
    updateCard: Card => Navigation
  ): Navigation = {
    val __obj = js.Dynamic.literal(popCard = js.Any.fromFunction0(popCard), popToNamedCard = js.Any.fromFunction1(popToNamedCard), popToRoot = js.Any.fromFunction0(popToRoot), printJson = js.Any.fromFunction0(printJson), pushCard = js.Any.fromFunction1(pushCard), updateCard = js.Any.fromFunction1(updateCard))
    __obj.asInstanceOf[Navigation]
  }
  
  @scala.inline
  implicit class NavigationMutableBuilder[Self <: Navigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopCard(value: () => Navigation): Self = StObject.set(x, "popCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopToNamedCard(value: String => Navigation): Self = StObject.set(x, "popToNamedCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopToRoot(value: () => Navigation): Self = StObject.set(x, "popToRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPushCard(value: Card => Navigation): Self = StObject.set(x, "pushCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateCard(value: Card => Navigation): Self = StObject.set(x, "updateCard", js.Any.fromFunction1(value))
  }
}

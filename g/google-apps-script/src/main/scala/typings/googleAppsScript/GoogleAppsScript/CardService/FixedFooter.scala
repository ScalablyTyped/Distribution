package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The fixed footer shown at the bottom of an add-on Card.
  */
trait FixedFooter extends StObject {
  
  def setPrimaryButton(button: TextButton): FixedFooter
  
  def setSecondaryButton(button: TextButton): FixedFooter
}
object FixedFooter {
  
  @scala.inline
  def apply(setPrimaryButton: TextButton => FixedFooter, setSecondaryButton: TextButton => FixedFooter): FixedFooter = {
    val __obj = js.Dynamic.literal(setPrimaryButton = js.Any.fromFunction1(setPrimaryButton), setSecondaryButton = js.Any.fromFunction1(setSecondaryButton))
    __obj.asInstanceOf[FixedFooter]
  }
  
  @scala.inline
  implicit class FixedFooterMutableBuilder[Self <: FixedFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetPrimaryButton(value: TextButton => FixedFooter): Self = StObject.set(x, "setPrimaryButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSecondaryButton(value: TextButton => FixedFooter): Self = StObject.set(x, "setSecondaryButton", js.Any.fromFunction1(value))
  }
}

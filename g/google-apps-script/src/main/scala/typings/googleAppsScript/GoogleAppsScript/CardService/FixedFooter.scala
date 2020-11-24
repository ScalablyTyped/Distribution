package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The fixed footer shown at the bottom of an add-on Card.
  */
@js.native
trait FixedFooter extends js.Object {
  
  def setPrimaryButton(button: TextButton): FixedFooter = js.native
  
  def setSecondaryButton(button: TextButton): FixedFooter = js.native
}
object FixedFooter {
  
  @scala.inline
  def apply(setPrimaryButton: TextButton => FixedFooter, setSecondaryButton: TextButton => FixedFooter): FixedFooter = {
    val __obj = js.Dynamic.literal(setPrimaryButton = js.Any.fromFunction1(setPrimaryButton), setSecondaryButton = js.Any.fromFunction1(setSecondaryButton))
    __obj.asInstanceOf[FixedFooter]
  }
  
  @scala.inline
  implicit class FixedFooterOps[Self <: FixedFooter] (val x: Self) extends AnyVal {
    
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
    def setSetPrimaryButton(value: TextButton => FixedFooter): Self = this.set("setPrimaryButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSecondaryButton(value: TextButton => FixedFooter): Self = this.set("setSecondaryButton", js.Any.fromFunction1(value))
  }
}

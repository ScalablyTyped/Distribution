package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The fixed footer shown at the bottom of an add-on Card.
  */
trait FixedFooter extends js.Object {
  def setPrimaryButton(button: TextButton): FixedFooter
  def setSecondaryButton(button: TextButton): FixedFooter
}

object FixedFooter {
  @scala.inline
  def apply(setPrimaryButton: TextButton => FixedFooter, setSecondaryButton: TextButton => FixedFooter): FixedFooter = {
    val __obj = js.Dynamic.literal(setPrimaryButton = js.Any.fromFunction1(setPrimaryButton), setSecondaryButton = js.Any.fromFunction1(setSecondaryButton))
    __obj.asInstanceOf[FixedFooter]
  }
}


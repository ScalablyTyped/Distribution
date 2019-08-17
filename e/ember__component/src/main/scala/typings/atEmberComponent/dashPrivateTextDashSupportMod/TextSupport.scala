package typings.atEmberComponent.dashPrivateTextDashSupportMod

import typings.atEmberComponent.dashPrivateTargetDashActionDashSupportMod.TargetActionSupport
import typings.atEmberComponent.dashPrivateTargetDashActionDashSupportMod.TriggerActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `TextSupport` is a shared mixin used by both `Ember.TextField` and
  * `Ember.TextArea`. `TextSupport` adds a number of methods that allow you to
  * specify a controller action to invoke when a certain event is fired on your
  * text field or textarea. The specifed controller action would get the current
  * value of the field passed in as the only argument unless the value of
  * the field is empty. In that case, the instance of the field itself is passed
  * in as the only argument.
  */
trait TextSupport extends TargetActionSupport {
  var action: String
  var bubbles: Boolean
  var onEvent: String
  // tslint:disable-next-line:ban-types
  def cancel(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def focusIn(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def focusOut(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def insertNewLine(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def keyPress(event: js.Function): Unit
}

object TextSupport {
  @scala.inline
  def apply(
    action: String,
    bubbles: Boolean,
    cancel: js.Function => Unit,
    focusIn: js.Function => Unit,
    focusOut: js.Function => Unit,
    insertNewLine: js.Function => Unit,
    keyPress: js.Function => Unit,
    onEvent: String,
    triggerAction: TriggerActionOptions => Boolean
  ): TextSupport = {
    val __obj = js.Dynamic.literal(action = action, bubbles = bubbles, cancel = js.Any.fromFunction1(cancel), focusIn = js.Any.fromFunction1(focusIn), focusOut = js.Any.fromFunction1(focusOut), insertNewLine = js.Any.fromFunction1(insertNewLine), keyPress = js.Any.fromFunction1(keyPress), onEvent = onEvent, triggerAction = js.Any.fromFunction1(triggerAction))
  
    __obj.asInstanceOf[TextSupport]
  }
}


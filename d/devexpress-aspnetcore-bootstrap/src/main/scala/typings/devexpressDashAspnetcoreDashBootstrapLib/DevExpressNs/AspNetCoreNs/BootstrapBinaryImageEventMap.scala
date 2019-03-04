package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapBinaryImageEventMap extends BootstrapClientEditEventMap {
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var click: EditClickEventArgs
  var endCallback: EndCallbackEventArgs
}

object BootstrapBinaryImageEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    click: EditClickEventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapBinaryImageEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback, callbackError = callbackError, click = click, endCallback = endCallback, gotFocus = gotFocus, init = init, lostFocus = lostFocus, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapBinaryImageEventMap]
  }
}


package typings.devextreme.mod.DevExpress

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxEvent extends event {
  /** @name dxEvent.currentTarget */
  var currentTarget: Element
  /** @name dxEvent.data */
  var data: js.Any
  /** @name dxEvent.delegateTarget */
  var delegateTarget: Element
  /** @name dxEvent.target */
  var target: Element
  /** @name dxEvent.isDefaultPrevented() */
  def isDefaultPrevented(): Boolean
  /** @name dxEvent.isImmediatePropagationStopped() */
  def isImmediatePropagationStopped(): Boolean
  /** @name dxEvent.isPropagationStopped() */
  def isPropagationStopped(): Boolean
  /** @name dxEvent.preventDefault() */
  def preventDefault(): Unit
  /** @name dxEvent.stopImmediatePropagation() */
  def stopImmediatePropagation(): Unit
  /** @name dxEvent.stopPropagation() */
  def stopPropagation(): Unit
}

object dxEvent {
  @scala.inline
  def apply(
    currentTarget: Element,
    data: js.Any,
    delegateTarget: Element,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: Element
  ): dxEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxEvent]
  }
}


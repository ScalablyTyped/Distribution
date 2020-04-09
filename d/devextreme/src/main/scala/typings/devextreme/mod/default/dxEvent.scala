package typings.devextreme.mod.default

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "dxEvent")
@js.native
class dxEvent ()
  extends typings.devextreme.mod.DevExpress.dxEvent {
  /** @name dxEvent.currentTarget */
  /* CompleteClass */
  override var currentTarget: Element = js.native
  /** @name dxEvent.data */
  /* CompleteClass */
  override var data: js.Any = js.native
  /** @name dxEvent.delegateTarget */
  /* CompleteClass */
  override var delegateTarget: Element = js.native
  /** @name dxEvent.target */
  /* CompleteClass */
  override var target: Element = js.native
  /** @name dxEvent.isDefaultPrevented() */
  /* CompleteClass */
  override def isDefaultPrevented(): Boolean = js.native
  /** @name dxEvent.isImmediatePropagationStopped() */
  /* CompleteClass */
  override def isImmediatePropagationStopped(): Boolean = js.native
  /** @name dxEvent.isPropagationStopped() */
  /* CompleteClass */
  override def isPropagationStopped(): Boolean = js.native
  /** @name dxEvent.preventDefault() */
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /** @name dxEvent.stopImmediatePropagation() */
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /** @name dxEvent.stopPropagation() */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}


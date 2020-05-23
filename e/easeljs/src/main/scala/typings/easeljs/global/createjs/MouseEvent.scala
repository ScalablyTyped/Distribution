package typings.easeljs.global.createjs

import typings.createjsLib.createjs.Event
import typings.easeljs.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.easeljs.createjs.MouseEvent {
  def this(
    `type`: String,
    bubbles: Boolean,
    cancelable: Boolean,
    stageX: Double,
    stageY: Double,
    nativeEvent: NativeMouseEvent,
    pointerID: Double,
    primary: Boolean,
    rawX: Double,
    rawY: Double
  ) = this()
  // properties
  /* CompleteClass */
  override var bubbles: Boolean = js.native
  /* CompleteClass */
  override var cancelable: Boolean = js.native
  /* CompleteClass */
  override var currentTarget: js.Any = js.native
  // other event payloads
  /* CompleteClass */
  override var data: js.Any = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  /* CompleteClass */
  override var defaultPrevented: Boolean = js.native
  /* CompleteClass */
  override var delta: Double = js.native
  /* CompleteClass */
  override var error: String = js.native
  /* CompleteClass */
  override var eventPhase: Double = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var immediatePropagationStopped: Boolean = js.native
  /* CompleteClass */
  override var item: js.Any = js.native
  /* CompleteClass */
  override var loaded: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var next: String = js.native
  /* CompleteClass */
  override var params: js.Any = js.native
  /* CompleteClass */
  override var paused: Boolean = js.native
  /* CompleteClass */
  override var progress: Double = js.native
  /* CompleteClass */
  override var propagationStopped: Boolean = js.native
  /* CompleteClass */
  override var rawResult: js.Any = js.native
  /* CompleteClass */
  override var removed: Boolean = js.native
  /* CompleteClass */
  override var result: js.Any = js.native
  /* CompleteClass */
  override var runTime: Double = js.native
  /* CompleteClass */
  override var src: String = js.native
  /* CompleteClass */
  override var target: js.Any = js.native
  /* CompleteClass */
  override var time: Double = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  /* CompleteClass */
  override var timeStamp: Double = js.native
  /* CompleteClass */
  override var total: Double = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def remove(): Unit = js.native
  /* CompleteClass */
  override def set(props: js.Object): Event = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}


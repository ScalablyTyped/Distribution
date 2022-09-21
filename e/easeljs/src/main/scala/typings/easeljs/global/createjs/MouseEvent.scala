package typings.easeljs.global.createjs

import typings.createjsLib.createjs.Event
import typings.easeljs.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.MouseEvent")
@js.native
open class MouseEvent protected ()
  extends StObject
     with typings.easeljs.createjs.MouseEvent {
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
  var bubbles: Boolean = js.native
  
  /* CompleteClass */
  var cancelable: Boolean = js.native
  
  /* CompleteClass */
  var currentTarget: Any = js.native
  
  // other event payloads
  /* CompleteClass */
  var data: Any = js.native
  
  // It is 'Object' type officially, but 'any' is easier to use.
  /* CompleteClass */
  var defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  var delta: Double = js.native
  
  /* CompleteClass */
  var error: String = js.native
  
  /* CompleteClass */
  var eventPhase: Double = js.native
  
  /* CompleteClass */
  var id: String = js.native
  
  /* CompleteClass */
  var immediatePropagationStopped: Boolean = js.native
  
  /* CompleteClass */
  var item: Any = js.native
  
  /* CompleteClass */
  var loaded: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var next: String = js.native
  
  /* CompleteClass */
  var params: Any = js.native
  
  /* CompleteClass */
  var paused: Boolean = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  var progress: Double = js.native
  
  /* CompleteClass */
  var propagationStopped: Boolean = js.native
  
  /* CompleteClass */
  var rawResult: Any = js.native
  
  /* CompleteClass */
  override def remove(): Unit = js.native
  
  /* CompleteClass */
  var removed: Boolean = js.native
  
  /* CompleteClass */
  var result: Any = js.native
  
  /* CompleteClass */
  var runTime: Double = js.native
  
  /* CompleteClass */
  override def set(props: js.Object): Event = js.native
  
  /* CompleteClass */
  var src: String = js.native
  
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /* CompleteClass */
  var target: Any = js.native
  
  /* CompleteClass */
  var time: Double = js.native
  
  // It is 'Object' type officially, but 'any' is easier to use.
  /* CompleteClass */
  var timeStamp: Double = js.native
  
  /* CompleteClass */
  var total: Double = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}

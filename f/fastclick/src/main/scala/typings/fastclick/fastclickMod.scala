package typings.fastclick

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastclick", JSImport.Namespace)
@js.native
object fastclickMod extends js.Object {
  @js.native
  class FastClick protected () extends FastClickObject {
    def this(layer: js.Any) = this()
    def this(layer: js.Any, options: FastClickOptions) = this()
    /* CompleteClass */
    override var lastTouchIdentifier: Double = js.native
    /* CompleteClass */
    override var layer: Element = js.native
    /* CompleteClass */
    override var tapDelay: Double = js.native
    /* CompleteClass */
    override var targetElement: js.Any = js.native
    /* CompleteClass */
    override var touchBoundary: Double = js.native
    /* CompleteClass */
    override var touchStartX: Double = js.native
    /* CompleteClass */
    override var touchStartY: Double = js.native
    /* CompleteClass */
    override var trackingClick: Boolean = js.native
    /* CompleteClass */
    override var trackingClickStart: Double = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def determineEventType(targetElement: js.Any): String = js.native
    /* CompleteClass */
    override def findControl(labelElement: js.Any): js.Any = js.native
    /* CompleteClass */
    override def focus(targetElement: js.Any): Unit = js.native
    /* CompleteClass */
    override def getTargetElementFromEventTarget(eventTarget: EventTarget): js.Any = js.native
    /* CompleteClass */
    override def needsClick(target: js.Any): Boolean = js.native
    /* CompleteClass */
    override def needsFocus(target: js.Any): Boolean = js.native
  }
  
  def apply(layer: js.Any): FastClickObject = js.native
  def apply(layer: js.Any, options: FastClickOptions): FastClickObject = js.native
  @js.native
  object FastClick extends TopLevel[FastClickStatic]
  
}


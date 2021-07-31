package typings.fastclick

import typings.std.Element
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(layer: js.Any): FastClickObject = ^.asInstanceOf[js.Dynamic].apply(layer.asInstanceOf[js.Any]).asInstanceOf[FastClickObject]
  @scala.inline
  def apply(layer: js.Any, options: FastClickOptions): FastClickObject = (^.asInstanceOf[js.Dynamic].apply(layer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FastClickObject]
  
  @JSImport("fastclick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fastclick", "FastClick")
  @js.native
  class FastClick protected ()
    extends StObject
       with FastClickObject {
    def this(layer: js.Any) = this()
    def this(layer: js.Any, options: FastClickOptions) = this()
    
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
    var lastTouchIdentifier: Double = js.native
    
    /* CompleteClass */
    var layer: Element = js.native
    
    /* CompleteClass */
    override def needsClick(target: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def needsFocus(target: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var tapDelay: Double = js.native
    
    /* CompleteClass */
    var targetElement: js.Any = js.native
    
    /* CompleteClass */
    var touchBoundary: Double = js.native
    
    /* CompleteClass */
    var touchStartX: Double = js.native
    
    /* CompleteClass */
    var touchStartY: Double = js.native
    
    /* CompleteClass */
    var trackingClick: Boolean = js.native
    
    /* CompleteClass */
    var trackingClickStart: Double = js.native
  }
  @JSImport("fastclick", "FastClick")
  @js.native
  def FastClick: FastClickStatic = js.native
  @scala.inline
  def FastClick_=(x: FastClickStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastClick")(x.asInstanceOf[js.Any])
}

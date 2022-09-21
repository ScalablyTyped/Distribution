package typings.fastclick

import typings.std.Element
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(layer: Any): FastClickObject = ^.asInstanceOf[js.Dynamic].apply(layer.asInstanceOf[js.Any]).asInstanceOf[FastClickObject]
  inline def apply(layer: Any, options: FastClickOptions): FastClickObject = (^.asInstanceOf[js.Dynamic].apply(layer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FastClickObject]
  
  @JSImport("fastclick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fastclick", "FastClick")
  @js.native
  open class FastClick protected ()
    extends StObject
       with FastClickObject {
    def this(layer: Any) = this()
    def this(layer: Any, options: FastClickOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def determineEventType(targetElement: Any): String = js.native
    
    /* CompleteClass */
    override def findControl(labelElement: Any): Any = js.native
    
    /* CompleteClass */
    override def focus(targetElement: Any): Unit = js.native
    
    /* CompleteClass */
    override def getTargetElementFromEventTarget(eventTarget: EventTarget): Any = js.native
    
    /* CompleteClass */
    var lastTouchIdentifier: Double = js.native
    
    /* CompleteClass */
    var layer: Element = js.native
    
    /* CompleteClass */
    override def needsClick(target: Any): Boolean = js.native
    
    /* CompleteClass */
    override def needsFocus(target: Any): Boolean = js.native
    
    /* CompleteClass */
    var tapDelay: Double = js.native
    
    /* CompleteClass */
    var targetElement: Any = js.native
    
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
  inline def FastClick_=(x: FastClickStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastClick")(x.asInstanceOf[js.Any])
}

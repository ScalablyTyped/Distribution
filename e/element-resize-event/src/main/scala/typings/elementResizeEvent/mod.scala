package typings.elementResizeEvent

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Make it easy to listen for element resize events.
    *
    * @example
    * import elementResizeEvent = require("element-resize-event");
    *
    * const element = document.getElementById("resize");
    *
    * if (element) {
    *     elementResizeEvent(element, () => {
    *         console.log("resized!");
    *         console.log(element.offsetWidth);
    *     });
    * }
    */
  inline def apply(domNode: Element, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(domNode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("element-resize-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Unbind a previously registered event listener.
    *
    * @example
    * import elementResizeEvent = require("element-resize-event");
    *
    * const element = document.getElementById("resize");
    *
    * if (element) {
    *     // ...
    *     elementResizeEvent.unbind(element);
    * }
    */
  inline def unbind(domNode: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(domNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unbind(domNode: Element, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(domNode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

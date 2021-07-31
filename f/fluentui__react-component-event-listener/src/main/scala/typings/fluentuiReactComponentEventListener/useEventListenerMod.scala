package typings.fluentuiReactComponentEventListener

import typings.fluentuiReactComponentEventListener.typesMod.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEventListenerMod {
  
  @JSImport("@fluentui/react-component-event-listener/dist/es/useEventListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useEventListener[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 97 */ js.Any */](options: EventListenerOptions[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

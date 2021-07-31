package typings.eventsOnce

import typings.node.eventsMod.DOMEventTarget
import typings.node.eventsMod.NodeEventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(emitter: DOMEventTarget, event: String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def apply(emitter: NodeEventTarget, event: String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def apply(emitter: NodeEventTarget, event: js.Symbol): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  @JSImport("events.once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

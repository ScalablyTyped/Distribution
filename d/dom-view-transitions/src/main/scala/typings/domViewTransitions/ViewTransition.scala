package typings.domViewTransitions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewTransition extends StObject {
  
  var finished: js.Promise[Unit]
  
  var ready: js.Promise[Unit]
  
  def skipTransition(): Unit
  
  var updateCallbackDone: js.Promise[Unit]
}
object ViewTransition {
  
  inline def apply(
    finished: js.Promise[Unit],
    ready: js.Promise[Unit],
    skipTransition: () => Unit,
    updateCallbackDone: js.Promise[Unit]
  ): ViewTransition = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], skipTransition = js.Any.fromFunction0(skipTransition), updateCallbackDone = updateCallbackDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewTransition] (val x: Self) extends AnyVal {
    
    inline def setFinished(value: js.Promise[Unit]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setReady(value: js.Promise[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setSkipTransition(value: () => Unit): Self = StObject.set(x, "skipTransition", js.Any.fromFunction0(value))
    
    inline def setUpdateCallbackDone(value: js.Promise[Unit]): Self = StObject.set(x, "updateCallbackDone", value.asInstanceOf[js.Any])
  }
}

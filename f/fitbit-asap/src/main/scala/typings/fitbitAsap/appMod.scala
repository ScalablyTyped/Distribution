package typings.fitbitAsap

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod extends Shortcut {
  
  @JSImport("fitbit-asap/app", JSImport.Default)
  @js.native
  val default: Asap = js.native
  
  @js.native
  trait Asap extends StObject {
    
    /**
      * Cancels all queued messages if id is not set. Call this function on startup to limit messages to a single session.
      * @param id cancel only the given message if id is set
      */
    def cancel(): Unit = js.native
    def cancel(id: Double): Unit = js.native
    
    /**
      * Called when a message is received from the peer.
      * The function assigned to asap.onmessage accepts a single parameter containing the message, which will have the same data type it had when it was passed into the send function.
      */
    def onmessage(message: Any): Unit = js.native
    
    /**
      * Queues a message to be sent to the peer.
      * @param message The message to be sent to the peer. This can be any data type.
      * @param options Options for how this message should be handled. Currently, timeout is the only option.
      */
    def send(message: Any): Unit = js.native
    def send(message: Any, options: Options): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The maximum number of milliseconds a message can remain in the queue. The default is 86400000 (24 hours).
      */
    var timeout: Double
  }
  object Options {
    
    inline def apply(timeout: Double): Options = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Asap
  
  /* This means you don't have to write `default`, but can instead just say `appMod.foo` */
  override def _to: Asap = default
}

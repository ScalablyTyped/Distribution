package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsEventsMod {
  
  @JSImport("ethers/types/utils/events", "EventPayload")
  @js.native
  open class EventPayload[T] protected () extends StObject {
    /**
      *  Create a new **EventPayload** for %%emitter%% with
      *  the %%listener%% and for %%filter%%.
      */
    def this(emitter: EventEmitterable[T], listener: Null, filter: T) = this()
    def this(emitter: EventEmitterable[T], listener: Listener, filter: T) = this()
    
    /**
      *  The **EventEmitterable**.
      */
    val emitter: EventEmitterable[T] = js.native
    
    /**
      *  The event filter.
      */
    val filter: T = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  Unregister the triggered listener for future events.
      */
    def removeListener(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait EventEmitterable[T] extends StObject {
    
    /**
      *  Alias for [[on]].
      */
    def addListener(event: T, listener: Listener): js.Promise[this.type] = js.native
    
    /**
      *  Triggers each listener for %%event%% with the %%args%%.
      */
    def emit(event: T, args: Any*): js.Promise[Boolean] = js.native
    
    /**
      *  Resolves to the number of listeners for %%event%%.
      */
    def listenerCount(): js.Promise[Double] = js.native
    def listenerCount(event: T): js.Promise[Double] = js.native
    
    /**
      *  Resolves to the listeners for %%event%%.
      */
    def listeners(): js.Promise[js.Array[Listener]] = js.native
    def listeners(event: T): js.Promise[js.Array[Listener]] = js.native
    
    /**
      *  Unregister the %%listener%% for %%event%%. If %%listener%%
      *  is unspecified, all listeners are unregistered.
      */
    def off(event: T): js.Promise[this.type] = js.native
    def off(event: T, listener: Listener): js.Promise[this.type] = js.native
    
    /**
      *  Registers a %%listener%% that is called whenever the
      *  %%event%% occurs until unregistered.
      */
    def on(event: T, listener: Listener): js.Promise[this.type] = js.native
    
    /**
      *  Registers a %%listener%% that is called the next time
      *  %%event%% occurs.
      */
    def once(event: T, listener: Listener): js.Promise[this.type] = js.native
    
    /**
      *  Unregister all listeners for %%event%%.
      */
    def removeAllListeners(): js.Promise[this.type] = js.native
    def removeAllListeners(event: T): js.Promise[this.type] = js.native
    
    /**
      *  Alias for [[off]].
      */
    def removeListener(event: T, listener: Listener): js.Promise[this.type] = js.native
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
}

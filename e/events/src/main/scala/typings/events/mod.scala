package typings.events

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("events", "EventEmitter")
  @js.native
  class EventEmitter () extends StObject {
    
    def addListener(`type`: String, listener: Listener): this.type = js.native
    def addListener(`type`: Double, listener: Listener): this.type = js.native
    
    def emit(`type`: String, args: js.Any*): Boolean = js.native
    def emit(`type`: Double, args: js.Any*): Boolean = js.native
    
    def eventNames(): js.Array[String | Double] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def listenerCount(`type`: String): Double = js.native
    def listenerCount(`type`: Double): Double = js.native
    
    def listeners(`type`: String): js.Array[Listener] = js.native
    def listeners(`type`: Double): js.Array[Listener] = js.native
    
    def off(`type`: String, listener: Listener): this.type = js.native
    def off(`type`: Double, listener: Listener): this.type = js.native
    
    def on(`type`: String, listener: Listener): this.type = js.native
    def on(`type`: Double, listener: Listener): this.type = js.native
    
    def once(`type`: String, listener: Listener): this.type = js.native
    def once(`type`: Double, listener: Listener): this.type = js.native
    
    def prependListener(`type`: String, listener: Listener): this.type = js.native
    def prependListener(`type`: Double, listener: Listener): this.type = js.native
    
    def prependOnceListener(`type`: String, listener: Listener): this.type = js.native
    def prependOnceListener(`type`: Double, listener: Listener): this.type = js.native
    
    def rawListeners(`type`: String): js.Array[Listener] = js.native
    def rawListeners(`type`: Double): js.Array[Listener] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(`type`: String): this.type = js.native
    def removeAllListeners(`type`: Double): this.type = js.native
    
    def removeListener(`type`: String, listener: Listener): this.type = js.native
    def removeListener(`type`: Double, listener: Listener): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
  }
  /* static members */
  object EventEmitter {
    
    @JSImport("events", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("events", "EventEmitter.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    @scala.inline
    def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
    @JSImport("events", "EventEmitter.listenerCount")
    @js.native
    def listenerCount(emitter: EventEmitter, `type`: String): Double = js.native
    @JSImport("events", "EventEmitter.listenerCount")
    @js.native
    def listenerCount(emitter: EventEmitter, `type`: Double): Double = js.native
  }
  
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
}

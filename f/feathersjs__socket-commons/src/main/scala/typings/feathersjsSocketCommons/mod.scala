package typings.feathersjsSocketCommons

import typings.feathersjsFeathers.mod.HookContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Channel extends StObject {
    
    def filter(callback: js.Function1[/* connection */ Connection, Boolean]): Channel
    
    def join(connections: Connection*): this.type
    
    def leave(connections: Connection*): this.type
    
    def send(data: Any): this.type
  }
  object Channel {
    
    inline def apply(
      filter: js.Function1[/* connection */ Connection, Boolean] => Channel,
      join: /* repeated */ Connection => Channel,
      leave: /* repeated */ Connection => Channel,
      send: Any => Channel
    ): Channel = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: js.Function1[/* connection */ Connection, Boolean] => Channel): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setJoin(value: /* repeated */ Connection => Channel): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      inline def setLeave(value: /* repeated */ Connection => Channel): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
      
      inline def setSend(value: Any => Channel): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  type Connection = Any
  
  /* augmented module */
  object feathersjsFeathersAugmentingMod {
    
    @js.native
    trait Application[ServiceTypes] extends StObject {
      
      def channel(name: js.Array[String]): Channel = js.native
      def channel(names: String*): Channel = js.native
      
      var channels: js.Array[String] = js.native
      
      def publish[T](
        callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
      ): Application[ServiceTypes] = js.native
      def publish[T](
        event: String,
        callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
      ): Application[ServiceTypes] = js.native
    }
    
    @js.native
    trait ServiceAddons[T] extends StObject {
      
      def publish(
        callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
      ): this.type = js.native
      def publish(
        event: String,
        callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
      ): this.type = js.native
    }
  }
}

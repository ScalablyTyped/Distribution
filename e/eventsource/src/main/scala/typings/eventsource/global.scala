package typings.eventsource

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class MessageEvent[T] protected ()
    extends typings.eventsource.MessageEvent[T] {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: MessageEventInit[T]) = this()
  }
  @js.native
  object MessageEvent
    extends Instantiable1[/* type */ String, typings.eventsource.MessageEvent[js.Object]]
       with Instantiable2[
          /* type */ String, 
          /* eventInitDict */ MessageEventInit[js.Object], 
          typings.eventsource.MessageEvent[js.Object]
        ]
}

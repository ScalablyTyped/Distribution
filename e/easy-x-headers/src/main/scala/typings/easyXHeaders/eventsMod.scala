package typings.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  
  @js.native
  class EventEmitter ()
    extends typings.easyXHeaders.NodeJS.EventEmitter
  /* static members */
  @js.native
  object EventEmitter extends js.Object {
    
    def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  }
}

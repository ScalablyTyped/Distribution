package typings.easyXapiSupertest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("events", "EventEmitter")
  @js.native
  class EventEmitter ()
    extends typings.easyXapiSupertest.NodeJS.EventEmitter
  /* static members */
  object EventEmitter {
    
    @JSImport("events", "EventEmitter.listenerCount")
    @js.native
    def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  }
}

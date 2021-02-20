package typings.eventemitterAsyncresource

import typings.eventemitterAsyncresource.anon.Name
import typings.node.asyncHooksMod.AsyncResource
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eventemitter-asyncresource", JSImport.Namespace)
  @js.native
  class ^ () extends EventEmitterAsyncResource {
    def this(options: String) = this()
    def this(options: Options) = this()
  }
  
  type AsyncResourceOptions = js.Any
  
  @js.native
  trait EventEmitterAsyncResource extends EventEmitter {
    
    def asyncId(): Double = js.native
    
    def asyncResource: EventEmitterReferencingAsyncResource = js.native
    
    def emitDestroy(): Unit = js.native
    
    def triggerAsyncId(): Double = js.native
  }
  
  type EventEmitterOptions = js.Any
  
  @js.native
  trait EventEmitterReferencingAsyncResource extends AsyncResource {
    
    def eventEmitter: EventEmitter = js.native
  }
  
  type Options = EventEmitterOptions with AsyncResourceOptions with Name
}

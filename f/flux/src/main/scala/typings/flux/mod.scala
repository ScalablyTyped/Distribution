package typings.flux

import typings.flux.libDispatcherMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flux", "Dispatcher")
  @js.native
  /**
    * Create an instance of the Dispatcher class to use throughout the application.
    *
    * Specify a type in the 'TPayload' generic argument to use strongly-typed payloads,
    * otherwise specify 'any'
    *
    * Examples:
    *     var dispatcher = new flux.Dispatcher<any>()
    *     var typedDispatcher = new flux.Dispatcher<MyCustomActionType>()
    */
  open class Dispatcher[TPayload] () extends ^[TPayload]
}

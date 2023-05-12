package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.Subscriber
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersSubscriberConnectionMod {
  
  @JSImport("ethers/types/providers/subscriber-connection", "BlockConnectionSubscriber")
  @js.native
  open class BlockConnectionSubscriber protected ()
    extends StObject
       with Subscriber {
    def this(provider: ConnectionRpcProvider) = this()
    
    /* private */ var `private`: Any = js.native
  }
  
  @js.native
  trait ConnectionRpcProvider
    extends StObject
       with Provider {
    
    def _subscribe(param: js.Array[Any], processFunc: js.Function1[/* result */ Any, Unit]): Double = js.native
    
    def _unsubscribe(filterId: Double): Unit = js.native
  }
}

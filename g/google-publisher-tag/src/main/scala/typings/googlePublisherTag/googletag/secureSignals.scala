package typings.googlePublisherTag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the namespace that GPT uses for managing secure signals.
  */
object secureSignals {
  
  /**
    * Returns a secure signal for a specific bidder.
    *
    * A bidder secure signal provider consists of 2 parts:
    *
    * 1. A collector function, which returns a `Promise` that resolves to a secure
    * signal.
    * 2. An `id` which identifies the bidder associated with the signal.
    *
    * To return a secure signal for a publisher, use {@link
    * secureSignals.PublisherSignalProvider} instead.
    *
    * @example
    *   // id is provided
    *   googletag.secureSignalProviders!.push({
    *     id: 'collector123',
    *     collectorFunction: () => {
    *       // ...custom signal generation logic...
    *       return Promise.resolve('signal');
    *     }
    *   });
    * @see [Share secure signals with bidders](https://support.google.com/admanager/answer/10488752)
    */
  trait BidderSignalProvider
    extends StObject
       with SecureSignalProvider {
    
    /**
      * A function which returns a `Promise` that resolves to a secure signal.
      * @return A
      * [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise)
      * that resolves to a secure signal.
      */
    def collectorFunction(): js.Promise[String]
    
    /**
      * A unique identifier for the collector associated with this secure signal,
      * as registered in Google Ad Manager.
      */
    var id: String
  }
  object BidderSignalProvider {
    
    inline def apply(collectorFunction: () => js.Promise[String], id: String): BidderSignalProvider = {
      val __obj = js.Dynamic.literal(collectorFunction = js.Any.fromFunction0(collectorFunction), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BidderSignalProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BidderSignalProvider] (val x: Self) extends AnyVal {
      
      inline def setCollectorFunction(value: () => js.Promise[String]): Self = StObject.set(x, "collectorFunction", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Returns a secure signal for a specific publisher.
    *
    * A publisher signal provider consists of 2 parts:
    *
    * 1. A collector function, which returns a `Promise` that resolves to a secure
    * signal.
    * 2. A `networkCode` which identifies the publisher associated with the signal.
    *
    * To return a secure signal for a bidder, use {@link
    * secureSignals.BidderSignalProvider} instead.
    *
    * @example
    *   // networkCode is provided
    *   googletag.secureSignalProviders!.push({
    *     networkCode: '123456',
    *     collectorFunction: () => {
    *       // ...custom signal generation logic...
    *       return Promise.resolve('signal');
    *     }
    *   });
    * @see [Share secure signals with bidders](https://support.google.com/admanager/answer/10488752)
    */
  trait PublisherSignalProvider
    extends StObject
       with SecureSignalProvider {
    
    /**
      * A function which returns a `Promise` that resolves to a secure signal.
      * @return A
      * [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise)
      * that resolves to a secure signal.
      */
    def collectorFunction(): js.Promise[String]
    
    /**
      * The network code (as seen in the ad unit path) for the publisher associated
      * with this secure signal.
      */
    var networkCode: String
  }
  object PublisherSignalProvider {
    
    inline def apply(collectorFunction: () => js.Promise[String], networkCode: String): PublisherSignalProvider = {
      val __obj = js.Dynamic.literal(collectorFunction = js.Any.fromFunction0(collectorFunction), networkCode = networkCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublisherSignalProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublisherSignalProvider] (val x: Self) extends AnyVal {
      
      inline def setCollectorFunction(value: () => js.Promise[String]): Self = StObject.set(x, "collectorFunction", js.Any.fromFunction0(value))
      
      inline def setNetworkCode(value: String): Self = StObject.set(x, "networkCode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for returning a secure signal for a specific bidder or provider.
    * One of `id` or `networkCode` must be provided, but not both.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.googlePublisherTag.googletag.secureSignals.BidderSignalProvider
    - typings.googlePublisherTag.googletag.secureSignals.PublisherSignalProvider
  */
  trait SecureSignalProvider extends StObject
  object SecureSignalProvider {
    
    inline def BidderSignalProvider(collectorFunction: () => js.Promise[String], id: String): typings.googlePublisherTag.googletag.secureSignals.BidderSignalProvider = {
      val __obj = js.Dynamic.literal(collectorFunction = js.Any.fromFunction0(collectorFunction), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.googlePublisherTag.googletag.secureSignals.BidderSignalProvider]
    }
    
    inline def PublisherSignalProvider(collectorFunction: () => js.Promise[String], networkCode: String): typings.googlePublisherTag.googletag.secureSignals.PublisherSignalProvider = {
      val __obj = js.Dynamic.literal(collectorFunction = js.Any.fromFunction0(collectorFunction), networkCode = networkCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.googlePublisherTag.googletag.secureSignals.PublisherSignalProvider]
    }
  }
  
  /**
    * An interface for managing secure signals.
    */
  trait SecureSignalProvidersArray extends StObject {
    
    /**
      * Clears all cached signals from local storage.
      */
    def clearAllCache(): Unit
    
    /**
      * Adds a new {@link secureSignals.SecureSignalProvider} to the signal
      * provider array and begins the signal generation process.
      * @param provider The {@link secureSignals.SecureSignalProvider} object to be
      * added to the array.
      */
    def push(provider: SecureSignalProvider): Unit
  }
  object SecureSignalProvidersArray {
    
    inline def apply(clearAllCache: () => Unit, push: SecureSignalProvider => Unit): SecureSignalProvidersArray = {
      val __obj = js.Dynamic.literal(clearAllCache = js.Any.fromFunction0(clearAllCache), push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[SecureSignalProvidersArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecureSignalProvidersArray] (val x: Self) extends AnyVal {
      
      inline def setClearAllCache(value: () => Unit): Self = StObject.set(x, "clearAllCache", js.Any.fromFunction0(value))
      
      inline def setPush(value: SecureSignalProvider => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}

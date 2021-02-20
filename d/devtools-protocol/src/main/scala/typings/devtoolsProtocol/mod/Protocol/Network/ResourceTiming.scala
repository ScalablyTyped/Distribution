package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTiming extends StObject {
  
  /**
    * Connected to the remote host.
    */
  var connectEnd: Double = js.native
  
  /**
    * Started connecting to the remote host.
    */
  var connectStart: Double = js.native
  
  /**
    * Finished DNS address resolve.
    */
  var dnsEnd: Double = js.native
  
  /**
    * Started DNS address resolve.
    */
  var dnsStart: Double = js.native
  
  /**
    * Finished resolving proxy.
    */
  var proxyEnd: Double = js.native
  
  /**
    * Started resolving proxy.
    */
  var proxyStart: Double = js.native
  
  /**
    * Time the server finished pushing request.
    */
  var pushEnd: Double = js.native
  
  /**
    * Time the server started pushing request.
    */
  var pushStart: Double = js.native
  
  /**
    * Finished receiving response headers.
    */
  var receiveHeadersEnd: Double = js.native
  
  /**
    * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in
    * milliseconds relatively to this requestTime.
    */
  var requestTime: Double = js.native
  
  /**
    * Finished sending request.
    */
  var sendEnd: Double = js.native
  
  /**
    * Started sending request.
    */
  var sendStart: Double = js.native
  
  /**
    * Finished SSL handshake.
    */
  var sslEnd: Double = js.native
  
  /**
    * Started SSL handshake.
    */
  var sslStart: Double = js.native
  
  /**
    * Started fetch event.
    */
  var workerFetchStart: Double = js.native
  
  /**
    * Finished Starting ServiceWorker.
    */
  var workerReady: Double = js.native
  
  /**
    * Settled fetch event respondWith promise.
    */
  var workerRespondWithSettled: Double = js.native
  
  /**
    * Started running ServiceWorker.
    */
  var workerStart: Double = js.native
}
object ResourceTiming {
  
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    dnsEnd: Double,
    dnsStart: Double,
    proxyEnd: Double,
    proxyStart: Double,
    pushEnd: Double,
    pushStart: Double,
    receiveHeadersEnd: Double,
    requestTime: Double,
    sendEnd: Double,
    sendStart: Double,
    sslEnd: Double,
    sslStart: Double,
    workerFetchStart: Double,
    workerReady: Double,
    workerRespondWithSettled: Double,
    workerStart: Double
  ): ResourceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], dnsEnd = dnsEnd.asInstanceOf[js.Any], dnsStart = dnsStart.asInstanceOf[js.Any], proxyEnd = proxyEnd.asInstanceOf[js.Any], proxyStart = proxyStart.asInstanceOf[js.Any], pushEnd = pushEnd.asInstanceOf[js.Any], pushStart = pushStart.asInstanceOf[js.Any], receiveHeadersEnd = receiveHeadersEnd.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], sendEnd = sendEnd.asInstanceOf[js.Any], sendStart = sendStart.asInstanceOf[js.Any], sslEnd = sslEnd.asInstanceOf[js.Any], sslStart = sslStart.asInstanceOf[js.Any], workerFetchStart = workerFetchStart.asInstanceOf[js.Any], workerReady = workerReady.asInstanceOf[js.Any], workerRespondWithSettled = workerRespondWithSettled.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTiming]
  }
  
  @scala.inline
  implicit class ResourceTimingMutableBuilder[Self <: ResourceTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsEnd(value: Double): Self = StObject.set(x, "dnsEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsStart(value: Double): Self = StObject.set(x, "dnsStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyEnd(value: Double): Self = StObject.set(x, "proxyEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyStart(value: Double): Self = StObject.set(x, "proxyStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushEnd(value: Double): Self = StObject.set(x, "pushEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushStart(value: Double): Self = StObject.set(x, "pushStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveHeadersEnd(value: Double): Self = StObject.set(x, "receiveHeadersEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendEnd(value: Double): Self = StObject.set(x, "sendEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendStart(value: Double): Self = StObject.set(x, "sendStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslEnd(value: Double): Self = StObject.set(x, "sslEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslStart(value: Double): Self = StObject.set(x, "sslStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerFetchStart(value: Double): Self = StObject.set(x, "workerFetchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerReady(value: Double): Self = StObject.set(x, "workerReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerRespondWithSettled(value: Double): Self = StObject.set(x, "workerRespondWithSettled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerStart(value: Double): Self = StObject.set(x, "workerStart", value.asInstanceOf[js.Any])
  }
}

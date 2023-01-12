package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableNetworkEmulationOptions extends StObject {
  
  /**
    * Download rate in Bps. Defaults to 0 which will disable download throttling.
    */
  var downloadThroughput: js.UndefOr[Double] = js.undefined
  
  /**
    * RTT in ms. Defaults to 0 which will disable latency throttling.
    */
  var latency: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to emulate network outage. Defaults to false.
    */
  var offline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Upload rate in Bps. Defaults to 0 which will disable upload throttling.
    */
  var uploadThroughput: js.UndefOr[Double] = js.undefined
}
object EnableNetworkEmulationOptions {
  
  inline def apply(): EnableNetworkEmulationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableNetworkEmulationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableNetworkEmulationOptions] (val x: Self) extends AnyVal {
    
    inline def setDownloadThroughput(value: Double): Self = StObject.set(x, "downloadThroughput", value.asInstanceOf[js.Any])
    
    inline def setDownloadThroughputUndefined: Self = StObject.set(x, "downloadThroughput", js.undefined)
    
    inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
    
    inline def setUploadThroughput(value: Double): Self = StObject.set(x, "uploadThroughput", value.asInstanceOf[js.Any])
    
    inline def setUploadThroughputUndefined: Self = StObject.set(x, "uploadThroughput", js.undefined)
  }
}

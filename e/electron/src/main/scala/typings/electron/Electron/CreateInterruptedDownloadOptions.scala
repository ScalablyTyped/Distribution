package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInterruptedDownloadOptions extends StObject {
  
  /**
    * ETag header value.
    */
  var eTag: js.UndefOr[String] = js.undefined
  
  /**
    * Last-Modified header value.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * Total length of the download.
    */
  var length: Double
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Start range for the download.
    */
  var offset: Double
  
  /**
    * Absolute path of the download.
    */
  var path: String
  
  /**
    * Time when download was started in number of seconds since UNIX epoch.
    */
  var startTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Complete URL chain for the download.
    */
  var urlChain: js.Array[String]
}
object CreateInterruptedDownloadOptions {
  
  inline def apply(length: Double, offset: Double, path: String, urlChain: js.Array[String]): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], urlChain = urlChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
  
  extension [Self <: CreateInterruptedDownloadOptions](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUrlChain(value: js.Array[String]): Self = StObject.set(x, "urlChain", value.asInstanceOf[js.Any])
    
    inline def setUrlChainVarargs(value: String*): Self = StObject.set(x, "urlChain", js.Array(value*))
  }
}

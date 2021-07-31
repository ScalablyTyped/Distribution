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
  
  @scala.inline
  def apply(length: Double, offset: Double, path: String, urlChain: js.Array[String]): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], urlChain = urlChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
  
  @scala.inline
  implicit class CreateInterruptedDownloadOptionsMutableBuilder[Self <: CreateInterruptedDownloadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUrlChain(value: js.Array[String]): Self = StObject.set(x, "urlChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlChainVarargs(value: String*): Self = StObject.set(x, "urlChain", js.Array(value :_*))
  }
}

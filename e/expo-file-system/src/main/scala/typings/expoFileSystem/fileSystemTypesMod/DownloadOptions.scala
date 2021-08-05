package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var md5: js.UndefOr[Boolean] = js.undefined
  
  var sessionType: js.UndefOr[FileSystemSessionType] = js.undefined
}
object DownloadOptions {
  
  inline def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  
  extension [Self <: DownloadOptions](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    inline def setSessionType(value: FileSystemSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
    
    inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
  }
}

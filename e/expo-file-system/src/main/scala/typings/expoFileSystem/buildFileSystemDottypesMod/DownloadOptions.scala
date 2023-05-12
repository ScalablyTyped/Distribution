package typings.expoFileSystem.buildFileSystemDottypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object containing all the HTTP header fields and their values for the download network request. The keys and values of the object are the header names and values respectively.
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * If `true`, include the MD5 hash of the file in the returned object. Provided for convenience since it is common to check the integrity of a file immediately after downloading.
    * @default false
    */
  var md5: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A session type. Determines if tasks can be handled in the background. On Android, sessions always work in the background and you can't change it.
    * @default FileSystemSessionType.BACKGROUND
    * @platform ios
    */
  var sessionType: js.UndefOr[FileSystemSessionType] = js.undefined
}
object DownloadOptions {
  
  inline def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    
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

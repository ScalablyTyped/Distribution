package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[Record[String, String]] = js.native
  
  var md5: js.UndefOr[Boolean] = js.native
  
  var sessionType: js.UndefOr[FileSystemSessionType] = js.native
}
object DownloadOptions {
  
  @scala.inline
  def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  
  @scala.inline
  implicit class DownloadOptionsMutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    @scala.inline
    def setSessionType(value: FileSystemSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
  }
}

package typings.forgeApis.mod

import typings.forgeApis.anon.Status
import typings.forgeApis.anon.StatusCode
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadedResource extends StObject {
  
  var data: Buffer
  
  var download: Status
  
  var downloadParams: StatusCode
  
  var downloadUrl: String
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var objectKey: String
  
  var progress: Double
  
  var responseType: DownloadResponseType
}
object DownloadedResource {
  
  inline def apply(
    data: Buffer,
    download: Status,
    downloadParams: StatusCode,
    downloadUrl: String,
    objectKey: String,
    progress: Double,
    responseType: DownloadResponseType
  ): DownloadedResource = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], downloadParams = downloadParams.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadedResource] (val x: Self) extends AnyVal {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: Status): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadParams(value: StatusCode): Self = StObject.set(x, "downloadParams", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: DownloadResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
  }
}

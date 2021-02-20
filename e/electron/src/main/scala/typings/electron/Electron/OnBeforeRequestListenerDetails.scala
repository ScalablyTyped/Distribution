package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBeforeRequestListenerDetails extends StObject {
  
  var id: Double = js.native
  
  var method: String = js.native
  
  var referrer: String = js.native
  
  var resourceType: String = js.native
  
  var timestamp: Double = js.native
  
  var uploadData: js.Array[UploadData] = js.native
  
  var url: String = js.native
  
  var webContentsId: js.UndefOr[Double] = js.native
}
object OnBeforeRequestListenerDetails {
  
  @scala.inline
  def apply(
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    timestamp: Double,
    uploadData: js.Array[UploadData],
    url: String
  ): OnBeforeRequestListenerDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uploadData = uploadData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRequestListenerDetails]
  }
  
  @scala.inline
  implicit class OnBeforeRequestListenerDetailsMutableBuilder[Self <: OnBeforeRequestListenerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadData(value: js.Array[UploadData]): Self = StObject.set(x, "uploadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDataVarargs(value: UploadData*): Self = StObject.set(x, "uploadData", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContentsId(value: Double): Self = StObject.set(x, "webContentsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContentsIdUndefined: Self = StObject.set(x, "webContentsId", js.undefined)
  }
}

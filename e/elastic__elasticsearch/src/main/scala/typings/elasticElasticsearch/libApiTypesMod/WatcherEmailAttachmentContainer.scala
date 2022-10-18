package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherEmailAttachmentContainer extends StObject {
  
  var data: js.UndefOr[WatcherDataEmailAttachment] = js.undefined
  
  var http: js.UndefOr[WatcherHttpEmailAttachment] = js.undefined
  
  var reporting: js.UndefOr[WatcherReportingEmailAttachment] = js.undefined
}
object WatcherEmailAttachmentContainer {
  
  inline def apply(): WatcherEmailAttachmentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherEmailAttachmentContainer]
  }
  
  extension [Self <: WatcherEmailAttachmentContainer](x: Self) {
    
    inline def setData(value: WatcherDataEmailAttachment): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHttp(value: WatcherHttpEmailAttachment): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setReporting(value: WatcherReportingEmailAttachment): Self = StObject.set(x, "reporting", value.asInstanceOf[js.Any])
    
    inline def setReportingUndefined: Self = StObject.set(x, "reporting", js.undefined)
  }
}

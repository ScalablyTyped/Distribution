package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInterconnectattachmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the interconnect attachment to return.
    */
  var interconnectAttachment: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceInterconnectattachmentsGet {
  
  inline def apply(): ParamsResourceInterconnectattachmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInterconnectattachmentsGet]
  }
  
  extension [Self <: ParamsResourceInterconnectattachmentsGet](x: Self) {
    
    inline def setInterconnectAttachment(value: String): Self = StObject.set(x, "interconnectAttachment", value.asInstanceOf[js.Any])
    
    inline def setInterconnectAttachmentUndefined: Self = StObject.set(x, "interconnectAttachment", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}

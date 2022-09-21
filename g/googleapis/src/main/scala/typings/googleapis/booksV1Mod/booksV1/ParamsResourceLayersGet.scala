package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLayersGet
  extends StObject
     with StandardParameters {
  
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for the layer to get the summary for.
    */
  var summaryId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to retrieve layers for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLayersGet {
  
  inline def apply(): ParamsResourceLayersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersGet]
  }
  
  extension [Self <: ParamsResourceLayersGet](x: Self) {
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSummaryId(value: String): Self = StObject.set(x, "summaryId", value.asInstanceOf[js.Any])
    
    inline def setSummaryIdUndefined: Self = StObject.set(x, "summaryId", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}

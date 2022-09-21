package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryAnnotationsSummary
  extends StObject
     with StandardParameters {
  
  /**
    * Array of layer IDs to get the summary for.
    */
  var layerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Volume id to get the summary for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMylibraryAnnotationsSummary {
  
  inline def apply(): ParamsResourceMylibraryAnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsSummary]
  }
  
  extension [Self <: ParamsResourceMylibraryAnnotationsSummary](x: Self) {
    
    inline def setLayerIds(value: js.Array[String]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "layerIds", js.Array(value*))
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}

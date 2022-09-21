package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchGetAssetsHistoryResponse extends StObject {
  
  /**
    * A list of assets with valid time windows.
    */
  var assets: js.UndefOr[js.Array[SchemaTemporalAsset]] = js.undefined
}
object SchemaBatchGetAssetsHistoryResponse {
  
  inline def apply(): SchemaBatchGetAssetsHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetAssetsHistoryResponse]
  }
  
  extension [Self <: SchemaBatchGetAssetsHistoryResponse](x: Self) {
    
    inline def setAssets(value: js.Array[SchemaTemporalAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: SchemaTemporalAsset*): Self = StObject.set(x, "assets", js.Array(value*))
  }
}

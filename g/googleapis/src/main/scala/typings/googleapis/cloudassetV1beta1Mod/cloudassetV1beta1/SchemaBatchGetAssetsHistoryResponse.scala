package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Batch get assets history response.
  */
@js.native
trait SchemaBatchGetAssetsHistoryResponse extends StObject {
  
  /**
    * A list of assets with valid time windows.
    */
  var assets: js.UndefOr[js.Array[SchemaTemporalAsset]] = js.native
}
object SchemaBatchGetAssetsHistoryResponse {
  
  @scala.inline
  def apply(): SchemaBatchGetAssetsHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetAssetsHistoryResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchGetAssetsHistoryResponseMutableBuilder[Self <: SchemaBatchGetAssetsHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: js.Array[SchemaTemporalAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: SchemaTemporalAsset*): Self = StObject.set(x, "assets", js.Array(value :_*))
  }
}

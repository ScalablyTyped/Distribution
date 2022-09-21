package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTemporalAsset extends StObject {
  
  /**
    * An asset in Google Cloud.
    */
  var asset: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * Whether the asset has been deleted or not.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Prior copy of the asset. Populated if prior_asset_state is PRESENT. Currently this is only set for responses in Real-Time Feed.
    */
  var priorAsset: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * State of prior_asset.
    */
  var priorAssetState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time window when the asset data and state was observed.
    */
  var window: js.UndefOr[SchemaTimeWindow] = js.undefined
}
object SchemaTemporalAsset {
  
  inline def apply(): SchemaTemporalAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemporalAsset]
  }
  
  extension [Self <: SchemaTemporalAsset](x: Self) {
    
    inline def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setPriorAsset(value: SchemaAsset): Self = StObject.set(x, "priorAsset", value.asInstanceOf[js.Any])
    
    inline def setPriorAssetState(value: String): Self = StObject.set(x, "priorAssetState", value.asInstanceOf[js.Any])
    
    inline def setPriorAssetStateNull: Self = StObject.set(x, "priorAssetState", null)
    
    inline def setPriorAssetStateUndefined: Self = StObject.set(x, "priorAssetState", js.undefined)
    
    inline def setPriorAssetUndefined: Self = StObject.set(x, "priorAsset", js.undefined)
    
    inline def setWindow(value: SchemaTimeWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}

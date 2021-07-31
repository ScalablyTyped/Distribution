package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Temporal asset. In addition to the asset, the temporal asset includes the
  * status of the asset and valid from and to time of it.
  */
trait SchemaTemporalAsset extends StObject {
  
  /**
    * Asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * If the asset is deleted or not.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time window when the asset data and state was observed.
    */
  var window: js.UndefOr[SchemaTimeWindow] = js.undefined
}
object SchemaTemporalAsset {
  
  @scala.inline
  def apply(): SchemaTemporalAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemporalAsset]
  }
  
  @scala.inline
  implicit class SchemaTemporalAssetMutableBuilder[Self <: SchemaTemporalAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setWindow(value: SchemaTimeWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}

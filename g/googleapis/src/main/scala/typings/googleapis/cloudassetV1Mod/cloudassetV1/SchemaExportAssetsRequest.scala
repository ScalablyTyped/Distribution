package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Export asset request.
  */
trait SchemaExportAssetsRequest extends StObject {
  
  /**
    * A list of asset types of which to take a snapshot for. For example:
    * &quot;compute.googleapis.com/Disk&quot;. If specified, only matching
    * assets will be returned. See [Introduction to Cloud Asset
    * Inventory](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/overview)
    * for all supported asset types.
    */
  var assetTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Asset content type. If not specified, no content but the asset name will
    * be returned.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Output configuration indicating where the results will be
    * output to. All results will be in newline delimited JSON format.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.undefined
  
  /**
    * Timestamp to take an asset snapshot. This can only be set to a timestamp
    * between 2018-10-02 UTC (inclusive) and the current time. If not
    * specified, the current time will be used. Due to delays in resource data
    * collection and indexing, there is a volatile window during which running
    * the same query may get different results.
    */
  var readTime: js.UndefOr[String] = js.undefined
}
object SchemaExportAssetsRequest {
  
  inline def apply(): SchemaExportAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportAssetsRequest]
  }
  
  extension [Self <: SchemaExportAssetsRequest](x: Self) {
    
    inline def setAssetTypes(value: js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    inline def setAssetTypesUndefined: Self = StObject.set(x, "assetTypes", js.undefined)
    
    inline def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value :_*))
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setOutputConfig(value: SchemaOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}

package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Batchgetassetshistory
  extends StObject
     with StandardParameters {
  
  /**
    * A list of the full names of the assets. See: https://cloud.google.com/asset-inventory/docs/resource-name-format Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. The request becomes a no-op if the asset name list is empty, and the max size of the asset name list is 100 in one request.
    */
  var assetNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The content type.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The relative name of the root asset. It can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * End time of the time window (inclusive). If not specified, the current timestamp is used instead.
    */
  @JSName("readTimeWindow.endTime")
  var readTimeWindowDotendTime: js.UndefOr[String] = js.undefined
  
  /**
    * Start time of the time window (exclusive).
    */
  @JSName("readTimeWindow.startTime")
  var readTimeWindowDotstartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A list of relationship types to output, for example: `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if content_type=RELATIONSHIP. * If specified: it outputs specified relationships' history on the [asset_names]. It returns an error if any of the [relationship_types] doesn't belong to the supported relationship types of the [asset_names] or if any of the [asset_names]'s types doesn't belong to the source types of the [relationship_types]. * Otherwise: it outputs the supported relationships' history on the [asset_names] or returns an error if any of the [asset_names]'s types has no relationship support. See [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types and relationship types.
    */
  var relationshipTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceV1Batchgetassetshistory {
  
  inline def apply(): ParamsResourceV1Batchgetassetshistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Batchgetassetshistory]
  }
  
  extension [Self <: ParamsResourceV1Batchgetassetshistory](x: Self) {
    
    inline def setAssetNames(value: js.Array[String]): Self = StObject.set(x, "assetNames", value.asInstanceOf[js.Any])
    
    inline def setAssetNamesUndefined: Self = StObject.set(x, "assetNames", js.undefined)
    
    inline def setAssetNamesVarargs(value: String*): Self = StObject.set(x, "assetNames", js.Array(value*))
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadTimeWindowDotendTime(value: String): Self = StObject.set(x, "readTimeWindow.endTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeWindowDotendTimeUndefined: Self = StObject.set(x, "readTimeWindow.endTime", js.undefined)
    
    inline def setReadTimeWindowDotstartTime(value: String): Self = StObject.set(x, "readTimeWindow.startTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeWindowDotstartTimeUndefined: Self = StObject.set(x, "readTimeWindow.startTime", js.undefined)
    
    inline def setRelationshipTypes(value: js.Array[String]): Self = StObject.set(x, "relationshipTypes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypesUndefined: Self = StObject.set(x, "relationshipTypes", js.undefined)
    
    inline def setRelationshipTypesVarargs(value: String*): Self = StObject.set(x, "relationshipTypes", js.Array(value*))
  }
}

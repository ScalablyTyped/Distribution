package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTarget extends StObject {
  
  /**
    * Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Information specifying an Anthos Cluster.
    */
  var anthosCluster: js.UndefOr[SchemaAnthosCluster] = js.undefined
  
  /**
    * Output only. Time at which the `Target` was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the `Target`. Max length is 255 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
    */
  var executionConfigs: js.UndefOr[js.Array[SchemaExecutionConfig]] = js.undefined
  
  /**
    * Information specifying a GKE Cluster.
    */
  var gke: js.UndefOr[SchemaGkeCluster] = js.undefined
  
  /**
    * Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Name of the `Target`. Format is projects/{project\}/locations/{location\}/targets/a-z{0,62\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether or not the `Target` requires approval.
    */
  var requireApproval: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Resource id of the `Target`.
    */
  var targetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique identifier of the `Target`.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Most recent time at which the `Target` was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTarget {
  
  inline def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  
  extension [Self <: SchemaTarget](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnthosCluster(value: SchemaAnthosCluster): Self = StObject.set(x, "anthosCluster", value.asInstanceOf[js.Any])
    
    inline def setAnthosClusterUndefined: Self = StObject.set(x, "anthosCluster", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExecutionConfigs(value: js.Array[SchemaExecutionConfig]): Self = StObject.set(x, "executionConfigs", value.asInstanceOf[js.Any])
    
    inline def setExecutionConfigsUndefined: Self = StObject.set(x, "executionConfigs", js.undefined)
    
    inline def setExecutionConfigsVarargs(value: SchemaExecutionConfig*): Self = StObject.set(x, "executionConfigs", js.Array(value*))
    
    inline def setGke(value: SchemaGkeCluster): Self = StObject.set(x, "gke", value.asInstanceOf[js.Any])
    
    inline def setGkeUndefined: Self = StObject.set(x, "gke", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequireApproval(value: Boolean): Self = StObject.set(x, "requireApproval", value.asInstanceOf[js.Any])
    
    inline def setRequireApprovalNull: Self = StObject.set(x, "requireApproval", null)
    
    inline def setRequireApprovalUndefined: Self = StObject.set(x, "requireApproval", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

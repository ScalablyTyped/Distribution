package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelease extends StObject {
  
  /**
    * Output only. Indicates whether this is an abandoned release.
    */
  var abandoned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * List of artifacts to pass through to Skaffold command.
    */
  var buildArtifacts: js.UndefOr[js.Array[SchemaBuildArtifact]] = js.undefined
  
  /**
    * Output only. Time at which the `Release` was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Snapshot of the parent pipeline taken at release creation time.
    */
  var deliveryPipelineSnapshot: js.UndefOr[SchemaDeliveryPipeline] = js.undefined
  
  /**
    * Description of the `Release`. Max length is 255 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Name of the `Release`. Format is projects/{project\}/ locations/{location\}/deliveryPipelines/{deliveryPipeline\}/ releases/a-z{0,62\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the render completed.
    */
  var renderEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the render began.
    */
  var renderStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the render operation.
    */
  var renderState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filepath of the Skaffold config inside of the config URI.
    */
  var skaffoldConfigPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Storage URI of tar.gz archive containing Skaffold configuration.
    */
  var skaffoldConfigUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Skaffold version to use when operating on this release, such as "1.20.0". Not all versions are valid; Google Cloud Deploy supports a specific set of versions. If unset, the most recent supported Skaffold version will be used.
    */
  var skaffoldVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Map from target ID to the target artifacts created during the render operation.
    */
  var targetArtifacts: js.UndefOr[StringDictionary[SchemaTargetArtifact] | Null] = js.undefined
  
  /**
    * Output only. Map from target ID to details of the render operation for that target.
    */
  var targetRenders: js.UndefOr[StringDictionary[SchemaTargetRender] | Null] = js.undefined
  
  /**
    * Output only. Snapshot of the targets taken at release creation time.
    */
  var targetSnapshots: js.UndefOr[js.Array[SchemaTarget]] = js.undefined
  
  /**
    * Output only. Unique identifier of the `Release`.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelease {
  
  inline def apply(): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelease]
  }
  
  extension [Self <: SchemaRelease](x: Self) {
    
    inline def setAbandoned(value: Boolean): Self = StObject.set(x, "abandoned", value.asInstanceOf[js.Any])
    
    inline def setAbandonedNull: Self = StObject.set(x, "abandoned", null)
    
    inline def setAbandonedUndefined: Self = StObject.set(x, "abandoned", js.undefined)
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setBuildArtifacts(value: js.Array[SchemaBuildArtifact]): Self = StObject.set(x, "buildArtifacts", value.asInstanceOf[js.Any])
    
    inline def setBuildArtifactsUndefined: Self = StObject.set(x, "buildArtifacts", js.undefined)
    
    inline def setBuildArtifactsVarargs(value: SchemaBuildArtifact*): Self = StObject.set(x, "buildArtifacts", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeliveryPipelineSnapshot(value: SchemaDeliveryPipeline): Self = StObject.set(x, "deliveryPipelineSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPipelineSnapshotUndefined: Self = StObject.set(x, "deliveryPipelineSnapshot", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRenderEndTime(value: String): Self = StObject.set(x, "renderEndTime", value.asInstanceOf[js.Any])
    
    inline def setRenderEndTimeNull: Self = StObject.set(x, "renderEndTime", null)
    
    inline def setRenderEndTimeUndefined: Self = StObject.set(x, "renderEndTime", js.undefined)
    
    inline def setRenderStartTime(value: String): Self = StObject.set(x, "renderStartTime", value.asInstanceOf[js.Any])
    
    inline def setRenderStartTimeNull: Self = StObject.set(x, "renderStartTime", null)
    
    inline def setRenderStartTimeUndefined: Self = StObject.set(x, "renderStartTime", js.undefined)
    
    inline def setRenderState(value: String): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
    
    inline def setRenderStateNull: Self = StObject.set(x, "renderState", null)
    
    inline def setRenderStateUndefined: Self = StObject.set(x, "renderState", js.undefined)
    
    inline def setSkaffoldConfigPath(value: String): Self = StObject.set(x, "skaffoldConfigPath", value.asInstanceOf[js.Any])
    
    inline def setSkaffoldConfigPathNull: Self = StObject.set(x, "skaffoldConfigPath", null)
    
    inline def setSkaffoldConfigPathUndefined: Self = StObject.set(x, "skaffoldConfigPath", js.undefined)
    
    inline def setSkaffoldConfigUri(value: String): Self = StObject.set(x, "skaffoldConfigUri", value.asInstanceOf[js.Any])
    
    inline def setSkaffoldConfigUriNull: Self = StObject.set(x, "skaffoldConfigUri", null)
    
    inline def setSkaffoldConfigUriUndefined: Self = StObject.set(x, "skaffoldConfigUri", js.undefined)
    
    inline def setSkaffoldVersion(value: String): Self = StObject.set(x, "skaffoldVersion", value.asInstanceOf[js.Any])
    
    inline def setSkaffoldVersionNull: Self = StObject.set(x, "skaffoldVersion", null)
    
    inline def setSkaffoldVersionUndefined: Self = StObject.set(x, "skaffoldVersion", js.undefined)
    
    inline def setTargetArtifacts(value: StringDictionary[SchemaTargetArtifact]): Self = StObject.set(x, "targetArtifacts", value.asInstanceOf[js.Any])
    
    inline def setTargetArtifactsNull: Self = StObject.set(x, "targetArtifacts", null)
    
    inline def setTargetArtifactsUndefined: Self = StObject.set(x, "targetArtifacts", js.undefined)
    
    inline def setTargetRenders(value: StringDictionary[SchemaTargetRender]): Self = StObject.set(x, "targetRenders", value.asInstanceOf[js.Any])
    
    inline def setTargetRendersNull: Self = StObject.set(x, "targetRenders", null)
    
    inline def setTargetRendersUndefined: Self = StObject.set(x, "targetRenders", js.undefined)
    
    inline def setTargetSnapshots(value: js.Array[SchemaTarget]): Self = StObject.set(x, "targetSnapshots", value.asInstanceOf[js.Any])
    
    inline def setTargetSnapshotsUndefined: Self = StObject.set(x, "targetSnapshots", js.undefined)
    
    inline def setTargetSnapshotsVarargs(value: SchemaTarget*): Self = StObject.set(x, "targetSnapshots", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}

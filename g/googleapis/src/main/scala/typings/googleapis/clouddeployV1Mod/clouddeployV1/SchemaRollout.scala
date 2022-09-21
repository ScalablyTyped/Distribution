package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRollout extends StObject {
  
  /**
    * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Approval state of the `Rollout`.
    */
  var approvalState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the `Rollout` was approved.
    */
  var approveTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the `Rollout` was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the `Rollout` finished deploying.
    */
  var deployEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The reason this rollout failed. This will always be unspecified while the rollout is in progress.
    */
  var deployFailureCause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the `Rollout` started deploying.
    */
  var deployStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the Cloud Build `Build` object that is used to deploy the Rollout. Format is `projects/{project\}/locations/{location\}/builds/{build\}`.
    */
  var deployingBuild: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the `Rollout` for user purposes. Max length is 255 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the `Rollout` was enqueued.
    */
  var enqueueTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional information about the rollout failure, if available.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Name of the `Rollout`. Format is projects/{project\}/ locations/{location\}/deliveryPipelines/{deliveryPipeline\}/ releases/{release\}/rollouts/a-z{0,62\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the `Rollout`.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The ID of Target to which this `Rollout` is deploying.
    */
  var targetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique identifier of the `Rollout`.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
}
object SchemaRollout {
  
  inline def apply(): SchemaRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollout]
  }
  
  extension [Self <: SchemaRollout](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setApprovalState(value: String): Self = StObject.set(x, "approvalState", value.asInstanceOf[js.Any])
    
    inline def setApprovalStateNull: Self = StObject.set(x, "approvalState", null)
    
    inline def setApprovalStateUndefined: Self = StObject.set(x, "approvalState", js.undefined)
    
    inline def setApproveTime(value: String): Self = StObject.set(x, "approveTime", value.asInstanceOf[js.Any])
    
    inline def setApproveTimeNull: Self = StObject.set(x, "approveTime", null)
    
    inline def setApproveTimeUndefined: Self = StObject.set(x, "approveTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeployEndTime(value: String): Self = StObject.set(x, "deployEndTime", value.asInstanceOf[js.Any])
    
    inline def setDeployEndTimeNull: Self = StObject.set(x, "deployEndTime", null)
    
    inline def setDeployEndTimeUndefined: Self = StObject.set(x, "deployEndTime", js.undefined)
    
    inline def setDeployFailureCause(value: String): Self = StObject.set(x, "deployFailureCause", value.asInstanceOf[js.Any])
    
    inline def setDeployFailureCauseNull: Self = StObject.set(x, "deployFailureCause", null)
    
    inline def setDeployFailureCauseUndefined: Self = StObject.set(x, "deployFailureCause", js.undefined)
    
    inline def setDeployStartTime(value: String): Self = StObject.set(x, "deployStartTime", value.asInstanceOf[js.Any])
    
    inline def setDeployStartTimeNull: Self = StObject.set(x, "deployStartTime", null)
    
    inline def setDeployStartTimeUndefined: Self = StObject.set(x, "deployStartTime", js.undefined)
    
    inline def setDeployingBuild(value: String): Self = StObject.set(x, "deployingBuild", value.asInstanceOf[js.Any])
    
    inline def setDeployingBuildNull: Self = StObject.set(x, "deployingBuild", null)
    
    inline def setDeployingBuildUndefined: Self = StObject.set(x, "deployingBuild", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnqueueTime(value: String): Self = StObject.set(x, "enqueueTime", value.asInstanceOf[js.Any])
    
    inline def setEnqueueTimeNull: Self = StObject.set(x, "enqueueTime", null)
    
    inline def setEnqueueTimeUndefined: Self = StObject.set(x, "enqueueTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}

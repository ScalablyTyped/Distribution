package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApiDeployment extends StObject {
  
  /**
    * Text briefly describing how to access the endpoint. Changes to this value will not affect the revision.
    */
  var accessGuidance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The full resource name (including revision id) of the spec of the API being served by the deployment. Changes to this value will update the revision. Format: apis/{api\}/deployments/{deployment\}
    */
  var apiSpecRevision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Creation timestamp; when the deployment resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A detailed description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-meaningful name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The address where the deployment is serving. Changes to this value will update the revision.
    */
  var endpointUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The address of the external channel of the API (e.g. the Developer Portal). Changes to this value will not affect the revision.
    */
  var externalChannelUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text briefly identifying the intended audience of the API. Changes to this value will not affect the revision.
    */
  var intendedAudience: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with "apigeeregistry.googleapis.com/" and cannot be changed.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Revision creation timestamp; when the represented revision was created.
    */
  var revisionCreateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The revision ID of the deployment. A new revision is committed whenever the deployment contents are changed. The format is an 8-character hexadecimal string.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Last update timestamp: when the represented revision was last modified.
    */
  var revisionUpdateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaApiDeployment {
  
  inline def apply(): SchemaApiDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiDeployment]
  }
  
  extension [Self <: SchemaApiDeployment](x: Self) {
    
    inline def setAccessGuidance(value: String): Self = StObject.set(x, "accessGuidance", value.asInstanceOf[js.Any])
    
    inline def setAccessGuidanceNull: Self = StObject.set(x, "accessGuidance", null)
    
    inline def setAccessGuidanceUndefined: Self = StObject.set(x, "accessGuidance", js.undefined)
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setApiSpecRevision(value: String): Self = StObject.set(x, "apiSpecRevision", value.asInstanceOf[js.Any])
    
    inline def setApiSpecRevisionNull: Self = StObject.set(x, "apiSpecRevision", null)
    
    inline def setApiSpecRevisionUndefined: Self = StObject.set(x, "apiSpecRevision", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndpointUri(value: String): Self = StObject.set(x, "endpointUri", value.asInstanceOf[js.Any])
    
    inline def setEndpointUriNull: Self = StObject.set(x, "endpointUri", null)
    
    inline def setEndpointUriUndefined: Self = StObject.set(x, "endpointUri", js.undefined)
    
    inline def setExternalChannelUri(value: String): Self = StObject.set(x, "externalChannelUri", value.asInstanceOf[js.Any])
    
    inline def setExternalChannelUriNull: Self = StObject.set(x, "externalChannelUri", null)
    
    inline def setExternalChannelUriUndefined: Self = StObject.set(x, "externalChannelUri", js.undefined)
    
    inline def setIntendedAudience(value: String): Self = StObject.set(x, "intendedAudience", value.asInstanceOf[js.Any])
    
    inline def setIntendedAudienceNull: Self = StObject.set(x, "intendedAudience", null)
    
    inline def setIntendedAudienceUndefined: Self = StObject.set(x, "intendedAudience", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimeNull: Self = StObject.set(x, "revisionCreateTime", null)
    
    inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setRevisionUpdateTime(value: String): Self = StObject.set(x, "revisionUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionUpdateTimeNull: Self = StObject.set(x, "revisionUpdateTime", null)
    
    inline def setRevisionUpdateTimeUndefined: Self = StObject.set(x, "revisionUpdateTime", js.undefined)
  }
}

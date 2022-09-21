package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamPolicyAnalysisQuery extends StObject {
  
  /**
    * Optional. Specifies roles or permissions for analysis. This is optional.
    */
  var accessSelector: js.UndefOr[SchemaAccessSelector] = js.undefined
  
  /**
    * Optional. The hypothetical context for IAM conditions evaluation.
    */
  var conditionContext: js.UndefOr[SchemaConditionContext] = js.undefined
  
  /**
    * Optional. Specifies an identity for analysis.
    */
  var identitySelector: js.UndefOr[SchemaIdentitySelector] = js.undefined
  
  /**
    * Optional. The query options.
    */
  var options: js.UndefOr[SchemaOptions] = js.undefined
  
  /**
    * Optional. Specifies a resource for analysis.
    */
  var resourceSelector: js.UndefOr[SchemaResourceSelector] = js.undefined
  
  /**
    * Required. The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    */
  var scope: js.UndefOr[String | Null] = js.undefined
}
object SchemaIamPolicyAnalysisQuery {
  
  inline def apply(): SchemaIamPolicyAnalysisQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicyAnalysisQuery]
  }
  
  extension [Self <: SchemaIamPolicyAnalysisQuery](x: Self) {
    
    inline def setAccessSelector(value: SchemaAccessSelector): Self = StObject.set(x, "accessSelector", value.asInstanceOf[js.Any])
    
    inline def setAccessSelectorUndefined: Self = StObject.set(x, "accessSelector", js.undefined)
    
    inline def setConditionContext(value: SchemaConditionContext): Self = StObject.set(x, "conditionContext", value.asInstanceOf[js.Any])
    
    inline def setConditionContextUndefined: Self = StObject.set(x, "conditionContext", js.undefined)
    
    inline def setIdentitySelector(value: SchemaIdentitySelector): Self = StObject.set(x, "identitySelector", value.asInstanceOf[js.Any])
    
    inline def setIdentitySelectorUndefined: Self = StObject.set(x, "identitySelector", js.undefined)
    
    inline def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceSelector(value: SchemaResourceSelector): Self = StObject.set(x, "resourceSelector", value.asInstanceOf[js.Any])
    
    inline def setResourceSelectorUndefined: Self = StObject.set(x, "resourceSelector", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}

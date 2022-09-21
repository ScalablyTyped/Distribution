package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Analyzemove
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the GCP Folder or Organization to reparent the target resource. The analysis will be performed against hypothetically moving the resource to this specified desitination parent. This can only be a Folder number (such as "folders/123") or an Organization number (such as "organizations/123").
    */
  var destinationParent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the resource to perform the analysis against. Only GCP Project are supported as of today. Hence, this can only be Project ID (such as "projects/my-project-id") or a Project Number (such as "projects/12345").
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * Analysis view indicating what information should be included in the analysis response. If unspecified, the default view is FULL.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceV1Analyzemove {
  
  inline def apply(): ParamsResourceV1Analyzemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Analyzemove]
  }
  
  extension [Self <: ParamsResourceV1Analyzemove](x: Self) {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

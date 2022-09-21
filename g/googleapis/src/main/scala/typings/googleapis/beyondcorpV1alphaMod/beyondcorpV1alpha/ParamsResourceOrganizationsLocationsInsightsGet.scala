package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsInsightsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the insight using the form: `organizations/{organization_id\}/locations/{location_id\}/insights/{insight_id\}` `projects/{project_id\}/locations/{location_id\}/insights/{insight_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Metadata only or full data view.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsLocationsInsightsGet {
  
  inline def apply(): ParamsResourceOrganizationsLocationsInsightsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsInsightsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsInsightsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

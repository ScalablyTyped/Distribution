package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServiceattachmentsGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Requested IAM Policy version.
    */
  var optionsRequestedPolicyVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Name or id of the resource for this request.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceServiceattachmentsGetiampolicy {
  
  inline def apply(): ParamsResourceServiceattachmentsGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServiceattachmentsGetiampolicy]
  }
  
  extension [Self <: ParamsResourceServiceattachmentsGetiampolicy](x: Self) {
    
    inline def setOptionsRequestedPolicyVersion(value: Double): Self = StObject.set(x, "optionsRequestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionsRequestedPolicyVersionUndefined: Self = StObject.set(x, "optionsRequestedPolicyVersion", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}

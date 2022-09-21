package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBackendbucketsGetiampolicy
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
    * Name or id of the resource for this request.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceBackendbucketsGetiampolicy {
  
  inline def apply(): ParamsResourceBackendbucketsGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBackendbucketsGetiampolicy]
  }
  
  extension [Self <: ParamsResourceBackendbucketsGetiampolicy](x: Self) {
    
    inline def setOptionsRequestedPolicyVersion(value: Double): Self = StObject.set(x, "optionsRequestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionsRequestedPolicyVersionUndefined: Self = StObject.set(x, "optionsRequestedPolicyVersion", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}

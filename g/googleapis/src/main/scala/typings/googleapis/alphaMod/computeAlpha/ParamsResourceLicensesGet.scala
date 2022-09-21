package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLicensesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the License resource to return.
    */
  var license: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceLicensesGet {
  
  inline def apply(): ParamsResourceLicensesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLicensesGet]
  }
  
  extension [Self <: ParamsResourceLicensesGet](x: Self) {
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}

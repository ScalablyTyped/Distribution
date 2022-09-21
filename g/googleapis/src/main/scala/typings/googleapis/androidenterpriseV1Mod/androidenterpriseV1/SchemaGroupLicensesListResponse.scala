package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupLicensesListResponse extends StObject {
  
  /**
    * A group license for a product approved for use in the enterprise.
    */
  var groupLicense: js.UndefOr[js.Array[SchemaGroupLicense]] = js.undefined
}
object SchemaGroupLicensesListResponse {
  
  inline def apply(): SchemaGroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicensesListResponse]
  }
  
  extension [Self <: SchemaGroupLicensesListResponse](x: Self) {
    
    inline def setGroupLicense(value: js.Array[SchemaGroupLicense]): Self = StObject.set(x, "groupLicense", value.asInstanceOf[js.Any])
    
    inline def setGroupLicenseUndefined: Self = StObject.set(x, "groupLicense", js.undefined)
    
    inline def setGroupLicenseVarargs(value: SchemaGroupLicense*): Self = StObject.set(x, "groupLicense", js.Array(value*))
  }
}

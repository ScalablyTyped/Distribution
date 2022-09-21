package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesEnrollmenttokensDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the enrollment token in the form enterprises/{enterpriseId\}/enrollmentTokens/{enrollmentTokenId\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesEnrollmenttokensDelete {
  
  inline def apply(): ParamsResourceEnterprisesEnrollmenttokensDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesEnrollmenttokensDelete]
  }
  
  extension [Self <: ParamsResourceEnterprisesEnrollmenttokensDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

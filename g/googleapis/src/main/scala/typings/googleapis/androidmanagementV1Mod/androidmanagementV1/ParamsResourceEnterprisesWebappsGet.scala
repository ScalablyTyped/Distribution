package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesWebappsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the web app in the form enterprises/{enterpriseId\}/webApp/{packageName\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesWebappsGet {
  
  inline def apply(): ParamsResourceEnterprisesWebappsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesWebappsGet]
  }
  
  extension [Self <: ParamsResourceEnterprisesWebappsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

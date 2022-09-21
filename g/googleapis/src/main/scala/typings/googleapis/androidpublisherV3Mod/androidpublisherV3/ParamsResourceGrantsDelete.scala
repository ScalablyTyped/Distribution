package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGrantsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the grant to delete. Format: developers/{developer\}/users/{email\}/grants/{package_name\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceGrantsDelete {
  
  inline def apply(): ParamsResourceGrantsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGrantsDelete]
  }
  
  extension [Self <: ParamsResourceGrantsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

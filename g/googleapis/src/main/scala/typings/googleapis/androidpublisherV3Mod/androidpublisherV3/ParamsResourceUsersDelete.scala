package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the user to delete. Format: developers/{developer\}/users/{email\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersDelete {
  
  inline def apply(): ParamsResourceUsersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersDelete]
  }
  
  extension [Self <: ParamsResourceUsersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

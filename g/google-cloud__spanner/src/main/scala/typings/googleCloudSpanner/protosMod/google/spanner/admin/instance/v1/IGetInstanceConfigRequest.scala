package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetInstanceConfigRequest. */
trait IGetInstanceConfigRequest extends StObject {
  
  /** GetInstanceConfigRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetInstanceConfigRequest {
  
  inline def apply(): IGetInstanceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetInstanceConfigRequest]
  }
  
  extension [Self <: IGetInstanceConfigRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

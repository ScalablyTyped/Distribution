package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpacesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the space, in the form "spaces/x". Format: spaces/{space\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpacesGet {
  
  inline def apply(): ParamsResourceSpacesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpacesGet]
  }
  
  extension [Self <: ParamsResourceSpacesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

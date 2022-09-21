package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpacesMembersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the membership to retrieve. Format: spaces/{space\}/members/{member\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpacesMembersGet {
  
  inline def apply(): ParamsResourceSpacesMembersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpacesMembersGet]
  }
  
  extension [Self <: ParamsResourceSpacesMembersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

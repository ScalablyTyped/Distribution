package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpacesMessagesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the message to be retrieved, in the form "spaces/x/messages/x". Example: spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpacesMessagesGet {
  
  inline def apply(): ParamsResourceSpacesMessagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpacesMessagesGet]
  }
  
  extension [Self <: ParamsResourceSpacesMessagesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

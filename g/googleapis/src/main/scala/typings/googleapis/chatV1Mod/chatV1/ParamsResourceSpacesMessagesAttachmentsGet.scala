package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpacesMessagesAttachmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the attachment, in the form "spaces/x/messages/x/attachments/x".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpacesMessagesAttachmentsGet {
  
  inline def apply(): ParamsResourceSpacesMessagesAttachmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpacesMessagesAttachmentsGet]
  }
  
  extension [Self <: ParamsResourceSpacesMessagesAttachmentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

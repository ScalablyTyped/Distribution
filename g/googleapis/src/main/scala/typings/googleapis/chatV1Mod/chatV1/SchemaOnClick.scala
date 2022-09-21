package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOnClick extends StObject {
  
  /**
    * A form action will be triggered by this onclick if specified.
    */
  var action: js.UndefOr[SchemaFormAction] = js.undefined
  
  /**
    * This onclick triggers an open link action if specified.
    */
  var openLink: js.UndefOr[SchemaOpenLink] = js.undefined
}
object SchemaOnClick {
  
  inline def apply(): SchemaOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnClick]
  }
  
  extension [Self <: SchemaOnClick](x: Self) {
    
    inline def setAction(value: SchemaFormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setOpenLink(value: SchemaOpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}

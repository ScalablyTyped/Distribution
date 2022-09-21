package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkupOnClick extends StObject {
  
  /**
    * A form action will be triggered by this onclick if specified.
    */
  var action: js.UndefOr[SchemaGoogleChatV1WidgetMarkupFormAction] = js.undefined
  
  /**
    * This onclick triggers an open link action if specified.
    */
  var openLink: js.UndefOr[SchemaGoogleChatV1WidgetMarkupOpenLink] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkupOnClick {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkupOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkupOnClick]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkupOnClick](x: Self) {
    
    inline def setAction(value: SchemaGoogleChatV1WidgetMarkupFormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setOpenLink(value: SchemaGoogleChatV1WidgetMarkupOpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}

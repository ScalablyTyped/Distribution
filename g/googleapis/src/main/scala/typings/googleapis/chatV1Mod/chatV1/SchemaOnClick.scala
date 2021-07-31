package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An onclick action (e.g. open a link).
  */
trait SchemaOnClick extends StObject {
  
  /**
    * A form action will be trigger by this onclick if specified.
    */
  var action: js.UndefOr[SchemaFormAction] = js.undefined
  
  /**
    * This onclick triggers an open link action if specified.
    */
  var openLink: js.UndefOr[SchemaOpenLink] = js.undefined
}
object SchemaOnClick {
  
  @scala.inline
  def apply(): SchemaOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnClick]
  }
  
  @scala.inline
  implicit class SchemaOnClickMutableBuilder[Self <: SchemaOnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: SchemaFormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setOpenLink(value: SchemaOpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}

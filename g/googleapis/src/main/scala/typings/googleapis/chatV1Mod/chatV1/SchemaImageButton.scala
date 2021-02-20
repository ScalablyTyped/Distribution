package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image button with an onclick action.
  */
@js.native
trait SchemaImageButton extends StObject {
  
  /**
    * The icon specified by an enum that indices to an icon provided by Chat
    * API.
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * The icon specified by a URL.
    */
  var iconUrl: js.UndefOr[String] = js.native
  
  /**
    * The name of this image_button which will be used for accessibility.
    * Default value will be provided if developers don&#39;t specify.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The onclick action.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
}
object SchemaImageButton {
  
  @scala.inline
  def apply(): SchemaImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageButton]
  }
  
  @scala.inline
  implicit class SchemaImageButtonMutableBuilder[Self <: SchemaImageButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}

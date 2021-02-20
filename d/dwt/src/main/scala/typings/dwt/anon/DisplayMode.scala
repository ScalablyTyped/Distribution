package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayMode extends StObject {
  
  var displayMode: js.UndefOr[String] = js.native
  
  // Example: '#0000ff',
  var goToThumbnail: js.UndefOr[Boolean] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  // Example: 'icon-tags',
  var selectedColor: js.UndefOr[String] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
}
object DisplayMode {
  
  @scala.inline
  def apply(): DisplayMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayMode]
  }
  
  @scala.inline
  implicit class DisplayModeMutableBuilder[Self <: DisplayMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayMode(value: String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setGoToThumbnail(value: Boolean): Self = StObject.set(x, "goToThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToThumbnailUndefined: Self = StObject.set(x, "goToThumbnail", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}

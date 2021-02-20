package typings.dwt.anon

import typings.dwt.dwtNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnButtonClick extends StObject {
  
  // Example: 'pager'
  var iconClass: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var onButtonClick: js.UndefOr[String] = js.native
  
  // Example: 'icon-pageEnd'
  var sequence: js.UndefOr[`5`] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
}
object OnButtonClick {
  
  @scala.inline
  def apply(): OnButtonClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnButtonClick]
  }
  
  @scala.inline
  implicit class OnButtonClickMutableBuilder[Self <: OnButtonClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOnButtonClick(value: String): Self = StObject.set(x, "onButtonClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
    
    @scala.inline
    def setSequence(value: `5`): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}

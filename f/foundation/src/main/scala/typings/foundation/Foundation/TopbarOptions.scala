package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopbarOptions extends StObject {
  
  var back_text: js.UndefOr[String] = js.native
  
  var custom_back_text: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var is_hover: js.UndefOr[Boolean] = js.native
  
  var mobile_show_parent_link: js.UndefOr[Boolean] = js.native
  
  var scrolltop: js.UndefOr[Boolean] = js.native
  
  var sticky_class: js.UndefOr[String] = js.native
  
  var sticky_on: js.UndefOr[String] = js.native
}
object TopbarOptions {
  
  @scala.inline
  def apply(): TopbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopbarOptions]
  }
  
  @scala.inline
  implicit class TopbarOptionsMutableBuilder[Self <: TopbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack_text(value: String): Self = StObject.set(x, "back_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack_textUndefined: Self = StObject.set(x, "back_text", js.undefined)
    
    @scala.inline
    def setCustom_back_text(value: Boolean): Self = StObject.set(x, "custom_back_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_back_textUndefined: Self = StObject.set(x, "custom_back_text", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIs_hover(value: Boolean): Self = StObject.set(x, "is_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hoverUndefined: Self = StObject.set(x, "is_hover", js.undefined)
    
    @scala.inline
    def setMobile_show_parent_link(value: Boolean): Self = StObject.set(x, "mobile_show_parent_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_show_parent_linkUndefined: Self = StObject.set(x, "mobile_show_parent_link", js.undefined)
    
    @scala.inline
    def setScrolltop(value: Boolean): Self = StObject.set(x, "scrolltop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrolltopUndefined: Self = StObject.set(x, "scrolltop", js.undefined)
    
    @scala.inline
    def setSticky_class(value: String): Self = StObject.set(x, "sticky_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticky_classUndefined: Self = StObject.set(x, "sticky_class", js.undefined)
    
    @scala.inline
    def setSticky_on(value: String): Self = StObject.set(x, "sticky_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticky_onUndefined: Self = StObject.set(x, "sticky_on", js.undefined)
  }
}

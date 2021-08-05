package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDropdownMenuOptions extends StObject {
  
  var alignment: js.UndefOr[String] = js.undefined
  
  var autoclose: js.UndefOr[Boolean] = js.undefined
  
  var clickOpen: js.UndefOr[Boolean] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var closingTime: js.UndefOr[Double] = js.undefined
  
  var disableHover: js.UndefOr[Boolean] = js.undefined
  
  var forceFollow: js.UndefOr[Boolean] = js.undefined
  
  var hoverDelay: js.UndefOr[Double] = js.undefined
  
  var rightClass: js.UndefOr[String] = js.undefined
  
  var verticalClass: js.UndefOr[String] = js.undefined
}
object IDropdownMenuOptions {
  
  inline def apply(): IDropdownMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownMenuOptions]
  }
  
  extension [Self <: IDropdownMenuOptions](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    inline def setClickOpen(value: Boolean): Self = StObject.set(x, "clickOpen", value.asInstanceOf[js.Any])
    
    inline def setClickOpenUndefined: Self = StObject.set(x, "clickOpen", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setClosingTime(value: Double): Self = StObject.set(x, "closingTime", value.asInstanceOf[js.Any])
    
    inline def setClosingTimeUndefined: Self = StObject.set(x, "closingTime", js.undefined)
    
    inline def setDisableHover(value: Boolean): Self = StObject.set(x, "disableHover", value.asInstanceOf[js.Any])
    
    inline def setDisableHoverUndefined: Self = StObject.set(x, "disableHover", js.undefined)
    
    inline def setForceFollow(value: Boolean): Self = StObject.set(x, "forceFollow", value.asInstanceOf[js.Any])
    
    inline def setForceFollowUndefined: Self = StObject.set(x, "forceFollow", js.undefined)
    
    inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
    
    inline def setRightClass(value: String): Self = StObject.set(x, "rightClass", value.asInstanceOf[js.Any])
    
    inline def setRightClassUndefined: Self = StObject.set(x, "rightClass", js.undefined)
    
    inline def setVerticalClass(value: String): Self = StObject.set(x, "verticalClass", value.asInstanceOf[js.Any])
    
    inline def setVerticalClassUndefined: Self = StObject.set(x, "verticalClass", js.undefined)
  }
}

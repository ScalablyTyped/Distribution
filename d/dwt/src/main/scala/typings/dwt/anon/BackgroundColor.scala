package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  // Example: 'pink'
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  // Example: 'yellow'
  var blockBackgroundColor: js.UndefOr[String] = js.undefined
  
  // Example: 'gray'
  var hoverBackgroundColor: js.UndefOr[String] = js.undefined
  
  // Example: '#c4faf8'
  var hoverBorderColor: js.UndefOr[String] = js.undefined
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  // Example: 'rgb(127, 133, 251)'
  var imageBackgroundColor: js.UndefOr[String] = js.undefined
  
  // Example: 'transparent'
  var imageBorderColor: js.UndefOr[String] = js.undefined
  
  // Example: 'rgba(67, 66, 70, 1)'
  var imageSpace: js.UndefOr[Double] = js.undefined
  
  var mouseShape: js.UndefOr[String] = js.undefined
  
  // Example: 'red'
  var selectedBackgroundColor: js.UndefOr[String] = js.undefined
  
  // Example: 'icon-thumbnail'
  var selectedBorderColor: js.UndefOr[String] = js.undefined
  
  // Example: 10
  var showPageNumber: js.UndefOr[Boolean] = js.undefined
  
  var showThumbnailControl: js.UndefOr[Boolean] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object BackgroundColor {
  
  inline def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBlockBackgroundColor(value: String): Self = StObject.set(x, "blockBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBlockBackgroundColorUndefined: Self = StObject.set(x, "blockBackgroundColor", js.undefined)
    
    inline def setHoverBackgroundColor(value: String): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColorUndefined: Self = StObject.set(x, "hoverBackgroundColor", js.undefined)
    
    inline def setHoverBorderColor(value: String): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderColorUndefined: Self = StObject.set(x, "hoverBorderColor", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setImageBackgroundColor(value: String): Self = StObject.set(x, "imageBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setImageBackgroundColorUndefined: Self = StObject.set(x, "imageBackgroundColor", js.undefined)
    
    inline def setImageBorderColor(value: String): Self = StObject.set(x, "imageBorderColor", value.asInstanceOf[js.Any])
    
    inline def setImageBorderColorUndefined: Self = StObject.set(x, "imageBorderColor", js.undefined)
    
    inline def setImageSpace(value: Double): Self = StObject.set(x, "imageSpace", value.asInstanceOf[js.Any])
    
    inline def setImageSpaceUndefined: Self = StObject.set(x, "imageSpace", js.undefined)
    
    inline def setMouseShape(value: String): Self = StObject.set(x, "mouseShape", value.asInstanceOf[js.Any])
    
    inline def setMouseShapeUndefined: Self = StObject.set(x, "mouseShape", js.undefined)
    
    inline def setSelectedBackgroundColor(value: String): Self = StObject.set(x, "selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedBackgroundColorUndefined: Self = StObject.set(x, "selectedBackgroundColor", js.undefined)
    
    inline def setSelectedBorderColor(value: String): Self = StObject.set(x, "selectedBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedBorderColorUndefined: Self = StObject.set(x, "selectedBorderColor", js.undefined)
    
    inline def setShowPageNumber(value: Boolean): Self = StObject.set(x, "showPageNumber", value.asInstanceOf[js.Any])
    
    inline def setShowPageNumberUndefined: Self = StObject.set(x, "showPageNumber", js.undefined)
    
    inline def setShowThumbnailControl(value: Boolean): Self = StObject.set(x, "showThumbnailControl", value.asInstanceOf[js.Any])
    
    inline def setShowThumbnailControlUndefined: Self = StObject.set(x, "showThumbnailControl", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}

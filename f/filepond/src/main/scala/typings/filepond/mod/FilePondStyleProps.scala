package typings.filepond.mod

import typings.filepond.filepondStrings.`compact circle`
import typings.filepond.filepondStrings.`integrated circle`
import typings.filepond.filepondStrings.circle
import typings.filepond.filepondStrings.compact
import typings.filepond.filepondStrings.integrated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondStyleProps extends StObject {
  
  /**
    * The position of the remove item button.
    * @default 'right'
    */
  var styleButtonProcessItemPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Enable to align the remove button to the left side of the file item.
    * @default false
    */
  var styleButtonRemoveItemAlign: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position of the remove item button.
    * @default 'left'
    */
  var styleButtonRemoveItemPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Set a forced aspect ratio for the file items.
    *
    * Useful when rendering cropped or fixed aspect ratio images in grid view.
    * @default null
    */
  var styleItemPanelAspectRatio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The position of the load indicator.
    * @default 'right'
    */
  var styleLoadIndicatorPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Set a forced aspect ratio for the FilePond drop area.
    *
    * Accepts human readable aspect ratios like `1:1` or numeric aspect ratios like `0.75`.
    * @default null
    */
  var stylePanelAspectRatio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set a different layout render mode.
    * @default null
    */
  var stylePanelLayout: js.UndefOr[
    integrated | compact | circle | (`integrated circle`) | (`compact circle`) | Null
  ] = js.undefined
  
  /**
    * The position of the progress indicator.
    * @default 'right'
    */
  var styleProgressIndicatorPosition: js.UndefOr[String] = js.undefined
}
object FilePondStyleProps {
  
  inline def apply(): FilePondStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondStyleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePondStyleProps] (val x: Self) extends AnyVal {
    
    inline def setStyleButtonProcessItemPosition(value: String): Self = StObject.set(x, "styleButtonProcessItemPosition", value.asInstanceOf[js.Any])
    
    inline def setStyleButtonProcessItemPositionUndefined: Self = StObject.set(x, "styleButtonProcessItemPosition", js.undefined)
    
    inline def setStyleButtonRemoveItemAlign(value: Boolean): Self = StObject.set(x, "styleButtonRemoveItemAlign", value.asInstanceOf[js.Any])
    
    inline def setStyleButtonRemoveItemAlignUndefined: Self = StObject.set(x, "styleButtonRemoveItemAlign", js.undefined)
    
    inline def setStyleButtonRemoveItemPosition(value: String): Self = StObject.set(x, "styleButtonRemoveItemPosition", value.asInstanceOf[js.Any])
    
    inline def setStyleButtonRemoveItemPositionUndefined: Self = StObject.set(x, "styleButtonRemoveItemPosition", js.undefined)
    
    inline def setStyleItemPanelAspectRatio(value: String): Self = StObject.set(x, "styleItemPanelAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setStyleItemPanelAspectRatioNull: Self = StObject.set(x, "styleItemPanelAspectRatio", null)
    
    inline def setStyleItemPanelAspectRatioUndefined: Self = StObject.set(x, "styleItemPanelAspectRatio", js.undefined)
    
    inline def setStyleLoadIndicatorPosition(value: String): Self = StObject.set(x, "styleLoadIndicatorPosition", value.asInstanceOf[js.Any])
    
    inline def setStyleLoadIndicatorPositionUndefined: Self = StObject.set(x, "styleLoadIndicatorPosition", js.undefined)
    
    inline def setStylePanelAspectRatio(value: String): Self = StObject.set(x, "stylePanelAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setStylePanelAspectRatioNull: Self = StObject.set(x, "stylePanelAspectRatio", null)
    
    inline def setStylePanelAspectRatioUndefined: Self = StObject.set(x, "stylePanelAspectRatio", js.undefined)
    
    inline def setStylePanelLayout(value: integrated | compact | circle | (`integrated circle`) | (`compact circle`)): Self = StObject.set(x, "stylePanelLayout", value.asInstanceOf[js.Any])
    
    inline def setStylePanelLayoutNull: Self = StObject.set(x, "stylePanelLayout", null)
    
    inline def setStylePanelLayoutUndefined: Self = StObject.set(x, "stylePanelLayout", js.undefined)
    
    inline def setStyleProgressIndicatorPosition(value: String): Self = StObject.set(x, "styleProgressIndicatorPosition", value.asInstanceOf[js.Any])
    
    inline def setStyleProgressIndicatorPositionUndefined: Self = StObject.set(x, "styleProgressIndicatorPosition", js.undefined)
  }
}

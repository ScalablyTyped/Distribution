package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartSectionAnchorPosition extends StObject {
  
  /**
    * The page number being accessed.
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  
  // int32
  /**
    * This property indicates the horizontal offset of the object on the page.
    * DocuSign uses 72 DPI when determining position.
    * Required. May be zero.
    *
    */
  var xPosition: js.UndefOr[Double] = js.undefined
  
  // double
  /**
    * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
    */
  var yPosition: js.UndefOr[Double] = js.undefined
}
object SmartSectionAnchorPosition {
  
  inline def apply(): SmartSectionAnchorPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartSectionAnchorPosition]
  }
  
  extension [Self <: SmartSectionAnchorPosition](x: Self) {
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setXPosition(value: Double): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    inline def setXPositionUndefined: Self = StObject.set(x, "xPosition", js.undefined)
    
    inline def setYPosition(value: Double): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
    
    inline def setYPositionUndefined: Self = StObject.set(x, "yPosition", js.undefined)
  }
}

package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchBox extends StObject {
  
  /**
    * The height of the tab in pixels.
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the page number on which the tab is located.
    * Must be 1 for supplemental documents.
    *
    */
  var pageNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the tab in pixels.
    */
  var width: js.UndefOr[String] = js.undefined
  
  /**
    * This property indicates the horizontal offset of the object on the page.
    * DocuSign uses 72 DPI when determining position.
    * Required. May be zero.
    *
    */
  var xPosition: js.UndefOr[String] = js.undefined
  
  /**
    * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
    */
  var yPosition: js.UndefOr[String] = js.undefined
}
object MatchBox {
  
  inline def apply(): MatchBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchBox]
  }
  
  extension [Self <: MatchBox](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPageNumber(value: String): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXPosition(value: String): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    inline def setXPositionUndefined: Self = StObject.set(x, "xPosition", js.undefined)
    
    inline def setYPosition(value: String): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
    
    inline def setYPositionUndefined: Self = StObject.set(x, "yPosition", js.undefined)
  }
}

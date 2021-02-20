package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartSectionAnchorPosition extends StObject {
  
  /**
    * The page number being accessed.
    */
  var pageNumber: js.UndefOr[Double] = js.native
  
  // int32
  /**
    * This property indicates the horizontal offset of the object on the page.
    * DocuSign uses 72 DPI when determining position.
    * Required. May be zero.
    *
    */
  var xPosition: js.UndefOr[Double] = js.native
  
  // double
  /**
    * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
    */
  var yPosition: js.UndefOr[Double] = js.native
}
object SmartSectionAnchorPosition {
  
  @scala.inline
  def apply(): SmartSectionAnchorPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartSectionAnchorPosition]
  }
  
  @scala.inline
  implicit class SmartSectionAnchorPositionMutableBuilder[Self <: SmartSectionAnchorPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    @scala.inline
    def setXPosition(value: Double): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPositionUndefined: Self = StObject.set(x, "xPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: Double): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPositionUndefined: Self = StObject.set(x, "yPosition", js.undefined)
  }
}

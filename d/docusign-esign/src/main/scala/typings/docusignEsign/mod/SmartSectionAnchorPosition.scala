package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartSectionAnchorPosition extends js.Object {
  
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
  implicit class SmartSectionAnchorPositionOps[Self <: SmartSectionAnchorPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    
    @scala.inline
    def setXPosition(value: Double): Self = this.set("xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPosition: Self = this.set("xPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: Double): Self = this.set("yPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPosition: Self = this.set("yPosition", js.undefined)
  }
}

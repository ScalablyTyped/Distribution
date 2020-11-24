package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphStyle extends js.Object {
  
  var alignment: js.UndefOr[String] = js.native
  
  var avoidWidowAndOrphan: js.UndefOr[Boolean] = js.native
  
  var borderBetween: js.UndefOr[ParagraphBorder] = js.native
  
  var borderBottom: js.UndefOr[ParagraphBorder] = js.native
  
  var borderLeft: js.UndefOr[ParagraphBorder] = js.native
  
  var borderRight: js.UndefOr[ParagraphBorder] = js.native
  
  var borderTop: js.UndefOr[ParagraphBorder] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var headingId: js.UndefOr[String] = js.native
  
  var indentEnd: js.UndefOr[Dimension] = js.native
  
  var indentFirstLine: js.UndefOr[Dimension] = js.native
  
  var indentStart: js.UndefOr[Dimension] = js.native
  
  var keepLinesTogether: js.UndefOr[Boolean] = js.native
  
  var keepWithNext: js.UndefOr[Boolean] = js.native
  
  var lineSpacing: js.UndefOr[Double] = js.native
  
  var namedStyleType: js.UndefOr[String] = js.native
  
  var shading: js.UndefOr[Shading] = js.native
  
  var spaceAbove: js.UndefOr[Dimension] = js.native
  
  var spaceBelow: js.UndefOr[Dimension] = js.native
  
  var spacingMode: js.UndefOr[String] = js.native
  
  var tabStops: js.UndefOr[js.Array[TabStop]] = js.native
}
object ParagraphStyle {
  
  @scala.inline
  def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setAvoidWidowAndOrphan(value: Boolean): Self = this.set("avoidWidowAndOrphan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidWidowAndOrphan: Self = this.set("avoidWidowAndOrphan", js.undefined)
    
    @scala.inline
    def setBorderBetween(value: ParagraphBorder): Self = this.set("borderBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBetween: Self = this.set("borderBetween", js.undefined)
    
    @scala.inline
    def setBorderBottom(value: ParagraphBorder): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    
    @scala.inline
    def setBorderLeft(value: ParagraphBorder): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    
    @scala.inline
    def setBorderRight(value: ParagraphBorder): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    
    @scala.inline
    def setBorderTop(value: ParagraphBorder): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHeadingId(value: String): Self = this.set("headingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingId: Self = this.set("headingId", js.undefined)
    
    @scala.inline
    def setIndentEnd(value: Dimension): Self = this.set("indentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentEnd: Self = this.set("indentEnd", js.undefined)
    
    @scala.inline
    def setIndentFirstLine(value: Dimension): Self = this.set("indentFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentFirstLine: Self = this.set("indentFirstLine", js.undefined)
    
    @scala.inline
    def setIndentStart(value: Dimension): Self = this.set("indentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentStart: Self = this.set("indentStart", js.undefined)
    
    @scala.inline
    def setKeepLinesTogether(value: Boolean): Self = this.set("keepLinesTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepLinesTogether: Self = this.set("keepLinesTogether", js.undefined)
    
    @scala.inline
    def setKeepWithNext(value: Boolean): Self = this.set("keepWithNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepWithNext: Self = this.set("keepWithNext", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
    
    @scala.inline
    def setNamedStyleType(value: String): Self = this.set("namedStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedStyleType: Self = this.set("namedStyleType", js.undefined)
    
    @scala.inline
    def setShading(value: Shading): Self = this.set("shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
    
    @scala.inline
    def setSpaceAbove(value: Dimension): Self = this.set("spaceAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceAbove: Self = this.set("spaceAbove", js.undefined)
    
    @scala.inline
    def setSpaceBelow(value: Dimension): Self = this.set("spaceBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceBelow: Self = this.set("spaceBelow", js.undefined)
    
    @scala.inline
    def setSpacingMode(value: String): Self = this.set("spacingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacingMode: Self = this.set("spacingMode", js.undefined)
    
    @scala.inline
    def setTabStopsVarargs(value: TabStop*): Self = this.set("tabStops", js.Array(value :_*))
    
    @scala.inline
    def setTabStops(value: js.Array[TabStop]): Self = this.set("tabStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabStops: Self = this.set("tabStops", js.undefined)
  }
}

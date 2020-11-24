package typings.glaze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends js.Object {
  
  val borderWidth: `2` = js.native
  
  val duration: `1000ms` = js.native
  
  val fontSize: `05` = js.native
  
  val letterSpacing: Normal = js.native
  
  val lineHeight: Base = js.native
  
  val radius: Full = js.native
  
  val shadow: Inner = js.native
  
  val size: `1` = js.native
  
  val spacing: `0` = js.native
}
object Border {
  
  @scala.inline
  def apply(
    borderWidth: `2`,
    duration: `1000ms`,
    fontSize: `05`,
    letterSpacing: Normal,
    lineHeight: Base,
    radius: Full,
    shadow: Inner,
    size: `1`,
    spacing: `0`
  ): Border = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    
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
    def setBorderWidth(value: `2`): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `1000ms`): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: `05`): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: Normal): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Base): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Full): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: Inner): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: `1`): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: `0`): Self = this.set("spacing", value.asInstanceOf[js.Any])
  }
}

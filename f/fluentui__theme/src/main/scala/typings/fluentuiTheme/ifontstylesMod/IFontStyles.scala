package typings.fluentuiTheme.ifontstylesMod

import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFontStyles extends js.Object {
  
  var large: IRawStyle = js.native
  
  var medium: IRawStyle = js.native
  
  var mediumPlus: IRawStyle = js.native
  
  var mega: IRawStyle = js.native
  
  var small: IRawStyle = js.native
  
  var smallPlus: IRawStyle = js.native
  
  var superLarge: IRawStyle = js.native
  
  var tiny: IRawStyle = js.native
  
  var xLarge: IRawStyle = js.native
  
  /**
    * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme.
    * Not recommended for use with Fabric 6.
    */
  var xLargePlus: IRawStyle = js.native
  
  var xSmall: IRawStyle = js.native
  
  var xxLarge: IRawStyle = js.native
  
  /**
    * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme
    * Not recommended for use with Fabric 6.
    */
  var xxLargePlus: IRawStyle = js.native
}
object IFontStyles {
  
  @scala.inline
  def apply(
    large: IRawStyle,
    medium: IRawStyle,
    mediumPlus: IRawStyle,
    mega: IRawStyle,
    small: IRawStyle,
    smallPlus: IRawStyle,
    superLarge: IRawStyle,
    tiny: IRawStyle,
    xLarge: IRawStyle,
    xLargePlus: IRawStyle,
    xSmall: IRawStyle,
    xxLarge: IRawStyle,
    xxLargePlus: IRawStyle
  ): IFontStyles = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumPlus = mediumPlus.asInstanceOf[js.Any], mega = mega.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], smallPlus = smallPlus.asInstanceOf[js.Any], superLarge = superLarge.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any], xLarge = xLarge.asInstanceOf[js.Any], xLargePlus = xLargePlus.asInstanceOf[js.Any], xSmall = xSmall.asInstanceOf[js.Any], xxLarge = xxLarge.asInstanceOf[js.Any], xxLargePlus = xxLargePlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontStyles]
  }
  
  @scala.inline
  implicit class IFontStylesOps[Self <: IFontStyles] (val x: Self) extends AnyVal {
    
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
    def setLarge(value: IRawStyle): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: IRawStyle): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumPlus(value: IRawStyle): Self = this.set("mediumPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMega(value: IRawStyle): Self = this.set("mega", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: IRawStyle): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallPlus(value: IRawStyle): Self = this.set("smallPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperLarge(value: IRawStyle): Self = this.set("superLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiny(value: IRawStyle): Self = this.set("tiny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXLarge(value: IRawStyle): Self = this.set("xLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXLargePlus(value: IRawStyle): Self = this.set("xLargePlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXSmall(value: IRawStyle): Self = this.set("xSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXxLarge(value: IRawStyle): Self = this.set("xxLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXxLargePlus(value: IRawStyle): Self = this.set("xxLargePlus", value.asInstanceOf[js.Any])
  }
}

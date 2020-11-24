package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains text wrapping settings for floating objects.
  */
@js.native
trait FloatingObjectTextWrappingSettings extends js.Object {
  
  /**
    * Gets or sets the bottom offset of text wrapping.
    */
  var bottomDistance: Double = js.native
  
  /**
    * Gets or sets a value specifying how text can wrap around a floating object's left and right sides.
    */
  var floatingObjectTextWrapSide: FloatingObjectTextWrapSide = js.native
  
  /**
    * Gets or sets a value specifying how text is wrapped around a floating object.
    */
  var floatingObjectTextWrapType: FloatingObjectTextWrapType = js.native
  
  /**
    * Gets or sets the left offset of text wrapping.
    */
  var leftDistance: Double = js.native
  
  /**
    * Gets or sets the right offset of text wrapping.
    */
  var rightDistance: Double = js.native
  
  /**
    * Gets or sets the top offset of text wrapping.
    */
  var topDistance: Double = js.native
}
object FloatingObjectTextWrappingSettings {
  
  @scala.inline
  def apply(
    bottomDistance: Double,
    floatingObjectTextWrapSide: FloatingObjectTextWrapSide,
    floatingObjectTextWrapType: FloatingObjectTextWrapType,
    leftDistance: Double,
    rightDistance: Double,
    topDistance: Double
  ): FloatingObjectTextWrappingSettings = {
    val __obj = js.Dynamic.literal(bottomDistance = bottomDistance.asInstanceOf[js.Any], floatingObjectTextWrapSide = floatingObjectTextWrapSide.asInstanceOf[js.Any], floatingObjectTextWrapType = floatingObjectTextWrapType.asInstanceOf[js.Any], leftDistance = leftDistance.asInstanceOf[js.Any], rightDistance = rightDistance.asInstanceOf[js.Any], topDistance = topDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectTextWrappingSettings]
  }
  
  @scala.inline
  implicit class FloatingObjectTextWrappingSettingsOps[Self <: FloatingObjectTextWrappingSettings] (val x: Self) extends AnyVal {
    
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
    def setBottomDistance(value: Double): Self = this.set("bottomDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingObjectTextWrapSide(value: FloatingObjectTextWrapSide): Self = this.set("floatingObjectTextWrapSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingObjectTextWrapType(value: FloatingObjectTextWrapType): Self = this.set("floatingObjectTextWrapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDistance(value: Double): Self = this.set("leftDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDistance(value: Double): Self = this.set("rightDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopDistance(value: Double): Self = this.set("topDistance", value.asInstanceOf[js.Any])
  }
}

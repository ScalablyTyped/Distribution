package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains page margin settings.
  */
@js.native
trait FloatingObjectAbsolutePositionSettings extends js.Object {
  
  /**
    * Gets or sets a floating object's horizontal position relative to an element specified by the FloatingObjectAbsolutePositionSettings.horizontalPositionType property.
    */
  var horizontalAbsolutePosition: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType = js.native
  
  /**
    * Gets or sets a floating object's vertical position relative to an element specified by the FloatingObjectAbsolutePositionSettings.verticalPositionType property.
    */
  var verticalAbsolutePosition: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType = js.native
}
object FloatingObjectAbsolutePositionSettings {
  
  @scala.inline
  def apply(
    horizontalAbsolutePosition: Double,
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    verticalAbsolutePosition: Double,
    verticalPositionType: FloatingObjectVerticalPositionType
  ): FloatingObjectAbsolutePositionSettings = {
    val __obj = js.Dynamic.literal(horizontalAbsolutePosition = horizontalAbsolutePosition.asInstanceOf[js.Any], horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], verticalAbsolutePosition = verticalAbsolutePosition.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAbsolutePositionSettings]
  }
  
  @scala.inline
  implicit class FloatingObjectAbsolutePositionSettingsOps[Self <: FloatingObjectAbsolutePositionSettings] (val x: Self) extends AnyVal {
    
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
    def setHorizontalAbsolutePosition(value: Double): Self = this.set("horizontalAbsolutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPositionType(value: FloatingObjectHorizontalPositionType): Self = this.set("horizontalPositionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAbsolutePosition(value: Double): Self = this.set("verticalAbsolutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPositionType(value: FloatingObjectVerticalPositionType): Self = this.set("verticalPositionType", value.asInstanceOf[js.Any])
  }
}

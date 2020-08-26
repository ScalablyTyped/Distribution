package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains alignment position settings for floating objects.
  */
@js.native
trait FloatingObjectAlignmentPositionSettings extends js.Object {
  /**
    * Gets or sets a value specifying how a floating object is horizontally aligned relative to an element specified by the FloatingObjectAlignmentPositionSettings.horizontalPositionAlignment property.
    */
  var horizontalPositionAlignment: FloatingObjectHorizontalPositionAlignment = js.native
  /**
    * Gets or sets a value specifying to what element the horizontal alignment of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType = js.native
  /**
    * Gets or sets a value specifying how a floating object is vertically aligned relative to an element specified by the FloatingObjectAlignmentPositionSettings.verticalPositionAlignment property.
    */
  var verticalPositionAlignment: FloatingObjectVerticalPositionAlignment = js.native
  /**
    * Gets or sets a value specifying to what element the vertical alignment of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType = js.native
}

object FloatingObjectAlignmentPositionSettings {
  @scala.inline
  def apply(
    horizontalPositionAlignment: FloatingObjectHorizontalPositionAlignment,
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    verticalPositionAlignment: FloatingObjectVerticalPositionAlignment,
    verticalPositionType: FloatingObjectVerticalPositionType
  ): FloatingObjectAlignmentPositionSettings = {
    val __obj = js.Dynamic.literal(horizontalPositionAlignment = horizontalPositionAlignment.asInstanceOf[js.Any], horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], verticalPositionAlignment = verticalPositionAlignment.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAlignmentPositionSettings]
  }
  @scala.inline
  implicit class FloatingObjectAlignmentPositionSettingsOps[Self <: FloatingObjectAlignmentPositionSettings] (val x: Self) extends AnyVal {
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
    def setHorizontalPositionAlignment(value: FloatingObjectHorizontalPositionAlignment): Self = this.set("horizontalPositionAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalPositionType(value: FloatingObjectHorizontalPositionType): Self = this.set("horizontalPositionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalPositionAlignment(value: FloatingObjectVerticalPositionAlignment): Self = this.set("verticalPositionAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalPositionType(value: FloatingObjectVerticalPositionType): Self = this.set("verticalPositionType", value.asInstanceOf[js.Any])
  }
  
}


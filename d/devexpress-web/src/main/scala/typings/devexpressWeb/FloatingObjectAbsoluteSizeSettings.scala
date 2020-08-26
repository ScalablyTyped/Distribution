package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains absolute size settings for floating objects.
  */
@js.native
trait FloatingObjectAbsoluteSizeSettings extends js.Object {
  /**
    * Gets or sets a floating object's absolute height.
    */
  var absoluteHeight: Double = js.native
  /**
    * Gets or sets a floating object's absolute width.
    */
  var absoluteWidth: Double = js.native
}

object FloatingObjectAbsoluteSizeSettings {
  @scala.inline
  def apply(absoluteHeight: Double, absoluteWidth: Double): FloatingObjectAbsoluteSizeSettings = {
    val __obj = js.Dynamic.literal(absoluteHeight = absoluteHeight.asInstanceOf[js.Any], absoluteWidth = absoluteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAbsoluteSizeSettings]
  }
  @scala.inline
  implicit class FloatingObjectAbsoluteSizeSettingsOps[Self <: FloatingObjectAbsoluteSizeSettings] (val x: Self) extends AnyVal {
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
    def setAbsoluteHeight(value: Double): Self = this.set("absoluteHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteWidth(value: Double): Self = this.set("absoluteWidth", value.asInstanceOf[js.Any])
  }
  
}


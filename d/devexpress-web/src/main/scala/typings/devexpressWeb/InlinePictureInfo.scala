package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains in-line picture settings.
  */
@js.native
trait InlinePictureInfo extends js.Object {
  /**
    * Gets the actual image height.
    */
  val actualHeight: Double = js.native
  val actualHeigth: Double = js.native
  /**
    * Gets the actual image width.
    */
  val actualWidth: Double = js.native
  /**
    * Gets the image identifier.
    */
  val id: Double = js.native
  /**
    * Gets the initial image height.
    */
  val initialHeight: Double = js.native
  /**
    * Gets the initial image width.
    */
  val initialWidth: Double = js.native
  /**
    * Gets the image position.
    */
  val position: Double = js.native
  /**
    * Gets the X-scaling factor of the inline image.
    */
  val scaleX: Double = js.native
  /**
    * Gets the Y-scaling factor of the inline image.
    */
  val scaleY: Double = js.native
}

object InlinePictureInfo {
  @scala.inline
  def apply(
    actualHeight: Double,
    actualHeigth: Double,
    actualWidth: Double,
    id: Double,
    initialHeight: Double,
    initialWidth: Double,
    position: Double,
    scaleX: Double,
    scaleY: Double
  ): InlinePictureInfo = {
    val __obj = js.Dynamic.literal(actualHeight = actualHeight.asInstanceOf[js.Any], actualHeigth = actualHeigth.asInstanceOf[js.Any], actualWidth = actualWidth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialHeight = initialHeight.asInstanceOf[js.Any], initialWidth = initialWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureInfo]
  }
  @scala.inline
  implicit class InlinePictureInfoOps[Self <: InlinePictureInfo] (val x: Self) extends AnyVal {
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
    def setActualHeight(value: Double): Self = this.set("actualHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualHeigth(value: Double): Self = this.set("actualHeigth", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualWidth(value: Double): Self = this.set("actualWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialHeight(value: Double): Self = this.set("initialHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialWidth(value: Double): Self = this.set("initialWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
  }
  
}


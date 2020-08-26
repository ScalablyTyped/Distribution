package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  /** The ID of an image file in Drive to use for the background image. */
  var id: js.UndefOr[String] = js.native
  /**
    * The width of the cropped image in the closed range of 0 to 1. This value represents the width of the cropped image divided by the width of the entire
    * image. The height is computed by applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280 pixels wide and 144
    * pixels high.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The X coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
    * represents the horizontal distance from the left side of the entire image to the left side of the cropping area divided by the width of the entire
    * image.
    */
  var xCoordinate: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate of the upper left corner of the cropping area in the background image. This is a value in the closed range of 0 to 1. This value
    * represents the vertical distance from the top side of the entire image to the top side of the cropping area divided by the height of the entire image.
    */
  var yCoordinate: js.UndefOr[Double] = js.native
}

object Id {
  @scala.inline
  def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXCoordinate(value: Double): Self = this.set("xCoordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXCoordinate: Self = this.set("xCoordinate", js.undefined)
    @scala.inline
    def setYCoordinate(value: Double): Self = this.set("yCoordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYCoordinate: Self = this.set("yCoordinate", js.undefined)
  }
  
}


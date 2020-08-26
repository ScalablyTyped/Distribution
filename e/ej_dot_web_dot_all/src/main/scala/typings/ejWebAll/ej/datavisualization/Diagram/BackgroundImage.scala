package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundImage extends js.Object {
  /** Defines how to align the background image over the diagram area.
    * @Default {ej.datavisualization.Diagram.ImageAlignment.XMidYMid}
    */
  var alignment: js.UndefOr[ImageAlignment | String] = js.native
}

object BackgroundImage {
  @scala.inline
  def apply(): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImage]
  }
  @scala.inline
  implicit class BackgroundImageOps[Self <: BackgroundImage] (val x: Self) extends AnyVal {
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
    def setAlignment(value: ImageAlignment | String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
  }
  
}


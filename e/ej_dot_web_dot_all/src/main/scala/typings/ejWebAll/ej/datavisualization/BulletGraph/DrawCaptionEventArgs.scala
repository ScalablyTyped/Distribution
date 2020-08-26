package typings.ejWebAll.ej.datavisualization.BulletGraph

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawCaptionEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  /** returns the current captionSettings element.
    */
  var captionElement: js.UndefOr[HTMLElement] = js.native
  /** returns the type of the captionSettings.
    */
  var captionType: js.UndefOr[String] = js.native
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.native
}

object DrawCaptionEventArgs {
  @scala.inline
  def apply(): DrawCaptionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawCaptionEventArgs]
  }
  @scala.inline
  implicit class DrawCaptionEventArgsOps[Self <: DrawCaptionEventArgs] (val x: Self) extends AnyVal {
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
    def setObject(value: js.Any): Self = this.set("Object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("Object", js.undefined)
    @scala.inline
    def setCaptionElement(value: HTMLElement): Self = this.set("captionElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionElement: Self = this.set("captionElement", js.undefined)
    @scala.inline
    def setCaptionType(value: String): Self = this.set("captionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionType: Self = this.set("captionType", js.undefined)
    @scala.inline
    def setScaleElement(value: HTMLElement): Self = this.set("scaleElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleElement: Self = this.set("scaleElement", js.undefined)
  }
  
}


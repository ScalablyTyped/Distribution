package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageElementProperties extends js.Object {
  /** The object ID of the page where the element is located. */
  var pageObjectId: js.UndefOr[String] = js.native
  /** The size of the element. */
  var size: js.UndefOr[Size] = js.native
  /** The transform for the element. */
  var transform: js.UndefOr[AffineTransform] = js.native
}

object PageElementProperties {
  @scala.inline
  def apply(): PageElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageElementProperties]
  }
  @scala.inline
  implicit class PageElementPropertiesOps[Self <: PageElementProperties] (val x: Self) extends AnyVal {
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
    def setPageObjectId(value: String): Self = this.set("pageObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageObjectId: Self = this.set("pageObjectId", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTransform(value: AffineTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}


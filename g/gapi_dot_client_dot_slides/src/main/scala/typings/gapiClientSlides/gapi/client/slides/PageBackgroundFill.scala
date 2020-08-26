package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageBackgroundFill extends js.Object {
  /**
    * The background fill property state.
    *
    * Updating the fill on a page will implicitly update this field to
    * `RENDERED`, unless another value is specified in the same request. To
    * have no fill on a page, set this field to `NOT_RENDERED`. In this case,
    * any other fill fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.native
  /** Stretched picture fill. */
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.native
}

object PageBackgroundFill {
  @scala.inline
  def apply(): PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBackgroundFill]
  }
  @scala.inline
  implicit class PageBackgroundFillOps[Self <: PageBackgroundFill] (val x: Self) extends AnyVal {
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
    def setPropertyState(value: String): Self = this.set("propertyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyState: Self = this.set("propertyState", js.undefined)
    @scala.inline
    def setSolidFill(value: SolidFill): Self = this.set("solidFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolidFill: Self = this.set("solidFill", js.undefined)
    @scala.inline
    def setStretchedPictureFill(value: StretchedPictureFill): Self = this.set("stretchedPictureFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretchedPictureFill: Self = this.set("stretchedPictureFill", js.undefined)
  }
  
}


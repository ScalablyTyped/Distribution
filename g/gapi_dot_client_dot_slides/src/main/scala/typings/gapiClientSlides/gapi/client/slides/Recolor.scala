package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recolor extends js.Object {
  /**
    * The name of the recolor effect.
    *
    * The name is determined from the `recolor_stops` by matching the gradient
    * against the colors in the page's current color scheme. This property is
    * read-only.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The recolor effect is represented by a gradient, which is a list of color
    * stops.
    *
    * The colors in the gradient will replace the corresponding colors at
    * the same position in the color palette and apply to the image. This
    * property is read-only.
    */
  var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.native
}

object Recolor {
  @scala.inline
  def apply(): Recolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recolor]
  }
  @scala.inline
  implicit class RecolorOps[Self <: Recolor] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRecolorStopsVarargs(value: ColorStop*): Self = this.set("recolorStops", js.Array(value :_*))
    @scala.inline
    def setRecolorStops(value: js.Array[ColorStop]): Self = this.set("recolorStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecolorStops: Self = this.set("recolorStops", js.undefined)
  }
  
}


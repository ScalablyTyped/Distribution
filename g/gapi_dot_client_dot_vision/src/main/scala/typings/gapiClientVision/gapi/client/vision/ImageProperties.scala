package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProperties extends js.Object {
  /** If present, dominant colors completed successfully. */
  var dominantColors: js.UndefOr[DominantColorsAnnotation] = js.native
}

object ImageProperties {
  @scala.inline
  def apply(): ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProperties]
  }
  @scala.inline
  implicit class ImagePropertiesOps[Self <: ImageProperties] (val x: Self) extends AnyVal {
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
    def setDominantColors(value: DominantColorsAnnotation): Self = this.set("dominantColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDominantColors: Self = this.set("dominantColors", js.undefined)
  }
  
}


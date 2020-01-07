package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of replacing shapes with an image.
  */
@js.native
trait Schema$ReplaceAllShapesWithImageResponse extends js.Object {
  /**
    * The number of shapes replaced with images.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object Schema$ReplaceAllShapesWithImageResponse {
  @scala.inline
  def apply(occurrencesChanged: Int | Double = null): Schema$ReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplaceAllShapesWithImageResponse]
  }
}


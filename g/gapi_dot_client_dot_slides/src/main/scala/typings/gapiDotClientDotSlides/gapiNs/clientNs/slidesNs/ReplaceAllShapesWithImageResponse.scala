package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithImageResponse extends js.Object {
  /** The number of shapes replaced with images. */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}

object ReplaceAllShapesWithImageResponse {
  @scala.inline
  def apply(occurrencesChanged: Int | Double = null): ReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllShapesWithImageResponse]
  }
}


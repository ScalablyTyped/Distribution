package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithImageResponse extends js.Object {
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}

object ReplaceAllShapesWithImageResponse {
  @scala.inline
  def apply(occurrencesChanged: js.UndefOr[Double] = js.undefined): ReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(occurrencesChanged)) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllShapesWithImageResponse]
  }
}


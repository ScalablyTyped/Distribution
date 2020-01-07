package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of replacing text.
  */
@js.native
trait Schema$ReplaceAllTextResponse extends js.Object {
  /**
    * The number of occurrences changed by replacing all text.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object Schema$ReplaceAllTextResponse {
  @scala.inline
  def apply(occurrencesChanged: Int | Double = null): Schema$ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplaceAllTextResponse]
  }
}


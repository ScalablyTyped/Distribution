package typings.googleapis.buildSrcApisLanguageV1Mod.language_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the feeling associated with the entire text or entities in the
  * text.
  */
@js.native
trait Schema$Sentiment extends js.Object {
  /**
    * A non-negative number in the [0, +inf) range, which represents the
    * absolute magnitude of sentiment regardless of score (positive or
    * negative).
    */
  var magnitude: js.UndefOr[Double] = js.native
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
    * sentiment).
    */
  var score: js.UndefOr[Double] = js.native
}

object Schema$Sentiment {
  @scala.inline
  def apply(magnitude: Int | Double = null, score: Int | Double = null): Schema$Sentiment = {
    val __obj = js.Dynamic.literal()
    if (magnitude != null) __obj.updateDynamic("magnitude")(magnitude.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Sentiment]
  }
}


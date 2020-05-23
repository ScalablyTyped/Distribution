package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sentiment extends js.Object {
  /**
    * A non-negative number in the [0, +inf) range, which represents
    * the absolute magnitude of sentiment regardless of score (positive or
    * negative).
    */
  var magnitude: js.UndefOr[Double] = js.undefined
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0
    * (positive sentiment).
    */
  var score: js.UndefOr[Double] = js.undefined
}

object Sentiment {
  @scala.inline
  def apply(magnitude: js.UndefOr[Double] = js.undefined, score: js.UndefOr[Double] = js.undefined): Sentiment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(magnitude)) __obj.updateDynamic("magnitude")(magnitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentiment]
  }
}


package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  /** The class label. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** The probability of the class label. */
  var score: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: java.lang.String = null, score: java.lang.String = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (score != null) __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[Anon_Label]
  }
}


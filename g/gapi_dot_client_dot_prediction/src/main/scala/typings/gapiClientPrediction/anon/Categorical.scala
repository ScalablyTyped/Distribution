package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Categorical extends js.Object {
  /** Description of the categorical values of this feature. */
  var categorical: js.UndefOr[Values] = js.undefined
  /** The feature index. */
  var index: js.UndefOr[String] = js.undefined
  /** Description of the numeric values of this feature. */
  var numeric: js.UndefOr[Mean] = js.undefined
  /** Description of multiple-word text values of this feature. */
  var text: js.UndefOr[CountString] = js.undefined
}

object Categorical {
  @scala.inline
  def apply(categorical: Values = null, index: String = null, numeric: Mean = null, text: CountString = null): Categorical = {
    val __obj = js.Dynamic.literal()
    if (categorical != null) __obj.updateDynamic("categorical")(categorical.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Categorical]
  }
}


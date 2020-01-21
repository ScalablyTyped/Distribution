package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategorical extends js.Object {
  /** Description of the categorical values of this feature. */
  var categorical: js.UndefOr[AnonCountValues] = js.undefined
  /** The feature index. */
  var index: js.UndefOr[String] = js.undefined
  /** Description of the numeric values of this feature. */
  var numeric: js.UndefOr[AnonCountMean] = js.undefined
  /** Description of multiple-word text values of this feature. */
  var text: js.UndefOr[AnonCountString] = js.undefined
}

object AnonCategorical {
  @scala.inline
  def apply(
    categorical: AnonCountValues = null,
    index: String = null,
    numeric: AnonCountMean = null,
    text: AnonCountString = null
  ): AnonCategorical = {
    val __obj = js.Dynamic.literal()
    if (categorical != null) __obj.updateDynamic("categorical")(categorical.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategorical]
  }
}


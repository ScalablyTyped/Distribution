package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorMapProjectionConfig extends js.Object {
  /** @name VectorMapProjectionConfig.aspectRatio */
  var aspectRatio: js.UndefOr[Double] = js.undefined
  /** @name VectorMapProjectionConfig.from */
  var from: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.undefined
  /** @name VectorMapProjectionConfig.to */
  var to: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.undefined
}

object VectorMapProjectionConfig {
  @scala.inline
  def apply(
    aspectRatio: Int | Double = null,
    from: /* coordinates */ js.Array[Double] => js.Array[Double] = null,
    to: /* coordinates */ js.Array[Double] => js.Array[Double] = null
  ): VectorMapProjectionConfig = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(js.Any.fromFunction1(from))
    if (to != null) __obj.updateDynamic("to")(js.Any.fromFunction1(to))
    __obj.asInstanceOf[VectorMapProjectionConfig]
  }
}


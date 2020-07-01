package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightSource extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var source: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object HeightSource {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    source: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): HeightSource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightSource]
  }
}


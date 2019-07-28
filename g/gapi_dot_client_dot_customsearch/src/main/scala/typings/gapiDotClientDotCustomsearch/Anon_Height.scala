package typings.gapiDotClientDotCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(height: Int | Double = null, source: String = null, width: Int | Double = null): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}


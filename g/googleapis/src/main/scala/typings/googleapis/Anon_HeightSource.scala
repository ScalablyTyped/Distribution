package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HeightSource extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var source: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Anon_HeightSource {
  @scala.inline
  def apply(height: Int | Double = null, source: String = null, width: Int | Double = null): Anon_HeightSource = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightSource]
  }
}


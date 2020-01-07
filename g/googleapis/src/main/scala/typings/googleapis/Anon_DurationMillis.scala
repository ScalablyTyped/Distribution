package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DurationMillis extends js.Object {
  var durationMillis: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Anon_DurationMillis {
  @scala.inline
  def apply(durationMillis: String = null, height: Int | Double = null, width: Int | Double = null): Anon_DurationMillis = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DurationMillis]
  }
}


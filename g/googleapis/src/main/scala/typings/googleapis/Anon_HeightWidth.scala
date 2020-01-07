package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HeightWidth extends js.Object {
  var height: js.UndefOr[String] = js.native
  var width: js.UndefOr[String] = js.native
}

object Anon_HeightWidth {
  @scala.inline
  def apply(height: String = null, width: String = null): Anon_HeightWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightWidth]
  }
}


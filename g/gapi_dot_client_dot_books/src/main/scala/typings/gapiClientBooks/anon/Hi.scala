package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hi extends js.Object {
  var hi: js.UndefOr[Latitude] = js.undefined
  var lo: js.UndefOr[Latitude] = js.undefined
}

object Hi {
  @scala.inline
  def apply(hi: Latitude = null, lo: Latitude = null): Hi = {
    val __obj = js.Dynamic.literal()
    if (hi != null) __obj.updateDynamic("hi")(hi.asInstanceOf[js.Any])
    if (lo != null) __obj.updateDynamic("lo")(lo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hi]
  }
}


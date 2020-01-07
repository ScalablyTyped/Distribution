package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Hi extends js.Object {
  var hi: js.UndefOr[Anon_Latitude] = js.native
  var lo: js.UndefOr[Anon_Latitude] = js.native
}

object Anon_Hi {
  @scala.inline
  def apply(hi: Anon_Latitude = null, lo: Anon_Latitude = null): Anon_Hi = {
    val __obj = js.Dynamic.literal()
    if (hi != null) __obj.updateDynamic("hi")(hi.asInstanceOf[js.Any])
    if (lo != null) __obj.updateDynamic("lo")(lo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hi]
  }
}


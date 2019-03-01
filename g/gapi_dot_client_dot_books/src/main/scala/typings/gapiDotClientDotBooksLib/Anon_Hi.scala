package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hi extends js.Object {
  var hi: js.UndefOr[Anon_Latitude] = js.undefined
  var lo: js.UndefOr[Anon_Latitude] = js.undefined
}

object Anon_Hi {
  @scala.inline
  def apply(hi: Anon_Latitude = null, lo: Anon_Latitude = null): Anon_Hi = {
    val __obj = js.Dynamic.literal()
    if (hi != null) __obj.updateDynamic("hi")(hi)
    if (lo != null) __obj.updateDynamic("lo")(lo)
    __obj.asInstanceOf[Anon_Hi]
  }
}


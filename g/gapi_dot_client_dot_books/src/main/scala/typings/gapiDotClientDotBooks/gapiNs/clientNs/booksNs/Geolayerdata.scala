package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClientDotBooks.Anon_Boundary
import typings.gapiDotClientDotBooks.Anon_Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geolayerdata extends js.Object {
  var common: js.UndefOr[Anon_Lang] = js.undefined
  var geo: js.UndefOr[Anon_Boundary] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Geolayerdata {
  @scala.inline
  def apply(common: Anon_Lang = null, geo: Anon_Boundary = null, kind: String = null): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common)
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Geolayerdata]
  }
}


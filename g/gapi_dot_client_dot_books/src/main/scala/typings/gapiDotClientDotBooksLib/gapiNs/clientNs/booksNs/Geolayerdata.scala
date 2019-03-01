package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geolayerdata extends js.Object {
  var common: js.UndefOr[gapiDotClientDotBooksLib.Anon_Lang] = js.undefined
  var geo: js.UndefOr[gapiDotClientDotBooksLib.Anon_Boundary] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Geolayerdata {
  @scala.inline
  def apply(
    common: gapiDotClientDotBooksLib.Anon_Lang = null,
    geo: gapiDotClientDotBooksLib.Anon_Boundary = null,
    kind: java.lang.String = null
  ): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common)
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Geolayerdata]
  }
}


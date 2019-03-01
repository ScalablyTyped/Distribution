package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictlayerdata extends js.Object {
  var common: js.UndefOr[gapiDotClientDotBooksLib.Anon_Title] = js.undefined
  var dict: js.UndefOr[gapiDotClientDotBooksLib.Anon_SourceWords] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Dictlayerdata {
  @scala.inline
  def apply(
    common: gapiDotClientDotBooksLib.Anon_Title = null,
    dict: gapiDotClientDotBooksLib.Anon_SourceWords = null,
    kind: java.lang.String = null
  ): Dictlayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common)
    if (dict != null) __obj.updateDynamic("dict")(dict)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Dictlayerdata]
  }
}


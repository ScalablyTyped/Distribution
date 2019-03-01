package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offers extends js.Object {
  /** A list of offers. */
  var items: js.UndefOr[js.Array[gapiDotClientDotBooksLib.Anon_ArtUrl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Offers {
  @scala.inline
  def apply(items: js.Array[gapiDotClientDotBooksLib.Anon_ArtUrl] = null, kind: java.lang.String = null): Offers = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Offers]
  }
}


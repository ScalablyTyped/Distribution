package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  /** A list of offline dictionary metadata. */
  var items: js.UndefOr[js.Array[gapiDotClientDotBooksLib.Anon_Downloadurl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(items: js.Array[gapiDotClientDotBooksLib.Anon_Downloadurl] = null, kind: java.lang.String = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Metadata]
  }
}

